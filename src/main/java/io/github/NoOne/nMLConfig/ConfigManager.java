package io.github.NoOne.nMLConfig;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.HashMap;

public class ConfigManager {
    protected FileConfiguration config;

    public ConfigManager(ConfigTemplate configTemplate) {
        config = configTemplate.getConfig();
    }
}
