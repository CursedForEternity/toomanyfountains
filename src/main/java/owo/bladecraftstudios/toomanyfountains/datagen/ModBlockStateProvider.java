package owo.bladecraftstudios.toomanyfountains.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
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
        blockWithItem(DWBlocks.MUSHITE);
        blockWithItem(DWBlocks.FUNGITE);
        blockFloor(DWBlocks.FUNGAL_MUSHITE);
        blockFloor(DWBlocks.FUNGAL_FUNGITE);
        blockWithItem(DWBlocks.JELLITE_ORE);
        blockWithItem(DWBlocks.BLIGHTSHROOM_PLANKS);
        blockWithItem(DWBlocks.BLIGHTSHROOM_LEAVES);
        blockColumn(DWBlocks.MUSHSNOW);
        blockColumn(DWBlocks.CIRCUS_BOARDS);
        blockColumn(DWBlocks.CIRCUS_ASH);
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
