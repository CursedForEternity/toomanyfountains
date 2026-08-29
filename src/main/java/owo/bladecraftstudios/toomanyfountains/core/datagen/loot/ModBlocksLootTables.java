package owo.bladecraftstudios.toomanyfountains.core.datagen.loot;

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
import owo.bladecraftstudios.toomanyfountains.server.blocks.*;
import owo.bladecraftstudios.toomanyfountains.server.registries.DWItems;

import java.util.Set;

public class ModBlocksLootTables extends BlockLootSubProvider {
    public ModBlocksLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //Circus
        this.dropSelf(DWCircusBlocks.CIRCUS_FLOOR.get());
        this.dropSelf(DWCircusBlocks.CIRCUS_ASH.get());
        this.dropSelf(DWCircusBlocks.CIRCUS_STONE.get());
        this.add(DWCircusBlocks.SILWARE_DEBRIS.get(),
                block -> createQroupletDrop(DWCircusBlocks.SILWARE_DEBRIS.get(), DWItems.RAW_SILWARE.get()));
        this.add(DWCircusBlocks.MEMOSHARD_ORE.get(),
                block -> createCopperLikeOreDrops(DWCircusBlocks.MEMOSHARD_ORE.get(), DWItems.MEMOSHARD.get()));
        this.dropSelf(DWCircusBlocks.MEMOROCK.get());
        this.dropSelf(DWCircusBlocks.CIRCUS_BOARDS.get());

