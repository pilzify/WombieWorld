package net.pilzify.wombieworld.listeners;

import net.pilzify.wombieworld.WombieWorld;
import net.pilzify.wombieworld.entities.EntityLootDropPreventer;
import net.pilzify.wombieworld.spawners.Spawners;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;


public class EventListneners implements Listener {
    private static final WombieWorld plugin = WombieWorld.getInstance();
    private static ArrayList<Listener> allListeners = new ArrayList<>();

    public static void addListener(Listener listener){
        allListeners.add(listener);
    }

    public static void init(){
        addListener(new Spawners());
        addListener(new EntityLootDropPreventer());
        //...addListener(new AnyClassWithListener());

        PluginManager pm = plugin.getServer().getPluginManager();
        for (Listener listener : allListeners){
            pm.registerEvents(listener, plugin);
        }
    }
}
