package com.danrus.svr.mixin.client;


import com.mojang.authlib.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.net.Proxy;

@Mixin(MinecraftClient.class)
public class ExampleMixin {
	@Inject(method = "<init>", at = @At("RETURN"))
	private void onConstruct(String accessToken, Proxy proxy, CallbackInfo ci) {
		// This code will be executed when the MinecraftClient constructor is called
		System.out.println("Hello from ExampleMixin!");
		// You can add your own logic here
	}
}
