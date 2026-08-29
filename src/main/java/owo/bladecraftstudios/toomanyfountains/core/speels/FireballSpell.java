package owo.bladecraftstudios.toomanyfountains.core.speels;

import net.minecraft.network.chat.Component;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.apache.logging.log4j.util.TriConsumer;

import java.util.List;

public class FireballSpell extends AbstractSpell {
    @Override
    public List<TagKey<Item>> requiredTag() {
        return List.of(ItemTags.CANDLES);
    }

    @Override
    public Component getName() {
        return Component.literal("FIREBALL!");
    }

    @Override
    public TriConsumer<Player, Entity, Level> FIREBALL() {
        return new TriConsumer<Player, Entity, Level>() {
            @Override
            public void accept(Player player, Entity entity, Level level) {
                Vec3 look = player.getLookAngle();

                Fireball ball = EntityType.FIREBALL.create(level);

                Vec3 pos = player.getEyePosition().add(look.scale(2.0));
                ball.setPos(pos);

                ball.setDeltaMovement(look.scale(1.5));

                level.addFreshEntity(ball);

                player.displayClientMessage(Component.literal(player.getName() + " Cast " + getName().getString()), false);
                if (entity instanceof Player p)
                    p.displayClientMessage(Component.literal(player.getName() + " Cast " + getName().getString()), false);
            }
        };
    }
}
