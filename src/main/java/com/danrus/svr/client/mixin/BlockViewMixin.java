package com.danrus.svr.client.mixin;

import com.danrus.svr.client.config.ModConfig;
import com.danrus.svr.client.utils.BlockUtils;
import com.danrus.svr.client.utils.PlayerUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BlockView.class, priority = 1500)
public interface BlockViewMixin {
    @Shadow BlockState getBlockState(BlockPos pos);

    @Inject(
            method = "method_17743(Lnet/minecraft/world/RaycastContext;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/hit/BlockHitResult;",
            at = @At("HEAD"),
            cancellable = true
    )
    @Environment(EnvType.CLIENT)
    private void blockFactoryMixin(RaycastContext innerContext, BlockPos pos, CallbackInfoReturnable<BlockHitResult> cir) {
        Block block = this.getBlockState(pos).getBlock();
        if (
                BlockUtils.isGrassBlock(block)
                && PlayerUtils.isPlayerHoldingRocket()
                && ModConfig.get().isInteractionWithGrassDisabled
        ) {
            cir.setReturnValue(null);
        }
    }

}
