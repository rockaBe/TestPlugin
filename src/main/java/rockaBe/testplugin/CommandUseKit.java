package rockaBe.testplugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

public class CommandUseKit implements CommandExecutor {
    
    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // Create a new ItemStack (type: diamond)
            ItemStack diamond = new ItemStack(Material.DIAMOND, 20);

            // Create a new ItemStack (type: brick)
            ItemStack bricks = new ItemStack(Material.BRICK, 10);

            // Give the player our items (comma-seperated list of all ItemStack)
            player.getInventory().addItem(bricks, diamond);
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}
