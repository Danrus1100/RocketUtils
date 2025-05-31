package com.danrus.svr.client;

import com.danrus.svr.client.config.ModConfig;
import com.danrus.svr.client.utils.PlayerUtils;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
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
//
//        applyRocketForceKeyBinding = new KeyBinding(
//                "key.svt.force_rocket_use",
//                InputUtil.Type.KEYSYM,
//                GLFW.GLFW_KEY_SPACE,
//                "category.svr.keybinds"
//        );
//
//        KeyBindingHelper.registerKeyBinding(applyRocketForceKeyBinding);
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

        if (applyRocketForceKeyBinding.wasPressed()) {
            assert mc.player != null;
            ClientPlayerEntity player = mc.player;
            int rocket_slot = player.getInventory().getMatchingSlot(RegistryEntry.of(Items.FIREWORK_ROCKET), ItemStack.EMPTY);
            if (rocket_slot >= 0) {
                // TODO
            }
        }
    }
}