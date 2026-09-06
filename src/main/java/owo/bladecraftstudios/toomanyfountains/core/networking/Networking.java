package owo.bladecraftstudios.toomanyfountains.core.networking;

import owo.bladecraftstudios.toomanyfountains.client.packets.KeybindPacketC2S;
import owo.bladecraftstudios.toomanyfountains.client.packets.SpellCastC2S;
import owo.bladecraftstudios.toomanyfountains.core.util.UniversalCommon;

public class Networking {
    public static void registerPackets() {
        UniversalCommon.Networking.registerMsg(KeybindPacketC2S.class);
        UniversalCommon.Networking.registerMsg(SpellCastC2S.class);
    }
}
