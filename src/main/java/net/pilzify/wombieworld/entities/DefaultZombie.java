package net.pilzify.wombieworld.entities;

import net.pilzify.wombieworld.WombieWorld;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

public class DefaultZombie implements Spawnable {

    Zombie zombie;

    @Override
    public void spawn(Location location) {
        //not sure yet how I want this to behave, but I guess every mob should have a spawn method, and then you can spawn them
        //in a separate class later on.

        Zombie zombie = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        zombie.setCustomName(ChatColor.DARK_GREEN + "Zombie");
        zombie.setCustomNameVisible(true);
        if (zombie.getEquipment() != null) {
            zombie.getEquipment().clear();
        }
        zombie.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
        zombie.setAdult();
        AttributeInstance maxHealth = zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        maxHealth.setBaseValue(10);
        zombie.setHealth(10);
        this.zombie = zombie;
    }
    public boolean isDead(){
        return zombie.isDead();
    }
}
