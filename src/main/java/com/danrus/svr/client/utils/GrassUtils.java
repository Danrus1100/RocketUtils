package com.danrus.svr.client.utils;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class GrassUtils {

    static List<Block> GRASS_BLOCKS = List.of(

            //? if >=1.21.5 {
            /*Blocks.SHORT_DRY_GRASS,
            Blocks.BUSH,
            Blocks.CACTUS_FLOWER,
            Blocks.FIREFLY_BUSH,
            *///?}

            //? if >=1.21.4 {
            Blocks.PALE_HANGING_MOSS,
            Blocks.PALE_OAK_SAPLING,
            Blocks.CLOSED_EYEBLOSSOM,
            Blocks.OPEN_EYEBLOSSOM,
            //?}

            //? if >= 1.20.4 {
            Blocks.SHORT_GRASS,
            //?} else {
            /*Blocks.GRASS,
            *///?}

            Blocks.TALL_GRASS,
            Blocks.FERN,
            Blocks.LARGE_FERN,
            Blocks.PEONY,
            Blocks.PITCHER_PLANT,
            Blocks.ROSE_BUSH,
            Blocks.SUNFLOWER,
            Blocks.LILAC,
            Blocks.ROSE_BUSH,
            Blocks.DEAD_BUSH,
            Blocks.SWEET_BERRY_BUSH,
            Blocks.OAK_SAPLING,
            Blocks.SPRUCE_SAPLING,
            Blocks.BIRCH_SAPLING,
            Blocks.JUNGLE_SAPLING,
            Blocks.ACACIA_SAPLING,
            Blocks.DARK_OAK_SAPLING,
            Blocks.MANGROVE_PROPAGULE,
            Blocks.CHERRY_SAPLING,
            Blocks.BROWN_MUSHROOM,
            Blocks.RED_MUSHROOM,
            Blocks.CRIMSON_FUNGUS,
            Blocks.WARPED_FUNGUS,
            Blocks.DANDELION,
            Blocks.POPPY,
            Blocks.BLUE_ORCHID,
            Blocks.ALLIUM,
            Blocks.AZURE_BLUET,
            Blocks.RED_TULIP,
            Blocks.ORANGE_TULIP,
            Blocks.WHITE_TULIP,
            Blocks.PINK_TULIP,
            Blocks.OXEYE_DAISY,
            Blocks.CORNFLOWER,
            Blocks.LILY_OF_THE_VALLEY,
            Blocks.TORCHFLOWER,
            Blocks.WITHER_ROSE,
            Blocks.BAMBOO,
            Blocks.SUGAR_CANE,
            Blocks.CRIMSON_ROOTS,
            Blocks.WARPED_ROOTS,
            Blocks.WEEPING_VINES,
            Blocks.TWISTING_VINES,
            Blocks.LARGE_FERN,
            Blocks.SUNFLOWER,
            Blocks.SEAGRASS,
            Blocks.SEAGRASS

    );


    public static boolean isGrassBlock(Block block) {
        return GRASS_BLOCKS.contains(block);
    }

}
