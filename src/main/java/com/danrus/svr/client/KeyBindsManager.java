package com.danrus.svr.client;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyBindsManager {
    public static KeyBinding toggleKeyBinding;
    public static KeyBinding applyRocketForceKeyBinding;

    public static void register() {
        toggleKeyBinding = new KeyBinding(
                "key.svr.toggle",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_Z,
                "category.svr.keybinds"
        );
        KeyBindingHelper.registerKeyBinding(toggleKeyBinding);
    }

    public static void handleKeyPress (MinecraftClient minecraftClient) {
        if (toggleKeyBinding.wasPressed()) {
            ModConfig.get().isModEnabled = !ModConfig.get().isModEnabled;
            ModConfig.save();
        }
    }
}