package ch.phntm.lobby.methodes;

import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_8_R3.PlayerConnection;

public class TitlesAPI
{
  public static void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle)
  {
    PlayerConnection connection = ((CraftPlayer)player).getHandle().playerConnection;

    PacketPlayOutTitle packetPlayOutTimes = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TIMES, null, fadeIn.intValue(), stay.intValue(), fadeOut.intValue());
    connection.sendPacket(packetPlayOutTimes);
    if (subtitle != null)
    {
      subtitle = subtitle.replaceAll("%player%", player.getDisplayName());
      subtitle = ChatColor.translateAlternateColorCodes('&', subtitle);
      IChatBaseComponent titleSub = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + subtitle + "\"}");
      PacketPlayOutTitle packetPlayOutSubTitle = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, titleSub); 
      connection.sendPacket(packetPlayOutSubTitle);
    }
    if (title != null)
    {
      title = title.replaceAll("%player%", player.getDisplayName());
      title = ChatColor.translateAlternateColorCodes('&', title);
      IChatBaseComponent titleMain = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + title + "\"}");
      PacketPlayOutTitle packetPlayOutTitle = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, titleMain);
      connection.sendPacket(packetPlayOutTitle);
    }
  }

  public static void sendTabTitle(Player player, String header, String footer) {
  }

  public static void sendActionBar(Player player, String message) {
    CraftPlayer p = (CraftPlayer)player;
    IChatBaseComponent cbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + message + "\"}");
    PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc, (byte)2);
    p.getHandle().playerConnection.sendPacket(ppoc);
  }
}