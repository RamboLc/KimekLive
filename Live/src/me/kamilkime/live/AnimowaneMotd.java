package me.kamilkime.live;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.scheduler.BukkitTask;

public class AnimowaneMotd implements Listener{

	private Map<InetAddress, BukkitTask> motd = new HashMap<InetAddress, BukkitTask>();
	int i;
	
	@EventHandler
	public void onPing(final ServerListPingEvent e){
		if(motd.containsKey(e.getAddress())){
			motd.remove(e.getAddress()).cancel();
		}
		i = 0;
		BukkitTask task = Bukkit.getScheduler().runTaskTimer(Main.getInst(), new Runnable(){
			public void run(){
				if(i == 0){
					e.setMotd("§6To jest moje motd!                      ");
				}
				if(i == 1){
					e.setMotd("§6o jest moje motd!                      T");
				}
				if(i == 2){
					e.setMotd("§6 jest moje motd!                      To");
				}
				if(i == 3){
					e.setMotd("§6jest moje motd!                      To ");
				}
				if(i == 4){
					e.setMotd("§6est moje motd!                      To j");
				}
				if(i == 5){
					e.setMotd("§6st moje motd!                      To je");
				}
				if(i == 6){
					e.setMotd("§6t moje motd!                      To jes");
				}
				if(i == 7){
					e.setMotd("§6 moje motd!                      To jest");
				}
				if(i == 8){
					e.setMotd("§6moje motd!                      To jest ");
				}
				if(i == 9){
					e.setMotd("§6oje motd!                      To jest m");
				}
				if(i == 10){
					e.setMotd("§6je motd!                      To jest mo");
				}
				if(i == 11){
					e.setMotd("§6e motd!                      To jest moj");
				}
				if(i == 12){
					e.setMotd("§6 motd!                      To jest moje");
				}
				if(i == 13){
					e.setMotd("§6motd!                      To jest moje ");
				}
				if(i == 14){
					e.setMotd("§6otd!                      To jest moje m");
				}
				if(i == 15){
					e.setMotd("§6td!                      To jest moje mo");
				}
				if(i == 16){
					e.setMotd("§6d!                      To jest moje mot");
				}
				if(i == 17){
					e.setMotd("§6!                      To jest moje motd");
				}
				if(i == 18){
					e.setMotd("§6                      To jest moje motd!");
				}
				if(i == 19){
					e.setMotd("§6                     To jest moje motd! ");
				}
				if(i == 20){
					e.setMotd("§6                    To jest moje motd!  ");
				}
				if(i == 21){
					e.setMotd("§6                   To jest moje motd!   ");
				}
				if(i == 22){
					e.setMotd("§6                  To jest moje motd!    ");
				}
				if(i == 23){
					e.setMotd("§6                 To jest moje motd!     ");
				}
				if(i == 24){
					e.setMotd("§6                To jest moje motd!      ");
				}
				if(i == 25){
					e.setMotd("§6               To jest moje motd!       ");
				}
				if(i == 26){
					e.setMotd("§6              To jest moje motd!        ");
				}
				if(i == 27){
					e.setMotd("§6             To jest moje motd!         ");
				}
				if(i == 28){
					e.setMotd("§6            To jest moje motd!          ");
				}
				if(i == 29){
					e.setMotd("§6           To jest moje motd!           ");
				}
				if(i == 30){
					e.setMotd("§6          To jest moje motd!            ");
				}
				if(i == 31){
					e.setMotd("§6         To jest moje motd!             ");
				}
				if(i == 32){
					e.setMotd("§6        To jest moje motd!              ");
				}
				if(i == 33){
					e.setMotd("§6       To jest moje motd!               ");
				}
				if(i == 34){
					e.setMotd("§6      To jest moje motd!                ");
				}
				if(i == 35){
					e.setMotd("§6     To jest moje motd!                 ");
				}
				if(i == 36){
					e.setMotd("§6    To jest moje motd!                  ");
				}
				if(i == 37){
					e.setMotd("§6   To jest moje motd!                   ");
				}
				if(i == 38){
					e.setMotd("§6  To jest moje motd!                    ");
				}
				if(i == 39){
					e.setMotd("§6 To jest moje motd!                     ");
				}
				i++;
				if(i > 39){
					i = 0;
				}
			}
		}, 0, 5);
		motd.put(e.getAddress(), task);
	}
}