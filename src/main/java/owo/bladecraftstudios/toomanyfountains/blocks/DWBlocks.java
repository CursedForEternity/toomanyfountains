package owo.bladecraftstudios.toomanyfountains.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.blocks.custom.ModFlammableRotatedPillarBlock;
import owo.bladecraftstudios.toomanyfountains.blocks.custom.ModRotatedPillarBlock;
import owo.bladecraftstudios.toomanyfountains.items.DWItems;

import java.util.function.Supplier;

public class DWBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TooManyFountains.MODID);
// Circus
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
// Ocean Blues

    public static final RegistryObject<Block> FOAM_ORE = registerBlock("foam_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ABYSS_ORE = registerBlock("abyss_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> HYDRON_ORE = registerBlock("hydron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).sound(SoundType.SCULK_SHRIEKER)));
    public static final RegistryObject<Block> OCEAN_SLATE = registerBlock("ocean_slate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEEPSTONE = registerBlock("deepstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> OCEAN_DIRT = registerBlock("ocean_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> SHALLOWLIGHT_GRASS_BLOCK = registerBlock("shallowlight_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> DEEPLIGHT_GRASS_BLOCK = registerBlock("deeplight_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> ABYSSLIGHT_GRASS_BLOCK = registerBlock("abysslight_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> SUNKENLIGHT_GRASS_BLOCK = registerBlock("sunkenlight_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.MUD)));
    public static final RegistryObject<Block> RED_CORALWOOD_LOG = registerBlock("red_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> RED_CORALWOOD_WOOD = registerBlock("red_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_LOG = registerBlock("purple_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PURPLE_CORALWOOD_WOOD = registerBlock("purple_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_LOG = registerBlock("yellow_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> YELLOW_CORALWOOD_WOOD = registerBlock("yellow_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PINK_CORALWOOD_LOG = registerBlock("pink_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> PINK_CORALWOOD_WOOD = registerBlock("pink_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> BLUE_CORALWOOD_LOG = registerBlock("blue_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> BLUE_CORALWOOD_WOOD = registerBlock("blue_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> DEAD_CORALWOOD_LOG = registerBlock("dead_coralwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(3f)));
    public static final RegistryObject<Block> DEAD_CORALWOOD_WOOD = registerBlock("dead_coralwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).strength(3f)));

    //BLOCKS FROM A COLD PLACE
    public static final RegistryObject<Block> FROZEN_OAK_LOG = registerBlock("frozen_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.NETHER_WOOD).strength(3f)));
    public static final RegistryObject<Block> FROZEN_OAK_WOOD = registerBlock("frozen_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.NETHER_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FROZEN_OAK_LOG = registerBlock("stripped_frozen_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).sound(SoundType.NETHER_WOOD).strength(3f)));//The blocks above do not seem to follow seem to follow the same properties as the blocks I set them as in their behaviour
    public static final RegistryObject<Block> STRIPPED_FROZEN_OAK_WOOD = registerBlock("stripped_frozen_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).sound(SoundType.NETHER_WOOD).strength(3f)));

    public static final RegistryObject<Block> FROZEN_OAK_PLANKS = registerBlock("frozen_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.NETHER_WOOD).strength(2f)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

            });
    public static final RegistryObject<Block> FROZEN_OAK_STAIRS = registerBlock("frozen_oak_stairs",
            () -> new StairBlock(() -> DWBlocks.FROZEN_OAK_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.NETHER_WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

            });
    public static final RegistryObject<Block> FROZEN_OAK_SLAB = registerBlock("frozen_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.NETHER_WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

            });
    public static final RegistryObject<Block> FROZEN_OAK_FENCE = registerBlock("frozen_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.NETHER_WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

            });
    public static final RegistryObject<Block> FROZEN_OAK_GATE = registerBlock("frozen_oak_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.NETHER_WOOD),SoundEvents.NETHER_WOOD_FENCE_GATE_CLOSE,SoundEvents.NETHER_WOOD_FENCE_GATE_OPEN){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

            });
    public static final RegistryObject<Block> FROZEN_OAK_WALL = registerBlock("frozen_oak_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.NETHER_WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

            });
    public static final RegistryObject<Block> SOOT_SNOW = registerBlock("soot_snow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> FROZEN_OAK_BUTTON = registerBlock("frozen_oak_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.NETHER_WOOD),
                BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> FROZEN_OAK_PRESSURE_PLATE = registerBlock("frozen_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.NETHER_WOOD),
            BlockSetType.OAK));
    public static final RegistryObject<Block> FROZEN_OAK_DOOR = registerBlock("frozen_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.NETHER_WOOD).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> FROZEN_OAK_TRAPDOOR = registerBlock("frozen_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.NETHER_WOOD).noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> ICESALT_PILLAR = registerBlock("icesalt_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_PILLAR = registerBlock("hailstone_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_PILLAR = registerBlock("subzero_stone_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_PILLAR = registerBlock("frost_marble_pillar",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> ICESALT_STAIRS = registerBlock("icesalt_stairs",
            () -> new StairBlock(() -> DWBlocks.ICESALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_SLAB = registerBlock("icesalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_WALL = registerBlock("icesalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_BUTTON = registerBlock("icesalt_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> ICESALT_PRESSURE_PLATE = registerBlock("icesalt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> HAILSTONE_STAIRS = registerBlock("hailstone_stairs",
            () -> new StairBlock(() -> DWBlocks.HAILSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_SLAB = registerBlock("hailstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_WALL = registerBlock("hailstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_BUTTON = registerBlock("hailstone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HAILSTONE_PRESSURE_PLATE = registerBlock("hailstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> SUBZERO_STONE_STAIRS = registerBlock("subzero_stone_stairs",
            () -> new StairBlock(() -> DWBlocks.SUBZERO_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_SLAB = registerBlock("subzero_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_WALL = registerBlock("subzero_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_BUTTON = registerBlock("subzero_stone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> SUBZERO_STONE_PRESSURE_PLATE = registerBlock("subzero_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> FROST_MARBLE_STAIRS = registerBlock("frost_marble_stairs",
            () -> new StairBlock(() -> DWBlocks.FROST_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_SLAB = registerBlock("frost_marble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_WALL = registerBlock("frost_marble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_BUTTON = registerBlock("frost_marble_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> FROST_MARBLE_PRESSURE_PLATE = registerBlock("frost_marble_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));

    //COBBLED_ cobbled_
    public static final RegistryObject<Block> COBBLED_ICESALT_STAIRS = registerBlock("cobbled_icesalt_stairs",
            () -> new StairBlock(() -> DWBlocks.COBBLED_ICESALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_ICESALT_SLAB = registerBlock("cobbled_icesalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_ICESALT_WALL = registerBlock("cobbled_icesalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_ICESALT_BUTTON = registerBlock("cobbled_icesalt_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> COBBLED_ICESALT_PRESSURE_PLATE = registerBlock("cobbled_icesalt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_STAIRS = registerBlock("cobbled_hailstone_stairs",
            () -> new StairBlock(() -> DWBlocks.COBBLED_HAILSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_SLAB = registerBlock("cobbled_hailstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_WALL = registerBlock("cobbled_hailstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_BUTTON = registerBlock("cobbled_hailstone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> COBBLED_HAILSTONE_PRESSURE_PLATE = registerBlock("cobbled_hailstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_STAIRS = registerBlock("cobbled_subzero_stone_stairs",
            () -> new StairBlock(() -> DWBlocks.COBBLED_SUBZERO_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_SLAB = registerBlock("cobbled_subzero_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_WALL = registerBlock("cobbled_subzero_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_BUTTON = registerBlock("cobbled_subzero_stone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE_PRESSURE_PLATE = registerBlock("cobbled_subzero_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_STAIRS = registerBlock("cobbled_frost_marble_stairs",
            () -> new StairBlock(() -> DWBlocks.COBBLED_FROST_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_SLAB = registerBlock("cobbled_frost_marble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_WALL = registerBlock("cobbled_frost_marble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_BUTTON = registerBlock("cobbled_frost_marble_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE_PRESSURE_PLATE = registerBlock("cobbled_frost_marble_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));

    //POLISHED_ polished_
    public static final RegistryObject<Block> POLISHED_ICESALT_STAIRS = registerBlock("polished_icesalt_stairs",
            () -> new StairBlock(() -> DWBlocks.POLISHED_ICESALT.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_ICESALT_SLAB = registerBlock("polished_icesalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_ICESALT_WALL = registerBlock("polished_icesalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_ICESALT_BUTTON = registerBlock("polished_icesalt_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> POLISHED_ICESALT_PRESSURE_PLATE = registerBlock("polished_icesalt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> POLISHED_HAILSTONE_STAIRS = registerBlock("polished_hailstone_stairs",
            () -> new StairBlock(() -> DWBlocks.POLISHED_HAILSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_HAILSTONE_SLAB = registerBlock("polished_hailstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_HAILSTONE_WALL = registerBlock("polished_hailstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_HAILSTONE_BUTTON = registerBlock("polished_hailstone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> POLISHED_HAILSTONE_PRESSURE_PLATE = registerBlock("polished_hailstone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> POLISHED_SUBZERO_STONE_STAIRS = registerBlock("polished_subzero_stone_stairs",
            () -> new StairBlock(() -> DWBlocks.POLISHED_SUBZERO_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_SUBZERO_STONE_SLAB = registerBlock("polished_subzero_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_SUBZERO_STONE_WALL = registerBlock("polished_subzero_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_SUBZERO_STONE_BUTTON = registerBlock("polished_subzero_stone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> POLISHED_SUBZERO_STONE_PRESSURE_PLATE = registerBlock("polished_subzero_stone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> POLISHED_FROST_MARBLE_STAIRS = registerBlock("polished_frost_marble_stairs",
            () -> new StairBlock(() -> DWBlocks.POLISHED_FROST_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_FROST_MARBLE_SLAB = registerBlock("polished_frost_marble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_FROST_MARBLE_WALL = registerBlock("polished_frost_marble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_FROST_MARBLE_BUTTON = registerBlock("polished_frost_marble_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> POLISHED_FROST_MARBLE_PRESSURE_PLATE = registerBlock("polished_frost_marble_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));

    //_BRICKS _bricks
    public static final RegistryObject<Block> ICESALT_BRICKS_STAIRS = registerBlock("icesalt_bricks_stairs",
            () -> new StairBlock(() -> DWBlocks.ICESALT_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_BRICKS_SLAB = registerBlock("icesalt_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_BRICKS_WALL = registerBlock("icesalt_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_BRICKS_BUTTON = registerBlock("icesalt_bricks_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> ICESALT_BRICKS_PRESSURE_PLATE = registerBlock("icesalt_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_STAIRS = registerBlock("hailstone_bricks_stairs",
            () -> new StairBlock(() -> DWBlocks.HAILSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_SLAB = registerBlock("hailstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_WALL = registerBlock("hailstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_BUTTON = registerBlock("hailstone_bricks_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HAILSTONE_BRICKS_PRESSURE_PLATE = registerBlock("hailstone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_STAIRS = registerBlock("subzero_stone_bricks_stairs",
            () -> new StairBlock(() -> DWBlocks.SUBZERO_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_SLAB = registerBlock("subzero_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_WALL = registerBlock("subzero_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_BUTTON = registerBlock("subzero_stone_bricks_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS_PRESSURE_PLATE = registerBlock("subzero_stone_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_STAIRS = registerBlock("frost_marble_bricks_stairs",
            () -> new StairBlock(() -> DWBlocks.FROST_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_SLAB = registerBlock("frost_marble_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_WALL = registerBlock("frost_marble_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_BUTTON = registerBlock("frost_marbl_brickse_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS_PRESSURE_PLATE = registerBlock("frost_marble_bricks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));

    //_TILES _tiles
    public static final RegistryObject<Block> ICESALT_TILES_STAIRS = registerBlock("icesalt_tiles_stairs",
            () -> new StairBlock(() -> DWBlocks.ICESALT_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_TILES_SLAB = registerBlock("icesalt_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_TILES_WALL = registerBlock("icesalt_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_TILES_BUTTON = registerBlock("icesalt_tiles_tiles",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> ICESALT_TILES_PRESSURE_PLATE = registerBlock("icesalt_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> HAILSTONE_TILES_STAIRS = registerBlock("hailstone_tiles_stairs",
            () -> new StairBlock(() -> DWBlocks.HAILSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_TILES_SLAB = registerBlock("hailstone_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_TILES_WALL = registerBlock("hailstone_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_TILES_BUTTON = registerBlock("hailstone_tiles_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> HAILSTONE_TILES_PRESSURE_PLATE = registerBlock("hailstone_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_STAIRS = registerBlock("subzero_stone_tiles_stairs",
            () -> new StairBlock(() -> DWBlocks.SUBZERO_STONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_SLAB = registerBlock("subzero_stone_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_WALL = registerBlock("subzero_stone_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_BUTTON = registerBlock("subzero_stone_tiles_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES_PRESSURE_PLATE = registerBlock("subzero_stone_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_STAIRS = registerBlock("frost_marble_tiles_stairs",
            () -> new StairBlock(() -> DWBlocks.FROST_MARBLE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_SLAB = registerBlock("frost_marble_tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_WALL = registerBlock("frost_marble_tiles_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_BUTTON = registerBlock("frost_marble_tiles_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> FROST_MARBLE_TILES_PRESSURE_PLATE = registerBlock("frost_marble_tiles_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE),
                    BlockSetType.STONE));

    public static final RegistryObject<Block> ICESALT = registerBlock("icesalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_ICESALT = registerBlock("cobbled_icesalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_ICESALT = registerBlock("polished_icesalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_ICESALT = registerBlock("chiseled_icesalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_BRICKS = registerBlock("icesalt_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_TILES = registerBlock("icesalt_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE = registerBlock("hailstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_HAILSTONE = registerBlock("cobbled_hailstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_HAILSTONE = registerBlock("polished_hailstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_HAILSTONE = registerBlock("chiseled_hailstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_BRICKS = registerBlock("hailstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_TILES = registerBlock("hailstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE = registerBlock("subzero_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_SUBZERO_STONE = registerBlock("cobbled_subzero_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_SUBZERO_STONE = registerBlock("polished_subzero_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_SUBZERO_STONE = registerBlock("chiseled_subzero_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_BRICKS = registerBlock("subzero_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES = registerBlock("subzero_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE = registerBlock("frost_marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_FROST_MARBLE = registerBlock("cobbled_frost_marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_FROST_MARBLE = registerBlock("polished_frost_marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_FROST_MARBLE = registerBlock("chiseled_frost_marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_BRICKS = registerBlock("frost_marble_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_TILES = registerBlock("frost_marble_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ARCTIC_SNOW_BLOCK = registerBlock("arctic_snow_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> ARCTIC_SNOW = registerBlock("arctic_snow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> POWDER_ARCTIC_SNOW = registerBlock("powder_arctic_snow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POWDER_SNOW).sound(SoundType.POWDER_SNOW)));
//The snow blocks above do not seem to follow seem to follow the same properties as the blocks I set them as in their behaviour

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return DWItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
