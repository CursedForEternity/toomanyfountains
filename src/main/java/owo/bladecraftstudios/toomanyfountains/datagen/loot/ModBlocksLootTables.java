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
        this.dropSelf(DWBlocks.FUNGITE.get());
        this.dropSelf(DWBlocks.CIRCUS_BOARDS.get());
        this.dropOther(DWBlocks.ICESALT.get(), DWBlocks.COBBLED_ICESALT.get());
        this.dropSelf(DWBlocks.COBBLED_ICESALT.get());
        this.dropSelf(DWBlocks.MUSHSNOW.get());
        this.dropSelf(DWBlocks.CIRCUS_ASH.get());
        this.dropSelf(DWBlocks.CIRCUS_STONE.get());

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
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DWBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}