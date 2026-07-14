package owo.bladecraftstudios.toomanyfountains.blocks;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.InstrumentTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
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
    public static final RegistryObject<Block> ICESALT = registerBlock("icesalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLED_ICESALT = registerBlock("cobble_icesalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_ICESALT = registerBlock("polished_icesalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_ICESALT = registerBlock("chiseled_icesalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ICESALT_ILES = registerBlock("icesalt_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE = registerBlock("hailstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLE_HAILSTONE = registerBlock("cobble_hailstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_HAILSTONE = registerBlock("polished_hailstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_HAILSTONE = registerBlock("chiseled_hailstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> HAILSTONE_TILES = registerBlock("hailstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE = registerBlock("subzero_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLE_SUBZERO_STONE = registerBlock("cobble_subzero_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_SUBZERO_STONE = registerBlock("polished_subzero_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_SUBZERO_STONE = registerBlock("chiseled_subzero_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> SUBZERO_STONE_TILES = registerBlock("hailstone_subzero_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE = registerBlock("frost_marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLE_FROST_MARBLE = registerBlock("cobble_frost_marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_FROST_MARBLE = registerBlock("polished_frost_marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISELED_FROST_MARBLE = registerBlock("chiseled_frost_marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> FROST_MARBLE_TILES = registerBlock("frost_marble_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> ARCTIC_SNOW = registerBlock("arctic_snow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SNOW).sound(SoundType.SNOW)));


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
