package com.xlxyvergil.playerprefix;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class PrefixExpansion extends PlaceholderExpansion {
    /**
     * This method should always return true unless we have a dependency we need to make sure is on the server for our placeholders to work!
     *
     * @return always true since we do not have any dependencies.
     */
    @Override
    public boolean canRegister() {
        return true;
    }

    /**
     * The name of the person who created this expansion should go here.
     *
     * @return The name of the author as a String.
     */
    @Override
    public String getAuthor() {
        return "xlxyvergil";
    }

    /**
     * The placeholder identifier should go here. <br>
     * This is what tells PlaceholderAPI to call our onRequest method to obtain a value if a placeholder starts with our identifier. <br>
     * This must be unique and can not contain % or _
     *
     * @return The identifier in {@code %<identifier>_<value>%} as String.
     */
    @Override
    public String getIdentifier() {
        return "Prefix";
    }

    /**
     * This is the version of this expansion. <br>
     * You don't have to use numbers, since it is set as a String.
     *
     * @return The version as a String.
     */
    @Override
    public String getVersion() {
        return "1.0.0";
    }

    /**
     * This is the method called when a placeholder with our identifier is found and needs a value. <br>
     * We specify the value identifier in this method. <br>
     * Since version 2.9.1 can you use OfflinePlayers in your requests.
     *
     * @param player
     *            A {@link org.bukkit.OfflinePlayer OfflinePlayer}.
     * @param identifier
     *            A String containing the identifier/value.
     *
     * @return Possibly-null String of the requested identifier.
     */
    private static String varMessage;
    public static String prefix;
    public static String Suffix;

    public String onRequest(OfflinePlayer player , String identifier) {
        if (identifier != null) {
            String[] args = new String[0];
            if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                String Message = "%player_displayname%";
                varMessage = PlaceholderAPI.setPlaceholders(target, Message);
                String[] varp = varMessage.split("", 1);
                int varm = varMessage.length();
                prefix = varp[0] + varp[1] + varp[2] + varp[3] + varp[4] + varp[5];
                prefix = String.valueOf(Integer.parseInt(identifier));
                Suffix = varp[varm - 5] + varp[varm - 4] + varp[varm - 3] + varp[varm - 2] + varp[varm - 1] + varp[varm];
                return "" + prefix;
                Suffix = String.valueOf(Integer.parseInt(identifier));
                return "" + Suffix;
            }

        }
        return null;
    }
}
