package owo.bladecraftstudios.toomanyfountains.items;

import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.items.special.DarkBucketItem;
import owo.bladecraftstudios.toomanyfountains.items.special.SilwareAxItem;
import owo.bladecraftstudios.toomanyfountains.items.special.SilwareJavelinItem;

public class DWItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TooManyFountains.MODID);

    public static final RegistryObject<Item> RAW_SILWARE = ITEMS.register("raw_silware",
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
    public static final RegistryObject<Item> FLOORBOARD = ITEMS.register("floorboard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEMOSHARD = ITEMS.register("memoshard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOARD_HOE = ITEMS.register("board_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, 1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOARD_AXE = ITEMS.register("board_axe",
            () -> new AxeItem(Tiers.WOOD, 4, 1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOARD_PICKAXE = ITEMS.register("board_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 0, 1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOARD_SHOVEL = ITEMS.register("board_shovel",
            () -> new ShovelItem(Tiers.WOOD, 0, 1, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOARD_SWORD = ITEMS.register("board_sword",
            () -> new SwordItem(Tiers.WOOD, 2, 1, new Item.Properties().stacksTo(1)));

    // a cold place
    public static final RegistryObject<Item> RED_MARK = ITEMS.register("red_mark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THORN = ITEMS.register("thorn",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_THORN_FLOWER = ITEMS.register("red_thorn_flower",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_STEM = ITEMS.register("red_stem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_OAK_STICK = ITEMS.register("frozen_oak_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_OAK_SEED = ITEMS.register("frozen_oak_seed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLACIEITE = ITEMS.register("glacieite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYOLITE_INGOT = ITEMS.register("cryolite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WINTER_SPEAR = ITEMS.register("winter_spear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICE_KEY = ITEMS.register("ice_key",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARTIFACT_OF_STRENGTH = ITEMS.register("artifact_of_strength",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRD_FEATHER = ITEMS.register("bird_feather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLOWER_PETAL = ITEMS.register("flower_petal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SCALE = ITEMS.register("blue_scale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SCALE = ITEMS.register("yellow_scale",
            () -> new Item(new Item.Properties()));






    //EXAMPLE STUFF FOR REFERENCE
    public static final RegistryObject<Item> EXAMPLE_BUCKET = ITEMS.register("example_bucket",
            () -> new DarkBucketItem(Fluids.EMPTY, new Item.Properties()));
    // public static final RegistryObject<Item> LUMINESCENT_WATER_BUCKET = ITEMS.register("luminescent_water_bucket",
    //            () -> new ScarletBucketItem(FluidRegistry.SOURCE_LUMINESCENT_WATER.get(), new Item.Properties().stacksTo(1).craftRemainder(ItemRegistry.DARK_CANDY_BUCKET.get())));
    //    public static final RegistryObject<Item> PURE_DARKNESS_BUCKET = ITEMS.register("pure_darkness_bucket",
    //            () -> new ScarletBucketItem(FluidRegistry.SOURCE_PURE_DARKNESS.get(), new Item.Properties().stacksTo(1).craftRemainder(ItemRegistry.DARK_CANDY_BUCKET.get())));

    //REPEAT PER FLUID, EACH BUCKET FROM NEW MATERIAL REQUIRES NEW CLASS IDENTICAL TO DarkBucketItem.java, JUST CHANGE THE BUCKET IT GIVES WHEN EMPTY



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
