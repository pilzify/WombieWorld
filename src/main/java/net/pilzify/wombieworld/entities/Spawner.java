package net.pilzify.wombieworld.entities;

import net.pilzify.wombieworld.WombieWorld;
import net.pilzify.wombieworld.utils.Millis;
import org.bukkit.Location;
import org.bukkit.scheduler.BukkitRunnable;

public class Spawner {
    private final WombieWorld plugin = WombieWorld.getInstance();
    private boolean active = true;
    private int count = 0;
    public void spawnEntities(Location location, Spawnable entity, int amount, long delay){
        //maybe something like this later on;
        if (amount < 0){
            throw new IllegalArgumentException("amount must be a positive integer");
        }
        new BukkitRunnable(){
            @Override
            public void run(){
                if (count >= amount) {
                    this.cancel();
                    return;
                }
                entity.spawn(location);
                count++;
            }
        }.runTaskTimer(plugin, 0, delay);
    }

    public void spawnEntityPeriodically(Location location, Spawnable entity, long delay){
        new BukkitRunnable(){
            @Override
            public void run(){
                if (!active) {
                    this.cancel();
                    return;
                }
                entity.spawn(location);
            }
        }.runTaskTimer(plugin, 0, delay);
    }

    public void spawnEntityLater(Location location, Spawnable entity, long delay){
        new BukkitRunnable(){
            @Override
            public void run(){
                if (!active) {
                    this.cancel();
                    return;
                }
                entity.spawn(location);
            }
        }.runTaskLater(plugin, delay);
    }
    //Dies ist ein comment zum testen!
    public void disable(){
        this.active = false;
    }

}
