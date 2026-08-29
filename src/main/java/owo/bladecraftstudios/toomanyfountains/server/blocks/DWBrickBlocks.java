package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.RegistryObject;

public class DWBrickBlocks {
    //_BRICKS _bricks
    public static final RegistryObject<Block> ICESALT_BRICKS_STAIRS = DWBlocks.registerBlock("icesalt_bricks_stairs",
            () -> new StairBlock(() -> DWBlocks.ICESALT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_BRICKS_SLAB = DWBlocks.registerBlock("icesalt_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_BRICKS_WALL = DWBlocks.registerBlock("icesalt_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_BRICKS_BUTTON = DWBlocks.registerBlock("icesalt_bricks_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> ICESALT_BRICKS_PRESSURE_PLATE = DWBlocks.registerBlock("icesalt_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_STAIRS = DWBlocks.registerBlock("hailstone_bricks_stairs",
            () -> new StairBlock(() -> DWBlocks.HAILSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_SLAB = DWBlocks.registerBlock("hailstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_WALL = DWBlocks.registerBlock("hailstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_BUTTON = DWBlocks.registerBlock("hailstone_bricks_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_PRESSURE_PLATE = DWBlocks.registerBlock("hailstone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_STAIRS = DWBlocks.registerBlock("subzero_stone_bricks_stairs",
            () -> new StairBlock(() -> DWBlocks.SUBZERO_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_SLAB = DWBlocks.registerBlock("subzero_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_WALL = DWBlocks.registerBlock("subzero_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_BUTTON = DWBlocks.registerBlock("subzero_stone_bricks_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_PRESSURE_PLATE = DWBlocks.registerBlock("subzero_stone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_STAIRS = DWBlocks.registerBlock("frost_marble_bricks_stairs",
            () -> new StairBlock(() -> DWBlocks.FROST_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_SLAB = DWBlocks.registerBlock("frost_marble_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_WALL = DWBlocks.registerBlock("frost_marble_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_BUTTON = DWBlocks.registerBlock("frost_marbl_brickse_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_PRESSURE_PLATE = DWBlocks.registerBlock("frost_marble_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
}
