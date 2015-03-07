package me.kamilkime.potionshop;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public static Main instance;
	
	public static String fireMat;
	public static int fireCost;
	
	public static String strMat;
	public static int strCost;
	
	public static String regen1Mat;
	public static int regen1Cost;
	
	public static String regen2Mat;
	public static int regen2Cost;
	
	public static String haste1Mat;
	public static int haste1Cost;
	
	public static String haste2Mat;
	public static int haste2Cost;
	
	public static String haste3Mat;
	public static int haste3Cost;
	
	@Override
	public void onDisable(){
		System.out.println("§4Wylaczono!");
}
	@Override
	public void onEnable(){
		
		fireMat = getConfig().getString("Settings.FireResistanceMaterial");
		fireCost = getConfig().getInt("Settings.FireResistanceItemCost");
		
		strMat = getConfig().getString("Settings.StrengthMaterial");
		strCost = getConfig().getInt("Settings.StrengthItemCost");
		
		regen1Mat = getConfig().getString("Settings.RegenerationShortMaterial");
		regen1Cost = getConfig().getInt("Settings.RegenerationShortItemCost");
		
		regen2Mat = getConfig().getString("Settings.RegenerationLongMaterial");
		regen2Cost = getConfig().getInt("Settings.RegenerationLongItemCost");
		
		haste1Mat = getConfig().getString("Settings.Haste1Material");
		haste1Cost = getConfig().getInt("Settings.Haste1ItemCost");
		
		haste2Mat = getConfig().getString("Settings.Haste2Material");
		haste2Cost = getConfig().getInt("Settings.Haste2ItemCost");
		
		haste3Mat = getConfig().getString("Settings.Haste3Material");
		haste3Cost = getConfig().getInt("Settings.Haste3ItemCost");
		
		saveDefaultConfig();
		
		System.out.println("§2Wlaczono!");
		instance = this;
		
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new InvListener(), this);
		
		getCommand("efekt").setExecutor(new Inv());
}
}