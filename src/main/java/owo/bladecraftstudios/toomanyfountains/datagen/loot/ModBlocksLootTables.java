package owo.bladecraftstudios.toomanyfountains.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.blocks.DWBlocks;
import owo.bladecraftstudios.toomanyfountains.items.DWItems;

import java.util.Set;

public class ModBlocksLootTables extends BlockLootSubProvider {
    public ModBlocksLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //Circus
        this.dropSelf(DWBlocks.CIRCUS_FLOOR.get());
        this.dropSelf(DWBlocks.CIRCUS_ASH.get());
        this.dropSelf(DWBlocks.CIRCUS_STONE.get());
        this.add(DWBlocks.SILWARE_DEBRIS.get(),
                block -> createQroupletDrop(DWBlocks.SILWARE_DEBRIS.get(), DWItems.RAW_SILWARE.get()));
        this.dropSelf(DWBlocks.CIRCUS_BOARDS.get());

        //Ocean
        this.dropSelf(DWBlocks.RED_CORALWOOD_LOG.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_WOOD.get());
        this.dropSelf(DWBlocks.BLUE_CORALWOOD_LOG.get());
        this.dropSelf(DWBlocks.BLUE_CORALWOOD_WOOD.get());
        this.dropSelf(DWBlocks.PINK_CORALWOOD_LOG.get());
        this.dropSelf(DWBlocks.PINK_CORALWOOD_WOOD.get());
        this.dropSelf(DWBlocks.YELLOW_CORALWOOD_LOG.get());
        this.dropSelf(DWBlocks.YELLOW_CORALWOOD_WOOD.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_LOG.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_WOOD.get());
        this.dropSelf(DWBlocks.DEAD_CORALWOOD_LOG.get());
        this.dropSelf(DWBlocks.DEAD_CORALWOOD_WOOD.get());
        this.dropSelf(DWBlocks.OCEAN_DIRT.get());
        this.dropSelf(DWBlocks.OCEAN_SLATE.get());
        this.dropSelf(DWBlocks.DEEPSTONE.get());
        this.dropOther(DWBlocks.SHALLOWLIGHT_GRASS_BLOCK.get(), DWBlocks.OCEAN_DIRT.get());
        this.dropOther(DWBlocks.DEEPLIGHT_GRASS_BLOCK.get(), DWBlocks.OCEAN_DIRT.get());
        this.dropOther(DWBlocks.ABYSSLIGHT_GRASS_BLOCK.get(), DWBlocks.OCEAN_SLATE.get());
        this.dropOther(DWBlocks.SUNKENLIGHT_GRASS_BLOCK.get(), DWBlocks.DEEPSTONE.get());
        this.dropSelf(DWBlocks.FOAM_ORE.get());
        this.dropSelf(DWBlocks.ABYSS_ORE.get());
        this.dropSelf(DWBlocks.HYDRON_ORE.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_PLANKS.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_STAIRS.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_SLAB.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_FENCE.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_GATE.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_BUTTON.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_DOOR.get());
        this.dropSelf(DWBlocks.RED_CORALWOOD_TRAPDOOR.get());
        this.dropSelf(DWBlocks.BLUE_CORALWOOD_PLANKS.get());
        this.dropSelf(DWBlocks.PINK_CORALWOOD_PLANKS.get());
        this.dropSelf(DWBlocks.YELLOW_CORALWOOD_PLANKS.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_PLANKS.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_STAIRS.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_SLAB.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_FENCE.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_GATE.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_BUTTON.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_DOOR.get());
        this.dropSelf(DWBlocks.PURPLE_CORALWOOD_TRAPDOOR.get());
        this.dropSelf(DWBlocks.DEAD_CORALWOOD_PLANKS.get());

        //Cold Place
        this.dropSelf(DWBlocks.SOOT_SNOW.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_LOG.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_WOOD.get());
        this.dropSelf(DWBlocks.STRIPPED_FROZEN_OAK_LOG.get());
        this.dropSelf(DWBlocks.STRIPPED_FROZEN_OAK_WOOD.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_PLANKS.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_STAIRS.get());
        this.add(DWBlocks.FROZEN_OAK_SLAB.get(),
            block -> createSlabItemTable(DWBlocks.FROZEN_OAK_SLAB.get()));
        this.add(DWBlocks.FROZEN_OAK_DOOR.get(),
            block -> createDoorTable(DWBlocks.FROZEN_OAK_DOOR.get()));

