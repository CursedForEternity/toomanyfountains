package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.core.blocks.ModFlammableRotatedPillarBlock;
//import owo.bladecraftstudios.toomanyfountains.core.blocks.ModHangingSignBlock;
//import owo.bladecraftstudios.toomanyfountains.core.blocks.ModStandingSignBlock;
//import owo.bladecraftstudios.toomanyfountains.core.blocks.ModWallHangingSignBlock;
import owo.bladecraftstudios.toomanyfountains.core.blocks.frozen.*;
//import owo.bladecraftstudios.toomanyfountains.core.util.ModWoodTypes;

public class DWWoodBlocks {
    //Logs/Woods
    public static final RegistryObject<Block> RED_CORALWOOD_LOG = DWBlocks.registerBlock("red_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> RED_CORALWOOD_WOOD = DWBlocks.registerBlock("red_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_LOG = DWBlocks.registerBlock("purple_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_WOOD = DWBlocks.registerBlock("purple_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_LOG = DWBlocks.registerBlock("yellow_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_WOOD = DWBlocks.registerBlock("yellow_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PINK_CORALWOOD_LOG = DWBlocks.registerBlock("pink_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PINK_CORALWOOD_WOOD = DWBlocks.registerBlock("pink_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> BLUE_CORALWOOD_LOG = DWBlocks.registerBlock("blue_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> BLUE_CORALWOOD_WOOD = DWBlocks.registerBlock("blue_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> GREEN_CORALWOOD_LOG = DWBlocks.registerBlock("green_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> GREEN_CORALWOOD_WOOD = DWBlocks.registerBlock("green_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> DEAD_CORALWOOD_LOG = DWBlocks.registerBlock("dead_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.NETHER_WOOD).strength(3f)));
    public static final RegistryObject<Block> DEAD_CORALWOOD_WOOD = DWBlocks.registerBlock("dead_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.NETHER_WOOD).strength(3f)));
    //Plankset
    //Red Coralwood
    public static final RegistryObject<Block> RED_CORALWOOD_PLANKS = DWBlocks.registerBlock("red_coralwood_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> RED_CORALWOOD_STAIRS = DWBlocks.registerBlock("red_coralwood_stairs",
            () -> new StairBlock(() -> RED_CORALWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_CORALWOOD_SLAB = DWBlocks.registerBlock("red_coralwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_CORALWOOD_FENCE = DWBlocks.registerBlock("red_coralwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_CORALWOOD_GATE = DWBlocks.registerBlock("red_coralwood_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD), SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE, SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN));
    public static final RegistryObject<Block> RED_CORALWOOD_BUTTON = DWBlocks.registerBlock("red_coralwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> RED_CORALWOOD_PRESSURE_PLATE = DWBlocks.registerBlock("red_coralwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> RED_CORALWOOD_DOOR = DWBlocks.registerBlock("red_coralwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> RED_CORALWOOD_TRAPDOOR = DWBlocks.registerBlock("red_coralwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    //Purple Coralwood
    public static final RegistryObject<Block> PURPLE_CORALWOOD_PLANKS = DWBlocks.registerBlock("purple_coralwood_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_STAIRS = DWBlocks.registerBlock("purple_coralwood_stairs",
            () -> new StairBlock(() -> PURPLE_CORALWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_SLAB = DWBlocks.registerBlock("purple_coralwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_FENCE = DWBlocks.registerBlock("purple_coralwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_GATE = DWBlocks.registerBlock("purple_coralwood_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD), SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE, SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_BUTTON = DWBlocks.registerBlock("purple_coralwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_PRESSURE_PLATE = DWBlocks.registerBlock("purple_coralwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_DOOR = DWBlocks.registerBlock("purple_coralwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_TRAPDOOR = DWBlocks.registerBlock("purple_coralwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    //Yellow Coralwood
    public static final RegistryObject<Block> YELLOW_CORALWOOD_PLANKS = DWBlocks.registerBlock("yellow_coralwood_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_STAIRS = DWBlocks.registerBlock("yellow_coralwood_stairs",
            () -> new StairBlock(() -> YELLOW_CORALWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_SLAB = DWBlocks.registerBlock("yellow_coralwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_FENCE = DWBlocks.registerBlock("yellow_coralwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_GATE = DWBlocks.registerBlock("yellow_coralwood_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD), SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE, SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_BUTTON = DWBlocks.registerBlock("yellow_coralwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_PRESSURE_PLATE = DWBlocks.registerBlock("yellow_coralwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_DOOR = DWBlocks.registerBlock("yellow_coralwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_TRAPDOOR = DWBlocks.registerBlock("yellow_coralwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    //Pink Coralwood
    public static final RegistryObject<Block> PINK_CORALWOOD_PLANKS = DWBlocks.registerBlock("pink_coralwood_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PINK_CORALWOOD_STAIRS = DWBlocks.registerBlock("pink_coralwood_stairs",
            () -> new StairBlock(() -> PINK_CORALWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_CORALWOOD_SLAB = DWBlocks.registerBlock("pink_coralwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_CORALWOOD_FENCE = DWBlocks.registerBlock("pink_coralwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_CORALWOOD_GATE = DWBlocks.registerBlock("pink_coralwood_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD), SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE, SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN));
    public static final RegistryObject<Block> PINK_CORALWOOD_BUTTON = DWBlocks.registerBlock("pink_coralwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> PINK_CORALWOOD_PRESSURE_PLATE = DWBlocks.registerBlock("pink_coralwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> PINK_CORALWOOD_DOOR = DWBlocks.registerBlock("pink_coralwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> PINK_CORALWOOD_TRAPDOOR = DWBlocks.registerBlock("pink_coralwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    //Blue Coralwood
    public static final RegistryObject<Block> BLUE_CORALWOOD_PLANKS = DWBlocks.registerBlock("blue_coralwood_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> BLUE_CORALWOOD_STAIRS = DWBlocks.registerBlock("blue_coralwood_stairs",
            () -> new StairBlock(() -> BLUE_CORALWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_CORALWOOD_SLAB = DWBlocks.registerBlock("blue_coralwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_CORALWOOD_FENCE = DWBlocks.registerBlock("blue_coralwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_CORALWOOD_GATE = DWBlocks.registerBlock("blue_coralwood_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD), SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE, SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN));
    public static final RegistryObject<Block> BLUE_CORALWOOD_BUTTON = DWBlocks.registerBlock("blue_coralwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> BLUE_CORALWOOD_PRESSURE_PLATE = DWBlocks.registerBlock("blue_coralwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> BLUE_CORALWOOD_DOOR = DWBlocks.registerBlock("blue_coralwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> BLUE_CORALWOOD_TRAPDOOR = DWBlocks.registerBlock("blue_coralwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> DEAD_CORALWOOD_PLANKS = DWBlocks.registerBlock("dead_coralwood_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.NETHER_WOOD).strength(3f)));
    //Green Coralwood
    public static final RegistryObject<Block> GREEN_CORALWOOD_PLANKS = DWBlocks.registerBlock("green_coralwood_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> GREEN_CORALWOOD_STAIRS = DWBlocks.registerBlock("green_coralwood_stairs",
            () -> new StairBlock(() -> GREEN_CORALWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_CORALWOOD_SLAB = DWBlocks.registerBlock("green_coralwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_CORALWOOD_FENCE = DWBlocks.registerBlock("green_coralwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_CORALWOOD_GATE = DWBlocks.registerBlock("green_coralwood_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD), SoundEvents.CHERRY_WOOD_FENCE_GATE_CLOSE, SoundEvents.CHERRY_WOOD_FENCE_GATE_OPEN));
    public static final RegistryObject<Block> GREEN_CORALWOOD_BUTTON = DWBlocks.registerBlock("green_coralwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> GREEN_CORALWOOD_PRESSURE_PLATE = DWBlocks.registerBlock("green_coralwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> GREEN_CORALWOOD_DOOR = DWBlocks.registerBlock("green_coralwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> GREEN_CORALWOOD_TRAPDOOR = DWBlocks.registerBlock("green_coralwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));

    //BLOCKS FROM A COLD PLACE
    public static final RegistryObject<Block> FROZEN_OAK_LOG = DWBlocks.registerBlock("frozen_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.NETHER_WOOD).strength(3f).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FROZEN_OAK_WOOD = DWBlocks.registerBlock("frozen_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.NETHER_WOOD).strength(3f).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> STRIPPED_FROZEN_OAK_LOG = DWBlocks.registerBlock("stripped_frozen_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).sound(SoundType.NETHER_WOOD).strength(3f).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));//The blocks above do not seem to follow seem to follow the same properties as the blocks I set them as in their behaviour
    public static final RegistryObject<Block> STRIPPED_FROZEN_OAK_WOOD = DWBlocks.registerBlock("stripped_frozen_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).sound(SoundType.NETHER_WOOD).strength(3f).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FROZEN_OAK_PLANKS = DWBlocks.registerBlock("frozen_oak_planks",
            FrozenWood::new);
    public static final RegistryObject<Block> FROZEN_OAK_STAIRS = DWBlocks.registerBlock("frozen_oak_stairs",
            () -> new FrozenStairs(() -> FROZEN_OAK_PLANKS.get().defaultBlockState()));
    public static final RegistryObject<Block> FROZEN_OAK_SLAB = DWBlocks.registerBlock("frozen_oak_slab",
            FrozenSlab::new);
    public static final RegistryObject<Block> FROZEN_OAK_FENCE = DWBlocks.registerBlock("frozen_oak_fence",
            FrozenFence::new);
    public static final RegistryObject<Block> FROZEN_OAK_GATE = DWBlocks.registerBlock("frozen_oak_gate",
            FrozenFenceGate::new);
    public static final RegistryObject<Block> FROZEN_OAK_WALL = DWBlocks.registerBlock("frozen_oak_wall",
            FrozenWall::new);
    public static final RegistryObject<Block> SOOT_SNOW = DWBlocks.registerBlock("soot_snow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.SNOW).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> FROZEN_OAK_BUTTON = DWBlocks.registerBlock("frozen_oak_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.NETHER_WOOD),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> FROZEN_OAK_PRESSURE_PLATE = DWBlocks.registerBlock("frozen_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.NETHER_WOOD).emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> FROZEN_OAK_DOOR = DWBlocks.registerBlock("frozen_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.NETHER_WOOD).noOcclusion().emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15), BlockSetType.OAK));
    public static final RegistryObject<Block> FROZEN_OAK_TRAPDOOR = DWBlocks.registerBlock("frozen_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.NETHER_WOOD).noOcclusion().emissiveRendering((state, reader, pos) -> true).lightLevel((state) -> 15), BlockSetType.OAK));
//    public static final RegistryObject<Block> FROZEN_OAK_SIGN = DWBlocks.registerBlock("frozen_oak_sign",
//            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).sound(SoundType.NETHER_WOOD).strength(3f), ModWoodTypes.FROZEN_OAK));
//    public static final RegistryObject<Block> FROZEN_OAK_WALL_SIGN = DWBlocks.registerBlock("frozen_oak_wall_sign",
//            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).sound(SoundType.NETHER_WOOD).strength(3f), ModWoodTypes.FROZEN_OAK));
//    public static final RegistryObject<Block> FROZEN_OAK_HANGING_SIGN = DWBlocks.registerBlock("frozen_oak_hanging_sign",
//            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).sound(SoundType.NETHER_WOOD).strength(3f), ModWoodTypes.FROZEN_OAK));
//    public static final RegistryObject<Block> FROZEN_OAK_WALL_HANGING_SIGN = DWBlocks.registerBlock("frozen_oak_wall_hanging_sign",
//            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).sound(SoundType.NETHER_WOOD).strength(3f), ModWoodTypes.FROZEN_OAK));


    // This exists to ensure the class is loaded and statics... staticed
    public static void register() {}
}