        //Ocean
        this.dropSelf(DWWoodBlocks.RED_CORALWOOD_LOG.get());
        this.dropSelf(DWWoodBlocks.RED_CORALWOOD_WOOD.get());
        this.dropSelf(DWWoodBlocks.GREEN_CORALWOOD_LOG.get());
        this.dropSelf(DWWoodBlocks.GREEN_CORALWOOD_WOOD.get());
        this.dropSelf(DWWoodBlocks.GREEN_CORALWOOD_PLANKS.get());
        this.dropSelf(DWWoodBlocks.BLUE_CORALWOOD_LOG.get());
        this.dropSelf(DWWoodBlocks.BLUE_CORALWOOD_WOOD.get());
        this.dropSelf(DWWoodBlocks.PINK_CORALWOOD_LOG.get());
        this.dropSelf(DWWoodBlocks.PINK_CORALWOOD_WOOD.get());
        this.dropSelf(DWWoodBlocks.YELLOW_CORALWOOD_LOG.get());
        this.dropSelf(DWWoodBlocks.YELLOW_CORALWOOD_WOOD.get());
        this.dropSelf(DWWoodBlocks.PURPLE_CORALWOOD_LOG.get());
        this.dropSelf(DWWoodBlocks.PURPLE_CORALWOOD_WOOD.get());
        this.dropSelf(DWWoodBlocks.DEAD_CORALWOOD_LOG.get());
        this.dropSelf(DWWoodBlocks.DEAD_CORALWOOD_WOOD.get());
        this.dropSelf(DWOceanWorldgenBlocks.HOT_PATH.get());
        this.dropSelf(DWOceanWorldgenBlocks.HOT_ROCK.get());
        this.dropSelf(DWOceanWorldgenBlocks.OCEAN_DIRT.get());
        this.dropOther(DWOceanWorldgenBlocks.OCEAN_SLATE.get(), DWStoneBlocks.COBBLED_SLATE.get());
        this.dropSelf(DWStoneBlocks.SLATE_BRICKS.get());
        this.dropSelf(DWStoneBlocks.SMOOTH_SLATE.get());
        this.dropSelf(DWStoneBlocks.COBBLED_SLATE.get());
        this.dropSelf(DWStoneBlocks.POLISHED_SLATE.get());
        this.dropSelf(DWStoneBlocks.POLISHED_DEEPSTONE.get());
        this.dropSelf(DWStoneBlocks.DEEPSTONE_BRICKS.get());
        this.dropSelf(DWStoneBlocks.SMOOTH_DEEPSTONE.get());
        this.dropSelf(DWStoneBlocks.COBBLED_DEEPSTONE.get());
        this.dropSelf(DWStoneBlocks.CHISELED_DEEPSTONE.get());
        this.dropSelf(DWStoneBlocks.CHISELED_SLATE.get());
        this.dropOther(DWOceanWorldgenBlocks.DEEPSTONE.get(), DWStoneBlocks.COBBLED_DEEPSTONE.get());
        this.dropOther(DWOceanWorldgenBlocks.SHALLOWLIGHT_GRASS_BLOCK.get(), DWOceanWorldgenBlocks.OCEAN_DIRT.get());
        this.dropOther(DWOceanWorldgenBlocks.DEEPLIGHT_GRASS_BLOCK.get(), DWOceanWorldgenBlocks.OCEAN_DIRT.get());
        this.dropOther(DWOceanWorldgenBlocks.ABYSSLIGHT_GRASS_BLOCK.get(), DWOceanWorldgenBlocks.OCEAN_SLATE.get());
        this.dropOther(DWOceanWorldgenBlocks.SUNKENLIGHT_GRASS_BLOCK.get(), DWOceanWorldgenBlocks.DEEPSTONE.get());
        this.dropSelf(DWOceanWorldgenBlocks.FOAM_ORE.get());
        this.dropSelf(DWOceanWorldgenBlocks.OCEAN_DIRT_FOAM_ORE.get());
        this.dropSelf(DWOceanWorldgenBlocks.ABYSS_ORE.get());
        this.dropSelf(DWOceanWorldgenBlocks.HYDRON_ORE.get());
        this.dropSelf(DWWoodBlocks.RED_CORALWOOD_PLANKS.get());
        this.dropSelf(DWWoodBlocks.RED_CORALWOOD_STAIRS.get());
        this.add(DWWoodBlocks.RED_CORALWOOD_SLAB.get(),
                block -> createSlabItemTable(DWWoodBlocks.RED_CORALWOOD_SLAB.get()));
        this.dropSelf(DWWoodBlocks.RED_CORALWOOD_FENCE.get());
        this.dropSelf(DWWoodBlocks.RED_CORALWOOD_GATE.get());
        this.dropSelf(DWWoodBlocks.RED_CORALWOOD_PRESSURE_PLATE.get());
        this.dropSelf(DWWoodBlocks.RED_CORALWOOD_BUTTON.get());
        this.add(DWWoodBlocks.RED_CORALWOOD_DOOR.get(),
                block -> createDoorTable(DWWoodBlocks.RED_CORALWOOD_DOOR.get()));
        this.dropSelf(DWWoodBlocks.RED_CORALWOOD_TRAPDOOR.get());
        this.dropSelf(DWWoodBlocks.BLUE_CORALWOOD_PLANKS.get());
        this.dropSelf(DWWoodBlocks.PINK_CORALWOOD_PLANKS.get());
        this.dropSelf(DWWoodBlocks.YELLOW_CORALWOOD_PLANKS.get());
        this.dropSelf(DWWoodBlocks.PURPLE_CORALWOOD_PLANKS.get());
        this.dropSelf(DWWoodBlocks.PURPLE_CORALWOOD_STAIRS.get());
        this.add(DWWoodBlocks.PURPLE_CORALWOOD_SLAB.get(),
                block -> createSlabItemTable(DWWoodBlocks.PURPLE_CORALWOOD_SLAB.get()));
        this.dropSelf(DWWoodBlocks.PURPLE_CORALWOOD_FENCE.get());
        this.dropSelf(DWWoodBlocks.PURPLE_CORALWOOD_GATE.get());
        this.dropSelf(DWWoodBlocks.PURPLE_CORALWOOD_PRESSURE_PLATE.get());
        this.dropSelf(DWWoodBlocks.PURPLE_CORALWOOD_BUTTON.get());
        this.add(DWWoodBlocks.PURPLE_CORALWOOD_DOOR.get(),
                block -> createDoorTable(DWWoodBlocks.PURPLE_CORALWOOD_DOOR.get()));
        this.dropSelf(DWWoodBlocks.PURPLE_CORALWOOD_TRAPDOOR.get());
        this.dropSelf(DWWoodBlocks.YELLOW_CORALWOOD_STAIRS.get());
        this.add(DWWoodBlocks.YELLOW_CORALWOOD_SLAB.get(),
                block -> createSlabItemTable(DWWoodBlocks.YELLOW_CORALWOOD_SLAB.get()));
        this.dropSelf(DWWoodBlocks.YELLOW_CORALWOOD_FENCE.get());
        this.dropSelf(DWWoodBlocks.YELLOW_CORALWOOD_GATE.get());
        this.dropSelf(DWWoodBlocks.YELLOW_CORALWOOD_PRESSURE_PLATE.get());
        this.dropSelf(DWWoodBlocks.YELLOW_CORALWOOD_BUTTON.get());
        this.add(DWWoodBlocks.YELLOW_CORALWOOD_DOOR.get(),
                block -> createDoorTable(DWWoodBlocks.YELLOW_CORALWOOD_DOOR.get()));
        this.dropSelf(DWWoodBlocks.YELLOW_CORALWOOD_TRAPDOOR.get());
        this.dropSelf(DWWoodBlocks.DEAD_CORALWOOD_PLANKS.get());
        this.dropSelf(DWWoodBlocks.BLUE_CORALWOOD_STAIRS.get());
        this.add(DWWoodBlocks.BLUE_CORALWOOD_SLAB.get(),
                block -> createSlabItemTable(DWWoodBlocks.BLUE_CORALWOOD_SLAB.get()));
        this.dropSelf(DWWoodBlocks.BLUE_CORALWOOD_FENCE.get());
        this.dropSelf(DWWoodBlocks.BLUE_CORALWOOD_GATE.get());
        this.dropSelf(DWWoodBlocks.BLUE_CORALWOOD_PRESSURE_PLATE.get());
        this.dropSelf(DWWoodBlocks.BLUE_CORALWOOD_BUTTON.get());
        this.add(DWWoodBlocks.BLUE_CORALWOOD_DOOR.get(),
                block -> createDoorTable(DWWoodBlocks.BLUE_CORALWOOD_DOOR.get()));
        this.dropSelf(DWWoodBlocks.BLUE_CORALWOOD_TRAPDOOR.get());
        this.dropSelf(DWWoodBlocks.PINK_CORALWOOD_STAIRS.get());
        this.add(DWWoodBlocks.PINK_CORALWOOD_SLAB.get(),
                block -> createSlabItemTable(DWWoodBlocks.PINK_CORALWOOD_SLAB.get()));
        this.dropSelf(DWWoodBlocks.PINK_CORALWOOD_FENCE.get());
        this.dropSelf(DWWoodBlocks.PINK_CORALWOOD_GATE.get());
        this.dropSelf(DWWoodBlocks.PINK_CORALWOOD_PRESSURE_PLATE.get());
        this.dropSelf(DWWoodBlocks.PINK_CORALWOOD_BUTTON.get());
        this.add(DWWoodBlocks.PINK_CORALWOOD_DOOR.get(),
                block -> createDoorTable(DWWoodBlocks.PINK_CORALWOOD_DOOR.get()));
        this.dropSelf(DWWoodBlocks.PINK_CORALWOOD_TRAPDOOR.get());
        this.dropSelf(DWOceanWorldgenBlocks.BUBBLE_SAND.get());
        this.dropSelf(DWWoodBlocks.GREEN_CORALWOOD_STAIRS.get());
        this.add(DWWoodBlocks.GREEN_CORALWOOD_SLAB.get(),
                block -> createSlabItemTable(DWWoodBlocks.GREEN_CORALWOOD_SLAB.get()));
        this.dropSelf(DWWoodBlocks.GREEN_CORALWOOD_FENCE.get());
        this.dropSelf(DWWoodBlocks.GREEN_CORALWOOD_GATE.get());
        this.dropSelf(DWWoodBlocks.GREEN_CORALWOOD_PRESSURE_PLATE.get());
        this.dropSelf(DWWoodBlocks.GREEN_CORALWOOD_BUTTON.get());
        this.add(DWWoodBlocks.GREEN_CORALWOOD_DOOR.get(),
                block -> createDoorTable(DWWoodBlocks.GREEN_CORALWOOD_DOOR.get()));
        this.dropSelf(DWWoodBlocks.GREEN_CORALWOOD_TRAPDOOR.get());

