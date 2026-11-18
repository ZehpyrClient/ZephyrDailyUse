package com.zephyr.dailyuse;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public final class ZephyrDailyUseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        try {
            Path configDir = FabricLoader.getInstance().getConfigDir().resolve("zephyr");
            Files.createDirectories(configDir);
            Path kitsFile = configDir.resolve("kits.dat");
            if (!Files.exists(kitsFile)) {
                try (InputStream in = ZephyrDailyUseClient.class.getResourceAsStream("/kits.dat")) {
                    if (in != null) {
                        Files.copy(in, kitsFile, StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }
        } catch (Exception ignored) {
        }
    }
}
