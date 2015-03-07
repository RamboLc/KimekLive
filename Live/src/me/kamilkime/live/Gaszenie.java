package me.kamilkime.live;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class Gaszenie implements Listener{
	
	@EventHandler
	public void onEntClick(PlayerInteractEntityEvent e){
		if(e.getRightClicked().getType() != EntityType.PRIMED_TNT){
			return;
		}
		if(!(e.getPlayer().getItemInHand() !=null && e.getPlayer().getItemInHand().getType().equals(Material.ICE))){
			return;
		}
		e.getPlayer().getInventory().removeItem(new ItemStack(Material.ICE, 1));
		e.getRightClicked().getLocation().getBlock().setType(Material.TNT);
		e.getRightClicked().remove();
	}
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e){
		if(!e.getPlayer().isOp()){
			e.setCancelled(true);
		}
	}
}