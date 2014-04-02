package net.bukkit_plugin.kojima1021.BarJoinMessage.event;

import me.confuser.barapi.BarAPI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

	@EventHandler
    public void OnJoin(PlayerJoinEvent e) {
	int seconds = 15;
	String message = ChatColor.AQUA +e.getPlayer().getName() + ChatColor.WHITE+" さんがサーバーに参加しました。";;
	Player[] pls = Bukkit.getOnlinePlayers();
	for(int i = 0; i < pls.length; i++)
	{
		Player player = pls[i];
	BarAPI.setMessage(player, message, seconds);

    }
}
}