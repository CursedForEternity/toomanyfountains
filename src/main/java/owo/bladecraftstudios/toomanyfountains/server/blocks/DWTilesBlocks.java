package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.RegistryObject;

public class DWTilesBlocks {
    //_TILES _tiles
    public static final RegistryObject<Block> ICESALT_TILES_STAIRS = DWBlocks.registerBlock("icesalt_tiles_stairs",
            () -> new StairBlock(() -> DWBlocks.ICESALT_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ICESALT_TILES_SLAB = DWBlocks.registerBlock("icesalt_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ICESALT_TILES_WALL = DWBlocks.registerBlock("icesalt_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ICESALT_TILES_BUTTON = DWBlocks.registerBlock("icesalt_tiles_tiles",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> ICESALT_TILES_PRESSURE_PLATE = DWBlocks.registerBlock("icesalt_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> HAILSTONE_TILES_STAIRS = DWBlocks.registerBlock("hailstone_tiles_stairs",
            () -> new StairBlock(() -> DWBlocks.HAILSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HAILSTONE_TILES_SLAB = DWBlocks.registerBlock("hailstone_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HAILSTONE_TILES_WALL = DWBlocks.registerBlock("hailstone_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> HAILSTONE_TILES_BUTTON = DWBlocks.registerBlock("hailstone_tiles_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HAILSTONE_TILES_PRESSURE_PLATE = DWBlocks.registerBlock("hailstone_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_STAIRS = DWBlocks.registerBlock("subzero_stone_tiles_stairs",
            () -> new StairBlock(() -> DWBlocks.SUBZERO_STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_SLAB = DWBlocks.registerBlock("subzero_stone_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_WALL = DWBlocks.registerBlock("subzero_stone_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_BUTTON = DWBlocks.registerBlock("subzero_stone_tiles_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_PRESSURE_PLATE = DWBlocks.registerBlock("subzero_stone_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_STAIRS = DWBlocks.registerBlock("frost_marble_tiles_stairs",
            () -> new StairBlock(() -> DWBlocks.FROST_MARBLE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_SLAB = DWBlocks.registerBlock("frost_marble_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_WALL = DWBlocks.registerBlock("frost_marble_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_BUTTON = DWBlocks.registerBlock("frost_marble_tiles_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_PRESSURE_PLATE = DWBlocks.registerBlock("frost_marble_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));

    // This exists to ensure the class is loaded and statics... staticed
    public static void register() {}
}
