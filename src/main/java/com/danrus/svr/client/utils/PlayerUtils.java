package com.danrus.svr.client.utils;

import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Items;

public class PlayerUtils {
    public static boolean isPlayerSneaking() {
        MinecraftClient mc = MinecraftClient.getInstance();
        assert mc.player != null;
        return mc.player.isSneaking();
    }

    public static boolean isPlayerHoldingRocket() {
        MinecraftClient mc = MinecraftClient.getInstance();
        assert mc.player != null;
        return mc.player.getMainHandStack().getItem() == Items.FIREWORK_ROCKET ||
               mc.player.getOffHandStack().getItem() == Items.FIREWORK_ROCKET;
    }

    public static boolean isPlayerGlide() {
        MinecraftClient mc = MinecraftClient.getInstance();
        assert mc.player != null;
        return mc.player.isGliding();
    }
}
