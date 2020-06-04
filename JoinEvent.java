package de.zanyar.JoinFullServer.events;

import java.util.Collection;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import org.bukkit.plugin.Plugin;

public class JoinEvent implements Listener {
	
	public static Plugin plugin;
	
	public void JoinEvent() {
		this.plugin = plugin;
		}



	@EventHandler
	public void onLogin(PlayerLoginEvent event) {

		Player player = (Player) event;
		if(player.hasPermission("permission.joinfullserver")) {
			int zanyar = Bukkit.getOnlinePlayers(); 
			int MaxPlayer = Bukkit.getMaxPlayers();
				
					if(zanyar == MaxPlayer) {
						if(player.hasPermission("permission.joinfullserver.canstayon")) {
							player.kickPlayer("§6Du wurdest gekickt!");
							event.allow();
							return;
					}
						
					
					
					
				} 
					
		} else
			event.disallow(Result.KICK_OTHER, "§3Der Server ist voll!");
			
	

		
		
	}
	
	
	}
