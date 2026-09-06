package owo.bladecraftstudios.toomanyfountains.client.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.client.packets.KeybindPacketC2S;
import owo.bladecraftstudios.toomanyfountains.core.util.UniversalCommon;

@Mod.EventBusSubscriber(modid = TooManyFountains.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.player.level().isClientSide) {
            while (ClientSetup.CAST_SPELL.consumeClick()) {
                UniversalCommon.Networking.getInstance().sendToServer(new KeybindPacketC2S(0));
            }
            while (ClientSetup.SWITCH_SPELL.consumeClick()) {
                UniversalCommon.Networking.getInstance().sendToServer(new KeybindPacketC2S(1));
            }
        }
    }
}
