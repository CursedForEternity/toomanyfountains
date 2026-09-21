package owo.bladecraftstudios.toomanyfountains.core.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.core.util.UniversalCommon;
import owo.bladecraftstudios.toomanyfountains.server.blocks.*;
import owo.bladecraftstudios.toomanyfountains.server.registries.DWItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TooManyFountains.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        evenSimplerBlockItem(DWColdBlocks.ICESALT_PILLAR);
        buttonItem(DWColdBlocks.ICESALT_BUTTON,DWBlocks.ICESALT);
        wallItem(DWColdBlocks.ICESALT_WALL,DWBlocks.ICESALT);
        evenSimplerBlockItem(DWColdBlocks.ICESALT_STAIRS);
        evenSimplerBlockItem(DWColdBlocks.ICESALT_SLAB);
        evenSimplerBlockItem(DWColdBlocks.ICESALT_PRESSURE_PLATE);
        evenSimplerBlockItem(DWColdBlocks.HAILSTONE_PILLAR);
        buttonItem(DWBlocks.HAILSTONE_BUTTON,DWBlocks.HAILSTONE);
        wallItem(DWBlocks.HAILSTONE_WALL,DWBlocks.HAILSTONE);
        evenSimplerBlockItem(DWBlocks.HAILSTONE_STAIRS);
        evenSimplerBlockItem(DWBlocks.HAILSTONE_SLAB);
        evenSimplerBlockItem(DWBlocks.HAILSTONE_PRESSURE_PLATE);
        evenSimplerBlockItem(DWColdBlocks.SUBZERO_STONE_PILLAR);
        buttonItem(DWColdBlocks.SUBZERO_STONE_BUTTON,DWBlocks.SUBZERO_STONE);
        wallItem(DWColdBlocks.SUBZERO_STONE_WALL,DWBlocks.SUBZERO_STONE);
        evenSimplerBlockItem(DWColdBlocks.SUBZERO_STONE_STAIRS);
        evenSimplerBlockItem(DWColdBlocks.SUBZERO_STONE_SLAB);
        evenSimplerBlockItem(DWColdBlocks.SUBZERO_STONE_PRESSURE_PLATE);
        evenSimplerBlockItem(DWColdBlocks.FROST_MARBLE_PILLAR);
        buttonItem(DWColdBlocks.FROST_MARBLE_BUTTON,DWBlocks.FROST_MARBLE);
        wallItem(DWColdBlocks.FROST_MARBLE_WALL,DWBlocks.FROST_MARBLE);
        evenSimplerBlockItem(DWColdBlocks.FROST_MARBLE_STAIRS);
        evenSimplerBlockItem(DWColdBlocks.FROST_MARBLE_SLAB);
        evenSimplerBlockItem(DWColdBlocks.FROST_MARBLE_PRESSURE_PLATE);

        //COBBLED_ cobbled_
        buttonItem(DWCobbledBlocks.COBBLED_ICESALT_BUTTON,DWBlocks.COBBLED_ICESALT);
        wallItem(DWCobbledBlocks.COBBLED_ICESALT_WALL,DWBlocks.COBBLED_ICESALT);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_ICESALT_STAIRS);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_ICESALT_SLAB);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_ICESALT_PRESSURE_PLATE);
        buttonItem(DWCobbledBlocks.COBBLED_HAILSTONE_BUTTON,DWBlocks.COBBLED_HAILSTONE);
        wallItem(DWCobbledBlocks.COBBLED_HAILSTONE_WALL,DWBlocks.COBBLED_HAILSTONE);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_HAILSTONE_STAIRS);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_HAILSTONE_SLAB);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_HAILSTONE_PRESSURE_PLATE);
        buttonItem(DWCobbledBlocks.COBBLED_SUBZERO_STONE_BUTTON,DWBlocks.COBBLED_SUBZERO_STONE);
        wallItem(DWCobbledBlocks.COBBLED_SUBZERO_STONE_WALL,DWBlocks.COBBLED_SUBZERO_STONE);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_SUBZERO_STONE_STAIRS);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_SUBZERO_STONE_SLAB);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_SUBZERO_STONE_PRESSURE_PLATE);
        buttonItem(DWCobbledBlocks.COBBLED_FROST_MARBLE_BUTTON,DWBlocks.COBBLED_FROST_MARBLE);
        wallItem(DWCobbledBlocks.COBBLED_FROST_MARBLE_WALL,DWBlocks.COBBLED_FROST_MARBLE);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_FROST_MARBLE_STAIRS);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_FROST_MARBLE_SLAB);
        evenSimplerBlockItem(DWCobbledBlocks.COBBLED_FROST_MARBLE_PRESSURE_PLATE);

        //POLISHED_ polished_
        buttonItem(DWPolishedBlocks.POLISHED_ICESALT_BUTTON,DWBlocks.POLISHED_ICESALT);
        wallItem(DWPolishedBlocks.POLISHED_ICESALT_WALL,DWBlocks.POLISHED_ICESALT);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_ICESALT_STAIRS);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_ICESALT_SLAB);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_ICESALT_PRESSURE_PLATE);
        buttonItem(DWPolishedBlocks.POLISHED_HAILSTONE_BUTTON,DWBlocks.POLISHED_HAILSTONE);
        wallItem(DWPolishedBlocks.POLISHED_HAILSTONE_WALL,DWBlocks.POLISHED_HAILSTONE);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_HAILSTONE_STAIRS);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_HAILSTONE_SLAB);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_HAILSTONE_PRESSURE_PLATE);
        buttonItem(DWPolishedBlocks.POLISHED_SUBZERO_STONE_BUTTON,DWBlocks.POLISHED_SUBZERO_STONE);
        wallItem(DWPolishedBlocks.POLISHED_SUBZERO_STONE_WALL,DWBlocks.POLISHED_SUBZERO_STONE);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_SUBZERO_STONE_STAIRS);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_SUBZERO_STONE_SLAB);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_SUBZERO_STONE_PRESSURE_PLATE);
        buttonItem(DWPolishedBlocks.POLISHED_FROST_MARBLE_BUTTON,DWBlocks.POLISHED_FROST_MARBLE);
        wallItem(DWPolishedBlocks.POLISHED_FROST_MARBLE_WALL,DWBlocks.POLISHED_FROST_MARBLE);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_FROST_MARBLE_STAIRS);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_FROST_MARBLE_SLAB);
        evenSimplerBlockItem(DWPolishedBlocks.POLISHED_FROST_MARBLE_PRESSURE_PLATE);

        //_BRICKS _bricks
        buttonItem(DWBrickBlocks.ICESALT_BRICKS_BUTTON,DWBlocks.ICESALT_BRICKS);
        wallItem(DWBrickBlocks.ICESALT_BRICKS_WALL,DWBlocks.ICESALT_BRICKS);
        evenSimplerBlockItem(DWBrickBlocks.ICESALT_BRICKS_STAIRS);
        evenSimplerBlockItem(DWBrickBlocks.ICESALT_BRICKS_SLAB);
        evenSimplerBlockItem(DWBrickBlocks.ICESALT_BRICKS_PRESSURE_PLATE);
        buttonItem(DWBrickBlocks.HAILSTONE_BRICKS_BUTTON,DWBlocks.HAILSTONE_BRICKS);
        wallItem(DWBrickBlocks.HAILSTONE_BRICKS_WALL,DWBlocks.HAILSTONE_BRICKS);
        evenSimplerBlockItem(DWBrickBlocks.HAILSTONE_BRICKS_STAIRS);
        evenSimplerBlockItem(DWBrickBlocks.HAILSTONE_BRICKS_SLAB);
        evenSimplerBlockItem(DWBrickBlocks.HAILSTONE_BRICKS_PRESSURE_PLATE);
        buttonItem(DWBrickBlocks.SUBZERO_STONE_BRICKS_BUTTON,DWBlocks.SUBZERO_STONE_BRICKS);
        wallItem(DWBrickBlocks.SUBZERO_STONE_BRICKS_WALL,DWBlocks.SUBZERO_STONE_BRICKS);
        evenSimplerBlockItem(DWBrickBlocks.SUBZERO_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(DWBrickBlocks.SUBZERO_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(DWBrickBlocks.SUBZERO_STONE_BRICKS_PRESSURE_PLATE);
        buttonItem(DWBrickBlocks.FROST_MARBLE_BRICKS_BUTTON,DWBlocks.FROST_MARBLE_BRICKS);
        wallItem(DWBrickBlocks.FROST_MARBLE_BRICKS_WALL,DWBlocks.FROST_MARBLE_BRICKS);
        evenSimplerBlockItem(DWBrickBlocks.FROST_MARBLE_BRICKS_STAIRS);
        evenSimplerBlockItem(DWBrickBlocks.FROST_MARBLE_BRICKS_SLAB);
        evenSimplerBlockItem(DWBrickBlocks.FROST_MARBLE_BRICKS_PRESSURE_PLATE);

        //_TILES _tiles
        buttonItem(DWTilesBlocks.ICESALT_TILES_BUTTON,DWBlocks.ICESALT_TILES);
        wallItem(DWTilesBlocks.ICESALT_TILES_WALL,DWBlocks.ICESALT_TILES);
        evenSimplerBlockItem(DWTilesBlocks.ICESALT_TILES_STAIRS);
        evenSimplerBlockItem(DWTilesBlocks.ICESALT_TILES_SLAB);
        evenSimplerBlockItem(DWTilesBlocks.ICESALT_TILES_PRESSURE_PLATE);
        buttonItem(DWTilesBlocks.HAILSTONE_TILES_BUTTON,DWBlocks.HAILSTONE_TILES);
        wallItem(DWTilesBlocks.HAILSTONE_TILES_WALL,DWBlocks.HAILSTONE_TILES);
        evenSimplerBlockItem(DWTilesBlocks.HAILSTONE_TILES_STAIRS);
        evenSimplerBlockItem(DWTilesBlocks.HAILSTONE_TILES_SLAB);
        evenSimplerBlockItem(DWTilesBlocks.HAILSTONE_TILES_PRESSURE_PLATE);
        buttonItem(DWTilesBlocks.SUBZERO_STONE_TILES_BUTTON,DWBlocks.SUBZERO_STONE_TILES);
        wallItem(DWTilesBlocks.SUBZERO_STONE_TILES_WALL,DWBlocks.SUBZERO_STONE_TILES);
        evenSimplerBlockItem(DWTilesBlocks.SUBZERO_STONE_TILES_STAIRS);
        evenSimplerBlockItem(DWTilesBlocks.SUBZERO_STONE_TILES_SLAB);
        evenSimplerBlockItem(DWTilesBlocks.SUBZERO_STONE_TILES_PRESSURE_PLATE);
        buttonItem(DWTilesBlocks.FROST_MARBLE_TILES_BUTTON,DWBlocks.FROST_MARBLE_TILES);
        wallItem(DWTilesBlocks.FROST_MARBLE_TILES_WALL,DWBlocks.FROST_MARBLE_TILES);
        evenSimplerBlockItem(DWTilesBlocks.FROST_MARBLE_TILES_STAIRS);
        evenSimplerBlockItem(DWTilesBlocks.FROST_MARBLE_TILES_SLAB);
        evenSimplerBlockItem(DWTilesBlocks.FROST_MARBLE_TILES_PRESSURE_PLATE);

        //Frozen Oak
        evenSimplerBlockItem(DWWoodBlocks.FROZEN_OAK_LOG);
        evenSimplerBlockItem(DWWoodBlocks.FROZEN_OAK_WOOD);
        evenSimplerBlockItem(DWWoodBlocks.STRIPPED_FROZEN_OAK_LOG);
        evenSimplerBlockItem(DWWoodBlocks.STRIPPED_FROZEN_OAK_WOOD);
        simpleBlockItem(DWWoodBlocks.FROZEN_OAK_DOOR);
        evenSimplerBlockItem(DWWoodBlocks.FROZEN_OAK_GATE);
        fenceItem(DWWoodBlocks.FROZEN_OAK_FENCE, DWWoodBlocks.FROZEN_OAK_PLANKS);
        buttonItem(DWWoodBlocks.FROZEN_OAK_BUTTON, DWWoodBlocks.FROZEN_OAK_PLANKS);
        wallItem(DWWoodBlocks.FROZEN_OAK_WALL, DWWoodBlocks.FROZEN_OAK_PLANKS);
        evenSimplerBlockItem(DWWoodBlocks.FROZEN_OAK_STAIRS);
        evenSimplerBlockItem(DWWoodBlocks.FROZEN_OAK_SLAB);
        evenSimplerBlockItem(DWWoodBlocks.FROZEN_OAK_PRESSURE_PLATE);
        trapdoorItem(DWWoodBlocks.FROZEN_OAK_TRAPDOOR);
//        simpleItem(DWColdBlocks.FROZEN_OAK_SIGN);
//        simpleItem(DWColdBlocks.FROZEN_OAK_HANGING_SIGN);

        evenSimplerBlockItem(DWBlocks.GLACIEITE_BLOCK);
        evenSimplerBlockItem(DWBlocks.CRYOLITE_BLOCK);
        evenSimplerBlockItem(DWBlocks.GLACIER_ICE);
        evenSimplerBlockItem(DWBlocks.ILL_ICE);
        evenSimplerBlockItem(DWBlocks.BITTER_ICE);
        evenSimplerBlockItem(DWBlocks.BLACK_ICE);
        simpleItem(DWColdBlocks.ARCTIC_WATER_BUCKET);
        simpleItem(DWColdBlocks.CRYOLITE_BUCKET);

        evenSimplerBlockItem(DWBlocks.ICE_LOCK);

        //Ocean
        fenceItem(DWWoodBlocks.RED_CORALWOOD_FENCE, DWWoodBlocks.RED_CORALWOOD_PLANKS);
        buttonItem(DWWoodBlocks.RED_CORALWOOD_BUTTON, DWWoodBlocks.RED_CORALWOOD_PLANKS);
        fenceItem(DWWoodBlocks.GREEN_CORALWOOD_FENCE, DWWoodBlocks.GREEN_CORALWOOD_PLANKS);
        buttonItem(DWWoodBlocks.GREEN_CORALWOOD_BUTTON, DWWoodBlocks.GREEN_CORALWOOD_PLANKS);
        evenSimplerBlockItem(DWWoodBlocks.RED_CORALWOOD_STAIRS);
        evenSimplerBlockItem(DWWoodBlocks.RED_CORALWOOD_SLAB);
        evenSimplerBlockItem(DWWoodBlocks.RED_CORALWOOD_PRESSURE_PLATE);
        evenSimplerBlockItem(DWWoodBlocks.BLUE_CORALWOOD_PLANKS);
        evenSimplerBlockItem(DWWoodBlocks.PINK_CORALWOOD_PLANKS);
        evenSimplerBlockItem(DWWoodBlocks.YELLOW_CORALWOOD_PLANKS);
        fenceItem(DWWoodBlocks.YELLOW_CORALWOOD_FENCE, DWWoodBlocks.YELLOW_CORALWOOD_PLANKS);
        fenceItem(DWWoodBlocks.BLUE_CORALWOOD_FENCE, DWWoodBlocks.BLUE_CORALWOOD_PLANKS);
        fenceItem(DWWoodBlocks.RED_CORALWOOD_FENCE, DWWoodBlocks.RED_CORALWOOD_PLANKS);
        fenceItem(DWWoodBlocks.PINK_CORALWOOD_FENCE, DWWoodBlocks.PINK_CORALWOOD_PLANKS);
        buttonItem(DWWoodBlocks.YELLOW_CORALWOOD_BUTTON, DWWoodBlocks.YELLOW_CORALWOOD_PLANKS);
        buttonItem(DWWoodBlocks.RED_CORALWOOD_BUTTON, DWWoodBlocks.RED_CORALWOOD_PLANKS);
        buttonItem(DWWoodBlocks.BLUE_CORALWOOD_BUTTON, DWWoodBlocks.BLUE_CORALWOOD_PLANKS);
        buttonItem(DWWoodBlocks.PINK_CORALWOOD_BUTTON, DWWoodBlocks.PINK_CORALWOOD_PLANKS);
        fenceItem(DWWoodBlocks.PURPLE_CORALWOOD_FENCE, DWWoodBlocks.PURPLE_CORALWOOD_PLANKS);
        buttonItem(DWWoodBlocks.PURPLE_CORALWOOD_BUTTON, DWWoodBlocks.PURPLE_CORALWOOD_PLANKS);
        evenSimplerBlockItem(DWWoodBlocks.RED_CORALWOOD_LOG);
        evenSimplerBlockItem(DWWoodBlocks.BLUE_CORALWOOD_GATE);
        evenSimplerBlockItem(DWWoodBlocks.PINK_CORALWOOD_GATE);
        evenSimplerBlockItem(DWWoodBlocks.YELLOW_CORALWOOD_GATE);
        evenSimplerBlockItem(DWWoodBlocks.RED_CORALWOOD_GATE);
        evenSimplerBlockItem(DWWoodBlocks.PURPLE_CORALWOOD_GATE);
        evenSimplerBlockItem(DWWoodBlocks.RED_CORALWOOD_WOOD);
        evenSimplerBlockItem(DWWoodBlocks.BLUE_CORALWOOD_LOG);
        evenSimplerBlockItem(DWWoodBlocks.BLUE_CORALWOOD_WOOD);
        evenSimplerBlockItem(DWWoodBlocks.PINK_CORALWOOD_LOG);
        evenSimplerBlockItem(DWWoodBlocks.PINK_CORALWOOD_WOOD);
        evenSimplerBlockItem(DWWoodBlocks.YELLOW_CORALWOOD_LOG);
        evenSimplerBlockItem(DWWoodBlocks.YELLOW_CORALWOOD_WOOD);
        evenSimplerBlockItem(DWWoodBlocks.PURPLE_CORALWOOD_LOG);
        evenSimplerBlockItem(DWWoodBlocks.PURPLE_CORALWOOD_WOOD);
        evenSimplerBlockItem(DWWoodBlocks.DEAD_CORALWOOD_LOG);
        evenSimplerBlockItem(DWWoodBlocks.DEAD_CORALWOOD_WOOD);
        evenSimplerBlockItem(DWWoodBlocks.RED_CORALWOOD_PLANKS);
        evenSimplerBlockItem(DWWoodBlocks.PURPLE_CORALWOOD_STAIRS);
        evenSimplerBlockItem(DWWoodBlocks.PURPLE_CORALWOOD_SLAB);
        evenSimplerBlockItem(DWWoodBlocks.YELLOW_CORALWOOD_SLAB);
        evenSimplerBlockItem(DWWoodBlocks.YELLOW_CORALWOOD_PRESSURE_PLATE);
        evenSimplerBlockItem(DWWoodBlocks.PURPLE_CORALWOOD_PLANKS);
        evenSimplerBlockItem(DWWoodBlocks.PURPLE_CORALWOOD_PRESSURE_PLATE);
        evenSimplerBlockItem(DWWoodBlocks.YELLOW_CORALWOOD_STAIRS);
        evenSimplerBlockItem(DWWoodBlocks.DEAD_CORALWOOD_PLANKS);
        simpleBlockItem(DWWoodBlocks.RED_CORALWOOD_DOOR);
        trapdoorItem(DWWoodBlocks.RED_CORALWOOD_TRAPDOOR);
        simpleBlockItem(DWWoodBlocks.YELLOW_CORALWOOD_DOOR);
        trapdoorItem(DWWoodBlocks.YELLOW_CORALWOOD_TRAPDOOR);
        simpleBlockItem(DWWoodBlocks.PURPLE_CORALWOOD_DOOR);
        trapdoorItem(DWWoodBlocks.PURPLE_CORALWOOD_TRAPDOOR);

        simpleItem(DWItems.RAW_SILWARE);
        simpleItem(DWItems.SILWARE);
        simpleItem(DWItems.MEMOSHARD);
        heldItem(DWItems.SILWARE_AXE);
        heldItem(DWItems.SILWARE_HOE);
        heldItem(DWItems.SILWARE_BODKIN);
        heldItem(DWItems.SILWARE_PICKAXE);
        heldItem(DWItems.SILWARE_SWORD);
        heldItem(DWItems.SILWARE_SHOVEL);
        simpleItem(DWItems.FLOORBOARD);
        heldItem(DWItems.BOARD_PICKAXE);
        heldItem(DWItems.BOARD_HOE);
        heldItem(DWItems.BOARD_AXE);
        heldItem(DWItems.BOARD_SHOVEL);
        heldItem(DWItems.BOARD_SWORD);
        heldItem(DWItems.SILWARE_BUCKET);
        heldItem(DWItems.SODA_BUCKET);
        evenSimplerBlockItem(DWCircusBlocks.FLOORBOARD_STAIRS);
        evenSimplerBlockItem(DWCircusBlocks.FLOORBOARD_SLAB);
        evenSimplerBlockItem(DWCircusBlocks.FLOORBOARD_FENCE_GATE);
        fenceItem(DWCircusBlocks.FLOORBOARD_FENCE, DWCircusBlocks.FLOORBOARDS);
        simpleBlockItem(DWCircusBlocks.FLOORBOARD_DOOR);
        trapdoorItem(DWCircusBlocks.FLOORBOARD_TRAPDOOR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                UniversalCommon.newRL("item/generated")).texture("layer0",
                UniversalCommon.modRL("item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(TooManyFountains.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  UniversalCommon.modRL( "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  UniversalCommon.modRL( "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  UniversalCommon.modRL( "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                UniversalCommon.newRL("item/generated")).texture("layer0",
                UniversalCommon.modRL("item/" + item.getId().getPath()));
    }
    private ItemModelBuilder heldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                UniversalCommon.newRL("item/handheld")).texture("layer0",
                UniversalCommon.modRL("item/" + item.getId().getPath()));
    }
}
