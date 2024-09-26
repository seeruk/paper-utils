package dev.seeruk.plugin.utils.inventory;

import dev.seeruk.plugin.utils.UtilsPlugin;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class DisposalInventory implements InventoryHolder {
    private final Inventory inventory;

    public DisposalInventory(UtilsPlugin plugin) {
        this.inventory = plugin.getServer().createInventory(this, 27, Component.text("Disposal"));
    }

    @Override
    public @NotNull Inventory getInventory() {
        return this.inventory;
    }
}
