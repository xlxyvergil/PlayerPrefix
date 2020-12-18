package com.xlxyvergil.playerprefix;


import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerPrefix extends JavaPlugin implements Listener {
    private static String varMessage;
    public static String varxlprefix;
    public static String varxlsuffix;
    public void onEnable( ){
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            String[] args = new String[0];
            if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                String Message = "%player_displayname%";
                varMessage = PlaceholderAPI.setPlaceholders(target, Message);
                String[] varp = varMessage.split("",1);
                int varm = varMessage.length();
                varxlprefix = varp[0] + varp[1] + varp[2] + varp[3] + varp[4] + varp[5];
                varxlsuffix = varp[varm-5] + varp[varm-4] + varp[varm-3] + varp[varm-2] + varp[varm-1] + varp[varm];
            }
            if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null){
                new PlaceholderPrefix(this).register();
            }
            }
            }
        }