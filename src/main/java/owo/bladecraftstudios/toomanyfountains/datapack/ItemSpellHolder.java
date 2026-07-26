package owo.bladecraftstudios.toomanyfountains.datapack;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;

import java.util.List;

public record ItemSpellHolder(ResourceLocation item_id, List<Spells> spells) {

    public static final ResourceKey<Registry<ItemSpellHolder>> REGISTRY_KEY = ResourceKey.createRegistryKey(
            new ResourceLocation(TooManyFountains.MODID, "spells/spell_holders"));
    public static final Codec<ResourceKey<Item>> RESOURCE_KEY_CODEC = ResourceKey.codec(REGISTRY_KEY);


    // FOR NOW THIS IS MERELY A BLUEPRINT, LITERALLY COPY OF DARK WORLD ITEMS. PLEASE CHANGE
    public static class Spells {
        public static final Codec<Spells> CODEC = RecordCodecBuilder.create(instance -> instance.group(
                ForgeRegistries.ITEMS.getCodec().fieldOf("light_world").forGetter(Spells::getLightWorldForm),
                ForgeRegistries.ITEMS.getCodec().fieldOf("dark_world").forGetter(Spells::getDarkWorldForm)
        ).apply(instance, Spells::new));

        private final Item lightWorld;
        private final Item darkWorld;

        public Spells(Item lightWorld, Item darkWorld)
        {
            this.lightWorld = lightWorld;
            this.darkWorld = darkWorld;
        }

        public Item getLightWorldForm()
        {
            return lightWorld;
        }

        public Item getDarkWorldForm()
        {
            return darkWorld;
        }
    }
}
