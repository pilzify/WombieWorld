package net.pilzify.wombieworld.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class CustomItem {
    private CustomItem(){}

    public static final ItemStack EXAMPLE_ITEM = getExampleItem();
    public static final ItemStack DEFAULT_SPAWNER = getDefaultSpawner();

    private static ItemStack getExampleItem(){
        return new CustomItemUtil().createItem(Material.IRON_AXE, ChatColor.RED + "The cleaver")
                .addEnchant(Enchantment.DAMAGE_ALL, 100, true)
                .setUnbreakable(true)
                .setLore("Cleave all the zombies!!!")
                .getItem();
    }
    private static ItemStack getDefaultSpawner(){
        return new CustomItemUtil().createItem(Material.ZOMBIE_SPAWN_EGG, ChatColor.DARK_GREEN + "Default spawner")
                .addEnchantGlint().getItem();
    }
}
