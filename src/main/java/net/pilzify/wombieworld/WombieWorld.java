package net.pilzify.wombieworld;

import org.bukkit.plugin.java.JavaPlugin;

public final class WombieWorld extends JavaPlugin {
    public static WombieWorld instance;
    public static WombieWorld getInstance(){return instance;}

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("hello world123456");
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
