package net.pilzify.wombieworld.spawners;


import net.pilzify.wombieworld.entities.Spawnable;
import org.bukkit.Location;

public class DefaultSpawner {
    private Spawnable entity;
    private Location location;
    public DefaultSpawner(Spawnable entity, Location location){
        this.entity = entity;
        this.location = location;
    }

    public Spawnable getEntity() {
        return this.entity;
    }
    public Location getLocation(){
        return this.location;
    }
}
