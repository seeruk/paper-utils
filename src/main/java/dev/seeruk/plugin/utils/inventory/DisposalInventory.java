package dev.seeruk.plugin.utils.inventory;

import dev.seeruk.plugin.utils.UtilsPlugin;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class DisposalInventory implements InventoryHolder {
    private final Inventory inventory;

    public DisposalInventory(UtilsPlugin plugin) {
        this.inventory = plugin.getServer().createInventory(this, 27, "Disposal");
    }

    @Override
    public Inventory getInventory() {
        return this.inventory;
    }
}
