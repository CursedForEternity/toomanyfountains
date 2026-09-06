package owo.bladecraftstudios.toomanyfountains.server;

import net.minecraft.server.level.ServerPlayer;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;
import owo.bladecraftstudios.toomanyfountains.core.capabilities.Capabilities;

public class KeybindManager {
    public static void onKeycode(int key, ServerPlayer p) {
        switch (key) {
            case 0: onCastKeybind(p);
            case 1: ;
            default:
                TooManyFountains.LOGGER.error("Unrecognized Keycode! {}", key);
        }
    }

    private static void onCastKeybind(ServerPlayer player) {
        player.getCapability(Capabilities.PLAYER_CAPABILITY).ifPresent(p -> {
            boolean canCast = false;
            for (int i = 0; i < p.getSelectedSpell().requiredTag().size(); i++) {
                if (player.getMainHandItem().is(p.getSelectedSpell().requiredTag().get(i))) {
                    canCast = true;
                    break;
                }
            }
            if (canCast)
                TooManyFountains.LOGGER.debug("{}", p.getSelectedSpell().cast(player, null, player.level()));
        });
    }
}
