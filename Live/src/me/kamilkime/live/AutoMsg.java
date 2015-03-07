package me.kamilkime.live;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class AutoMsg extends BukkitRunnable{

	int i;
	
	public void run(){
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', Main.getInst().msgs.get(i)));
		i++;
		if(i >= Main.getInst().msgs.size()){
			i = 0;
		}
	}
}