package owo.bladecraftstudios.toomanyfountains.datapack;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record SpellData(String actionType, int cooldownTicks, int holdDuration, boolean requireCrouch, boolean requireSprint, String name) {
    public static final Codec<SpellData> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.optionalFieldOf("action_type", "cast").forGetter(SpellData::actionType),
            Codec.INT.optionalFieldOf("cooldown", 20).forGetter(SpellData::cooldownTicks),
            Codec.INT.optionalFieldOf("hold_duration", 0).forGetter(SpellData::holdDuration),
            Codec.BOOL.optionalFieldOf("require_crouch", false).forGetter(SpellData::requireCrouch),
            Codec.BOOL.optionalFieldOf("require_sprint", false).forGetter(SpellData::requireSprint),
            Codec.STRING.optionalFieldOf("name", "spell.toomanyfountains.default").forGetter(SpellData::name)
    ).apply(instance, SpellData::new));
}
