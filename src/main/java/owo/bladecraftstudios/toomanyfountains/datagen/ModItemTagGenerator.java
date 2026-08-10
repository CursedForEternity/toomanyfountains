package owo.bladecraftstudios.toomanyfountains.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.blocks.DWBlocks;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, TooManyFountains.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(DWBlocks.FROZEN_OAK_LOG.get().asItem())
                .add(DWBlocks.FROZEN_OAK_WOOD.get().asItem())
                .add(DWBlocks.STRIPPED_FROZEN_OAK_LOG.get().asItem())
                .add(DWBlocks.STRIPPED_FROZEN_OAK_WOOD.get().asItem())
                .add(DWBlocks.FROZEN_OAK_PLANKS.get().asItem())
                .add(DWBlocks.RED_CORALWOOD_LOG.get().asItem())
                .add(DWBlocks.RED_CORALWOOD_WOOD.get().asItem())
                .add(DWBlocks.BLUE_CORALWOOD_LOG.get().asItem())
                .add(DWBlocks.BLUE_CORALWOOD_WOOD.get().asItem())
                .add(DWBlocks.PINK_CORALWOOD_LOG.get().asItem())
                .add(DWBlocks.PINK_CORALWOOD_WOOD.get().asItem())
                .add(DWBlocks.YELLOW_CORALWOOD_LOG.get().asItem())
                .add(DWBlocks.YELLOW_CORALWOOD_WOOD.get().asItem())
                .add(DWBlocks.PURPLE_CORALWOOD_LOG.get().asItem())
                .add(DWBlocks.PURPLE_CORALWOOD_WOOD.get().asItem())
                .add(DWBlocks.DEAD_CORALWOOD_LOG.get().asItem())
                .add(DWBlocks.DEAD_CORALWOOD_WOOD.get().asItem());
    }
}
