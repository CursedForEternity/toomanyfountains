package owo.bladecraftstudios.toomanyfountains.client.events;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;
import owo.bladecraftstudios.toomanyfountains.TooManyFountains;

@Mod.EventBusSubscriber(modid = TooManyFountains.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    public static final KeyMapping CAST_SPELL = new KeyMapping("toomanyfountains.keybinds.cast_spell",
            KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, // Default mapping is on the keyboard
            GLFW.GLFW_KEY_G, "key.categories.toomanyfountains" // Mapping will be in the main category
    );

    public static final KeyMapping SWITCH_SPELL = new KeyMapping("toomanyfountains.keybinds.switch_spell",
            KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, // Default mapping is on the keyboard
            GLFW.GLFW_KEY_G, "key.categories.toomanyfountains" // Mapping will be in the main category
    );

    @SubscribeEvent
    public static void registerBindings(RegisterKeyMappingsEvent event) {
        event.register(CAST_SPELL);
        event.register(SWITCH_SPELL);
    }
}
