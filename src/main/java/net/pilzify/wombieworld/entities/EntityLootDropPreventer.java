package net.pilzify.wombieworld.entities;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityLootDropPreventer implements Listener {
    @EventHandler
    public static void onEntityDeath(EntityDeathEvent event){
        event.getDrops().clear();
        event.setDroppedExp(0);
    }
}
