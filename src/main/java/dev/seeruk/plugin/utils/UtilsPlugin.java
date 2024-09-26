package dev.seeruk.plugin.utils;

import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIBukkitConfig;
import dev.jorel.commandapi.CommandAPICommand;
import dev.seeruk.plugin.utils.inventory.DisposalInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.plugin.java.JavaPlugin;

public final class UtilsPlugin extends JavaPlugin {
    @Override
    public void onLoad() {
        var commandConfig = new CommandAPIBukkitConfig(this)
            .shouldHookPaperReload(true)
            .setNamespace("seers-utils");

        CommandAPI.onLoad(commandConfig);

        new CommandAPICommand("disposal")
            .executes((sender, args) -> {
                if (sender instanceof Player player) {
                    var inventory = new DisposalInventory(this);
                    player.openInventory(inventory.getInventory());
                }
            })
            .register();
    }

    @Override
    public void onEnable() {
        CommandAPI.onEnable();
    }

    @Override
    public void onDisable() {
        CommandAPI.onDisable();
    }
}
