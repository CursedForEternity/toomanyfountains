package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.core.blocks.ModRotatedPillarBlock;
import owo.bladecraftstudios.toomanyfountains.core.items.CryoliteBucketItem;
import owo.bladecraftstudios.toomanyfountains.server.registries.DWFluids;
import owo.bladecraftstudios.toomanyfountains.server.registries.DWItems;

public class DWColdBlocks {
    // a cold place
    public static final RegistryObject<Item> RED_MARK = DWItems.ITEMS.register("red_mark",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THORN = DWItems.ITEMS.register("thorn",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_THORN_FLOWER = DWItems.ITEMS.register("red_thorn_flower",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_STEM = DWItems.ITEMS.register("red_stem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_OAK_STICK = DWItems.ITEMS.register("frozen_oak_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_OAK_SEED = DWItems.ITEMS.register("frozen_oak_seed",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLACIEITE = DWItems.ITEMS.register("glacieite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYOLITE_INGOT = DWItems.ITEMS.register("cryolite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WINTER_SPEAR = DWItems.ITEMS.register("winter_spear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ICE_KEY = DWItems.ITEMS.register("ice_key",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARTIFACT_OF_STRENGTH = DWItems.ITEMS.register("artifact_of_strength",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BIRD_FEATHER = DWItems.ITEMS.register("bird_feather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLOWER_PETAL = DWItems.ITEMS.register("flower_petal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_SCALE = DWItems.ITEMS.register("blue_scale",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> YELLOW_SCALE = DWItems.ITEMS.register("yellow_scale",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYOLITE_BUCKET = DWItems.ITEMS.register("cryolite_bucket",
            () -> new CryoliteBucketItem(Fluids.EMPTY, new Item.Properties()));

    public static final RegistryObject<Item> ARCTIC_WATER_BUCKET = DWItems.ITEMS.register("arctic_water_bucket",
            () -> new CryoliteBucketItem(DWFluids.SOURCE_ARCTIC_WATER.get(), new Item.Properties().stacksTo(1)
                    .craftRemainder(CRYOLITE_BUCKET.get())));

//    public static final RegistryObject<Item> FROZEN_OAK_SIGN = DWItems.ITEMS.register("frozen_oak_sign",
//            () -> new SignItem(new Item.Properties().stacksTo(16), DWWoodBlocks.FROZEN_OAK_SIGN.get(), DWWoodBlocks.FROZEN_OAK_WALL_SIGN.get()));
//    public static final RegistryObject<Item> FROZEN_OAK_HANGING_SIGN = DWItems.ITEMS.register("frozen_oak_hanging_sign",
//            () -> new HangingSignItem(DWWoodBlocks.FROZEN_OAK_HANGING_SIGN.get(), DWWoodBlocks.FROZEN_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Block> ICESALT_PILLAR = DWBlocks.registerBlock("icesalt_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HAILSTONE_PILLAR = DWBlocks.registerBlock("hailstone_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SUBZERO_STONE_PILLAR = DWBlocks.registerBlock("subzero_stone_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FROST_MARBLE_PILLAR = DWBlocks.registerBlock("frost_marble_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ICESALT_STAIRS = DWBlocks.registerBlock("icesalt_stairs",
            () -> new StairBlock(() -> DWBlocks.ICESALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ICESALT_SLAB = DWBlocks.registerBlock("icesalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ICESALT_WALL = DWBlocks.registerBlock("icesalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ICESALT_BUTTON = DWBlocks.registerBlock("icesalt_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> ICESALT_PRESSURE_PLATE = DWBlocks.registerBlock("icesalt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> SUBZERO_STONE_STAIRS = DWBlocks.registerBlock("subzero_stone_stairs",
            () -> new StairBlock(() -> DWBlocks.SUBZERO_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SUBZERO_STONE_SLAB = DWBlocks.registerBlock("subzero_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SUBZERO_STONE_WALL = DWBlocks.registerBlock("subzero_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SUBZERO_STONE_BUTTON = DWBlocks.registerBlock("subzero_stone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> SUBZERO_STONE_PRESSURE_PLATE = DWBlocks.registerBlock("subzero_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> FROST_MARBLE_STAIRS = DWBlocks.registerBlock("frost_marble_stairs",
            () -> new StairBlock(() -> DWBlocks.FROST_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_SLAB = DWBlocks.registerBlock("frost_marble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FROST_MARBLE_WALL = DWBlocks.registerBlock("frost_marble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FROST_MARBLE_BUTTON = DWBlocks.registerBlock("frost_marble_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> FROST_MARBLE_PRESSURE_PLATE = DWBlocks.registerBlock("frost_marble_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));

    // This exists to ensure the class is loaded and statics... staticed
    public static void register() {}
}
