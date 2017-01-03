package ch.phntm.lobby;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import ch.phntm.lobby.commands.CMD_lobby;
import ch.phntm.lobby.commands.CMD_setwarp;
import ch.phntm.lobby.commands.CMD_warp;
import ch.phntm.lobby.listeners.CommandBlocker;
import ch.phntm.lobby.listeners.Compass;
import ch.phntm.lobby.listeners.Events;
import ch.phntm.lobby.listeners.PlayerHide;
import ch.phntm.lobby.listeners.Schutzschild;
import ch.phntm.lobby.listeners.SilentHub;
import ch.phntm.lobby.listeners.onFriends;
import ch.phntm.lobby.listeners.onGadgets;
import ch.phntm.lobby.listeners.onJoin;
import ch.phntm.lobby.listeners.onNick;
import ch.phntm.lobby.listeners.boots.BOOTS_Flame;
import ch.phntm.lobby.listeners.boots.BOOTS_Love;
import ch.phntm.lobby.listeners.boots.BOOTS_angry;
import ch.phntm.lobby.listeners.boots.BOOTS_cloud;
import ch.phntm.lobby.listeners.boots.BOOTS_end;
import ch.phntm.lobby.listeners.boots.BOOTS_happy;
import ch.phntm.lobby.listeners.boots.BOOTS_note;
import ch.phntm.lobby.listeners.boots.BOOTS_tnt;
import ch.phntm.lobby.listeners.boots.BOOTS_wasser;


public class Lobby extends JavaPlugin {
	public static Lobby plugin;
	public static File config = new File("plugins/Krayze-Lobby", "config.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(config);
	public static String prefix = "§8[§6Krayze§8] §7";
	public static boolean sql;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList<String> s = new ArrayList();
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static HashMap<String, BukkitRunnable> SS = new HashMap();
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList<String> SL = new ArrayList();
    public static String noperm = prefix + "Du besitzt keine Rechte dazu!";
    
   
    
    public static Lobby getPlugin() {
    	return plugin;
    }
    
    @Override
    public void onEnable() {
    	System.out.println("[Lobby] Plugin wurd aktiviert!");
    	sql = false;
    	Bukkit.getPluginManager().registerEvents(new onJoin(this), this);
    	Bukkit.getPluginManager().registerEvents(new Events(), this);
    	Bukkit.getPluginManager().registerEvents(new Compass(), this);
    	Bukkit.getPluginManager().registerEvents(new PlayerHide(), this);
    	Bukkit.getPluginManager().registerEvents(new SilentHub(), this);
    	Bukkit.getPluginManager().registerEvents(new Schutzschild(), this);
    	Bukkit.getPluginManager().registerEvents(new onNick(), this);
    	Bukkit.getPluginManager().registerEvents(new onGadgets(), this);
    	Bukkit.getPluginManager().registerEvents(new CommandBlocker(this), this);
    	Bukkit.getPluginManager().registerEvents(new onFriends(), this);
    	Bukkit.getPluginManager().registerEvents(new BOOTS_Love(), this);
    	Bukkit.getPluginManager().registerEvents(new BOOTS_Flame(), this);
    	Bukkit.getPluginManager().registerEvents(new BOOTS_happy(), this);
    	Bukkit.getPluginManager().registerEvents(new BOOTS_note(), this);
    	Bukkit.getPluginManager().registerEvents(new BOOTS_wasser(), this);
    	Bukkit.getPluginManager().registerEvents(new BOOTS_end(), this);
    	Bukkit.getPluginManager().registerEvents(new BOOTS_cloud(), this);
    	Bukkit.getPluginManager().registerEvents(new BOOTS_angry(), this);
    	Bukkit.getPluginManager().registerEvents(new BOOTS_tnt(), this);
    	
    	getCommand("warp").setExecutor(new CMD_warp(this));
    	getCommand("setwarp").setExecutor(new CMD_setwarp(this));
    	getCommand("lobby").setExecutor(new CMD_lobby());
    	getCommand("l").setExecutor(new CMD_lobby());
    	getCommand("leave").setExecutor(new CMD_lobby());
    	getCommand("hub").setExecutor(new CMD_lobby());
    	getCommand("spawn").setExecutor(new CMD_lobby());
    	
    	
    	
    }
    
    public void loadConfig() {
    	FileConfiguration cfg = getConfig(); 
    	cfg.options().copyDefaults(true);
    }
}
