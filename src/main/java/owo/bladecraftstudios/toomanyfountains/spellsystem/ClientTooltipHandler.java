package owo.bladecraftstudios.toomanyfountains.spellsystem;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.datapack.ItemSpellHolder;
import owo.bladecraftstudios.toomanyfountains.datapack.SpellData;

@Mod.EventBusSubscriber(modid = TooManyFountains.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientTooltipHandler {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        if (!stack.isEmpty() && SpellDataLoader.HOLDER_ITEMS.containsKey(stack.getItem())) {
            ItemSpellHolder holder = SpellDataLoader.HOLDER_ITEMS.get(stack.getItem());
            if (holder == null || holder.spells().isEmpty()) return;
            int index = stack.getOrCreateTag().getInt("ActiveSpellIndex");
            if (index < 0 || index >= holder.spells().size()) index = 0;

            String activeSpellId = holder.spells().get(index);
            ResourceLocation spellRl = new ResourceLocation(activeSpellId);
            SpellData spell = SpellDataLoader.REGISTRY_SPELLS.get(spellRl);
            event.getToolTip().add(Component.empty());
            event.getToolTip().add(Component.translatable(spell.name())
                    .withStyle(ChatFormatting.GOLD));
            event.getToolTip().add(Component.literal(" * Type " + spell.actionType())
                    .withStyle(ChatFormatting.DARK_GRAY));event.getToolTip()
                    .add(Component.literal(" * RestTime " + (spell.cooldownTicks() / 20.0F) + "s")
                            .withStyle(ChatFormatting.DARK_GRAY));
        }
    }
}