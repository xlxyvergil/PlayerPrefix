package com.xlxyvergil.playerprefix;


import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;

public class PlaceholderPrefix extends PlaceholderExpansion {
    private PlayerPrefix plugin;
    public PlaceholderPrefix(PlayerPrefix plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean canRegister(){
        return true;
    }
    @Override
    public String getAuthor(){
        return "xlxyvergil";
    }
    @Override
    public String getIdentifier(){
        return "PlayerPrefix";
    }
    @Override
    public String getVersion(){
        return "1.0.0";
    }

    public String onPlaceholderRequest(Player player , String identifier){
        if(player == null){
            return "";
        }
        // %example_placeholder1%
        if(identifier.equals("Prefix")){
            return "Prefix works";
        }

        // %example_placeholder2%
        if(identifier.equals("suffix")){
            return "suffix works";
        }

        // We return null if an invalid placeholder (f.e. %example_placeholder3%)
        // was provided
        return null;
    }
}
