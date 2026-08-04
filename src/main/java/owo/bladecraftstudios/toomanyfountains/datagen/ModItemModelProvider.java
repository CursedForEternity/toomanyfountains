package owo.bladecraftstudios.toomanyfountains.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.blocks.DWBlocks;
import owo.bladecraftstudios.toomanyfountains.items.DWItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TooManyFountains.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(DWItems.RAW_SILWARE);
        simpleItem(DWItems.SILWARE);
        heldItem(DWItems.SILWARE_AXE);
        heldItem(DWItems.SILWARE_HOE);
        heldItem(DWItems.SILWARE_BODKIN);
        heldItem(DWItems.SILWARE_PICKAXE);
        heldItem(DWItems.SILWARE_SWORD);
        heldItem(DWItems.SILWARE_SHOVEL);

        evenSimplerBlockItem(DWBlocks.FROZEN_OAK_LOG);
        evenSimplerBlockItem(DWBlocks.FROZEN_OAK_WOOD);
        evenSimplerBlockItem(DWBlocks.STRIPPED_FROZEN_OAK_LOG);
        evenSimplerBlockItem(DWBlocks.STRIPPED_FROZEN_OAK_WOOD);
        simpleBlockItem(DWBlocks.FROZEN_OAK_DOOR);
        fenceItem(DWBlocks.FROZEN_OAK_FENCE,DWBlocks.FROZEN_OAK_PLANKS);
        buttonItem(DWBlocks.FROZEN_OAK_BUTTON,DWBlocks.FROZEN_OAK_PLANKS);
        wallItem(DWBlocks.FROZEN_OAK_WALL,DWBlocks.FROZEN_OAK_PLANKS);
        evenSimplerBlockItem(DWBlocks.ICESALT_PILLAR);
        buttonItem(DWBlocks.ICESALT_BUTTON,DWBlocks.ICESALT);
        wallItem(DWBlocks.ICESALT_WALL,DWBlocks.ICESALT);
        evenSimplerBlockItem(DWBlocks.HAILSTONE_PILLAR);
        buttonItem(DWBlocks.HAILSTONE_BUTTON,DWBlocks.HAILSTONE);
        wallItem(DWBlocks.HAILSTONE_WALL,DWBlocks.HAILSTONE);
        evenSimplerBlockItem(DWBlocks.SUBZERO_STONE_PILLAR);
        buttonItem(DWBlocks.SUBZERO_STONE_BUTTON,DWBlocks.SUBZERO_STONE);
        wallItem(DWBlocks.SUBZERO_STONE_WALL,DWBlocks.SUBZERO_STONE);
        evenSimplerBlockItem(DWBlocks.FROST_MARBLE_PILLAR);
        buttonItem(DWBlocks.FROST_MARBLE_BUTTON,DWBlocks.FROST_MARBLE);
        wallItem(DWBlocks.FROST_MARBLE_WALL,DWBlocks.FROST_MARBLE);

        //COBBLED_ cobbled_
        buttonItem(DWBlocks.COBBLED_ICESALT_BUTTON,DWBlocks.COBBLED_ICESALT);
        wallItem(DWBlocks.COBBLED_ICESALT_WALL,DWBlocks.COBBLED_ICESALT);
        buttonItem(DWBlocks.COBBLED_HAILSTONE_BUTTON,DWBlocks.COBBLED_HAILSTONE);
        wallItem(DWBlocks.COBBLED_HAILSTONE_WALL,DWBlocks.COBBLED_HAILSTONE);
        buttonItem(DWBlocks.COBBLED_SUBZERO_STONE_BUTTON,DWBlocks.COBBLED_SUBZERO_STONE);
        wallItem(DWBlocks.COBBLED_SUBZERO_STONE_WALL,DWBlocks.COBBLED_SUBZERO_STONE);
        buttonItem(DWBlocks.COBBLED_FROST_MARBLE_BUTTON,DWBlocks.COBBLED_FROST_MARBLE);
        wallItem(DWBlocks.COBBLED_FROST_MARBLE_WALL,DWBlocks.COBBLED_FROST_MARBLE);

        //POLISHED_ polished_
        buttonItem(DWBlocks.POLISHED_ICESALT_BUTTON,DWBlocks.POLISHED_ICESALT);
        wallItem(DWBlocks.POLISHED_ICESALT_WALL,DWBlocks.POLISHED_ICESALT);
        buttonItem(DWBlocks.POLISHED_HAILSTONE_BUTTON,DWBlocks.POLISHED_HAILSTONE);
        wallItem(DWBlocks.POLISHED_HAILSTONE_WALL,DWBlocks.POLISHED_HAILSTONE);
        buttonItem(DWBlocks.POLISHED_SUBZERO_STONE_BUTTON,DWBlocks.POLISHED_SUBZERO_STONE);
        wallItem(DWBlocks.POLISHED_SUBZERO_STONE_WALL,DWBlocks.POLISHED_SUBZERO_STONE);
        buttonItem(DWBlocks.POLISHED_FROST_MARBLE_BUTTON,DWBlocks.POLISHED_FROST_MARBLE);
        wallItem(DWBlocks.POLISHED_FROST_MARBLE_WALL,DWBlocks.POLISHED_FROST_MARBLE);

        //_BRICKS _bricks
        buttonItem(DWBlocks.ICESALT_BRICKS_BUTTON,DWBlocks.ICESALT_BRICKS);
        wallItem(DWBlocks.ICESALT_BRICKS_WALL,DWBlocks.ICESALT_BRICKS);
        buttonItem(DWBlocks.HAILSTONE_BRICKS_BUTTON,DWBlocks.HAILSTONE_BRICKS);
        wallItem(DWBlocks.HAILSTONE_BRICKS_WALL,DWBlocks.HAILSTONE_BRICKS);
        buttonItem(DWBlocks.SUBZERO_STONE_BRICKS_BUTTON,DWBlocks.SUBZERO_STONE_BRICKS);
        wallItem(DWBlocks.SUBZERO_STONE_BRICKS_WALL,DWBlocks.SUBZERO_STONE_BRICKS);
        buttonItem(DWBlocks.FROST_MARBLE_BRICKS_BUTTON,DWBlocks.FROST_MARBLE_BRICKS);
        wallItem(DWBlocks.FROST_MARBLE_BRICKS_WALL,DWBlocks.FROST_MARBLE_BRICKS);

        //_TILES _tiles
        buttonItem(DWBlocks.ICESALT_TILES_BUTTON,DWBlocks.ICESALT_TILES);
        wallItem(DWBlocks.ICESALT_TILES_WALL,DWBlocks.ICESALT_TILES);
        buttonItem(DWBlocks.HAILSTONE_TILES_BUTTON,DWBlocks.HAILSTONE_TILES);
        wallItem(DWBlocks.HAILSTONE_TILES_WALL,DWBlocks.HAILSTONE_TILES);
        buttonItem(DWBlocks.SUBZERO_STONE_TILES_BUTTON,DWBlocks.SUBZERO_STONE_TILES);
        wallItem(DWBlocks.SUBZERO_STONE_TILES_WALL,DWBlocks.SUBZERO_STONE_TILES);
        buttonItem(DWBlocks.FROST_MARBLE_TILES_BUTTON,DWBlocks.FROST_MARBLE_TILES);
        wallItem(DWBlocks.FROST_MARBLE_TILES_WALL,DWBlocks.FROST_MARBLE_TILES);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TooManyFountains.MODID,"item/" + item.getId().getPath()));
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
                .texture("texture",  new ResourceLocation(TooManyFountains.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(TooManyFountains.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(TooManyFountains.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TooManyFountains.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder heldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(TooManyFountains.MODID,"item/" + item.getId().getPath()));
    }
}
