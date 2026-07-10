package owo.bladecraftstudios.toomanyfountains.items;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.items.special.SilwareAxItem;
import owo.bladecraftstudios.toomanyfountains.items.special.SilwareJavelinItem;

public class DWItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TooManyFountains.MODID);

    public static final RegistryObject<Item> RAW_JELLITE = ITEMS.register("raw_jellite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILWARE = ITEMS.register("raw_silware",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JELLITE = ITEMS.register("jellite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILWARE = ITEMS.register("silware_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILWARE_AX = ITEMS.register("silware_ax",
            () -> new SilwareAxItem(Tiers.IRON, 9, -2, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILWARE_AXE = ITEMS.register("silware_axe",
            () -> new AxeItem(Tiers.IRON, 6, -2, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILWARE_PICKAXE = ITEMS.register("silware_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 0, -1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILWARE_SHOVEL = ITEMS.register("silware_shovel",
            () -> new ShovelItem(Tiers.IRON, 0, -1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILWARE_SWORD = ITEMS.register("silware_sword",
            () -> new SwordItem(Tiers.IRON, 4, -1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILWARE_BODKIN = ITEMS.register("silware_bodkin",
            () -> new SwordItem(Tiers.IRON, 2, 1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILWARE_JAVELIN = ITEMS.register("silware_javelin",
            () -> new SilwareJavelinItem(Tiers.IRON, 6, -1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILWARE_HOE = ITEMS.register("silware_hoe",
            () -> new HoeItem(Tiers.IRON, 0, 1, new Item.Properties().stacksTo(1)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
