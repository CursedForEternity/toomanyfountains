package owo.bladecraftstudios.toomanyfountains.server.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import owo.bladecraftstudios.toomanyfountains.server.registries.DWFluids;
import owo.bladecraftstudios.toomanyfountains.server.registries.DWItems;

import java.util.function.Supplier;

public class DWBlocks {
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

    public static final RegistryObject<Block> GLACIEITE_BLOCK = registerBlock("glacieite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CRYOLITE_BLOCK = registerBlock("cryolite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GLACIER_ICE = registerBlock("glacier_ice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BITTER_ICE = registerBlock("bitter_ice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).sound(SoundType.GLASS)));

    //Bitter Ice is meant to damage player when stepped on, but I don't know how to implement that
    // Yw
    // - Codiak
    public static final RegistryObject<Block> ILL_ICE = registerBlock("ill_ice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).sound(SoundType.DEEPSLATE)) {
                @Override
                public void stepOn(@NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull BlockState pState, @NotNull Entity pEntity) {
                    pEntity.handleDamageEvent(pEntity.damageSources().generic());
                    super.stepOn(pLevel, pPos, pState, pEntity);
                }
            });
    public static final RegistryObject<Block> BLACK_ICE = registerBlock("black_ice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));
    //Black Ice is meant to have obsidian durability, mining and explosion wise, but I don't know how to implement that
    public static final RegistryObject<LiquidBlock> ARCTIC_WATER = DWStoneBlocks.BLOCKS.register("arctic_water",
            () -> new LiquidBlock(DWFluids.SOURCE_ARCTIC_WATER, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));
    //how do i give this custom textures?
    public static final RegistryObject<Block> ICE_LOCK = registerBlock("ice_lock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).sound(SoundType.NETHERITE_BLOCK)));

    protected static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = DWStoneBlocks.BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return DWItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        DWStoneBlocks.BLOCKS.register(eventBus);
    }

}
