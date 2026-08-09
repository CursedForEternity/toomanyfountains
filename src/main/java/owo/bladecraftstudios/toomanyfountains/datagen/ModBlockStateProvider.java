package owo.bladecraftstudios.toomanyfountains.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.blocks.DWBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TooManyFountains.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {



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

        blockWithItem(DWBlocks.SOOT_SNOW);

        logBlock((RotatedPillarBlock) DWBlocks.FROZEN_OAK_LOG.get());
        axisBlock(((RotatedPillarBlock) DWBlocks.FROZEN_OAK_WOOD.get()), blockTexture(DWBlocks.FROZEN_OAK_LOG.get()), blockTexture(DWBlocks.FROZEN_OAK_LOG.get()));

        axisBlock(((RotatedPillarBlock) DWBlocks.STRIPPED_FROZEN_OAK_LOG.get()), blockTexture(DWBlocks.STRIPPED_FROZEN_OAK_LOG.get()),
                new ResourceLocation(TooManyFountains.MODID, "block/stripped_frozen_oak_log_top"));
        axisBlock(((RotatedPillarBlock) DWBlocks.STRIPPED_FROZEN_OAK_WOOD.get()), blockTexture(DWBlocks.STRIPPED_FROZEN_OAK_LOG.get()),
                blockTexture(DWBlocks.STRIPPED_FROZEN_OAK_LOG.get()));
        blockWithItem(DWBlocks.FROZEN_OAK_PLANKS);

        stairsBlock(((StairBlock) DWBlocks.FROZEN_OAK_STAIRS.get()), blockTexture(DWBlocks.FROZEN_OAK_PLANKS.get()));
        slabBlock(((SlabBlock) DWBlocks.FROZEN_OAK_SLAB.get()), blockTexture(DWBlocks.FROZEN_OAK_PLANKS.get()), blockTexture(DWBlocks.FROZEN_OAK_PLANKS.get()));
        buttonBlock(((ButtonBlock) DWBlocks.FROZEN_OAK_BUTTON.get()), blockTexture(DWBlocks.FROZEN_OAK_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.FROZEN_OAK_PRESSURE_PLATE.get()), blockTexture(DWBlocks.FROZEN_OAK_PLANKS.get()));
        fenceBlock(((FenceBlock) DWBlocks.FROZEN_OAK_FENCE.get()), blockTexture(DWBlocks.FROZEN_OAK_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWBlocks.FROZEN_OAK_GATE.get()), blockTexture(DWBlocks.FROZEN_OAK_PLANKS.get()));
        wallBlock(((WallBlock) DWBlocks.FROZEN_OAK_WALL.get()), blockTexture(DWBlocks.FROZEN_OAK_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) DWBlocks.FROZEN_OAK_DOOR.get()), modLoc("block/frozen_oak_door_bottom"), modLoc("block/frozen_oak_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) DWBlocks.FROZEN_OAK_TRAPDOOR.get()), modLoc("block/frozen_oak_trapdoor"), true, "cutout");

        logBlock((RotatedPillarBlock) DWBlocks.ICESALT_PILLAR.get());
        logBlock((RotatedPillarBlock) DWBlocks.HAILSTONE_PILLAR.get());
        logBlock((RotatedPillarBlock) DWBlocks.SUBZERO_STONE_PILLAR.get());
        logBlock((RotatedPillarBlock) DWBlocks.FROST_MARBLE_PILLAR.get());

        stairsBlock(((StairBlock) DWBlocks.ICESALT_STAIRS.get()), blockTexture(DWBlocks.ICESALT.get()));
        slabBlock(((SlabBlock) DWBlocks.ICESALT_SLAB.get()), blockTexture(DWBlocks.ICESALT.get()), blockTexture(DWBlocks.ICESALT.get()));
        buttonBlock(((ButtonBlock) DWBlocks.ICESALT_BUTTON.get()), blockTexture(DWBlocks.ICESALT.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.ICESALT_PRESSURE_PLATE.get()), blockTexture(DWBlocks.ICESALT.get()));
        wallBlock(((WallBlock) DWBlocks.ICESALT_WALL.get()), blockTexture(DWBlocks.ICESALT.get()));
        stairsBlock(((StairBlock) DWBlocks.HAILSTONE_STAIRS.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        slabBlock(((SlabBlock) DWBlocks.HAILSTONE_SLAB.get()), blockTexture(DWBlocks.HAILSTONE.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.HAILSTONE_BUTTON.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.HAILSTONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        wallBlock(((WallBlock) DWBlocks.HAILSTONE_WALL.get()), blockTexture(DWBlocks.HAILSTONE.get()));
        stairsBlock(((StairBlock) DWBlocks.SUBZERO_STONE_STAIRS.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        slabBlock(((SlabBlock) DWBlocks.SUBZERO_STONE_SLAB.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.SUBZERO_STONE_BUTTON.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.SUBZERO_STONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        wallBlock(((WallBlock) DWBlocks.SUBZERO_STONE_WALL.get()), blockTexture(DWBlocks.SUBZERO_STONE.get()));
        stairsBlock(((StairBlock) DWBlocks.FROST_MARBLE_STAIRS.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));
        slabBlock(((SlabBlock) DWBlocks.FROST_MARBLE_SLAB.get()), blockTexture(DWBlocks.FROST_MARBLE.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.FROST_MARBLE_BUTTON.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.FROST_MARBLE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));
        wallBlock(((WallBlock) DWBlocks.FROST_MARBLE_WALL.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));

        stairsBlock(((StairBlock) DWBlocks.COBBLED_ICESALT_STAIRS.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        slabBlock(((SlabBlock) DWBlocks.COBBLED_ICESALT_SLAB.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        buttonBlock(((ButtonBlock) DWBlocks.COBBLED_ICESALT_BUTTON.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.COBBLED_ICESALT_PRESSURE_PLATE.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        wallBlock(((WallBlock) DWBlocks.COBBLED_ICESALT_WALL.get()), blockTexture(DWBlocks.COBBLED_ICESALT.get()));
        stairsBlock(((StairBlock) DWBlocks.COBBLED_HAILSTONE_STAIRS.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        slabBlock(((SlabBlock) DWBlocks.COBBLED_HAILSTONE_SLAB.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.COBBLED_HAILSTONE_BUTTON.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.COBBLED_HAILSTONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        wallBlock(((WallBlock) DWBlocks.COBBLED_HAILSTONE_WALL.get()), blockTexture(DWBlocks.COBBLED_HAILSTONE.get()));
        stairsBlock(((StairBlock) DWBlocks.COBBLED_SUBZERO_STONE_STAIRS.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        slabBlock(((SlabBlock) DWBlocks.COBBLED_SUBZERO_STONE_SLAB.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.COBBLED_SUBZERO_STONE_BUTTON.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.COBBLED_SUBZERO_STONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        wallBlock(((WallBlock) DWBlocks.COBBLED_SUBZERO_STONE_WALL.get()), blockTexture(DWBlocks.COBBLED_SUBZERO_STONE.get()));
        stairsBlock(((StairBlock) DWBlocks.COBBLED_FROST_MARBLE_STAIRS.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));
        slabBlock(((SlabBlock) DWBlocks.COBBLED_FROST_MARBLE_SLAB.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.COBBLED_FROST_MARBLE_BUTTON.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.COBBLED_FROST_MARBLE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));
        wallBlock(((WallBlock) DWBlocks.COBBLED_FROST_MARBLE_WALL.get()), blockTexture(DWBlocks.COBBLED_FROST_MARBLE.get()));

        stairsBlock(((StairBlock) DWBlocks.POLISHED_ICESALT_STAIRS.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        slabBlock(((SlabBlock) DWBlocks.POLISHED_ICESALT_SLAB.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        buttonBlock(((ButtonBlock) DWBlocks.POLISHED_ICESALT_BUTTON.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.POLISHED_ICESALT_PRESSURE_PLATE.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        wallBlock(((WallBlock) DWBlocks.POLISHED_ICESALT_WALL.get()), blockTexture(DWBlocks.POLISHED_ICESALT.get()));
        stairsBlock(((StairBlock) DWBlocks.POLISHED_HAILSTONE_STAIRS.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        slabBlock(((SlabBlock) DWBlocks.POLISHED_HAILSTONE_SLAB.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.POLISHED_HAILSTONE_BUTTON.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.POLISHED_HAILSTONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        wallBlock(((WallBlock) DWBlocks.POLISHED_HAILSTONE_WALL.get()), blockTexture(DWBlocks.POLISHED_HAILSTONE.get()));
        stairsBlock(((StairBlock) DWBlocks.POLISHED_SUBZERO_STONE_STAIRS.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        slabBlock(((SlabBlock) DWBlocks.POLISHED_SUBZERO_STONE_SLAB.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.POLISHED_SUBZERO_STONE_BUTTON.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.POLISHED_SUBZERO_STONE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        wallBlock(((WallBlock) DWBlocks.POLISHED_SUBZERO_STONE_WALL.get()), blockTexture(DWBlocks.POLISHED_SUBZERO_STONE.get()));
        stairsBlock(((StairBlock) DWBlocks.POLISHED_FROST_MARBLE_STAIRS.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));
        slabBlock(((SlabBlock) DWBlocks.POLISHED_FROST_MARBLE_SLAB.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));
        buttonBlock(((ButtonBlock) DWBlocks.POLISHED_FROST_MARBLE_BUTTON.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.POLISHED_FROST_MARBLE_PRESSURE_PLATE.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));
        wallBlock(((WallBlock) DWBlocks.POLISHED_FROST_MARBLE_WALL.get()), blockTexture(DWBlocks.POLISHED_FROST_MARBLE.get()));

        stairsBlock(((StairBlock) DWBlocks.ICESALT_BRICKS_STAIRS.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        slabBlock(((SlabBlock) DWBlocks.ICESALT_BRICKS_SLAB.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        buttonBlock(((ButtonBlock) DWBlocks.ICESALT_BRICKS_BUTTON.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.ICESALT_BRICKS_PRESSURE_PLATE.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        wallBlock(((WallBlock) DWBlocks.ICESALT_BRICKS_WALL.get()), blockTexture(DWBlocks.ICESALT_BRICKS.get()));
        stairsBlock(((StairBlock) DWBlocks.HAILSTONE_BRICKS_STAIRS.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) DWBlocks.HAILSTONE_BRICKS_SLAB.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        buttonBlock(((ButtonBlock) DWBlocks.HAILSTONE_BRICKS_BUTTON.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.HAILSTONE_BRICKS_PRESSURE_PLATE.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        wallBlock(((WallBlock) DWBlocks.HAILSTONE_BRICKS_WALL.get()), blockTexture(DWBlocks.HAILSTONE_BRICKS.get()));
        stairsBlock(((StairBlock) DWBlocks.SUBZERO_STONE_BRICKS_STAIRS.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) DWBlocks.SUBZERO_STONE_BRICKS_SLAB.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        buttonBlock(((ButtonBlock) DWBlocks.SUBZERO_STONE_BRICKS_BUTTON.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.SUBZERO_STONE_BRICKS_PRESSURE_PLATE.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        wallBlock(((WallBlock) DWBlocks.SUBZERO_STONE_BRICKS_WALL.get()), blockTexture(DWBlocks.SUBZERO_STONE_BRICKS.get()));
        stairsBlock(((StairBlock) DWBlocks.FROST_MARBLE_BRICKS_STAIRS.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));
        slabBlock(((SlabBlock) DWBlocks.FROST_MARBLE_BRICKS_SLAB.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));
        buttonBlock(((ButtonBlock) DWBlocks.FROST_MARBLE_BRICKS_BUTTON.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.FROST_MARBLE_BRICKS_PRESSURE_PLATE.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));
        wallBlock(((WallBlock) DWBlocks.FROST_MARBLE_BRICKS_WALL.get()), blockTexture(DWBlocks.FROST_MARBLE_BRICKS.get()));

        stairsBlock(((StairBlock) DWBlocks.ICESALT_TILES_STAIRS.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        slabBlock(((SlabBlock) DWBlocks.ICESALT_TILES_SLAB.get()), blockTexture(DWBlocks.ICESALT_TILES.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        buttonBlock(((ButtonBlock) DWBlocks.ICESALT_TILES_BUTTON.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.ICESALT_TILES_PRESSURE_PLATE.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        wallBlock(((WallBlock) DWBlocks.ICESALT_TILES_WALL.get()), blockTexture(DWBlocks.ICESALT_TILES.get()));
        stairsBlock(((StairBlock) DWBlocks.HAILSTONE_TILES_STAIRS.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        slabBlock(((SlabBlock) DWBlocks.HAILSTONE_TILES_SLAB.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        buttonBlock(((ButtonBlock) DWBlocks.HAILSTONE_TILES_BUTTON.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.HAILSTONE_TILES_PRESSURE_PLATE.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        wallBlock(((WallBlock) DWBlocks.HAILSTONE_TILES_WALL.get()), blockTexture(DWBlocks.HAILSTONE_TILES.get()));
        stairsBlock(((StairBlock) DWBlocks.SUBZERO_STONE_TILES_STAIRS.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        slabBlock(((SlabBlock) DWBlocks.SUBZERO_STONE_TILES_SLAB.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        buttonBlock(((ButtonBlock) DWBlocks.SUBZERO_STONE_TILES_BUTTON.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.SUBZERO_STONE_TILES_PRESSURE_PLATE.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        wallBlock(((WallBlock) DWBlocks.SUBZERO_STONE_TILES_WALL.get()), blockTexture(DWBlocks.SUBZERO_STONE_TILES.get()));
        stairsBlock(((StairBlock) DWBlocks.FROST_MARBLE_TILES_STAIRS.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));
        slabBlock(((SlabBlock) DWBlocks.FROST_MARBLE_TILES_SLAB.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));
        buttonBlock(((ButtonBlock) DWBlocks.FROST_MARBLE_TILES_BUTTON.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.FROST_MARBLE_TILES_PRESSURE_PLATE.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));
        wallBlock(((WallBlock) DWBlocks.FROST_MARBLE_TILES_WALL.get()), blockTexture(DWBlocks.FROST_MARBLE_TILES.get()));

        //COBBLED_ cobbled_
        //POLISHED_ polished_
        //_BRICKS _bricks
        //_TILES _tiles

        // Circus
        blockWithItem(DWBlocks.SILWARE_DEBRIS);
        blockColumn(DWBlocks.CIRCUS_BOARDS);
        blockColumn(DWBlocks.CIRCUS_ASH);
        blockColumn(DWBlocks.CIRCUS_STONE);

        //Ocean
        logBlock((RotatedPillarBlock) DWBlocks.RED_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWBlocks.RED_CORALWOOD_WOOD.get()), blockTexture(DWBlocks.RED_CORALWOOD_LOG.get()), blockTexture(DWBlocks.RED_CORALWOOD_LOG.get()));
        stairsBlock(((StairBlock) DWBlocks.RED_CORALWOOD_STAIRS.get()), blockTexture(DWBlocks.RED_CORALWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) DWBlocks.RED_CORALWOOD_SLAB.get()), blockTexture(DWBlocks.RED_CORALWOOD_PLANKS.get()), blockTexture(DWBlocks.RED_CORALWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) DWBlocks.RED_CORALWOOD_FENCE.get()), blockTexture(DWBlocks.RED_CORALWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWBlocks.RED_CORALWOOD_GATE.get()), blockTexture(DWBlocks.RED_CORALWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.RED_CORALWOOD_PRESSURE_PLATE.get()), blockTexture(DWBlocks.RED_CORALWOOD_PLANKS.get()));
        buttonBlock(((ButtonBlock) DWBlocks.RED_CORALWOOD_BUTTON.get()), blockTexture(DWBlocks.RED_CORALWOOD_PLANKS.get()));
        logBlock((RotatedPillarBlock) DWBlocks.YELLOW_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWBlocks.YELLOW_CORALWOOD_WOOD.get()), blockTexture(DWBlocks.YELLOW_CORALWOOD_LOG.get()), blockTexture(DWBlocks.YELLOW_CORALWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) DWBlocks.BLUE_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWBlocks.BLUE_CORALWOOD_WOOD.get()), blockTexture(DWBlocks.BLUE_CORALWOOD_LOG.get()), blockTexture(DWBlocks.BLUE_CORALWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) DWBlocks.PINK_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWBlocks.PINK_CORALWOOD_WOOD.get()), blockTexture(DWBlocks.PINK_CORALWOOD_LOG.get()), blockTexture(DWBlocks.PINK_CORALWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) DWBlocks.PURPLE_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWBlocks.PURPLE_CORALWOOD_WOOD.get()), blockTexture(DWBlocks.PURPLE_CORALWOOD_LOG.get()), blockTexture(DWBlocks.PURPLE_CORALWOOD_LOG.get()));
        logBlock((RotatedPillarBlock) DWBlocks.DEAD_CORALWOOD_LOG.get());
        axisBlock(((RotatedPillarBlock) DWBlocks.DEAD_CORALWOOD_WOOD.get()), blockTexture(DWBlocks.DEAD_CORALWOOD_LOG.get()), blockTexture(DWBlocks.DEAD_CORALWOOD_LOG.get()));
        blockWithItem(DWBlocks.RED_CORALWOOD_PLANKS);
        blockWithItem(DWBlocks.PINK_CORALWOOD_PLANKS);
        blockWithItem(DWBlocks.BLUE_CORALWOOD_PLANKS);
        blockWithItem(DWBlocks.YELLOW_CORALWOOD_PLANKS);
        blockWithItem(DWBlocks.PURPLE_CORALWOOD_PLANKS);
        blockWithItem(DWBlocks.DEAD_CORALWOOD_PLANKS);
        blockFloor(DWBlocks.SHALLOWLIGHT_GRASS_BLOCK);
        blockFloor(DWBlocks.DEEPLIGHT_GRASS_BLOCK);
        blockFloor(DWBlocks.ABYSSLIGHT_GRASS_BLOCK);
        blockFloor(DWBlocks.SUNKENLIGHT_GRASS_BLOCK);
        blockWithItem(DWBlocks.DEEPSTONE);
        blockWithItem(DWBlocks.OCEAN_DIRT);
        blockColumn(DWBlocks.OCEAN_SLATE);
        blockWithItem(DWBlocks.FOAM_ORE);
        blockWithItem(DWBlocks.ABYSS_ORE);
        blockWithItem(DWBlocks.HYDRON_ORE);
        blockWithItem(DWBlocks.SLATE_BRICKS);
    }

    private void blockWithItem(Block block) {
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockFloor(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeBottomTop("block/" + blockRegistryObject.getId().getPath(),
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath() + "_side"),
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath() + "_bottom"),
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath() + "_top")));
    }

    private void slabFloor(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeBottomTop("block/" + blockRegistryObject.getId().getPath(),
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath() + "_side"),
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath() + "_bottom"),
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath() + "_top")));
    }

    private void blockColumn(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeColumn("block/" + blockRegistryObject.getId().getPath(),
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath()),
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath() + "_top")));
    }

    private void blockColumnHorizontal(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().cubeColumnHorizontal("block/" + blockRegistryObject.getId().getPath() + "_horizontal",
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath()),
                new ResourceLocation(TooManyFountains.MODID,
                        "block/" + blockRegistryObject.getId().getPath() + "_top")));
    }
}

