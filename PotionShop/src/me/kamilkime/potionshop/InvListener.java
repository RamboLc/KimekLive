package me.kamilkime.potionshop;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class InvListener implements Listener{

//=========================================================================================================================================================================================================
	@SuppressWarnings("deprecation")	
	public static ItemStack str = new Potion(PotionType.STRENGTH , 1, false, false).toItemStack(1);{
		ItemMeta im = str.getItemMeta();
		im.setDisplayName("§5Strength I");
		im.setLore(Arrays.asList(" ", "§bTime: " + "§710 min", "§bCost: " + "§7" + Main.strMat + " x" + Main.strCost));
		str.setItemMeta(im);
}
	
	@SuppressWarnings("deprecation")
	public static ItemStack regen1 = new Potion(PotionType.REGEN , 1, false, false).toItemStack(1);{
		ItemMeta im = regen1.getItemMeta();
		im.setDisplayName("§dRegeneration I");
		im.setLore(Arrays.asList(" ", "§bTime: " + "§75 min", "§bCost: " + "§7" + Main.regen1Mat + " x" + Main.regen1Cost));
		regen1.setItemMeta(im);
}
	
	@SuppressWarnings("deprecation")
	public static ItemStack regen2 = new Potion(PotionType.REGEN , 1, false, false).toItemStack(1);{
		ItemMeta im = regen2.getItemMeta();
		im.setDisplayName("§dRegeneration I");
		im.setLore(Arrays.asList(" ", "§bTime: " + "§710 min", "§bCost: " + "§7" + Main.regen2Mat + " x" + Main.regen2Cost));
		regen2.setItemMeta(im);
}
	
	@SuppressWarnings("deprecation")
	public static ItemStack fireres = new Potion(PotionType.FIRE_RESISTANCE , 1, false, false).toItemStack(1);{
		ItemMeta im = fireres.getItemMeta();
		im.setDisplayName("§6Fire Resistance I");
		im.setLore(Arrays.asList(" ", "§bTime: " + "§710 min", "§bCost: " + "§7" + Main.fireMat + " x" + Main.fireCost));
		fireres.setItemMeta(im);
}
	
	
	
	public static ItemStack haste1 = new ItemStack(Material.IRON_PICKAXE, 1);{
		ItemMeta im = haste1.getItemMeta();
		im.setDisplayName("§eHaste I");
		im.setLore(Arrays.asList(" ", "§bTime: " + "§75 min", "§bCost: " + "§7" + Main.haste1Mat + " x" + Main.haste1Cost));
		haste1.setItemMeta(im);
}
	
	public static ItemStack haste2 = new ItemStack(Material.GOLD_PICKAXE, 1);{
		ItemMeta im = haste2.getItemMeta();
		im.setDisplayName("§eHaste I");
		im.setLore(Arrays.asList(" ", "§bTime: " + "§710 min", "§bCost: " + "§7" + Main.haste2Mat + " x" + Main.haste2Cost));
		haste2.setItemMeta(im);
}
	
	public static ItemStack haste3 = new ItemStack(Material.DIAMOND_PICKAXE, 1);{
		ItemMeta im = haste3.getItemMeta();
		im.setDisplayName("§eHaste I");
		im.setLore(Arrays.asList(" ", "§bTime: " + "§720 min", "§bCost: " + "§7" + Main.haste3Mat + " x" + Main.haste3Cost));
		haste3.setItemMeta(im);
}	
	public static ItemStack glass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 7);{
		ItemMeta im = glass.getItemMeta();
		im.setDisplayName(" ");
		im.setLore(null);
		glass.setItemMeta(im);
}
//=========================================================================================================================================================================================================
	
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.HIGH)
	public void onInvClick(InventoryClickEvent e){
		Inventory inv = e.getInventory();
		
		if(inv == null){
			return;
}
		if(inv !=null){
			if(!inv.getName().equals("§5§lEffect Shop")){
				return;
}
			if (e.getCurrentItem() == null){
				return;
}
			else{
				if(e.getCurrentItem().getItemMeta() == null){
					return;
}
}
}
		if(e.getWhoClicked() instanceof Player){
			Player p = (Player) e.getWhoClicked();
			PlayerInventory pinv = p.getInventory();
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Fire Resistance I")){
				if(pinv.containsAtLeast(new ItemStack(Material.getMaterial(Main.fireMat)), Main.fireCost)){
					e.setCancelled(true);
					pinv.removeItem(new ItemStack (Material.getMaterial(Main.fireMat), Main.fireCost));
					p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 10*60*20, 0, true));
					p.closeInventory();}
				else{
					e.setCancelled(true);
					p.sendMessage(ChatColor.RED + "Masz za malo itemow!");
					p.closeInventory();}
}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§5Strength I")){
				if(pinv.containsAtLeast(new ItemStack(Material.getMaterial(Main.strMat)), Main.strCost)){
					e.setCancelled(true);
					pinv.removeItem(new ItemStack (Material.getMaterial(Main.strMat), Main.strCost));
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 10*60*20, 0, true));
					p.closeInventory();}
				else{
					e.setCancelled(true);
					p.sendMessage(ChatColor.RED + "Masz za malo itemow!");
					p.closeInventory();}
}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§eHaste I")){
				if(e.getCurrentItem().getType().equals(Material.IRON_PICKAXE)){
					if(pinv.containsAtLeast(new ItemStack(Material.getMaterial(Main.haste1Mat)), Main.haste1Cost)){
						e.setCancelled(true);
						pinv.removeItem(new ItemStack (Material.getMaterial(Main.haste1Mat), Main.haste1Cost));
						p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 5*60*20, 0, true));
						p.closeInventory();}
					else{
						e.setCancelled(true);
						p.sendMessage(ChatColor.RED + "Masz za malo itemow!");
						p.closeInventory();}
}
}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§eHaste I")){
				if(e.getCurrentItem().getType().equals(Material.GOLD_PICKAXE)){
					if(pinv.containsAtLeast(new ItemStack(Material.getMaterial(Main.haste2Mat)), Main.haste2Cost)){
						e.setCancelled(true);
						pinv.removeItem(new ItemStack (Material.getMaterial(Main.haste2Mat), Main.haste2Cost));
						p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 10*60*20, 0, true));
						p.closeInventory();}
					else{
						e.setCancelled(true);
						p.sendMessage(ChatColor.RED + "Masz za malo itemow!");
						p.closeInventory();}
}
}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§eHaste I")){
				if(e.getCurrentItem().getType().equals(Material.DIAMOND_PICKAXE)){
					if(pinv.containsAtLeast(new ItemStack(Material.getMaterial(Main.haste3Mat)), Main.haste3Cost)){
						e.setCancelled(true);
						pinv.removeItem(new ItemStack (Material.getMaterial(Main.haste3Mat), Main.haste3Cost));
						p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 20*60*20, 0, true));
						p.closeInventory();}
					else{
						e.setCancelled(true);
						p.sendMessage(ChatColor.RED + "Masz za malo itemow!");
						p.closeInventory();}
}
}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§dRegeneration I")){
				if(e.getCurrentItem().getItemMeta().getLore().contains("§bTime: " + "§75 min")){
					if(pinv.containsAtLeast(new ItemStack(Material.getMaterial(Main.regen1Mat)), Main.regen1Cost)){
						e.setCancelled(true);
						pinv.removeItem(new ItemStack (Material.getMaterial(Main.regen1Mat), Main.regen1Cost));
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 5*60*20, 0, true));
						p.closeInventory();
}
					else{
						e.setCancelled(true);
						p.sendMessage(ChatColor.RED + "Masz za malo itemow!");
						p.closeInventory();
}
}
}
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§dRegeneration I")){
				if(e.getCurrentItem().getItemMeta().getLore().contains("§bTime: " + "§710 min")){
					if(pinv.containsAtLeast(new ItemStack(Material.getMaterial(Main.regen2Mat)), Main.regen2Cost)){
						e.setCancelled(true);
						pinv.removeItem(new ItemStack (Material.getMaterial(Main.regen2Mat), Main.regen2Cost));
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10*60*20, 0, true));
						p.closeInventory();
}
					else{
						e.setCancelled(true);
						p.sendMessage(ChatColor.RED + "Masz za malo itemow!");
						p.closeInventory();
}
}
}
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().equals(" ")){
				e.setCancelled(true);
				e.setCurrentItem(new ItemStack(Material.AIR, 1));
				p.updateInventory();
}
			else{
				e.setCancelled(true);
				return;
				
}
}
}
}