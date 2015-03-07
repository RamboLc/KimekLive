package me.kamilkime.live;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	private static Main inst;
	public List<String> msgs;
	
	public void onEnable(){
		inst = this;
		Bukkit.getPluginManager().registerEvents(new Gaszenie(), this);
		Bukkit.getPluginManager().registerEvents(new Ogon(), this);
		Bukkit.getPluginManager().registerEvents(new AntyAura(), this);
		Bukkit.getPluginManager().registerEvents(new AnimowaneMotd(), this);
		saveDefaultConfig();
		msgs = getConfig().getStringList("automsg");
		runAutoMsg(15);
	}
	
	public static Main getInst(){
		return inst;
	}
	
	private void runAutoMsg(int delay){
		Bukkit.getScheduler().runTaskTimer(this, new AutoMsg(), 0, delay*20);
	}
}