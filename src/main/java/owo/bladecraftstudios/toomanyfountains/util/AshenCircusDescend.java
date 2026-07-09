package owo.bladecraftstudios.toomanyfountains.util;

import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//@Mod.EventBusSubscriber(modid = "toomanyfountains", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AshenCircusDescend {
    @SubscribeEvent
    public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) {
            return;
        }
        ResourceKey<Level> targetDim = event.getTo();
        String dimId = targetDim.location().toString().toLowerCase();
        if (dimId.contains("ashen_circus")) {
            double targetY = player.getY() + 64.0D;
            player.server.execute(() -> {
                if (player.connection != null) {
                    player.teleportTo(player.getX(), targetY, player.getZ());
                    player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0));
                }
            });
        }
    }
}
