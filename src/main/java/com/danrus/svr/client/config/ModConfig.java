package com.danrus.svr.client.config;

import com.google.gson.GsonBuilder;
import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.api.controller.TickBoxControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import dev.isxander.yacl3.platform.YACLPlatform;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ModConfig {

    @SerialEntry
    public boolean isInteractionDisabled = true;

    @SerialEntry
    public boolean isInteractionWithGrassDisabled = true;

    public static final ConfigClassHandler<ModConfig> HANDLER = ConfigClassHandler.createBuilder(ModConfig.class)
            .serializer(config -> GsonConfigSerializerBuilder.create(config)
                    .setPath(YACLPlatform.getConfigDir().resolve("rockets_utils.json5"))
                    .appendGsonBuilder(GsonBuilder::setPrettyPrinting)
                    .setJson5(true)
                    .build())
            .build();

    public static void initialize() {
        HANDLER.load();
    }

    public static ModConfig get() {
        return HANDLER.instance();
    }

    public static void save() {
        HANDLER.save();
    }

//    private static ResourceLocation imageSample(String name) {
//        return YACLPlatform.rl("yacl_test", "textures/images/" + name);
//    }

    public static Screen getConfigScreen(Screen parent) {
        return YetAnotherConfigLib.createBuilder()
                .title(Text.translatable("config.svr.title"))
                .category(ConfigCategory.createBuilder()
                        .name(Text.translatable("config.svr.category.general"))
                        .option(Option.createBuilder(boolean.class)
                                .name(Text.translatable("config.svr.disable_interaction"))
                                .controller(TickBoxControllerBuilder::create)
                                .description(OptionDescription.createBuilder()
                                        .text(Text.translatable("config.svr.disable_interaction.description"))
                                        .build())
                                .binding(
                                        true,
                                        () -> HANDLER.instance().isInteractionDisabled,
                                        value -> {
                                            HANDLER.instance().isInteractionDisabled = value;
                                            HANDLER.save();
                                        }
                                )
                                .build())
                        .option(Option.createBuilder(boolean.class)
                                .name(Text.translatable("config.svr.disable_grass_interaction"))
                                .controller(TickBoxControllerBuilder::create)
                                .description(OptionDescription.createBuilder()
                                        .text(Text.translatable("config.svr.disable_grass_interaction.description"))
                                        .build())
                                .binding(
                                        true,
                                        () -> HANDLER.instance().isInteractionWithGrassDisabled,
                                        value -> {
                                            HANDLER.instance().isInteractionWithGrassDisabled = value;
                                            HANDLER.save();
                                        }
                                )
                                .build())
                        .build())


                .build()
                .generateScreen(parent);

    }
}
