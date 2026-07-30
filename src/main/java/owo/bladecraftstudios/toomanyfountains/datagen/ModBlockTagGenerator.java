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
        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(DWBlocks.JELLITE_ORE.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(DWBlocks.CIRCUS_BOARDS.get())
                .add(DWBlocks.CIRCUS_FLOOR.get())
                .add(DWBlocks.BLIGHTSHROOM_PLANKS.get())
                .add(DWBlocks.BLIGHTSHROOM_STAIRS.get())
                .add(DWBlocks.BLIGHTSHROOM_SLAB.get())
                .add(DWBlocks.BLIGHTSHROOM_FENCE.get())
                .add(DWBlocks.BLIGHTSHROOM_FENCE_GATE.get())
                .add(DWBlocks.BLIGHTSHROOM_DOOR.get())
                .add(DWBlocks.BLIGHTSHROOM_BUTTON.get())
                .add(DWBlocks.BLIGHTSHROOM_PRESSURE_PLATE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DWBlocks.MUSHITE.get())
                .add(DWBlocks.JELLITE_ORE.get())
                .add(DWBlocks.ICESALT.get())
                .add(DWBlocks.COBBLED_ICESALT.get())
                .add(DWBlocks.POLISHED_ICESALT.get())
                .add(DWBlocks.CHISELED_ICESALT.get())
                .add(DWBlocks.ICESALT_BRICKS.get())
                .add(DWBlocks.ICESALT_PILLAR.get())
                .add(DWBlocks.ICESALT_TILES.get())
                .add(DWBlocks.ICESALT_STAIRS.get())
                .add(DWBlocks.ICESALT_SLAB.get())
                .add(DWBlocks.ICESALT_WALL.get())
                .add(DWBlocks.ICESALT_PRESSURE_PLATE.get())
                .add(DWBlocks.ICESALT_BUTTON.get())
                .add(DWBlocks.HAILSTONE.get())
                .add(DWBlocks.COBBLED_HAILSTONE.get())
                .add(DWBlocks.POLISHED_HAILSTONE.get())
                .add(DWBlocks.CHISELED_HAILSTONE.get())
                .add(DWBlocks.HAILSTONE_BRICKS.get())
                .add(DWBlocks.HAILSTONE_PILLAR.get())
                .add(DWBlocks.HAILSTONE_TILES.get())
                .add(DWBlocks.HAILSTONE_STAIRS.get())
                .add(DWBlocks.HAILSTONE_SLAB.get())
                .add(DWBlocks.HAILSTONE_WALL.get())
                .add(DWBlocks.HAILSTONE_PRESSURE_PLATE.get())
                .add(DWBlocks.HAILSTONE_BUTTON.get())
                .add(DWBlocks.SUBZERO_STONE.get())
                .add(DWBlocks.COBBLED_SUBZERO_STONE.get())
                .add(DWBlocks.POLISHED_SUBZERO_STONE.get())
                .add(DWBlocks.CHISELED_SUBZERO_STONE.get())
                .add(DWBlocks.SUBZERO_STONE_BRICKS.get())
                .add(DWBlocks.SUBZERO_STONE_PILLAR.get())
                .add(DWBlocks.SUBZERO_STONE_TILES.get())
                .add(DWBlocks.SUBZERO_STONE_STAIRS.get())
                .add(DWBlocks.SUBZERO_STONE_SLAB.get())
                .add(DWBlocks.SUBZERO_STONE_WALL.get())
                .add(DWBlocks.SUBZERO_STONE_PRESSURE_PLATE.get())
                .add(DWBlocks.SUBZERO_STONE_BUTTON.get())
                .add(DWBlocks.FROST_MARBLE.get())
                .add(DWBlocks.COBBLED_FROST_MARBLE.get())
                .add(DWBlocks.POLISHED_FROST_MARBLE.get())
                .add(DWBlocks.CHISELED_FROST_MARBLE.get())
                .add(DWBlocks.FROST_MARBLE_BRICKS.get())
                .add(DWBlocks.FROST_MARBLE_PILLAR.get())
                .add(DWBlocks.FROST_MARBLE_TILES.get())
                .add(DWBlocks.FROST_MARBLE_STAIRS.get())
                .add(DWBlocks.FROST_MARBLE_SLAB.get())
                .add(DWBlocks.FROST_MARBLE_WALL.get())
                .add(DWBlocks.FROST_MARBLE_PRESSURE_PLATE.get())
                .add(DWBlocks.FROST_MARBLE_BUTTON.get())
                .add(DWBlocks.MUSHSNOW.get())
                .add(DWBlocks.CIRCUS_STONE.get())
                .add(DWBlocks.FUNGITE.get())
                .add(DWBlocks.FUNGAL_FUNGITE.get())
                .add(DWBlocks.SILWARE_DEBRIS.get())
                .add(DWBlocks.FUNGAL_MUSHITE.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(DWBlocks.CIRCUS_ASH.get());
        this.tag(BlockTags.FENCES)
                .add(DWBlocks.BLIGHTSHROOM_FENCE.get())
                .add(DWBlocks.FROZEN_OAK_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(DWBlocks.BLIGHTSHROOM_FENCE_GATE.get())
                .add(DWBlocks.FROZEN_OAK_GATE.get());
    }
}