        //Cold Place
        this.dropSelf(DWWoodBlocks.SOOT_SNOW.get());
        this.dropSelf(DWWoodBlocks.FROZEN_OAK_LOG.get());
        this.dropSelf(DWWoodBlocks.FROZEN_OAK_WOOD.get());
        this.dropSelf(DWWoodBlocks.STRIPPED_FROZEN_OAK_LOG.get());
        this.dropSelf(DWWoodBlocks.STRIPPED_FROZEN_OAK_WOOD.get());
        this.dropSelf(DWWoodBlocks.FROZEN_OAK_PLANKS.get());
        this.dropSelf(DWWoodBlocks.FROZEN_OAK_STAIRS.get());
        this.add(DWWoodBlocks.FROZEN_OAK_SLAB.get(),
            block -> createSlabItemTable(DWWoodBlocks.FROZEN_OAK_SLAB.get()));
        this.add(DWWoodBlocks.FROZEN_OAK_DOOR.get(),
            block -> createDoorTable(DWWoodBlocks.FROZEN_OAK_DOOR.get()));

        this.dropSelf(DWWoodBlocks.FROZEN_OAK_TRAPDOOR.get());
        this.dropSelf(DWWoodBlocks.FROZEN_OAK_WALL.get());
        this.dropSelf(DWWoodBlocks.FROZEN_OAK_FENCE.get());
        this.dropSelf(DWWoodBlocks.FROZEN_OAK_GATE.get());
        this.dropSelf(DWWoodBlocks.FROZEN_OAK_PRESSURE_PLATE.get());
        this.dropSelf(DWWoodBlocks.FROZEN_OAK_BUTTON.get());
        this.dropOther(DWBlocks.ICESALT.get(), DWBlocks.COBBLED_ICESALT.get());
        this.dropSelf(DWBlocks.COBBLED_ICESALT.get());
        this.dropSelf(DWBlocks.POLISHED_ICESALT.get());
        this.dropSelf(DWBlocks.CHISELED_ICESALT.get());
        this.dropSelf(DWBlocks.ICESALT_BRICKS.get());
        this.dropSelf(DWColdBlocks.ICESALT_PILLAR.get());
        this.dropSelf(DWBlocks.ICESALT_TILES.get());
        this.dropSelf(DWColdBlocks.ICESALT_STAIRS.get());
        this.add(DWColdBlocks.ICESALT_SLAB.get(),
                block -> createSlabItemTable(DWColdBlocks.ICESALT_SLAB.get()));
        this.dropSelf(DWColdBlocks.ICESALT_WALL.get());
        this.dropSelf(DWColdBlocks.ICESALT_PRESSURE_PLATE.get());
        this.dropSelf(DWColdBlocks.ICESALT_BUTTON.get());
        this.dropOther(DWBlocks.HAILSTONE.get(), DWBlocks.COBBLED_HAILSTONE.get());
        this.dropSelf(DWBlocks.COBBLED_HAILSTONE.get());
        this.dropSelf(DWBlocks.POLISHED_HAILSTONE.get());
        this.dropSelf(DWBlocks.CHISELED_HAILSTONE.get());
        this.dropSelf(DWBlocks.HAILSTONE_BRICKS.get());
        this.dropSelf(DWColdBlocks.HAILSTONE_PILLAR.get());
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
        this.dropSelf(DWColdBlocks.SUBZERO_STONE_PILLAR.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_TILES.get());
        this.dropSelf(DWColdBlocks.SUBZERO_STONE_STAIRS.get());
        this.add(DWColdBlocks.SUBZERO_STONE_SLAB.get(),
                block -> createSlabItemTable(DWColdBlocks.SUBZERO_STONE_SLAB.get()));
        this.dropSelf(DWColdBlocks.SUBZERO_STONE_WALL.get());
        this.dropSelf(DWColdBlocks.SUBZERO_STONE_PRESSURE_PLATE.get());
        this.dropSelf(DWColdBlocks.SUBZERO_STONE_BUTTON.get());
        this.dropOther(DWBlocks.FROST_MARBLE.get(), DWBlocks.COBBLED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.COBBLED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.POLISHED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.CHISELED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_BRICKS.get());
        this.dropSelf(DWColdBlocks.FROST_MARBLE_PILLAR.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_TILES.get());
        this.dropSelf(DWColdBlocks.FROST_MARBLE_STAIRS.get());
        this.add(DWColdBlocks.FROST_MARBLE_SLAB.get(),
                block -> createSlabItemTable(DWColdBlocks.FROST_MARBLE_SLAB.get()));
        this.dropSelf(DWColdBlocks.FROST_MARBLE_WALL.get());
        this.dropSelf(DWColdBlocks.FROST_MARBLE_PRESSURE_PLATE.get());
        this.dropSelf(DWColdBlocks.FROST_MARBLE_BUTTON.get());
        this.dropSelf(DWBlocks.ARCTIC_SNOW_BLOCK.get());
        this.dropSelf(DWBlocks.ARCTIC_SNOW.get());
        this.dropSelf(DWBlocks.POWDER_ARCTIC_SNOW.get());

