package owo.bladecraftstudios.toomanyfountains.core.speels;

import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import org.apache.logging.log4j.util.TriConsumer;

import java.util.List;
import java.util.function.BiConsumer;

public abstract class AbstractSpell {
    /**
     * @return The List of Tag's required to cast this spell
     * Basically, if the players held item has at least one of the tags returned by this, they may cast the spell
     */
    public abstract List<TagKey<Item>> requiredTag();

    /**
     * @return a TriConsumer which will be executed based on `FIREBALL.accept(caster, castedAt, level);`
     * Why is it named FIREBALL? BECAUSE I CAST FIREBALL THAT'S WHY!
     */
    public abstract TriConsumer<Player, Entity, Level> FIREBALL();
}
