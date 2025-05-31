package com.danrus.svr.client;

import com.danrus.svr.client.config.ModConfig;
import com.danrus.svr.client.utils.PlayerUtils;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import net.minecraft.util.ActionResult;

public class InteractionResolver {
    public static ActionResult resolve(PlayerEntity player, World world, Hand hand, BlockHitResult blockHitResult) {
        assert MinecraftClient.getInstance().player != null;

        if (!ModConfig.get().isInteractionDisabled || PlayerUtils.isPlayerSneaking()) {
            return ActionResult.PASS;
        }

        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.FIREWORK_ROCKET)) {
            Block block = world.getBlockState(blockHitResult.getBlockPos()).getBlock();
            if (block == Blocks.CHEST) {
                return ActionResult.PASS;
            } else {
                return ActionResult.FAIL;
            }
        } else {
            return ActionResult.PASS;
        }
    }
}
