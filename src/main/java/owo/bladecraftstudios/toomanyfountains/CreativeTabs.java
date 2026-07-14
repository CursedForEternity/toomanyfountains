package owo.bladecraftstudios.toomanyfountains;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import owo.bladecraftstudios.toomanyfountains.blocks.DWBlocks;
import owo.bladecraftstudios.toomanyfountains.items.DWItems;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TooManyFountains.MODID);

    public static final RegistryObject<CreativeModeTab> CIRCUS_TAB = CREATIVE_TABS.register("circus_dw", () -> CreativeModeTab.builder().icon(() -> new ItemStack(DWBlocks.CIRCUS_FLOOR.get())).title(Component.translatable("creativetab.circus_dw")).displayItems((itemDisplayParameters, output) -> {
        output.accept(DWBlocks.CIRCUS_FLOOR.get());
        output.accept(DWBlocks.CIRCUS_BOARDS.get());
        output.accept(DWBlocks.CIRCUS_ASH.get());
        output.accept(DWBlocks.CIRCUS_STONE.get());
        output.accept(DWItems.SILWARE_AX.get());
        output.accept(DWItems.SILWARE_AXE.get());
        output.accept(DWItems.SILWARE_SHOVEL.get());
        output.accept(DWItems.SILWARE_PICKAXE.get());
        output.accept(DWItems.SILWARE_SWORD.get());
        output.accept(DWItems.SILWARE_HOE.get());
        output.accept(DWItems.SILWARE_BODKIN.get());
        output.accept(DWItems.SILWARE_JAVELIN.get());
        output.accept(DWItems.RAW_SILWARE.get());
        output.accept(DWItems.SILWARE.get());
        output.accept(DWBlocks.SILWARE_DEBRIS.get());
    }).build());
    public static final RegistryObject<CreativeModeTab> SHROOM_TAB = CREATIVE_TABS.register("mushroom_dw", () -> CreativeModeTab.builder().icon(() -> new ItemStack(DWBlocks.MUSHITE.get())).title(Component.translatable("creativetab.shroom_dw")).displayItems((itemDisplayParameters, output) -> {
        output.accept(DWItems.RAW_JELLITE.get());
        output.accept(DWItems.JELLITE.get());
        output.accept(DWBlocks.JELLITE_ORE.get());
        output.accept(DWBlocks.MUSHITE.get());
        output.accept(DWBlocks.FUNGITE.get());
        output.accept(DWBlocks.BLIGHTSHROOM_PLANKS.get());
        output.accept(DWBlocks.BLIGHTSHROOM_DOOR.get());
        output.accept(DWBlocks.BLIGHTSHROOM_BUTTON.get());
        output.accept(DWBlocks.BLIGHTSHROOM_FENCE.get());
        output.accept(DWBlocks.BLIGHTSHROOM_FENCE_GATE.get());
        output.accept(DWBlocks.BLIGHTSHROOM_PRESSURE_PLATE.get());
        output.accept(DWBlocks.BLIGHTSHROOM_STAIRS.get());
        output.accept(DWBlocks.BLIGHTSHROOM_SLAB.get());
        output.accept(DWBlocks.MUSHSNOW.get());
        output.accept(DWBlocks.FUNGAL_MUSHITE.get());
        output.accept(DWBlocks.FUNGAL_FUNGITE.get());
    }).build());
    public static final RegistryObject<CreativeModeTab> ICE_TAB = CREATIVE_TABS.register("ice_dw", () -> CreativeModeTab.builder().icon(() -> new ItemStack(DWBlocks.ICESALT.get())).title(Component.translatable("creativetab.ice_dw")).displayItems((itemDisplayParameters, output) -> {
        output.accept(DWBlocks.ICESALT.get());
        output.accept(DWBlocks.COBBLED_ICESALT.get());
        output.accept(DWBlocks.POLISHED_ICESALT.get());
        output.accept(DWBlocks.CHISELED_ICESALT.get());
        output.accept(DWBlocks.ICESALT_BRICKS.get());
        output.accept(DWBlocks.ICESALT_TILES.get());
        output.accept(DWBlocks.HAILSTONE.get());
        output.accept(DWBlocks.COBBLED_HAILSTONE.get());
        output.accept(DWBlocks.POLISHED_HAILSTONE.get());
        output.accept(DWBlocks.CHISELED_HAILSTONE.get());
        output.accept(DWBlocks.HAILSTONE_BRICKS.get());
        output.accept(DWBlocks.HAILSTONE_TILES.get());
        output.accept(DWBlocks.SUBZERO_STONE.get());
        output.accept(DWBlocks.COBBLED_SUBZERO_STONE.get());
        output.accept(DWBlocks.POLISHED_SUBZERO_STONE.get());
        output.accept(DWBlocks.CHISELED_SUBZERO_STONE.get());
        output.accept(DWBlocks.SUBZERO_STONE_BRICKS.get());
        output.accept(DWBlocks.SUBZERO_STONE_TILES.get());
        output.accept(DWBlocks.FROST_MARBLE.get());
        output.accept(DWBlocks.COBBLED_FROST_MARBLE.get());
        output.accept(DWBlocks.POLISHED_FROST_MARBLE.get());
        output.accept(DWBlocks.CHISELED_FROST_MARBLE.get());
        output.accept(DWBlocks.FROST_MARBLE_BRICKS.get());
        output.accept(DWBlocks.FROST_MARBLE_TILES.get());
        output.accept(DWBlocks.ARCTIC_SNOW.get());
    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_TABS.register(eventBus);
    }
}
