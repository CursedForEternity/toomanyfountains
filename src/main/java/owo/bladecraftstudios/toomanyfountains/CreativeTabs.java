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
    }).build());
    public static final RegistryObject<CreativeModeTab> SHROOM_TAB = CREATIVE_TABS.register("mushroom_dw", () -> CreativeModeTab.builder().icon(() -> new ItemStack(DWBlocks.MUSHITE.get())).title(Component.translatable("creativetab.shroom_dw")).displayItems((itemDisplayParameters, output) -> {
        output.accept(DWItems.RAW_JELLITE.get());
        output.accept(DWItems.JELLITE.get());
        output.accept(DWBlocks.JELLITE_ORE.get());
        output.accept(DWBlocks.MUSHITE.get());
    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_TABS.register(eventBus);
    }
}
