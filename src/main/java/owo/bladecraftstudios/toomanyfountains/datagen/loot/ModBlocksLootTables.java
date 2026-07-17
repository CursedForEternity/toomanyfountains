package owo.bladecraftstudios.toomanyfountains.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.blocks.DWBlocks;
import owo.bladecraftstudios.toomanyfountains.items.DWItems;

import java.util.Set;

public class ModBlocksLootTables extends BlockLootSubProvider {
    public ModBlocksLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(DWBlocks.CIRCUS_FLOOR.get());
        this.dropSelf(DWBlocks.MUSHITE.get());
        this.dropSelf(DWBlocks.FUNGITE.get());
        this.dropSelf(DWBlocks.FUNGAL_FUNGITE.get());
        this.dropSelf(DWBlocks.FUNGAL_MUSHITE.get());
        this.dropSelf(DWBlocks.BLIGHTSHROOM_LEAVES.get());
        this.dropSelf(DWBlocks.BLIGHTSHROOM_PLANKS.get());
        this.dropSelf(DWBlocks.BLIGHTSHROOM_STAIRS.get());
        this.dropSelf(DWBlocks.BLIGHTSHROOM_DOOR.get());
        this.dropSelf(DWBlocks.BLIGHTSHROOM_SLAB.get());
        this.dropSelf(DWBlocks.BLIGHTSHROOM_PRESSURE_PLATE.get());
        this.dropSelf(DWBlocks.BLIGHTSHROOM_FENCE.get());
        this.dropSelf(DWBlocks.BLIGHTSHROOM_FENCE_GATE.get());
        this.dropSelf(DWBlocks.BLIGHTSHROOM_BUTTON.get());
        this.dropSelf(DWBlocks.FUNGITE.get());
        this.dropSelf(DWBlocks.CIRCUS_BOARDS.get());
        this.dropSelf(DWBlocks.MUSHSNOW.get());
        this.dropSelf(DWBlocks.CIRCUS_ASH.get());
        this.dropSelf(DWBlocks.CIRCUS_STONE.get());

        //A Cold Place
        this.dropSelf(DWBlocks.FROZEN_OAK_LOG.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_WOOD.get());
        this.dropSelf(DWBlocks.STRIPPED_FROZEN_OAK_LOG.get());
        this.dropSelf(DWBlocks.STRIPPED_FROZEN_OAK_WOOD.get());
        this.dropSelf(DWBlocks.FROZEN_OAK_PLANKS.get());
        this.dropOther(DWBlocks.ICESALT.get(), DWBlocks.COBBLED_ICESALT.get());
        this.dropSelf(DWBlocks.COBBLED_ICESALT.get());
        this.dropSelf(DWBlocks.POLISHED_ICESALT.get());
        this.dropSelf(DWBlocks.CHISELED_ICESALT.get());
        this.dropSelf(DWBlocks.ICESALT_BRICKS.get());
        this.dropSelf(DWBlocks.ICESALT_TILES.get());
        this.dropOther(DWBlocks.HAILSTONE.get(), DWBlocks.COBBLED_HAILSTONE.get());
        this.dropSelf(DWBlocks.COBBLED_HAILSTONE.get());
        this.dropSelf(DWBlocks.POLISHED_HAILSTONE.get());
        this.dropSelf(DWBlocks.CHISELED_HAILSTONE.get());
        this.dropSelf(DWBlocks.HAILSTONE_BRICKS.get());
        this.dropSelf(DWBlocks.HAILSTONE_TILES.get());
        this.dropOther(DWBlocks.SUBZERO_STONE.get(), DWBlocks.COBBLED_SUBZERO_STONE.get());
        this.dropSelf(DWBlocks.COBBLED_SUBZERO_STONE.get());
        this.dropSelf(DWBlocks.POLISHED_SUBZERO_STONE.get());
        this.dropSelf(DWBlocks.CHISELED_SUBZERO_STONE.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_BRICKS.get());
        this.dropSelf(DWBlocks.SUBZERO_STONE_TILES.get());
        this.dropOther(DWBlocks.FROST_MARBLE.get(), DWBlocks.COBBLED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.COBBLED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.POLISHED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.CHISELED_FROST_MARBLE.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_BRICKS.get());
        this.dropSelf(DWBlocks.FROST_MARBLE_TILES.get());
        this.dropSelf(DWBlocks.ARCTIC_SNOW_BLOCK.get());
        this.dropSelf(DWBlocks.ARCTIC_SNOW.get());
        this.dropSelf(DWBlocks.POWDER_ARCTIC_SNOW.get());

        this.add(DWBlocks.SILWARE_DEBRIS.get(),
                block -> createRareOreDrops(DWBlocks.SILWARE_DEBRIS.get(), DWItems.RAW_SILWARE.get()));
        this.add(DWBlocks.JELLITE_ORE.get(),
                block -> createCopperLikeOreDrops(DWBlocks.JELLITE_ORE.get(), DWItems.RAW_JELLITE.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createRareOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 6.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DWBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}