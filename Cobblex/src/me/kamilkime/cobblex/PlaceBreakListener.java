package me.kamilkime.cobblex;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class PlaceBreakListener implements Listener{

	private Random rand = new Random();
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e){
		if(e.getBlock().getType().equals(Material.EMERALD_ORE) && e.getPlayer().getItemInHand().hasItemMeta()
				&& e.getPlayer().getItemInHand().getItemMeta().hasDisplayName()
				&& e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(Main.getInst().cobblex.getItemMeta().getDisplayName())){
			Main.getInst().locs.add(Main.locToString(e.getBlock().getLocation()));
		}
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		String loc = Main.locToString(e.getBlock().getLocation());
		if(Main.getInst().locs.contains(loc)){
			Main.getInst().locs.remove(loc);
			int r = rand.nextInt(Main.getInst().items.size());
			String s = Main.getInst().items.get(r);
			Material m = Material.getMaterial(s.split("@")[0].toUpperCase());
			int amount;
			if(s.split("@")[1].contains("-")){
				String[] splittedNext = s.split("@")[1].split("-");
				int min = Integer.valueOf(splittedNext[0]);
				int max = Integer.valueOf(splittedNext[1]);
				int rolled = (int) (Math.random() * ((max - min) + min));
				if(rolled < min){
					rolled = min;
				}
				amount = rolled;
			} else{
				amount = Integer.parseInt(s.split("@")[1]);
			}
			Short data = Short.parseShort(s.split("@")[2]);
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
			e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(m,amount, data));
		}
	}
}