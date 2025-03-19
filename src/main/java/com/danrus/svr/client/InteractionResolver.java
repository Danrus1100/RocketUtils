package com.danrus.svr.client;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.ActionResult;

public class InteractionResolver {
    public static ActionResult resolve(Hand hand, BlockPos pos, PlayerEntity player, World world) {
        if (!ModConfig.get().isModEnabled) {
            return ActionResult.PASS;
        }

        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.FIREWORK_ROCKET)) {
            Block block = world.getBlockState(pos).getBlock();
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
