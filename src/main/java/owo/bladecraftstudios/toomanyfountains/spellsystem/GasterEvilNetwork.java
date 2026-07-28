package owo.bladecraftstudios.toomanyfountains.spellsystem;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;

public class GasterEvilNetwork {
    private static final String PROTOCOL_VERSION = "1";
    private static int packetId = 0;
    public static SimpleChannel CHANNEL;

    public static void register() {
        CHANNEL = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(TooManyFountains.MODID, "main"))
                .clientAcceptedVersions(PROTOCOL_VERSION::equals)
                .serverAcceptedVersions(PROTOCOL_VERSION::equals)
                .networkProtocolVersion(() -> PROTOCOL_VERSION)
                .simpleChannel();

        CHANNEL.messageBuilder(ChangeSpellPacket.class, packetId++, NetworkDirection.PLAY_TO_SERVER)
                .encoder(ChangeSpellPacket::encode)
                .decoder(ChangeSpellPacket::decode)
                .consumerNetworkThread(ChangeSpellPacket::handle)
                .add();
    }
}
