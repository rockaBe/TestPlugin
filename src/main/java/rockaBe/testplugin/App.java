package rockaBe.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin
{
    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");
        // Register our command "kit" (set an instance of your command class as executor)
        getCommand("usekit").setExecutor(new CommandUseKit());
    }
    
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}
