package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.RegistryObject;

public class DWCobbledBlocks {
    //COBBLED_ cobbled_
    public static final RegistryObject<Block> COBBLED_ICESALT_STAIRS = DWBlocks.registerBlock("cobbled_icesalt_stairs",
            () -> new StairBlock(() -> DWBlocks.COBBLED_ICESALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_ICESALT_SLAB = DWBlocks.registerBlock("cobbled_icesalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_ICESALT_WALL = DWBlocks.registerBlock("cobbled_icesalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_ICESALT_BUTTON = DWBlocks.registerBlock("cobbled_icesalt_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> COBBLED_ICESALT_PRESSURE_PLATE = DWBlocks.registerBlock("cobbled_icesalt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_STAIRS = DWBlocks.registerBlock("cobbled_hailstone_stairs",
            () -> new StairBlock(() -> DWBlocks.COBBLED_HAILSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_SLAB = DWBlocks.registerBlock("cobbled_hailstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_WALL = DWBlocks.registerBlock("cobbled_hailstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_BUTTON = DWBlocks.registerBlock("cobbled_hailstone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_PRESSURE_PLATE = DWBlocks.registerBlock("cobbled_hailstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_STAIRS = DWBlocks.registerBlock("cobbled_subzero_stone_stairs",
            () -> new StairBlock(() -> DWBlocks.COBBLED_SUBZERO_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_SLAB = DWBlocks.registerBlock("cobbled_subzero_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_WALL = DWBlocks.registerBlock("cobbled_subzero_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_BUTTON = DWBlocks.registerBlock("cobbled_subzero_stone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_PRESSURE_PLATE = DWBlocks.registerBlock("cobbled_subzero_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_STAIRS = DWBlocks.registerBlock("cobbled_frost_marble_stairs",
            () -> new StairBlock(() -> DWBlocks.COBBLED_FROST_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_SLAB = DWBlocks.registerBlock("cobbled_frost_marble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_WALL = DWBlocks.registerBlock("cobbled_frost_marble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_BUTTON = DWBlocks.registerBlock("cobbled_frost_marble_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_PRESSURE_PLATE = DWBlocks.registerBlock("cobbled_frost_marble_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));

    // This exists to ensure the class is loaded and statics... staticed
    public static void register() {}
}
