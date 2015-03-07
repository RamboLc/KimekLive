package me.kamilkime.cobblex;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	private static Main inst;
	public List<String> locs;
	public List<String> items;
	public ItemStack cobblex = new ItemStack(Material.EMERALD_ORE, 1);{
		ItemMeta im = cobblex.getItemMeta();
		im.setDisplayName("§a§lCobbleX");
		cobblex.setItemMeta(im);
	}
	
	public void onEnable(){
		inst = this;
		saveDefaultConfig();
		locs = getConfig().getStringList("locs");
		items = getConfig().getStringList("items");
		ShapedRecipe cx = new ShapedRecipe(cobblex).shape("ccc", "ccc", "ccc").setIngredient('c', Material.COBBLESTONE);
		Bukkit.getPluginManager().registerEvents(new PlaceBreakListener(), this);
		Bukkit.getPluginManager().registerEvents(new ItemCraftListener(), this);
		Bukkit.getPluginManager().registerEvents(new PrepareListener(), this);
		getServer().addRecipe(cx);
	}
	public void onDisable(){
		getConfig().set("locs", locs);
	}
	public static Main getInst(){
		return inst;
	}
	
	public static String locToString(Location l){
		return l.getWorld().getName() + "@" + l.getBlockX() + "@" + l.getBlockY() + "@" + l.getBlockZ();
	}
	
	public static Location stringToLoc(String s){
		String[] ss = s.split("@");
		return new Location(Bukkit.getWorld(ss[0]), Integer.parseInt(ss[1]), Integer.parseInt(ss[2]), Integer.parseInt(ss[3]));
	}
}