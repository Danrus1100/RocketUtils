package com.danrus.svr.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;


public class SaveYourRockets implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModConfig.initialize();
		UseBlockCallback.EVENT.register((playerEntity, world, hand, hitResult) -> {

			return InteractionResolver.resolve(hand, hitResult.getBlockPos(), playerEntity, world);
		});
	}
}