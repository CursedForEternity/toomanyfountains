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
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.FROZEN_OAK_PRESSURE_PLATE.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));
        wallBlock(((WallBlock) DWBlocks.FROZEN_OAK_WALL.get()), blockTexture(DWBlocks.FROST_MARBLE.get()));

        // Endless Spores
        blockWithItem(DWBlocks.MUSHITE);
        blockFloor(DWBlocks.FUNGAL_MUSHITE);
        blockFloor(DWBlocks.FUNGAL_FUNGITE);
        blockWithItem(DWBlocks.JELLITE_ORE);
        blockWithItem(DWBlocks.BLIGHTSHROOM_PLANKS);
        blockWithItem(DWBlocks.BLIGHTSHROOM_LEAVES);
        blockColumn(DWBlocks.MUSHSNOW);
        blockWithItem(DWBlocks.FUNGITE);
        stairsBlock(((StairBlock) DWBlocks.BLIGHTSHROOM_STAIRS.get()), blockTexture(DWBlocks.BLIGHTSHROOM_PLANKS.get()));
        slabBlock(((SlabBlock) DWBlocks.BLIGHTSHROOM_SLAB.get()), blockTexture(DWBlocks.BLIGHTSHROOM_PLANKS.get()), blockTexture(DWBlocks.BLIGHTSHROOM_PLANKS.get()));
        fenceBlock(((FenceBlock) DWBlocks.BLIGHTSHROOM_FENCE.get()), blockTexture(DWBlocks.BLIGHTSHROOM_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) DWBlocks.BLIGHTSHROOM_FENCE_GATE.get()), blockTexture(DWBlocks.BLIGHTSHROOM_PLANKS.get()));
        buttonBlock(((ButtonBlock) DWBlocks.BLIGHTSHROOM_BUTTON.get()), blockTexture(DWBlocks.BLIGHTSHROOM_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) DWBlocks.BLIGHTSHROOM_PRESSURE_PLATE.get()), blockTexture(DWBlocks.BLIGHTSHROOM_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) DWBlocks.BLIGHTSHROOM_DOOR.get()), modLoc("block/blightshroom_door_bottom"), modLoc("block/blightshroom_door_top"), "cutout");

        // Circus
        blockWithItem(DWBlocks.SILWARE_DEBRIS);
        blockColumn(DWBlocks.CIRCUS_BOARDS);
        blockColumn(DWBlocks.CIRCUS_ASH);
        blockColumn(DWBlocks.CIRCUS_STONE);
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

