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
import owo.bladecraftstudios.toomanyfountains.items.DWItems;

import java.util.function.Supplier;

public class DWBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TooManyFountains.MODID);
// lmfao
    public static final RegistryObject<Block> CIRCUS_BOARDS = registerBlock("circus_boards",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.BAMBOO_WOOD)));
    public static final RegistryObject<Block> CIRCUS_FLOOR = registerBlock("circus_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> JELLITE_ORE = registerBlock("jellite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> MUSHITE = registerBlock("mushite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FUNGITE = registerBlock("fungite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> BLIGHTSHROOM_PLANKS = registerBlock("blightshroom_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLIGHTSHROOM_STAIRS = registerBlock("blightshroom_stairs",
            () -> new StairBlock(() -> DWBlocks.BLIGHTSHROOM_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLIGHTSHROOM_SLAB = registerBlock("blightshroom_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLIGHTSHROOM_FENCE = registerBlock("blightshroom_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLIGHTSHROOM_FENCE_GATE = registerBlock("blightshroom_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BLIGHTSHROOM_DOOR = registerBlock("blightshroom_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD), BlockSetType.OAK));
//    public static final RegistryObject<Block> BLIGHTSHROOM_TRAPDOOR = registerBlock("blightshroom_trapdoor",
//            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> BLIGHTSHROOM_BUTTON = registerBlock("blightshroom_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD), BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> BLIGHTSHROOM_PRESSURE_PLATE = registerBlock("blightshroom_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD), BlockSetType.OAK));
    public static final RegistryObject<Block> MUSHSNOW = registerBlock("mushsnow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> FUNGAL_MUSHITE = registerBlock("fungal_mushite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FUNGAL_FUNGITE = registerBlock("fungal_fungite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> BLIGHTSHROOM_LEAVES = registerBlock("blightshroom_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> CIRCUS_ASH = registerBlock("circus_ash",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.SAND)));
    public static final RegistryObject<Block> CIRCUS_STONE = registerBlock("circus_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> SILWARE_DEBRIS = registerBlock("silware_debris",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANCIENT_DEBRIS)));

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
