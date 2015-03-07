package me.kamilkime.youtube;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.server.v1_7_R1.EntityPlayer;
import net.minecraft.server.v1_7_R1.PacketPlayOutWorldParticles;
import net.minecraft.server.v1_7_R1.PlayerConnection;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_7_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class Listenery
  implements Listener
{
  FireworkMeta fm;
  public static Map<String, BukkitTask> sbt = new HashMap();

  @EventHandler
  public void onClick(PlayerInteractEvent e) {
    if ((e.getAction().equals(Action.RIGHT_CLICK_AIR)) && (e.getPlayer().getItemInHand() != null) && (e.getPlayer().getItemInHand().getType().equals(Material.DIAMOND_BARDING))) {
      BukkitTask bt = Bukkit.getScheduler().runTaskTimer(Main.getInst(), new Runnable() {
        public void run() {
          Listenery.this.createParticle(0, 0, 0);
          Listenery.this.createParticle(0, 1, 0);
          Listenery.this.createParticle(0, 2, 0);
          Listenery.this.createParticle(0, 3, 0);
          Listenery.this.createParticle(0, 4, 0);
          Listenery.this.createParticle(-1, 3, 0);
          Listenery.this.createParticle(2, 1, 0);
          Listenery.this.createParticle(2, 2, 0);
          Listenery.this.createParticle(2, 3, 0);
          Listenery.this.createParticle(3, 0, 0);
          Listenery.this.createParticle(3, 4, 0);
          Listenery.this.createParticle(4, 0, 0);
          Listenery.this.createParticle(4, 4, 0);
          Listenery.this.createParticle(5, 1, 0);
          Listenery.this.createParticle(5, 2, 0);
          Listenery.this.createParticle(5, 3, 0);
          Listenery.this.createParticle(7, 1, 0);
          Listenery.this.createParticle(7, 2, 0);
          Listenery.this.createParticle(7, 3, 0);
          Listenery.this.createParticle(8, 0, 0);
          Listenery.this.createParticle(8, 4, 0);
          Listenery.this.createParticle(9, 0, 0);
          Listenery.this.createParticle(9, 4, 0);
          Listenery.this.createParticle(10, 1, 0);
          Listenery.this.createParticle(10, 2, 0);
          Listenery.this.createParticle(10, 3, 0);
          Listenery.this.createParticle(12, 1, 0);
          Listenery.this.createParticle(12, 2, 0);
          Listenery.this.createParticle(12, 3, 0);
          Listenery.this.createParticle(13, 0, 0);
          Listenery.this.createParticle(13, 4, 0);
          Listenery.this.createParticle(14, 0, 0);
          Listenery.this.createParticle(14, 4, 0);
          Listenery.this.createParticle(15, 1, 0);
          Listenery.this.createParticle(15, 2, 0);
          Listenery.this.createParticle(15, 3, 0);
          ((World)Bukkit.getWorlds().get(0)).setTime(15000L);
        }
      }
      , 0L, 4L);
      if (sbt.containsKey("1000")) {
        ((BukkitTask)sbt.remove("1000")).cancel();
      }
      sbt.put("1000", bt);
    }
    if ((e.getAction().equals(Action.RIGHT_CLICK_AIR)) && (e.getPlayer().getItemInHand() != null) && (e.getPlayer().getItemInHand().getType().equals(Material.GOLD_BARDING))) {
      new Ramka().ramka();
    }
    if ((e.getAction().equals(Action.RIGHT_CLICK_AIR)) && (e.getPlayer().getItemInHand() != null) && (e.getPlayer().getItemInHand().getType().equals(Material.IRON_BARDING))) {
      if (sbt.containsKey("1000")) {
        ((BukkitTask)sbt.remove("1000")).cancel();
      }
      if (sbt.containsKey("ramka"))
        ((BukkitTask)sbt.remove("ramka")).cancel();
    }
  }

  private void createParticle(int x, int y, int z) {
    Location l = new Location((World)Bukkit.getWorlds().get(0), -196.0D, 98.0D, 148.0D).add(x, y, z);
    for (Player p : Bukkit.getOnlinePlayers())
      ((CraftPlayer)p).getHandle().playerConnection.sendPacket(new PacketPlayOutWorldParticles("explode", l.getBlockX(), l.getBlockY(), l.getBlockZ(), 0.0F, 0.0F, 0.0F, 0.0F, 100));
  }
}