package owo.bladecraftstudios.toomanyfountains.spellsystem;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.datapack.ItemSpellHolder;
import owo.bladecraftstudios.toomanyfountains.datapack.SpellData;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = TooManyFountains.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SpellDataLoader {
    private static final Gson GSON = new Gson();

    public static final Map<ResourceLocation, SpellData> REGISTRY_SPELLS = new HashMap<>();
    public static final Map<Item, ItemSpellHolder> HOLDER_ITEMS = new HashMap<>();



    public static class SpellLoader extends SimpleJsonResourceReloadListener {
        public SpellLoader() { super(GSON, TooManyFountains.MODID+"/spells"); }
        @Override
        protected void apply(Map<ResourceLocation, JsonElement> pObject, ResourceManager pResourceManager, ProfilerFiller pProfiler) {
            REGISTRY_SPELLS.clear();
            pObject.forEach((loc, json) -> SpellData.CODEC.parse(JsonOps.INSTANCE, json).result().ifPresent(data -> REGISTRY_SPELLS.put(loc, data)));
        }
    }

    public static class ItemLoader extends SimpleJsonResourceReloadListener {
        public ItemLoader() { super(GSON, TooManyFountains.MODID+"/holders"); }
        @Override
        protected void apply(Map<ResourceLocation, JsonElement> object, ResourceManager rm, ProfilerFiller pf) {
            HOLDER_ITEMS.clear();
            object.forEach((loc, json) -> {
                String path = loc.getPath();
                if (path.contains("/")) {
                    ResourceLocation itemLoc = new ResourceLocation(path.substring(0, path.indexOf("/")), path.substring(path.indexOf("/") + 1));
                    if (ForgeRegistries.ITEMS.containsKey(itemLoc)) {
                        ItemSpellHolder.CODEC.parse(JsonOps.INSTANCE, json).result().ifPresent(holder -> HOLDER_ITEMS.put(ForgeRegistries.ITEMS.getValue(itemLoc), holder));
                    }
                }
            });
        }
    }
}
