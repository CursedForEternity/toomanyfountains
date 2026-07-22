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
        simpleItem(DWItems.JELLITE);
        simpleItem(DWItems.RAW_JELLITE);
        simpleItem(DWItems.RAW_SILWARE);
        simpleItem(DWItems.SILWARE);
        heldItem(DWItems.SILWARE_AXE);
        heldItem(DWItems.SILWARE_HOE);
        heldItem(DWItems.SILWARE_BODKIN);
        heldItem(DWItems.SILWARE_PICKAXE);
        heldItem(DWItems.SILWARE_SWORD);
        heldItem(DWItems.SILWARE_SHOVEL);

        simpleBlockItem(DWBlocks.BLIGHTSHROOM_DOOR);
        evenSimplerBlockItem(DWBlocks.FROZEN_OAK_LOG);
        evenSimplerBlockItem(DWBlocks.FROZEN_OAK_WOOD);
        evenSimplerBlockItem(DWBlocks.STRIPPED_FROZEN_OAK_LOG);
        evenSimplerBlockItem(DWBlocks.STRIPPED_FROZEN_OAK_WOOD);
        evenSimplerBlockItem(DWBlocks.BLIGHTSHROOM_STAIRS);
        evenSimplerBlockItem(DWBlocks.BLIGHTSHROOM_FENCE_GATE);
        evenSimplerBlockItem(DWBlocks.BLIGHTSHROOM_PRESSURE_PLATE);
        evenSimplerBlockItem(DWBlocks.BLIGHTSHROOM_SLAB);
        fenceItem(DWBlocks.BLIGHTSHROOM_FENCE, DWBlocks.BLIGHTSHROOM_PLANKS);
        buttonItem(DWBlocks.BLIGHTSHROOM_BUTTON, DWBlocks.BLIGHTSHROOM_PLANKS);
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
