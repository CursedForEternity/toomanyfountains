package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.core.blocks.circus.CircusFence;
import owo.bladecraftstudios.toomanyfountains.core.blocks.circus.CircusFenceGate;
import owo.bladecraftstudios.toomanyfountains.core.blocks.circus.CircusSlab;
import owo.bladecraftstudios.toomanyfountains.core.blocks.circus.CircusStairs;
import owo.bladecraftstudios.toomanyfountains.core.blocks.frozen.FrozenFence;
import owo.bladecraftstudios.toomanyfountains.core.blocks.frozen.FrozenFenceGate;
import owo.bladecraftstudios.toomanyfountains.core.blocks.frozen.FrozenSlab;
import owo.bladecraftstudios.toomanyfountains.core.blocks.frozen.FrozenStairs;

import static owo.bladecraftstudios.toomanyfountains.server.blocks.DWBlocks.registerBlock;

public class DWCircusBlocks {
    public static final RegistryObject<Block> CIRCUS_BOARDS = registerBlock("circus_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> FLOORBOARDS = registerBlock("floorboards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.BAMBOO_WOOD)));

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

    public static final RegistryObject<Block> SILWARE_BLOCK = registerBlock("silware_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_SILWARE_BLOCK = registerBlock("raw_silware_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FLOORBOARD_STAIRS = DWBlocks.registerBlock("floorboard_stairs",
            () -> new CircusStairs(() -> FLOORBOARDS.get().defaultBlockState()));
    public static final RegistryObject<Block> FLOORBOARD_SLAB = DWBlocks.registerBlock("floorboard_slab",
            CircusSlab::new);
    public static final RegistryObject<Block> FLOORBOARD_FENCE = DWBlocks.registerBlock("floorboard_fence",
            CircusFence::new);
    public static final RegistryObject<Block> FLOORBOARD_FENCE_GATE = DWBlocks.registerBlock("floorboard_gate",
            CircusFenceGate::new);
    public static final RegistryObject<Block> FLOORBOARD_DOOR = DWBlocks.registerBlock("floorboard_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.BAMBOO_WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> FLOORBOARD_TRAPDOOR = DWBlocks.registerBlock("floorboard_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.BAMBOO_WOOD).noOcclusion(), BlockSetType.OAK));

    // This exists to ensure the class is loaded and statics... staticed
    public static void register() {}
}
