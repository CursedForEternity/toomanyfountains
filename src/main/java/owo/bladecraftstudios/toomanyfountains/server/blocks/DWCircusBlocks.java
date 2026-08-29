package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

import static owo.bladecraftstudios.toomanyfountains.server.blocks.DWBlocks.registerBlock;

public class DWCircusBlocks {
    public static final RegistryObject<Block> CIRCUS_BOARDS = registerBlock("circus_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> CIRCUS_FLOOR = registerBlock("circus_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> CIRCUS_ASH = registerBlock("circus_ash",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.SAND)));

    public static final RegistryObject<Block> CIRCUS_STONE = registerBlock("circus_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> SILWARE_DEBRIS = registerBlock("silware_debris",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> MEMOSHARD_ORE = registerBlock("memoshard_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).sound(SoundType.NETHER_ORE)));

    public static final RegistryObject<Block> MEMOROCK = registerBlock("memorock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK)));

    // This exists to ensure the class is loaded and statics... staticed
    public static void register() {}
}
