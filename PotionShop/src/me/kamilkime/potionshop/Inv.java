package me.kamilkime.potionshop;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class Inv implements CommandExecutor{

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
	
	public static Inventory i = Bukkit.createInventory(null, 27, "§5§lEffect Shop");{
		i.setItem(0, glass);
		i.setItem(1, glass);
		i.setItem(2, glass);
		i.setItem(3, glass);
		i.setItem(4, glass);
		i.setItem(5, glass);
		i.setItem(6, glass);
		i.setItem(7, glass);
		i.setItem(8, glass);
		i.setItem(9, glass);
		
		i.setItem(10, fireres);
		i.setItem(11, str);
		i.setItem(12, haste1);
		i.setItem(13, haste2);
		i.setItem(14, haste3);
		i.setItem(15, regen1);
		i.setItem(16, regen2);
		
		i.setItem(17, glass);
		i.setItem(18, glass);
		i.setItem(19, glass);
		i.setItem(20, glass);
		i.setItem(21, glass);
		i.setItem(22, glass);
		i.setItem(23, glass);
		i.setItem(24, glass);
		i.setItem(25, glass);
		i.setItem(26, glass);
}
	
	public boolean onCommand(CommandSender sender, Command cmd, String l, String args[]){
		if(cmd.getName().equalsIgnoreCase("efekt")){
			if(sender instanceof Player){
				Player p = (Player) sender;
				p.openInventory(i);
}
}
		
	return false;	
}
}