package owo.bladecraftstudios.toomanyfountains.spellsystem;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.datapack.ItemSpellHolder;
import owo.bladecraftstudios.toomanyfountains.datapack.SpellData;

@Mod.EventBusSubscriber(modid = TooManyFountains.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SpellUtilHandler {
    private static boolean checkConditions(Player player, SpellData spell) {
        if (spell.requireCrouch() && !player.isCrouching()) return false;
        if (spell.requireSprint() && !player.isSprinting()) return false;
        return true;
    }


    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        ItemStack stack = event.getItemStack();
        Player player = event.getEntity();
        SpellData spell = getActiveSpell(stack);
        if (spell == null) return;

        if (!checkConditions(player, spell)) return;

        if (spell.actionType().equals("cast")) {
            if (!event.getLevel().isClientSide) {
                triggerEffect(player, stack.getItem(), spell);
            }
            event.setCancellationResult(InteractionResult.SUCCESS);
            event.setCanceled(true);
        }
        else if (spell.actionType().equals("focus")) {
            player.startUsingItem(event.getHand());
            event.setCancellationResult(InteractionResult.SUCCESS);
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
        if (event.getEntity() instanceof Player) {
            SpellData spell = getActiveSpell(event.getItem());
            if (spell != null && spell.actionType().equals("focus")) {
                event.setDuration(spell.holdDuration());
            }
        }
    }

    @SubscribeEvent
    public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
        if (event.getEntity() instanceof Player player) {
            ItemStack stack = event.getItem();
            SpellData spell = getActiveSpell(stack);

            if (spell != null && spell.actionType().equals("focus") && checkConditions(player, spell)) {
                if (!player.getCommandSenderWorld().isClientSide) {
                    triggerEffect(player, stack.getItem(), spell);
                }
                event.setResultStack(stack);
            }
        }
    }

    public static void triggerEffect(Player player, Item item, SpellData spell) {
        Component spellNameComponent = Component.translatable(spell.name()).withStyle(ChatFormatting.GOLD);

        Component actionBarMessage = Component.translatable("* You used [")
                .withStyle(ChatFormatting.WHITE)
                .append(spellNameComponent)
                .append("] !").withStyle(ChatFormatting.WHITE);

        player.displayClientMessage(actionBarMessage, true);

        player.getCooldowns().addCooldown(item, spell.cooldownTicks());
    }

    private static SpellData getActiveSpell(ItemStack stack) {
        if (stack.isEmpty() || !SpellDataLoader.HOLDER_ITEMS.containsKey(stack.getItem())) return null;
        ItemSpellHolder holder = SpellDataLoader.HOLDER_ITEMS.get(stack.getItem());
        if (holder.spells().isEmpty()) return null;

        int index = stack.getOrCreateTag().getInt("ActiveSpellIndex");
        if (index < 0 || index >= holder.spells().size()) index = 0;

        ResourceLocation spellId = new ResourceLocation(holder.spells().get(index));
        return SpellDataLoader.REGISTRY_SPELLS.get(spellId);
    }
}
