package owo.bladecraftstudios.toomanyfountains.core.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.core.util.UniversalCommon;
import owo.bladecraftstudios.toomanyfountains.server.blocks.*;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TooManyFountains.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // Circus
        blockWithItem(DWCircusBlocks.SILWARE_DEBRIS);
        blockColumn(DWCircusBlocks.CIRCUS_ASH);
        blockWithItem(DWCircusBlocks.MEMOROCK);
        blockWithItem(DWCircusBlocks.MEMOSHARD_ORE);
        blockWithItem(DWCircusBlocks.SILWARE_BLOCK);
        blockWithItem(DWCircusBlocks.RAW_SILWARE_BLOCK);
        blockColumn(DWCircusBlocks.CIRCUS_STONE);
        blockWithItem(DWCircusBlocks.FLOORBOARDS);
        stairsBlock(((StairBlock) DWCircusBlocks.FLOORBOARD_STAIRS.get()), blockTexture(DWCircusBlocks.FLOORBOARDS.get()));
        fenceBlock(((FenceBlock) DWCircusBlocks.FLOORBOARD_FENCE.get()), blockTexture(DWCircusBlocks.FLOORBOARDS.get()));
        fenceGateBlock(((FenceGateBlock) DWCircusBlocks.FLOORBOARD_FENCE_GATE.get()), blockTexture(DWCircusBlocks.FLOORBOARDS.get()));
        slabBlock(((SlabBlock) DWCircusBlocks.FLOORBOARD_SLAB.get()), blockTexture(DWCircusBlocks.FLOORBOARDS.get()), blockTexture(DWCircusBlocks.FLOORBOARDS.get()));
        doorBlockWithRenderType(((DoorBlock) DWCircusBlocks.FLOORBOARD_DOOR.get()), modLoc("block/floorboard_door_bottom"), modLoc("block/floorboard_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) DWCircusBlocks.FLOORBOARD_TRAPDOOR.get()), modLoc("block/floorboard_trapdoor"), true, "cutout");

        //Ocean
        trapdoorBlockWithRenderType(((TrapDoorBlock) DWWoodBlocks.RED_CORALWOOD_TRAPDOOR.get()), modLoc("block/red_coralwood_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) DWWoodBlocks.BLUE_CORALWOOD_TRAPDOOR.get()), modLoc("block/blue_coralwood_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) DWWoodBlocks.PINK_CORALWOOD_TRAPDOOR.get()), modLoc("block/pink_coralwood_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) DWWoodBlocks.PURPLE_CORALWOOD_TRAPDOOR.get()), modLoc("block/purple_coralwood_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) DWWoodBlocks.YELLOW_CORALWOOD_TRAPDOOR.get()), modLoc("block/yellow_coralwood_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) DWWoodBlocks.GREEN_CORALWOOD_TRAPDOOR.get()), modLoc("block/green_coralwood_trapdoor"), true, "cutout");
        logBlock((RotatedPillarBlock) DWWoodBlocks.RED_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWWoodBlocks.RED_CORALWOOD_WOOD.get()), blockTexture(DWWoodBlocks.RED_CORALWOOD_LOG.get()), blockTexture(DWWoodBlocks.RED_CORALWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) DWWoodBlocks.GREEN_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWWoodBlocks.GREEN_CORALWOOD_WOOD.get()), blockTexture(DWWoodBlocks.GREEN_CORALWOOD_LOG.get()), blockTexture(DWWoodBlocks.GREEN_CORALWOOD_LOG.get()));
        blockWithItem(DWWoodBlocks.RED_CORALWOOD_PLANKS);
        blockWithItem(DWWoodBlocks.GREEN_CORALWOOD_PLANKS);
        blockWithItem(DWWoodBlocks.PINK_CORALWOOD_PLANKS);
        blockWithItem(DWWoodBlocks.BLUE_CORALWOOD_PLANKS);
        blockWithItem(DWWoodBlocks.YELLOW_CORALWOOD_PLANKS);
        blockWithItem(DWWoodBlocks.PURPLE_CORALWOOD_PLANKS);
        blockWithItem(DWOceanWorldgenBlocks.BUBBLE_SAND);
        //blockWithItem(DWBlocks.HOT_ROCK);
        blockWithItem(DWWoodBlocks.DEAD_CORALWOOD_PLANKS);
        blockFloor(DWOceanWorldgenBlocks.SHALLOWLIGHT_GRASS_BLOCK);
        blockFloor(DWOceanWorldgenBlocks.DEEPLIGHT_GRASS_BLOCK);
        blockFloor(DWOceanWorldgenBlocks.ABYSSLIGHT_GRASS_BLOCK);
        blockFloor(DWOceanWorldgenBlocks.SUNKENLIGHT_GRASS_BLOCK);
        blockWithItem(DWOceanWorldgenBlocks.DEEPSTONE);
        blockWithItem(DWOceanWorldgenBlocks.OCEAN_DIRT);
        blockColumn(DWOceanWorldgenBlocks.OCEAN_SLATE);
        blockWithItem(DWOceanWorldgenBlocks.FOAM_ORE);
        blockWithItem(DWOceanWorldgenBlocks.OCEAN_DIRT_FOAM_ORE);
        blockWithItem(DWOceanWorldgenBlocks.ABYSS_ORE);
        blockWithItem(DWOceanWorldgenBlocks.HYDRON_ORE);
        blockWithItem(DWStoneBlocks.SLATE_BRICKS);
        blockWithItem(DWStoneBlocks.POLISHED_SLATE);
        blockWithItem(DWStoneBlocks.SMOOTH_SLATE);
        blockWithItem(DWStoneBlocks.COBBLED_SLATE);
        blockWithItem(DWStoneBlocks.CHISELED_DEEPSTONE);
        blockWithItem(DWStoneBlocks.CHISELED_SLATE);
        fenceBlock(((FenceBlock) DWWoodBlocks.RED_CORALWOOD_FENCE.get()), blockTexture(DWWoodBlocks.RED_CORALWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) DWWoodBlocks.BLUE_CORALWOOD_FENCE.get()), blockTexture(DWWoodBlocks.BLUE_CORALWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) DWWoodBlocks.YELLOW_CORALWOOD_FENCE.get()), blockTexture(DWWoodBlocks.YELLOW_CORALWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) DWWoodBlocks.PINK_CORALWOOD_FENCE.get()), blockTexture(DWWoodBlocks.PINK_CORALWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) DWWoodBlocks.PURPLE_CORALWOOD_FENCE.get()), blockTexture(DWWoodBlocks.PURPLE_CORALWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) DWWoodBlocks.GREEN_CORALWOOD_FENCE.get()), blockTexture(DWWoodBlocks.GREEN_CORALWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWWoodBlocks.RED_CORALWOOD_GATE.get()), blockTexture(DWWoodBlocks.RED_CORALWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWWoodBlocks.BLUE_CORALWOOD_GATE.get()), blockTexture(DWWoodBlocks.BLUE_CORALWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWWoodBlocks.YELLOW_CORALWOOD_GATE.get()), blockTexture(DWWoodBlocks.YELLOW_CORALWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWWoodBlocks.PURPLE_CORALWOOD_GATE.get()), blockTexture(DWWoodBlocks.PURPLE_CORALWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWWoodBlocks.PINK_CORALWOOD_GATE.get()), blockTexture(DWWoodBlocks.PINK_CORALWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWWoodBlocks.GREEN_CORALWOOD_GATE.get()), blockTexture(DWWoodBlocks.GREEN_CORALWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWWoodBlocks.RED_CORALWOOD_PRESSURE_PLATE.get()), blockTexture(DWWoodBlocks.RED_CORALWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWWoodBlocks.BLUE_CORALWOOD_PRESSURE_PLATE.get()), blockTexture(DWWoodBlocks.BLUE_CORALWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWWoodBlocks.YELLOW_CORALWOOD_PRESSURE_PLATE.get()), blockTexture(DWWoodBlocks.YELLOW_CORALWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWWoodBlocks.PURPLE_CORALWOOD_PRESSURE_PLATE.get()), blockTexture(DWWoodBlocks.PURPLE_CORALWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWWoodBlocks.PINK_CORALWOOD_PRESSURE_PLATE.get()), blockTexture(DWWoodBlocks.PINK_CORALWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWWoodBlocks.GREEN_CORALWOOD_PRESSURE_PLATE.get()), blockTexture(DWWoodBlocks.GREEN_CORALWOOD_PLANKS.get()));
        buttonBlock(((ButtonBlock) DWWoodBlocks.RED_CORALWOOD_BUTTON.get()), blockTexture(DWWoodBlocks.RED_CORALWOOD_PLANKS.get()));
        buttonBlock(((ButtonBlock) DWWoodBlocks.GREEN_CORALWOOD_BUTTON.get()), blockTexture(DWWoodBlocks.GREEN_CORALWOOD_PLANKS.get()));
        logBlock((RotatedPillarBlock) DWWoodBlocks.YELLOW_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWWoodBlocks.YELLOW_CORALWOOD_WOOD.get()), blockTexture(DWWoodBlocks.YELLOW_CORALWOOD_LOG.get()), blockTexture(DWWoodBlocks.YELLOW_CORALWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) DWWoodBlocks.BLUE_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWWoodBlocks.BLUE_CORALWOOD_WOOD.get()), blockTexture(DWWoodBlocks.BLUE_CORALWOOD_LOG.get()), blockTexture(DWWoodBlocks.BLUE_CORALWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) DWWoodBlocks.PINK_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWWoodBlocks.PINK_CORALWOOD_WOOD.get()), blockTexture(DWWoodBlocks.PINK_CORALWOOD_LOG.get()), blockTexture(DWWoodBlocks.PINK_CORALWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) DWWoodBlocks.PURPLE_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWWoodBlocks.PURPLE_CORALWOOD_WOOD.get()), blockTexture(DWWoodBlocks.PURPLE_CORALWOOD_LOG.get()), blockTexture(DWWoodBlocks.PURPLE_CORALWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) DWWoodBlocks.DEAD_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWWoodBlocks.DEAD_CORALWOOD_WOOD.get()), blockTexture(DWWoodBlocks.DEAD_CORALWOOD_LOG.get()), blockTexture(DWWoodBlocks.DEAD_CORALWOOD_LOG.get()));
        slabBlock(((SlabBlock) DWWoodBlocks.RED_CORALWOOD_SLAB.get()), blockTexture(DWWoodBlocks.RED_CORALWOOD_PLANKS.get()), blockTexture(DWWoodBlocks.RED_CORALWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) DWWoodBlocks.BLUE_CORALWOOD_SLAB.get()), blockTexture(DWWoodBlocks.BLUE_CORALWOOD_PLANKS.get()), blockTexture(DWWoodBlocks.BLUE_CORALWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) DWWoodBlocks.PINK_CORALWOOD_SLAB.get()), blockTexture(DWWoodBlocks.PINK_CORALWOOD_PLANKS.get()), blockTexture(DWWoodBlocks.PINK_CORALWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) DWWoodBlocks.PURPLE_CORALWOOD_SLAB.get()), blockTexture(DWWoodBlocks.PURPLE_CORALWOOD_PLANKS.get()), blockTexture(DWWoodBlocks.PURPLE_CORALWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) DWWoodBlocks.YELLOW_CORALWOOD_SLAB.get()), blockTexture(DWWoodBlocks.YELLOW_CORALWOOD_PLANKS.get()), blockTexture(DWWoodBlocks.YELLOW_CORALWOOD_PLANKS.get()));
        stairsBlock(((StairBlock) DWWoodBlocks.RED_CORALWOOD_STAIRS.get()), blockTexture(DWWoodBlocks.RED_CORALWOOD_PLANKS.get()));
        stairsBlock(((StairBlock) DWWoodBlocks.YELLOW_CORALWOOD_STAIRS.get()), blockTexture(DWWoodBlocks.YELLOW_CORALWOOD_PLANKS.get()));
        stairsBlock(((StairBlock) DWWoodBlocks.PURPLE_CORALWOOD_STAIRS.get()), blockTexture(DWWoodBlocks.PURPLE_CORALWOOD_PLANKS.get()));
        stairsBlock(((StairBlock) DWWoodBlocks.PINK_CORALWOOD_STAIRS.get()), blockTexture(DWWoodBlocks.PINK_CORALWOOD_PLANKS.get()));
        stairsBlock(((StairBlock) DWWoodBlocks.BLUE_CORALWOOD_STAIRS.get()), blockTexture(DWWoodBlocks.BLUE_CORALWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) DWWoodBlocks.GREEN_CORALWOOD_SLAB.get()), blockTexture(DWWoodBlocks.GREEN_CORALWOOD_PLANKS.get()), blockTexture(DWWoodBlocks.GREEN_CORALWOOD_PLANKS.get()));
        stairsBlock(((StairBlock) DWWoodBlocks.GREEN_CORALWOOD_STAIRS.get()), blockTexture(DWWoodBlocks.GREEN_CORALWOOD_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) DWWoodBlocks.BLUE_CORALWOOD_DOOR.get()), modLoc("block/blue_coralwood_door_bottom"), modLoc("block/blue_coralwood_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) DWWoodBlocks.PINK_CORALWOOD_DOOR.get()), modLoc("block/pink_coralwood_door_bottom"), modLoc("block/pink_coralwood_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) DWWoodBlocks.YELLOW_CORALWOOD_DOOR.get()), modLoc("block/yellow_coralwood_door_bottom"), modLoc("block/yellow_coralwood_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) DWWoodBlocks.PURPLE_CORALWOOD_DOOR.get()), modLoc("block/purple_coralwood_door_bottom"), modLoc("block/purple_coralwood_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) DWWoodBlocks.RED_CORALWOOD_DOOR.get()), modLoc("block/red_coralwood_door_bottom"), modLoc("block/red_coralwood_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) DWWoodBlocks.GREEN_CORALWOOD_DOOR.get()), modLoc("block/green_coralwood_door_bottom"), modLoc("block/green_coralwood_door_top"), "cutout");


    // Cold Place
        blockWithItem(DWBlocks.ICESALT);
        blockWithItem(DWBlocks.COBBLED_ICESALT);
        blockWithItem(DWBlocks.POLISHED_ICESALT);
        blockWithItem(DWBlocks.CHISELED_ICESALT);
        blockWithItem(DWBlocks.ICESALT_BRICKS);
        blockWithItem(DWBlocks.ICESALT_TILES);
        blockWithItem(DWBlocks.HAILSTONE);
        blockWithItem(DWBlocks.COBBLED_HAILSTONE);
        blockWithItem(DWBlocks.POLISHED_HAILSTONE);
        blockWithItem(DWBlocks.CHISELED_HAILSTONE);
        blockWithItem(DWBlocks.HAILSTONE_BRICKS);
        blockWithItem(DWBlocks.HAILSTONE_TILES);
        blockWithItem(DWBlocks.SUBZERO_STONE);
        blockWithItem(DWBlocks.COBBLED_SUBZERO_STONE);
        blockWithItem(DWBlocks.POLISHED_SUBZERO_STONE);
        blockWithItem(DWBlocks.CHISELED_SUBZERO_STONE);
        blockWithItem(DWBlocks.SUBZERO_STONE_BRICKS);
        blockWithItem(DWBlocks.SUBZERO_STONE_TILES);
        blockWithItem(DWBlocks.FROST_MARBLE);
        blockWithItem(DWBlocks.COBBLED_FROST_MARBLE);
        blockWithItem(DWBlocks.POLISHED_FROST_MARBLE);
        blockWithItem(DWBlocks.CHISELED_FROST_MARBLE);
        blockWithItem(DWBlocks.FROST_MARBLE_BRICKS);
        blockWithItem(DWBlocks.FROST_MARBLE_TILES);
        blockWithItem(DWBlocks.ARCTIC_SNOW_BLOCK);
        blockWithItem(DWBlocks.ARCTIC_SNOW);
        blockWithItem(DWBlocks.POWDER_ARCTIC_SNOW);

        blockWithItem(DWWoodBlocks.SOOT_SNOW);

        logBlock((RotatedPillarBlock) DWWoodBlocks.FROZEN_OAK_LOG.get());
        axisBlock(((RotatedPillarBlock) DWWoodBlocks.FROZEN_OAK_WOOD.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_LOG.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_LOG.get()));

        axisBlock(((RotatedPillarBlock) DWWoodBlocks.STRIPPED_FROZEN_OAK_LOG.get()), blockTexture(DWWoodBlocks.STRIPPED_FROZEN_OAK_LOG.get()),
                UniversalCommon.modRL( "block/stripped_frozen_oak_log_top"));
        axisBlock(((RotatedPillarBlock) DWWoodBlocks.STRIPPED_FROZEN_OAK_WOOD.get()), blockTexture(DWWoodBlocks.STRIPPED_FROZEN_OAK_LOG.get()),
                blockTexture(DWWoodBlocks.STRIPPED_FROZEN_OAK_LOG.get()));
        blockWithItem(DWWoodBlocks.FROZEN_OAK_PLANKS);

        stairsBlock(((StairBlock) DWWoodBlocks.FROZEN_OAK_STAIRS.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_PLANKS.get()));
        slabBlock(((SlabBlock) DWWoodBlocks.FROZEN_OAK_SLAB.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_PLANKS.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_PLANKS.get()));
        buttonBlock(((ButtonBlock) DWWoodBlocks.FROZEN_OAK_BUTTON.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWWoodBlocks.FROZEN_OAK_PRESSURE_PLATE.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_PLANKS.get()));
        fenceBlock(((FenceBlock) DWWoodBlocks.FROZEN_OAK_FENCE.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWWoodBlocks.FROZEN_OAK_GATE.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_PLANKS.get()));
        wallBlock(((WallBlock) DWWoodBlocks.FROZEN_OAK_WALL.get()), blockTexture(DWWoodBlocks.FROZEN_OAK_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) DWWoodBlocks.FROZEN_OAK_DOOR.get()), modLoc("block/frozen_oak_door_bottom"), modLoc("block/frozen_oak_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) DWWoodBlocks.FROZEN_OAK_TRAPDOOR.get()), modLoc("block/frozen_oak_trapdoor"), true, "cutout");

        logBlock((RotatedPillarBlock) DWColdBlocks.ICESALT_PILLAR.get());
        logBlock((RotatedPillarBlock) DWColdBlocks.HAILSTONE_PILLAR.get());
        logBlock((RotatedPillarBlock) DWColdBlocks.SUBZERO_STONE_PILLAR.get());
        logBlock((RotatedPillarBlock) DWColdBlocks.FROST_MARBLE_PILLAR.get());

        stairsBlock(((StairBlock) DWColdBlocks.ICESALT_STAIRS.get()), blockTexture(DWBlocks.ICESALT.get()));
        slabBlock(((SlabBlock) DWColdBlocks.ICESALT_SLAB.get()), blockTexture(DWBlocks.ICESALT.get()), blockTexture(DWBlocks.ICESALT.get()));
        buttonBlock(((ButtonBlock) DWColdBlocks.ICESALT_BUTTON.get()), blockTexture(DWBlocks.ICESALT.get()));
        pressurePlateBlock(((PressurePlateBlock) DWColdBlocks.ICESALT_PRESSURE_PLATE.get()), blockTexture(DWBlocks.ICESALT.get()));
        wallBlock(((WallBlock) DWColdBlocks.ICESALT_WALL.get()), blockTexture(DWBlocks.ICESALT.get()));
        stairsBlock(((StairBlock) DWBlocks.HAILSTONE_STAIRS.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        slabBlock(((SlabBlock) DWBlocks.HAILSTONE_SLAB.get()), blockTexture(DWBlocks.HAILSTONE.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.HAILSTONE_BUTTON.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.HAILSTONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        wallBlock(((WallBlock) DWBlocks.HAILSTONE_WALL.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        stairsBlock(((StairBlock) DWColdBlocks.SUBZERO_STONE_STAIRS.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        slabBlock(((SlabBlock) DWColdBlocks.SUBZERO_STONE_SLAB.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        buttonBlock(((ButtonBlock) DWColdBlocks.SUBZERO_STONE_BUTTON.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWColdBlocks.SUBZERO_STONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        wallBlock(((WallBlock) DWColdBlocks.SUBZERO_STONE_WALL.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        stairsBlock(((StairBlock) DWColdBlocks.FROST_MARBLE_STAIRS.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));
        slabBlock(((SlabBlock) DWColdBlocks.FROST_MARBLE_SLAB.get()), blockTexture(DWBlocks.FROST_MARBLE.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));
        buttonBlock(((ButtonBlock) DWColdBlocks.FROST_MARBLE_BUTTON.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWColdBlocks.FROST_MARBLE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));
        wallBlock(((WallBlock) DWColdBlocks.FROST_MARBLE_WALL.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));

        stairsBlock(((StairBlock) DWCobbledBlocks.COBBLED_ICESALT_STAIRS.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        slabBlock(((SlabBlock) DWCobbledBlocks.COBBLED_ICESALT_SLAB.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        buttonBlock(((ButtonBlock) DWCobbledBlocks.COBBLED_ICESALT_BUTTON.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        pressurePlateBlock(((PressurePlateBlock) DWCobbledBlocks.COBBLED_ICESALT_PRESSURE_PLATE.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        wallBlock(((WallBlock) DWCobbledBlocks.COBBLED_ICESALT_WALL.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        stairsBlock(((StairBlock) DWCobbledBlocks.COBBLED_HAILSTONE_STAIRS.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        slabBlock(((SlabBlock) DWCobbledBlocks.COBBLED_HAILSTONE_SLAB.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        buttonBlock(((ButtonBlock) DWCobbledBlocks.COBBLED_HAILSTONE_BUTTON.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWCobbledBlocks.COBBLED_HAILSTONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        wallBlock(((WallBlock) DWCobbledBlocks.COBBLED_HAILSTONE_WALL.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        stairsBlock(((StairBlock) DWCobbledBlocks.COBBLED_SUBZERO_STONE_STAIRS.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        slabBlock(((SlabBlock) DWCobbledBlocks.COBBLED_SUBZERO_STONE_SLAB.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        buttonBlock(((ButtonBlock) DWCobbledBlocks.COBBLED_SUBZERO_STONE_BUTTON.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWCobbledBlocks.COBBLED_SUBZERO_STONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        wallBlock(((WallBlock) DWCobbledBlocks.COBBLED_SUBZERO_STONE_WALL.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        stairsBlock(((StairBlock) DWCobbledBlocks.COBBLED_FROST_MARBLE_STAIRS.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));
        slabBlock(((SlabBlock) DWCobbledBlocks.COBBLED_FROST_MARBLE_SLAB.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));
        buttonBlock(((ButtonBlock) DWCobbledBlocks.COBBLED_FROST_MARBLE_BUTTON.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWCobbledBlocks.COBBLED_FROST_MARBLE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));
        wallBlock(((WallBlock) DWCobbledBlocks.COBBLED_FROST_MARBLE_WALL.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));

        stairsBlock(((StairBlock) DWPolishedBlocks.POLISHED_ICESALT_STAIRS.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        slabBlock(((SlabBlock) DWPolishedBlocks.POLISHED_ICESALT_SLAB.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        buttonBlock(((ButtonBlock) DWPolishedBlocks.POLISHED_ICESALT_BUTTON.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        pressurePlateBlock(((PressurePlateBlock) DWPolishedBlocks.POLISHED_ICESALT_PRESSURE_PLATE.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        wallBlock(((WallBlock) DWPolishedBlocks.POLISHED_ICESALT_WALL.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        stairsBlock(((StairBlock) DWPolishedBlocks.POLISHED_HAILSTONE_STAIRS.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        slabBlock(((SlabBlock) DWPolishedBlocks.POLISHED_HAILSTONE_SLAB.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        buttonBlock(((ButtonBlock) DWPolishedBlocks.POLISHED_HAILSTONE_BUTTON.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWPolishedBlocks.POLISHED_HAILSTONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        wallBlock(((WallBlock) DWPolishedBlocks.POLISHED_HAILSTONE_WALL.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        stairsBlock(((StairBlock) DWPolishedBlocks.POLISHED_SUBZERO_STONE_STAIRS.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        slabBlock(((SlabBlock) DWPolishedBlocks.POLISHED_SUBZERO_STONE_SLAB.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        buttonBlock(((ButtonBlock) DWPolishedBlocks.POLISHED_SUBZERO_STONE_BUTTON.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWPolishedBlocks.POLISHED_SUBZERO_STONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        wallBlock(((WallBlock) DWPolishedBlocks.POLISHED_SUBZERO_STONE_WALL.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        stairsBlock(((StairBlock) DWPolishedBlocks.POLISHED_FROST_MARBLE_STAIRS.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));
        slabBlock(((SlabBlock) DWPolishedBlocks.POLISHED_FROST_MARBLE_SLAB.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));
        buttonBlock(((ButtonBlock) DWPolishedBlocks.POLISHED_FROST_MARBLE_BUTTON.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWPolishedBlocks.POLISHED_FROST_MARBLE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));
        wallBlock(((WallBlock) DWPolishedBlocks.POLISHED_FROST_MARBLE_WALL.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));

        stairsBlock(((StairBlock) DWBrickBlocks.ICESALT_BRICKS_STAIRS.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        slabBlock(((SlabBlock) DWBrickBlocks.ICESALT_BRICKS_SLAB.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        buttonBlock(((ButtonBlock) DWBrickBlocks.ICESALT_BRICKS_BUTTON.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBrickBlocks.ICESALT_BRICKS_PRESSURE_PLATE.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        wallBlock(((WallBlock) DWBrickBlocks.ICESALT_BRICKS_WALL.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        stairsBlock(((StairBlock) DWBrickBlocks.HAILSTONE_BRICKS_STAIRS.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) DWBrickBlocks.HAILSTONE_BRICKS_SLAB.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        buttonBlock(((ButtonBlock) DWBrickBlocks.HAILSTONE_BRICKS_BUTTON.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBrickBlocks.HAILSTONE_BRICKS_PRESSURE_PLATE.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        wallBlock(((WallBlock) DWBrickBlocks.HAILSTONE_BRICKS_WALL.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        stairsBlock(((StairBlock) DWBrickBlocks.SUBZERO_STONE_BRICKS_STAIRS.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) DWBrickBlocks.SUBZERO_STONE_BRICKS_SLAB.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        buttonBlock(((ButtonBlock) DWBrickBlocks.SUBZERO_STONE_BRICKS_BUTTON.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBrickBlocks.SUBZERO_STONE_BRICKS_PRESSURE_PLATE.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        wallBlock(((WallBlock) DWBrickBlocks.SUBZERO_STONE_BRICKS_WALL.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        stairsBlock(((StairBlock) DWBrickBlocks.FROST_MARBLE_BRICKS_STAIRS.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));
        slabBlock(((SlabBlock) DWBrickBlocks.FROST_MARBLE_BRICKS_SLAB.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));
        buttonBlock(((ButtonBlock) DWBrickBlocks.FROST_MARBLE_BRICKS_BUTTON.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBrickBlocks.FROST_MARBLE_BRICKS_PRESSURE_PLATE.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));
        wallBlock(((WallBlock) DWBrickBlocks.FROST_MARBLE_BRICKS_WALL.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));

        stairsBlock(((StairBlock) DWTilesBlocks.ICESALT_TILES_STAIRS.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        slabBlock(((SlabBlock) DWTilesBlocks.ICESALT_TILES_SLAB.get()), blockTexture(DWBlocks.ICESALT_TILES.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        buttonBlock(((ButtonBlock) DWTilesBlocks.ICESALT_TILES_BUTTON.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        pressurePlateBlock(((PressurePlateBlock) DWTilesBlocks.ICESALT_TILES_PRESSURE_PLATE.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        wallBlock(((WallBlock) DWTilesBlocks.ICESALT_TILES_WALL.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        stairsBlock(((StairBlock) DWTilesBlocks.HAILSTONE_TILES_STAIRS.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        slabBlock(((SlabBlock) DWTilesBlocks.HAILSTONE_TILES_SLAB.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        buttonBlock(((ButtonBlock) DWTilesBlocks.HAILSTONE_TILES_BUTTON.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        pressurePlateBlock(((PressurePlateBlock) DWTilesBlocks.HAILSTONE_TILES_PRESSURE_PLATE.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        wallBlock(((WallBlock) DWTilesBlocks.HAILSTONE_TILES_WALL.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        stairsBlock(((StairBlock) DWTilesBlocks.SUBZERO_STONE_TILES_STAIRS.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        slabBlock(((SlabBlock) DWTilesBlocks.SUBZERO_STONE_TILES_SLAB.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        buttonBlock(((ButtonBlock) DWTilesBlocks.SUBZERO_STONE_TILES_BUTTON.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        pressurePlateBlock(((PressurePlateBlock) DWTilesBlocks.SUBZERO_STONE_TILES_PRESSURE_PLATE.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        wallBlock(((WallBlock) DWTilesBlocks.SUBZERO_STONE_TILES_WALL.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        stairsBlock(((StairBlock) DWTilesBlocks.FROST_MARBLE_TILES_STAIRS.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));
        slabBlock(((SlabBlock) DWTilesBlocks.FROST_MARBLE_TILES_SLAB.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));
        buttonBlock(((ButtonBlock) DWTilesBlocks.FROST_MARBLE_TILES_BUTTON.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));
        pressurePlateBlock(((PressurePlateBlock) DWTilesBlocks.FROST_MARBLE_TILES_PRESSURE_PLATE.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));
        wallBlock(((WallBlock) DWTilesBlocks.FROST_MARBLE_TILES_WALL.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));

        blockWithItem(DWBlocks.CRYOLITE_BLOCK);
        blockWithItem(DWBlocks.GLACIEITE_BLOCK);
        blockWithItem(DWBlocks.GLACIER_ICE);
        blockWithItem(DWBlocks.BITTER_ICE);
        blockWithItem(DWBlocks.ILL_ICE);
        blockWithItem(DWBlocks.BLACK_ICE);

        blockWithItem(DWBlocks.ICE_LOCK);

        //COBBLED_ cobbled_
        //POLISHED_ polished_
        //_BRICKS _bricks
        //_TILES _tiles

        //ROOTS
        blockColumn(DWBlocks.ROOTED_BARK_BRICKS);
        blockWithItem(DWBlocks.CHISELED_ROOTED_BARK);
        blockColumn(DWBlocks.MOSSY_ROOTED_BARK_BRICKS);
        blockWithItem(DWBlocks.FOSSILIZED_CARBON);
        blockWithItem(DWBlocks.ROOTED_LIGHT);

    }

    private void blockWithItem(Block block) {
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockFloor(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeBottomTop("block/" + blockRegistryObject.getId().getPath(),
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath() + "_side"),
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath() + "_bottom"),
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath() + "_top")));
    }

    private void slabFloor(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeBottomTop("block/" + blockRegistryObject.getId().getPath(),
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath() + "_side"),
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath() + "_bottom"),
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath() + "_top")));
    }

    private void blockColumn(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeColumn("block/" + blockRegistryObject.getId().getPath(),
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath()),
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath() + "_top")));
    }

    private void blockColumnHorizontal(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeColumnHorizontal("block/" + blockRegistryObject.getId().getPath() + "_horizontal",
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath()),
                UniversalCommon.modRL(
                        "block/" + blockRegistryObject.getId().getPath() + "_top")));
    }
}

