package io.github.NoOne.nMLConfig;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Set;

public class ConfigManager {
    protected FileConfiguration config;

    public ConfigManager(ConfigTemplate configTemplate) {
        config = configTemplate.getConfig();
    }

    // returns all the immediate children of the given path
    public Set<String> getAllImmediateChildren(String path) {
        return config.getConfigurationSection(path).getKeys(false);
    }
}
