package owo.bladecraftstudios.toomanyfountains.spellsystem;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.datapack.ItemSpellHolder;

@Mod.EventBusSubscriber(modid = TooManyFountains.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientMouseHandler {
    @SubscribeEvent
    public static void onMouseScroll(InputEvent.MouseScrollingEvent event) {
        net.minecraft.client.player.LocalPlayer player = net.minecraft.client.Minecraft.getInstance().player;
        if (player != null && player.isCrouching()) {
            ItemStack stack = player.getMainHandItem();
            if (SpellDataLoader.HOLDER_ITEMS.containsKey(stack.getItem())) {
                ItemSpellHolder holder = SpellDataLoader.HOLDER_ITEMS.get(stack.getItem());
                if (holder != null && holder.spells().size() > 1) {
                    GasterEvilNetwork.CHANNEL.sendToServer(new ChangeSpellPacket(event.getScrollDelta() > 0));
                    event.setCanceled(true);
                }
            }
        }
    }
}