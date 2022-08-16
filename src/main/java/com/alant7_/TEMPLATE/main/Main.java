package com.alant7_.TEMPLATE.main;

import com.alant7_.TEMPLATE.data.DataLoader;
import com.alant7_.TEMPLATE.data.DataSource;
import com.alant7_.util.BukkitPlugin;
import com.alant7_.util.chat.lang.Language;
import org.bukkit.configuration.file.FileConfiguration;

public class Main extends BukkitPlugin {

    private static Main instance;

    @Override
    public void onPluginEnable() {

        instance = this;

        setDataSource(new DataSource());

        setDataLoader(new DataLoader());

        getDataLoader().load();

    }

    @Override
    public void onPluginDisable() {
        
    }

    public static Main getPlugin() {
        return instance;
    }

    @Override
    public DataLoader getDataLoader() {
        return (DataLoader) super.getDataLoader();
    }

    @Override
    public DataSource getDataSource() {
        return (DataSource) super.getDataSource();
    }

    public static Main plugin() {
        return instance;
    }

    public static FileConfiguration conf() {
        return instance.getConfig();
    }

}
