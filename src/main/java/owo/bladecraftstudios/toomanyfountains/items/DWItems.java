package owo.bladecraftstudios.toomanyfountains.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;

public class DWItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TooManyFountains.MODID);

    public static final RegistryObject<Item> RAW_JELLITE = ITEMS.register("raw_jellite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JELLITE = ITEMS.register("jellite_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
