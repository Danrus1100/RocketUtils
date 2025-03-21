package com.danrus.svr.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;

public class RocketUtils implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        KeyBindsManager.register();
        ModConfig.initialize();

        UseBlockCallback.EVENT.register(InteractionResolver::resolve);
        ClientTickEvents.END_CLIENT_TICK.register(KeyBindsManager::handleKeyPress);
    }
}