package ch.phntm.lobby.listeners;



import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;

import ch.phntm.lobby.Lobby;

public class CommandBlocker
implements Listener
{
private static Lobby plugin;

public CommandBlocker(Lobby Lobby)
{
  plugin = Lobby;
}

@EventHandler
public void onHelp(PlayerCommandPreprocessEvent e)
{
  Player p = e.getPlayer();
  String command = e.getMessage();
  if ((command.equalsIgnoreCase("/help")) || (command.equalsIgnoreCase("/?"))  || (command.equalsIgnoreCase("/pl")) || (command.equalsIgnoreCase("/plugins")) || (command.equalsIgnoreCase("/tell")) || (command.equalsIgnoreCase("/bukkit:")) || (command.equalsIgnoreCase("/reload")) || (command.equalsIgnoreCase("/rl")))
  {
	  if(p.hasPermission("krayze.admin")) {
		  e.setCancelled(false);
	  } else {

    p.sendMessage(Lobby.noperm);

    e.setCancelled(true);
	  }
  }
}

@EventHandler
public void onVersion(PlayerCommandPreprocessEvent e)
{
  Player p = e.getPlayer();
  String command = e.getMessage();
  if ((command.equalsIgnoreCase("/ver")) || (command.equalsIgnoreCase("/version")))
  {
    if (p.isOp()) {
      return;
    }
    p.sendMessage(Lobby.noperm);

    e.setCancelled(true);
  }
}

@EventHandler
public void Reload(PlayerCommandPreprocessEvent event)
{
  Player p = event.getPlayer();
  String command = event.getMessage();
  String RL1 = plugin.getConfig().getString("Reload.Begin");
  RL1 = RL1.replaceAll("&", "§");
  RL1 = RL1.replaceAll("%prefix%", Lobby.prefix);
  String RL2 = plugin.getConfig().getString("Reload.Done");
  RL2 = RL2.replaceAll("&", "§");
  RL2 = RL2.replaceAll("%prefix%", Lobby.prefix);
  if (((command.equalsIgnoreCase("/rl")) || (command.equalsIgnoreCase("/reload")) || (command.equalsIgnoreCase("/r"))) && 
    (p.isOp()))
  {
    event.setCancelled(true);
    Bukkit.broadcastMessage(RL1);
    Bukkit.reload();
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage(RL2);
  }
}

@EventHandler
public void onAbout(PlayerCommandPreprocessEvent e)
{
  Player p = e.getPlayer();
  String command = e.getMessage();
  if ((command.equalsIgnoreCase("/bungee")) || (command.equalsIgnoreCase("/about")))
  {
    if (p.isOp()) {
      return;
    }
    p.sendMessage(Lobby.noperm);

    e.setCancelled(true);
  }
}

@EventHandler
public void onUnknown(PlayerCommandPreprocessEvent e)
{
  Player p = e.getPlayer();
  String msg = e.getMessage().split(" ")[0];
  HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
  if (topic == null)
  {
    p.sendMessage(Lobby.prefix + "§7Der Command §c" + msg + "§7 ist in unserem System nicht vorhanden!");
    e.setCancelled(true);
  }
}
}