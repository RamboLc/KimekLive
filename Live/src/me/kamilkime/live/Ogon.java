package me.kamilkime.live;

import net.minecraft.server.v1_7_R1.PacketPlayOutWorldParticles;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_7_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Ogon implements Listener{

	@EventHandler
	public void onMove(PlayerMoveEvent e){
		Location to = e.getTo();
		Location from = e.getFrom();
	    if ((from.getBlockX() != to.getBlockX()) || (from.getBlockY() != to.getBlockY()) || (from.getBlockZ() != to.getBlockZ()) || (from.getWorld() != to.getWorld())) {
	    	for(Player p : Bukkit.getOnlinePlayers()){
	    		Location l = e.getPlayer().getLocation();
	    		((CraftPlayer)p).getHandle().playerConnection.sendPacket(new PacketPlayOutWorldParticles("heart", (float) l.getX(), (float) l.getY(), (float) l.getZ(), 0F, 0F, 0F, 0, 80));
	    	}
	    }
	}
}