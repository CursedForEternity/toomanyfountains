package owo.bladecraftstudios.toomanyfountains.datapack;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import java.util.List;

public record ItemSpellHolder(List<String> spells) {
    public static final Codec<ItemSpellHolder> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.listOf().fieldOf("spells").forGetter(ItemSpellHolder::spells)
    ).apply(instance, ItemSpellHolder::new));
}