        this.dropSelf(DWBlocks.FROZEN_OAK_TRAPDOOR.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_WALL.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_FENCE.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_GATE.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_BUTTON.get());
        this.dropOther(DWBlocks.ICESALT.get(), DWBlocks.COBBLED_ICESALT.get());
        this.dropSelf(DWBlocks.COBBLED_ICESALT.get());
        this.dropSelf(DWBlocks.POLISHED_ICESALT.get());
        this.dropSelf(DWBlocks.CHISELED_ICESALT.get());
        this.dropSelf(DWBlocks.ICESALT_BRICKS.get());
        this.dropSelf(DWBlocks.ICESALT_PILLAR.get());
        this.dropSelf(DWBlocks.ICESALT_TILES.get());
        this.dropSelf(DWBlocks.ICESALT_STAIRS.get());
        this.add(DWBlocks.ICESALT_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.ICESALT_SLAB.get()));
        this.dropSelf(DWBlocks.ICESALT_WALL.get());
        this.dropSelf(DWBlocks.ICESALT_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.ICESALT_BUTTON.get());
        this.dropOther(DWBlocks.HAILSTONE.get(), DWBlocks.COBBLED_HAILSTONE.get());
        this.dropSelf(DWBlocks.COBBLED_HAILSTONE.get());
        this.dropSelf(DWBlocks.POLISHED_HAILSTONE.get());
        this.dropSelf(DWBlocks.CHISELED_HAILSTONE.get());
        this.dropSelf(DWBlocks.HAILSTONE_BRICKS.get());
        this.dropSelf(DWBlocks.HAILSTONE_PILLAR.get());
        this.dropSelf(DWBlocks.HAILSTONE_TILES.get());
        this.dropSelf(DWBlocks.HAILSTONE_STAIRS.get());
        this.add(DWBlocks.HAILSTONE_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.HAILSTONE_SLAB.get()));
        this.dropSelf(DWBlocks.HAILSTONE_WALL.get());
        this.dropSelf(DWBlocks.HAILSTONE_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.HAILSTONE_BUTTON.get());
        this.dropOther(DWBlocks.SUBZERO_STONE.get(), DWBlocks.COBBLED_SUBZERO_STONE.get());
        this.dropSelf(DWBlocks.COBBLED_SUBZERO_STONE.get());
        this.dropSelf(DWBlocks.POLISHED_SUBZERO_STONE.get());
        this.dropSelf(DWBlocks.CHISELED_SUBZERO_STONE.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_BRICKS.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_PILLAR.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_TILES.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_STAIRS.get());
        this.add(DWBlocks.SUBZERO_STONE_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.SUBZERO_STONE_SLAB.get()));
        this.dropSelf(DWBlocks.SUBZERO_STONE_WALL.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_BUTTON.get());
        this.dropOther(DWBlocks.FROST_MARBLE.get(), DWBlocks.COBBLED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.COBBLED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.POLISHED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.CHISELED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_BRICKS.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_PILLAR.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_TILES.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_STAIRS.get());
        this.add(DWBlocks.FROST_MARBLE_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.FROST_MARBLE_SLAB.get()));
        this.dropSelf(DWBlocks.FROST_MARBLE_WALL.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_BUTTON.get());
        this.dropSelf(DWBlocks.ARCTIC_SNOW_BLOCK.get());
        this.dropSelf(DWBlocks.ARCTIC_SNOW.get());
        this.dropSelf(DWBlocks.POWDER_ARCTIC_SNOW.get());

        //COBBLED_ cobbled_
        this.dropSelf(DWBlocks.COBBLED_ICESALT_STAIRS.get());
        this.add(DWBlocks.COBBLED_ICESALT_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.COBBLED_ICESALT_SLAB.get()));
        this.dropSelf(DWBlocks.COBBLED_ICESALT_WALL.get());
        this.dropSelf(DWBlocks.COBBLED_ICESALT_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.COBBLED_ICESALT_BUTTON.get());
        this.dropSelf(DWBlocks.COBBLED_HAILSTONE_STAIRS.get());
        this.add(DWBlocks.COBBLED_HAILSTONE_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.COBBLED_HAILSTONE_SLAB.get()));
        this.dropSelf(DWBlocks.COBBLED_HAILSTONE_WALL.get());
        this.dropSelf(DWBlocks.COBBLED_HAILSTONE_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.COBBLED_HAILSTONE_BUTTON.get());
        this.dropSelf(DWBlocks.COBBLED_SUBZERO_STONE_STAIRS.get());
        this.add(DWBlocks.COBBLED_SUBZERO_STONE_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.COBBLED_SUBZERO_STONE_SLAB.get()));
        this.dropSelf(DWBlocks.COBBLED_SUBZERO_STONE_WALL.get());
        this.dropSelf(DWBlocks.COBBLED_SUBZERO_STONE_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.COBBLED_SUBZERO_STONE_BUTTON.get());
        this.dropSelf(DWBlocks.COBBLED_FROST_MARBLE_STAIRS.get());
        this.add(DWBlocks.COBBLED_FROST_MARBLE_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.COBBLED_FROST_MARBLE_SLAB.get()));
        this.dropSelf(DWBlocks.COBBLED_FROST_MARBLE_WALL.get());
        this.dropSelf(DWBlocks.COBBLED_FROST_MARBLE_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.COBBLED_FROST_MARBLE_BUTTON.get());

        //POLISHED_ polished_
        this.dropSelf(DWBlocks.POLISHED_ICESALT_STAIRS.get());
        this.add(DWBlocks.POLISHED_ICESALT_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.POLISHED_ICESALT_SLAB.get()));
        this.dropSelf(DWBlocks.POLISHED_ICESALT_WALL.get());
        this.dropSelf(DWBlocks.POLISHED_ICESALT_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.POLISHED_ICESALT_BUTTON.get());
        this.dropSelf(DWBlocks.POLISHED_HAILSTONE_STAIRS.get());
        this.add(DWBlocks.POLISHED_HAILSTONE_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.POLISHED_HAILSTONE_SLAB.get()));
        this.dropSelf(DWBlocks.POLISHED_HAILSTONE_WALL.get());
        this.dropSelf(DWBlocks.POLISHED_HAILSTONE_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.POLISHED_HAILSTONE_BUTTON.get());
        this.dropSelf(DWBlocks.POLISHED_SUBZERO_STONE_STAIRS.get());
        this.add(DWBlocks.POLISHED_SUBZERO_STONE_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.POLISHED_SUBZERO_STONE_SLAB.get()));
        this.dropSelf(DWBlocks.POLISHED_SUBZERO_STONE_WALL.get());
        this.dropSelf(DWBlocks.POLISHED_SUBZERO_STONE_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.POLISHED_SUBZERO_STONE_BUTTON.get());
        this.dropSelf(DWBlocks.POLISHED_FROST_MARBLE_STAIRS.get());
        this.add(DWBlocks.POLISHED_FROST_MARBLE_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.POLISHED_FROST_MARBLE_SLAB.get()));
        this.dropSelf(DWBlocks.POLISHED_FROST_MARBLE_WALL.get());
        this.dropSelf(DWBlocks.POLISHED_FROST_MARBLE_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.POLISHED_FROST_MARBLE_BUTTON.get());

        //_BRICKS _bricks
        this.dropSelf(DWBlocks.ICESALT_BRICKS_STAIRS.get());
        this.add(DWBlocks.ICESALT_BRICKS_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.ICESALT_BRICKS_SLAB.get()));
        this.dropSelf(DWBlocks.ICESALT_BRICKS_WALL.get());
        this.dropSelf(DWBlocks.ICESALT_BRICKS_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.ICESALT_BRICKS_BUTTON.get());
        this.dropSelf(DWBlocks.HAILSTONE_BRICKS_STAIRS.get());
        this.add(DWBlocks.HAILSTONE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.HAILSTONE_BRICKS_SLAB.get()));
        this.dropSelf(DWBlocks.HAILSTONE_BRICKS_WALL.get());
        this.dropSelf(DWBlocks.HAILSTONE_BRICKS_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.HAILSTONE_BRICKS_BUTTON.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_BRICKS_STAIRS.get());
        this.add(DWBlocks.SUBZERO_STONE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.SUBZERO_STONE_BRICKS_SLAB.get()));
        this.dropSelf(DWBlocks.SUBZERO_STONE_BRICKS_WALL.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_BRICKS_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_BRICKS_BUTTON.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_BRICKS_STAIRS.get());
        this.add(DWBlocks.FROST_MARBLE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.FROST_MARBLE_BRICKS_SLAB.get()));
        this.dropSelf(DWBlocks.FROST_MARBLE_BRICKS_WALL.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_BRICKS_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_BRICKS_BUTTON.get());

        //_TILES _tiles
        this.dropSelf(DWBlocks.ICESALT_TILES_STAIRS.get());
        this.add(DWBlocks.ICESALT_TILES_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.ICESALT_TILES_SLAB.get()));
        this.dropSelf(DWBlocks.ICESALT_TILES_WALL.get());
        this.dropSelf(DWBlocks.ICESALT_TILES_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.ICESALT_TILES_BUTTON.get());
        this.dropSelf(DWBlocks.HAILSTONE_TILES_STAIRS.get());
        this.add(DWBlocks.HAILSTONE_TILES_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.HAILSTONE_TILES_SLAB.get()));
        this.dropSelf(DWBlocks.HAILSTONE_TILES_WALL.get());
        this.dropSelf(DWBlocks.HAILSTONE_TILES_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.HAILSTONE_TILES_BUTTON.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_TILES_STAIRS.get());
        this.add(DWBlocks.SUBZERO_STONE_TILES_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.SUBZERO_STONE_TILES_SLAB.get()));
        this.dropSelf(DWBlocks.SUBZERO_STONE_TILES_WALL.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_TILES_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_TILES_BUTTON.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_TILES_STAIRS.get());
        this.add(DWBlocks.FROST_MARBLE_TILES_SLAB.get(),
                block -> createSlabItemTable(DWBlocks.FROST_MARBLE_TILES_SLAB.get()));
        this.dropSelf(DWBlocks.FROST_MARBLE_TILES_WALL.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_TILES_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_TILES_BUTTON.get());

    }

    private void dropsSelf() {
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createRareOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 6.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createQroupletDrop(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DWBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}