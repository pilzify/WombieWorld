package net.pilzify.wombieworld;

import net.pilzify.wombieworld.chat.Commands;
import net.pilzify.wombieworld.listeners.EventListneners;
import org.bukkit.plugin.java.JavaPlugin;

public final class WombieWorld extends JavaPlugin {
    public static WombieWorld instance;
    public static WombieWorld getInstance(){return instance;}

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("hello world womp womp");
        instance = this;
        Commands.init();
        EventListneners.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
