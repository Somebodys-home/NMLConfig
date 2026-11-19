package io.github.NoOne.nMLConfig;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class ConfigTemplate {
    private JavaPlugin javaPlugin;
    private File file;
    private String fileName;
    private FileConfiguration config;

    public ConfigTemplate(JavaPlugin javaPlugin, String filename) {
        this.javaPlugin = javaPlugin;
        this.fileName = filename;
        file = new File(javaPlugin.getDataFolder(), filename + ".yml");
        config = new YamlConfiguration();
    }

    public void loadConfig() {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            javaPlugin.saveResource(fileName + ".yml", false);
        } try {
            config.load(file);
        } catch (IOException | InvalidConfigurationException exception) {
            exception.printStackTrace();
        }
    }

    public void saveConfig() {
        try {
            config.save(file);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public FileConfiguration getConfig() {
        return config;
    }
}