        //COBBLED_ cobbled_
        this.dropSelf(DWCobbledBlocks.COBBLED_ICESALT_STAIRS.get());
        this.add(DWCobbledBlocks.COBBLED_ICESALT_SLAB.get(),
                block -> createSlabItemTable(DWCobbledBlocks.COBBLED_ICESALT_SLAB.get()));
        this.dropSelf(DWCobbledBlocks.COBBLED_ICESALT_WALL.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_ICESALT_PRESSURE_PLATE.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_ICESALT_BUTTON.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_HAILSTONE_STAIRS.get());
        this.add(DWCobbledBlocks.COBBLED_HAILSTONE_SLAB.get(),
                block -> createSlabItemTable(DWCobbledBlocks.COBBLED_HAILSTONE_SLAB.get()));
        this.dropSelf(DWCobbledBlocks.COBBLED_HAILSTONE_WALL.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_HAILSTONE_PRESSURE_PLATE.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_HAILSTONE_BUTTON.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_SUBZERO_STONE_STAIRS.get());
        this.add(DWCobbledBlocks.COBBLED_SUBZERO_STONE_SLAB.get(),
                block -> createSlabItemTable(DWCobbledBlocks.COBBLED_SUBZERO_STONE_SLAB.get()));
        this.dropSelf(DWCobbledBlocks.COBBLED_SUBZERO_STONE_WALL.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_SUBZERO_STONE_PRESSURE_PLATE.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_SUBZERO_STONE_BUTTON.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_FROST_MARBLE_STAIRS.get());
        this.add(DWCobbledBlocks.COBBLED_FROST_MARBLE_SLAB.get(),
                block -> createSlabItemTable(DWCobbledBlocks.COBBLED_FROST_MARBLE_SLAB.get()));
        this.dropSelf(DWCobbledBlocks.COBBLED_FROST_MARBLE_WALL.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_FROST_MARBLE_PRESSURE_PLATE.get());
        this.dropSelf(DWCobbledBlocks.COBBLED_FROST_MARBLE_BUTTON.get());

