package net.pilzify.wombieworld.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Gun {


    private int ammo = 30;
    private double shootingSpeed = 1.5;

    private Gun(){}

    private static ItemStack holGun(){
        return new CustomItemUtil().createItem(Material.WOODEN_HOE, "Gun").setUnbreakable(true).getItem();
    }

    private static shoot(){

    }

}
