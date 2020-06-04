package de.zanyar.JoinFullServer.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.zanyar.JoinFullServer.events.JoinEvent;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		PluginManager pluginManager = Bukkit.getPluginManager();
		pluginManager.registerEvents(new JoinEvent(), this);
		
			Bukkit.getConsoleSender().sendMessage("§aJoinFullServer wurde erfolgreich gestartet!");
	}

	
}