        //POLISHED_ polished_
        this.dropSelf(DWPolishedBlocks.POLISHED_ICESALT_STAIRS.get());
        this.add(DWPolishedBlocks.POLISHED_ICESALT_SLAB.get(),
                block -> createSlabItemTable(DWPolishedBlocks.POLISHED_ICESALT_SLAB.get()));
        this.dropSelf(DWPolishedBlocks.POLISHED_ICESALT_WALL.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_ICESALT_PRESSURE_PLATE.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_ICESALT_BUTTON.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_HAILSTONE_STAIRS.get());
        this.add(DWPolishedBlocks.POLISHED_HAILSTONE_SLAB.get(),
                block -> createSlabItemTable(DWPolishedBlocks.POLISHED_HAILSTONE_SLAB.get()));
        this.dropSelf(DWPolishedBlocks.POLISHED_HAILSTONE_WALL.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_HAILSTONE_PRESSURE_PLATE.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_HAILSTONE_BUTTON.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_SUBZERO_STONE_STAIRS.get());
        this.add(DWPolishedBlocks.POLISHED_SUBZERO_STONE_SLAB.get(),
                block -> createSlabItemTable(DWPolishedBlocks.POLISHED_SUBZERO_STONE_SLAB.get()));
        this.dropSelf(DWPolishedBlocks.POLISHED_SUBZERO_STONE_WALL.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_SUBZERO_STONE_PRESSURE_PLATE.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_SUBZERO_STONE_BUTTON.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_FROST_MARBLE_STAIRS.get());
        this.add(DWPolishedBlocks.POLISHED_FROST_MARBLE_SLAB.get(),
                block -> createSlabItemTable(DWPolishedBlocks.POLISHED_FROST_MARBLE_SLAB.get()));
        this.dropSelf(DWPolishedBlocks.POLISHED_FROST_MARBLE_WALL.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_FROST_MARBLE_PRESSURE_PLATE.get());
        this.dropSelf(DWPolishedBlocks.POLISHED_FROST_MARBLE_BUTTON.get());

