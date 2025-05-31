package com.danrus.svr.client;

import com.danrus.svr.client.config.ModConfig;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.lwjgl.glfw.GLFW;

public class KeyBindsManager {
    public static KeyBinding toggleKeyBinding;

    public static void register() {
        toggleKeyBinding = new KeyBinding(
                "key.svr.toggle",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_Z,
                "category.svr.keybinds"
        );
        KeyBindingHelper.registerKeyBinding(toggleKeyBinding);
    }

    public static void handleKeyPress (MinecraftClient mc) {
        if (toggleKeyBinding.wasPressed()) {
            ModConfig.get().isInteractionDisabled = !ModConfig.get().isInteractionDisabled;
            ModConfig.save();
            assert mc.player != null;
            mc.player.playSound(SoundEvents.UI_BUTTON_CLICK.value(), 0.33F, 1.0F);
            mc.inGameHud.setOverlayMessage(
                    ModConfig.get().isInteractionDisabled ?
                            Text.translatable("key.svr.interaction_disabled").formatted(Formatting.RED) :
                            Text.translatable("key.svr.interaction_enabled").formatted(Formatting.GREEN),
                    false
            );
        }
    }
}