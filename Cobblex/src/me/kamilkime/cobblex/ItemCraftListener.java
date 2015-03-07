package me.kamilkime.cobblex;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

public class ItemCraftListener implements Listener{

	@EventHandler
	public void onCraft(CraftItemEvent e){
		if(e.getInventory().getResult().equals(Main.getInst().cobblex)){
			for(int i = 1; i<10; i++){
				e.getInventory().setItem(i, new ItemStack(Material.AIR, 1));
			}
			e.getWhoClicked().closeInventory();
			e.getWhoClicked().getInventory().addItem(Main.getInst().cobblex);
			e.setCancelled(true);
		}
	}
}