        //_BRICKS _bricks
        this.dropSelf(DWBrickBlocks.ICESALT_BRICKS_STAIRS.get());
        this.add(DWBrickBlocks.ICESALT_BRICKS_SLAB.get(),
                block -> createSlabItemTable(DWBrickBlocks.ICESALT_BRICKS_SLAB.get()));
        this.dropSelf(DWBrickBlocks.ICESALT_BRICKS_WALL.get());
        this.dropSelf(DWBrickBlocks.ICESALT_BRICKS_PRESSURE_PLATE.get());
        this.dropSelf(DWBrickBlocks.ICESALT_BRICKS_BUTTON.get());
        this.dropSelf(DWBrickBlocks.HAILSTONE_BRICKS_STAIRS.get());
        this.add(DWBrickBlocks.HAILSTONE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(DWBrickBlocks.HAILSTONE_BRICKS_SLAB.get()));
        this.dropSelf(DWBrickBlocks.HAILSTONE_BRICKS_WALL.get());
        this.dropSelf(DWBrickBlocks.HAILSTONE_BRICKS_PRESSURE_PLATE.get());
        this.dropSelf(DWBrickBlocks.HAILSTONE_BRICKS_BUTTON.get());
        this.dropSelf(DWBrickBlocks.SUBZERO_STONE_BRICKS_STAIRS.get());
        this.add(DWBrickBlocks.SUBZERO_STONE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(DWBrickBlocks.SUBZERO_STONE_BRICKS_SLAB.get()));
        this.dropSelf(DWBrickBlocks.SUBZERO_STONE_BRICKS_WALL.get());
        this.dropSelf(DWBrickBlocks.SUBZERO_STONE_BRICKS_PRESSURE_PLATE.get());
        this.dropSelf(DWBrickBlocks.SUBZERO_STONE_BRICKS_BUTTON.get());
        this.dropSelf(DWBrickBlocks.FROST_MARBLE_BRICKS_STAIRS.get());
        this.add(DWBrickBlocks.FROST_MARBLE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(DWBrickBlocks.FROST_MARBLE_BRICKS_SLAB.get()));
        this.dropSelf(DWBrickBlocks.FROST_MARBLE_BRICKS_WALL.get());
        this.dropSelf(DWBrickBlocks.FROST_MARBLE_BRICKS_PRESSURE_PLATE.get());
        this.dropSelf(DWBrickBlocks.FROST_MARBLE_BRICKS_BUTTON.get());

