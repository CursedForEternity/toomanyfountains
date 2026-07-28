package owo.bladecraftstudios.toomanyfountains.spellsystem;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.NetworkEvent;
import owo.bladecraftstudios.toomanyfountains.datapack.ItemSpellHolder;

import java.util.function.Supplier;

public class ChangeSpellPacket {
    private final boolean scrollUp;

    public ChangeSpellPacket(boolean scrollUp) { this.scrollUp = scrollUp; }
    public ChangeSpellPacket(FriendlyByteBuf buf) { this.scrollUp = buf.readBoolean(); }
    public void toBytes(FriendlyByteBuf buf) { buf.writeBoolean(scrollUp); }

    public static void encode(ChangeSpellPacket pkt, FriendlyByteBuf buf) {
        buf.writeBoolean(pkt.scrollUp);
    }

    public static ChangeSpellPacket decode(FriendlyByteBuf buf) {
        return new ChangeSpellPacket(buf.readBoolean());
    }

    public static void handle(ChangeSpellPacket pkt, Supplier<NetworkEvent.Context> ctxSupplier) {
        NetworkEvent.Context ctx = ctxSupplier.get();
        ctx.enqueueWork(() -> {
            ServerPlayer player = ctx.getSender();
            if (player == null) return;

            ItemStack stack = player.getMainHandItem();
            if (SpellDataLoader.HOLDER_ITEMS.containsKey(stack.getItem())) {
                ItemSpellHolder holder = SpellDataLoader.HOLDER_ITEMS.get(stack.getItem());
                if (holder.spells().isEmpty()) return;
                int currentIndex = stack.getOrCreateTag().getInt("ActiveSpellIndex");
                int nextIndex = pkt.scrollUp ? currentIndex + 1 : currentIndex - 1;
                if (nextIndex >= holder.spells().size()) nextIndex = 0;
                if (nextIndex < 0) nextIndex = holder.spells().size() - 1;

                stack.getOrCreateTag().putInt("ActiveSpellIndex", nextIndex);
                String activeSpell = holder.spells().get(nextIndex);
            }
        });
        ctx.setPacketHandled(true);
    }
}