package owo.bladecraftstudios.toomanyfountains.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.blocks.DWBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TooManyFountains.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(DWBlocks.JELLITE_ORE.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(DWBlocks.CIRCUS_BOARDS.get()).add(DWBlocks.CIRCUS_FLOOR.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DWBlocks.MUSHITE.get()).add(DWBlocks.JELLITE_ORE.get());
    }
}