        //_TILES _tiles
        this.dropSelf(DWTilesBlocks.ICESALT_TILES_STAIRS.get());
        this.add(DWTilesBlocks.ICESALT_TILES_SLAB.get(),
                block -> createSlabItemTable(DWTilesBlocks.ICESALT_TILES_SLAB.get()));
        this.dropSelf(DWTilesBlocks.ICESALT_TILES_WALL.get());
        this.dropSelf(DWTilesBlocks.ICESALT_TILES_PRESSURE_PLATE.get());
        this.dropSelf(DWTilesBlocks.ICESALT_TILES_BUTTON.get());
        this.dropSelf(DWTilesBlocks.HAILSTONE_TILES_STAIRS.get());
        this.add(DWTilesBlocks.HAILSTONE_TILES_SLAB.get(),
                block -> createSlabItemTable(DWTilesBlocks.HAILSTONE_TILES_SLAB.get()));
        this.dropSelf(DWTilesBlocks.HAILSTONE_TILES_WALL.get());
        this.dropSelf(DWTilesBlocks.HAILSTONE_TILES_PRESSURE_PLATE.get());
        this.dropSelf(DWTilesBlocks.HAILSTONE_TILES_BUTTON.get());
        this.dropSelf(DWTilesBlocks.SUBZERO_STONE_TILES_STAIRS.get());
        this.add(DWTilesBlocks.SUBZERO_STONE_TILES_SLAB.get(),
                block -> createSlabItemTable(DWTilesBlocks.SUBZERO_STONE_TILES_SLAB.get()));
        this.dropSelf(DWTilesBlocks.SUBZERO_STONE_TILES_WALL.get());
        this.dropSelf(DWTilesBlocks.SUBZERO_STONE_TILES_PRESSURE_PLATE.get());
        this.dropSelf(DWTilesBlocks.SUBZERO_STONE_TILES_BUTTON.get());
        this.dropSelf(DWTilesBlocks.FROST_MARBLE_TILES_STAIRS.get());
        this.add(DWTilesBlocks.FROST_MARBLE_TILES_SLAB.get(),
                block -> createSlabItemTable(DWTilesBlocks.FROST_MARBLE_TILES_SLAB.get()));
        this.dropSelf(DWTilesBlocks.FROST_MARBLE_TILES_WALL.get());
        this.dropSelf(DWTilesBlocks.FROST_MARBLE_TILES_PRESSURE_PLATE.get());
        this.dropSelf(DWTilesBlocks.FROST_MARBLE_TILES_BUTTON.get());

        this.dropSelf(DWBlocks.CRYOLITE_BLOCK.get());
        this.dropSelf(DWBlocks.GLACIEITE_BLOCK.get());
        this.dropSelf(DWBlocks.GLACIER_ICE.get());
        this.dropSelf(DWBlocks.BITTER_ICE.get());
        this.dropSelf(DWBlocks.ILL_ICE.get());
        this.dropSelf(DWBlocks.BLACK_ICE.get());

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
        return DWStoneBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}