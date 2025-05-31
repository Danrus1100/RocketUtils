package com.danrus.svr.client.utils;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.List;

public class BlockUtils {

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
            Blocks.SEAGRASS

    );

    static List<Block> INTERACTABLE_BLOCKS = List.of(
            Blocks.CRAFTING_TABLE,
            Blocks.STONECUTTER,
            Blocks.CARTOGRAPHY_TABLE,
            Blocks.SMITHING_TABLE,
            Blocks.GRINDSTONE,
            Blocks.LOOM,
            Blocks.FURNACE,
            Blocks.SMOKER,
            Blocks.BLAST_FURNACE,
            Blocks.CAMPFIRE,
            Blocks.SOUL_CAMPFIRE,
            Blocks.ANVIL,
            Blocks.CHIPPED_ANVIL,
            Blocks.DAMAGED_ANVIL,
            Blocks.COMPOSTER,
            Blocks.NOTE_BLOCK,
            Blocks.JUKEBOX,
            Blocks.ENCHANTING_TABLE,
            Blocks.BREWING_STAND,
            Blocks.CAULDRON,
            Blocks.BELL,
            Blocks.BEACON,
            Blocks.LODESTONE,
            Blocks.DECORATED_POT,
            Blocks.CHISELED_BOOKSHELF,
            Blocks.LECTERN,
            Blocks.CHEST,
            Blocks.BARREL,
            Blocks.ENDER_CHEST,
            Blocks.END_PORTAL_FRAME,

            Blocks.SHULKER_BOX,
            Blocks.BLACK_SHULKER_BOX,
            Blocks.BLUE_SHULKER_BOX,
            Blocks.BROWN_SHULKER_BOX,
            Blocks.CYAN_SHULKER_BOX,
            Blocks.GRAY_SHULKER_BOX,
            Blocks.GREEN_SHULKER_BOX,
            Blocks.LIGHT_BLUE_SHULKER_BOX,
            Blocks.LIGHT_GRAY_SHULKER_BOX,
            Blocks.LIME_SHULKER_BOX,
            Blocks.MAGENTA_SHULKER_BOX,
            Blocks.ORANGE_SHULKER_BOX,
            Blocks.PINK_SHULKER_BOX,
            Blocks.PURPLE_SHULKER_BOX,
            Blocks.RED_SHULKER_BOX,
            Blocks.WHITE_SHULKER_BOX,
            Blocks.YELLOW_SHULKER_BOX,

            Blocks.BLACK_BED,
            Blocks.BLUE_BED,
            Blocks.BROWN_BED,
            Blocks.CYAN_BED,
            Blocks.GRAY_BED,
            Blocks.GREEN_BED,
            Blocks.LIGHT_BLUE_BED,
            Blocks.LIGHT_GRAY_BED,
            Blocks.LIME_BED,
            Blocks.MAGENTA_BED,
            Blocks.ORANGE_BED,
            Blocks.PINK_BED,
            Blocks.PURPLE_BED,
            Blocks.RED_BED,
            Blocks.WHITE_BED,
            Blocks.YELLOW_BED
    );

    public static boolean isGrassBlock(Block block) {
        return GRASS_BLOCKS.contains(block);
    }

    public static boolean isInteractableBlock(Block block) {
        return  INTERACTABLE_BLOCKS.contains(block);
    }

}
