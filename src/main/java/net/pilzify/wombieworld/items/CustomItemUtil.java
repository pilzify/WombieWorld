package net.pilzify.wombieworld.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomItemUtil {
    private ItemMeta meta;
    private List<String> lore;
    private ItemStack item;
    public CustomItemUtil createItem(Material material, String name){
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        this.meta = meta;
        this.item = item;

        return this;
    }
    public CustomItemUtil createItem(Material material, String name, int amount){
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        this.meta = meta;
        this.item = item;

        return this;
    }
    public CustomItemUtil setLore(List<String> lore){
        this.meta.setLore(lore);
        this.item.setItemMeta(this.meta);
        this.lore = lore;
        return this;
    }
    public CustomItemUtil setLore(String loreString){
        this.lore = Collections.singletonList(loreString);
        this.meta.setLore(lore);
        this.item.setItemMeta(this.meta);
        return this;
    }
    public CustomItemUtil addLore(String loreString){
        this.lore.add(loreString);
        this.meta.setLore(this.lore);
        this.item.setItemMeta(this.meta);
        return this;
    }
    public CustomItemUtil addEnchant(Enchantment enchantment, int level, boolean ignoreVanillaRestrictions){
        this.meta.addEnchant(enchantment,level,ignoreVanillaRestrictions);
        this.item.setItemMeta(this.meta);
        return this;
    }
    public CustomItemUtil addEnchantGlint(){
        this.meta.addEnchant(Enchantment.LUCK,1, true);
        this.meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        this.item.setItemMeta(this.meta);
        return this;
    }
    public CustomItemUtil addItemFlag(ItemFlag itemflag){
        this.meta.addItemFlags(itemflag);
        this.item.setItemMeta(meta);
        return this;
    }
    public CustomItemUtil setUnbreakable(boolean b){
        this.meta.setUnbreakable(b);
        this.item.setItemMeta(this.meta);
        return this;
    }

    public ItemStack getItem() {return this.item;}


    public ItemMeta getMeta() {return this.meta;}


    public List<String> getLore() {return this.lore;}

    public String getName() {return this.meta.getDisplayName();}
}
