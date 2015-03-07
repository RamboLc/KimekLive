package me.kamilkime.youtube;

import java.util.List;
import java.util.Map;
import net.minecraft.server.v1_7_R1.EntityPlayer;
import net.minecraft.server.v1_7_R1.PacketPlayOutWorldParticles;
import net.minecraft.server.v1_7_R1.PlayerConnection;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_7_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class Ramka
{
  public int i;

  public void ramka()
  {
    this.i = 0;
    BukkitTask bt = Bukkit.getScheduler().runTaskTimer(Main.getInst(), new Runnable() {
      public void run() {
        if (Ramka.this.i == 0) {
          Ramka.this.createParticle(0, 0, 0);
        }
        if (Ramka.this.i == 1) {
          Ramka.this.createParticle(1, 0, 0);
        }
        if (Ramka.this.i == 2) {
          Ramka.this.createParticle(2, 0, 0);
        }
        if (Ramka.this.i == 3) {
          Ramka.this.createParticle(3, 0, 0);
        }
        if (Ramka.this.i == 4) {
          Ramka.this.createParticle(4, 0, 0);
        }
        if (Ramka.this.i == 5) {
          Ramka.this.createParticle(5, 0, 0);
        }
        if (Ramka.this.i == 6) {
          Ramka.this.createParticle(6, 0, 0);
        }
        if (Ramka.this.i == 7) {
          Ramka.this.createParticle(7, 0, 0);
        }
        if (Ramka.this.i == 8) {
          Ramka.this.createParticle(8, 0, 0);
        }
        if (Ramka.this.i == 9) {
          Ramka.this.createParticle(9, 0, 0);
        }
        if (Ramka.this.i == 10) {
          Ramka.this.createParticle(10, 0, 0);
        }
        if (Ramka.this.i == 11) {
          Ramka.this.createParticle(11, 0, 0);
        }
        if (Ramka.this.i == 12) {
          Ramka.this.createParticle(12, 0, 0);
        }
        if (Ramka.this.i == 13) {
          Ramka.this.createParticle(13, 0, 0);
        }
        if (Ramka.this.i == 14) {
          Ramka.this.createParticle(14, 0, 0);
        }
        if (Ramka.this.i == 15) {
          Ramka.this.createParticle(15, 0, 0);
        }
        if (Ramka.this.i == 16) {
          Ramka.this.createParticle(16, 0, 0);
        }
        if (Ramka.this.i == 17) {
          Ramka.this.createParticle(17, 0, 0);
        }
        if (Ramka.this.i == 18) {
          Ramka.this.createParticle(18, 0, 0);
        }
        if (Ramka.this.i == 19) {
          Ramka.this.createParticle(19, 0, 0);
        }
        if (Ramka.this.i == 20) {
          Ramka.this.i = 21;
          Ramka.this.createParticle(20, 0, 0);
        }
        if (Ramka.this.i == 22) {
          Ramka.this.createParticle(20, -1, 0);
        }
        if (Ramka.this.i == 23) {
          Ramka.this.createParticle(20, -2, 0);
        }
        if (Ramka.this.i == 24) {
          Ramka.this.createParticle(20, -3, 0);
        }
        if (Ramka.this.i == 25) {
          Ramka.this.createParticle(20, -4, 0);
        }
        if (Ramka.this.i == 26) {
          Ramka.this.createParticle(20, -5, 0);
        }
        if (Ramka.this.i == 27) {
          Ramka.this.createParticle(20, -6, 0);
        }
        if (Ramka.this.i == 28) {
          Ramka.this.createParticle(20, -7, 0);
        }
        if (Ramka.this.i == 29) {
          Ramka.this.createParticle(20, -8, 0);
        }
        if (Ramka.this.i == 30) {
          Ramka.this.createParticle(20, -9, 0);
        }
        if (Ramka.this.i == 31) {
          Ramka.this.createParticle(20, -9, 0);
        }
        if (Ramka.this.i == 32) {
          Ramka.this.createParticle(19, -9, 0);
        }
        if (Ramka.this.i == 33) {
          Ramka.this.createParticle(18, -9, 0);
        }
        if (Ramka.this.i == 34) {
          Ramka.this.createParticle(17, -9, 0);
        }
        if (Ramka.this.i == 35) {
          Ramka.this.createParticle(16, -9, 0);
        }
        if (Ramka.this.i == 36) {
          Ramka.this.createParticle(15, -9, 0);
        }
        if (Ramka.this.i == 37) {
          Ramka.this.createParticle(14, -9, 0);
        }
        if (Ramka.this.i == 38) {
          Ramka.this.createParticle(13, -9, 0);
        }
        if (Ramka.this.i == 39) {
          Ramka.this.createParticle(12, -9, 0);
        }
        if (Ramka.this.i == 40) {
          Ramka.this.createParticle(11, -9, 0);
        }
        if (Ramka.this.i == 41) {
          Ramka.this.createParticle(10, -9, 0);
        }
        if (Ramka.this.i == 42) {
          Ramka.this.createParticle(9, -9, 0);
        }
        if (Ramka.this.i == 43) {
          Ramka.this.createParticle(8, -9, 0);
        }
        if (Ramka.this.i == 44) {
          Ramka.this.createParticle(7, -9, 0);
        }
        if (Ramka.this.i == 45) {
          Ramka.this.createParticle(6, -9, 0);
        }
        if (Ramka.this.i == 46) {
          Ramka.this.createParticle(5, -9, 0);
        }
        if (Ramka.this.i == 47) {
          Ramka.this.createParticle(4, -9, 0);
        }
        if (Ramka.this.i == 48) {
          Ramka.this.createParticle(3, -9, 0);
        }
        if (Ramka.this.i == 49) {
          Ramka.this.createParticle(2, -9, 0);
        }
        if (Ramka.this.i == 50) {
          Ramka.this.createParticle(1, -9, 0);
        }
        if (Ramka.this.i == 51) {
          Ramka.this.createParticle(0, -9, 0);
        }
        if (Ramka.this.i == 52) {
          Ramka.this.createParticle(0, -8, 0);
        }
        if (Ramka.this.i == 53) {
          Ramka.this.createParticle(0, -7, 0);
        }
        if (Ramka.this.i == 54) {
          Ramka.this.createParticle(0, -6, 0);
        }
        if (Ramka.this.i == 55) {
          Ramka.this.createParticle(0, -5, 0);
        }
        if (Ramka.this.i == 56) {
          Ramka.this.createParticle(0, -4, 0);
        }
        if (Ramka.this.i == 57) {
          Ramka.this.createParticle(0, -3, 0);
        }
        if (Ramka.this.i == 58) {
          Ramka.this.createParticle(0, -2, 0);
        }
        if (Ramka.this.i == 59) {
          Ramka.this.createParticle(0, -1, 0);
        }
        if (Ramka.this.i > 59) {
          Ramka.this.i = 0;
          Ramka.this.createParticle(0, 0, 0);
        }
        Ramka.this.i += 1;
      }
    }
    , 0L, 1L);
    if (Listenery.sbt.containsKey("ramka")) {
      ((BukkitTask)Listenery.sbt.remove("ramka")).cancel();
    }
    Listenery.sbt.put("ramka", bt);
  }

  private void createParticle(int x, int y, int z) {
    Location l = new Location((World)Bukkit.getWorlds().get(0), -199.0D, 104.0D, 148.0D).add(x, y, z);
    for (Player p : Bukkit.getOnlinePlayers())
      ((CraftPlayer)p).getHandle().playerConnection.sendPacket(new PacketPlayOutWorldParticles("heart", l.getBlockX(), l.getBlockY(), l.getBlockZ(), 0.0F, 0.0F, 0.0F, 0.0F, 100));
  }
}