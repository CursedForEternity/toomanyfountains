package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class DWOceanWorldgenBlocks {
    // Ocean Blues
    //Worldgen Blocks
    public static final RegistryObject<Block> FOAM_ORE = DWBlocks.registerBlock("foam_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> OCEAN_DIRT_FOAM_ORE = DWBlocks.registerBlock("ocean_dirt_foam_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.MUD)));
    public static final RegistryObject<Block> ABYSS_ORE = DWBlocks.registerBlock("abyss_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> HYDRON_ORE = DWBlocks.registerBlock("hydron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).sound(SoundType.SCULK_SHRIEKER)));
    public static final RegistryObject<Block> OCEAN_SLATE = DWBlocks.registerBlock("ocean_slate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEEPSTONE = DWBlocks.registerBlock("deepstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> OCEAN_DIRT = DWBlocks.registerBlock("ocean_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> BUBBLE_SAND = DWBlocks.registerBlock("bubble_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.SAND)));
    public static final RegistryObject<Block> SHALLOWLIGHT_GRASS_BLOCK = DWBlocks.registerBlock("shallowlight_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> DEEPLIGHT_GRASS_BLOCK = DWBlocks.registerBlock("deeplight_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> ABYSSLIGHT_GRASS_BLOCK = DWBlocks.registerBlock("abysslight_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> SUNKENLIGHT_GRASS_BLOCK = DWBlocks.registerBlock("sunkenlight_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> HOT_PATH = DWBlocks.registerBlock("hot_path",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HOT_ROCK = DWBlocks.registerBlock("hot_rock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
}
