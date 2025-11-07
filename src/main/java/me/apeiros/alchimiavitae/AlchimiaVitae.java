package me.apeiros.alchimiavitae;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.mooy1.infinitylib.metrics.bukkit.Metrics;

import me.apeiros.alchimiavitae.setup.Setup;
import net.guizhanss.guizhanlibplugin.updater.GuizhanUpdater;

import java.util.logging.Level;

/**
 * Main class
 */
public class AlchimiaVitae extends AbstractAddon {

    private static AlchimiaVitae instance;

    public AlchimiaVitae() {
        super("SlimefunGuguProject", "AlchimiaVitae", "master", "options.auto-update");
    }

    @Override
    public void enable() {
        // Set instance
        instance = this;

        if (!getServer().getPluginManager().isPluginEnabled("GuizhanLibPlugin")) {
            getLogger().log(Level.SEVERE, "This plugin requires the GuizhanLibPlugin dependency to run!");
            getLogger().log(Level.SEVERE, "Download it from: https://50L.cc/gzlib");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        if (getConfig().getBoolean("options.auto-update") && getDescription().getVersion().startsWith("Build")) {
            GuizhanUpdater.start(this, getFile(), "SlimefunGuguProject", "AlchimiaVitae", "master");
        }

        // Set up items and listeners
        Setup.setup(this);

        // bStats
        new Metrics(this, 15139);
    }

    @Override
    public void disable() {
        // Set instance to null
        instance = null;
    }

    public static AlchimiaVitae i() {
        return instance;
    }

}
