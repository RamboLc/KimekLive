package me.kamilkime.cobblex;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

public class PrepareListener implements Listener{
	
	@EventHandler
	public void onPrepare(PrepareItemCraftEvent e){
		if(e.getInventory().getResult().equals(Main.getInst().cobblex)){
			boolean c = true;
			for(int i = 1; i<10; i++){
				if(!(e.getInventory().getItem(i).getType() !=null && e.getInventory().getItem(i).getType().equals(Material.COBBLESTONE)
						&& e.getInventory().getItem(i).getAmount() == 64)){
					c = false;
				}
			}
			if(!c){
				e.getInventory().setResult(new ItemStack(Material.AIR, 1));
			}
		}
	}
}