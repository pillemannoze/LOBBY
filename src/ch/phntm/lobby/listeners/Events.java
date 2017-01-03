package ch.phntm.lobby.listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

import ch.phntm.lobby.Lobby;




public class Events
implements Listener
{


@EventHandler
public void on(InventoryClickEvent e)
{
  Player p = (Player)e.getWhoClicked();
  if (e.getInventory().equals(p.getInventory()))
  {
    if (p.getGameMode().equals(GameMode.CREATIVE)) {
      e.setCancelled(false);
    }
  }
  else
    e.setCancelled(true);
}

@EventHandler
public void a(PlayerDropItemEvent e)
{
  Player p = e.getPlayer();
  if (p.getGameMode().equals(GameMode.CREATIVE))
  {
    e.setCancelled(false);
  }
  else
  {
    e.setCancelled(true);
  }
}

@EventHandler
public void b(PlayerDeathEvent e)
{
  Player p = e.getEntity();
  p.setHealth(1.0D);
  p.setMaxHealth(1.0D);
  p.setFoodLevel(20);
//  p.getInventory().setArmorContents(null);
//  p.getInventory().clear();
//  p.getInventory().setItem(0, ch.phntm.lobby.methods.Items.createItem(Material.FIREBALL, 1, 0, "§aGadgets §7(Rechtsklick)"));
//  p.getInventory().setItem(1, ch.phntm.lobby.methods.Items.createItem(Material.BLAZE_ROD, 1, 0, "§cSpieler-Sichtbarkeit §7(Rechtsklick)"));
//  p.getInventory().setItem(2, ch.phntm.lobby.methods.Items.createItem(Material.TNT, 1, 0, "§5Silent-Hub §7(Rechtklick)"));
//  p.getInventory().setItem(3, null);
//  p.getInventory().setItem(4, ch.phntm.lobby.methods.Items.createItem(Material.COMPASS, 1, 0, "§6Teleporter §7(Rechtsklick)"));
//  p.getInventory().setItem(5, null);
//  p.getInventory().setItem(7, ch.phntm.lobby.methods.Items.createItem(Material.EYE_OF_ENDER, 1, 0, "§4Schutzschild §7(Rechtsklick)"));
//  p.getInventory().setItem(8, ch.phntm.lobby.methods.Items.createItem(Material.SLIME_BALL, 1, 0, "§cKein Gadget ausgewählt"));
  p.performCommand("warp Spawn");

  e.setDeathMessage(null);
}

@EventHandler
public void on(PlayerAchievementAwardedEvent e)
{
  e.setCancelled(true);
}

@EventHandler
public void damage(EntityDamageByEntityEvent e)
{
  e.setCancelled(true);
}

@EventHandler
public void damage(EntityDamageEvent e)
{
  e.setCancelled(true);
}

@EventHandler
public void onFood(FoodLevelChangeEvent e) {
  e.setCancelled(true);
}

@EventHandler(priority=EventPriority.HIGH)
public void onPlace(BlockPlaceEvent e) {
  Player p = e.getPlayer();
  if (p.getGameMode().equals(GameMode.CREATIVE))
  {
    e.setCancelled(false);
  }
  else
  {
    e.setCancelled(true);
   
  }
}

@EventHandler(priority=EventPriority.HIGH)
public void onBreak(BlockBreakEvent e)
{
  Player p = e.getPlayer();
  if (p.getGameMode().equals(GameMode.CREATIVE))
  {
    e.setCancelled(false);
  }
  else
  {
    e.setCancelled(true);
    
  }
}

@EventHandler
public void on(WeatherChangeEvent e) {
e.setCancelled(true);
}
}