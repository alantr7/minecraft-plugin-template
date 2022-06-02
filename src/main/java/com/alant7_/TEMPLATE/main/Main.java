package com.alant7_.TEMPLATE.main;

import com.alant7_.TEMPLATE.data.DataLoader;
import com.alant7_.TEMPLATE.data.DataSource;
import com.alant7_.util.AlanJavaPlugin;

public class Main extends AlanJavaPlugin {

    @Override
    public void onPluginEnable() {

        setDataSource(new DataSource());

        setDataLoader(new DataLoader());

        getDataLoader().load();

    }

    @Override
    public void onPluginDisable() {

    }

    @Override
    public DataLoader getDataLoader() {
        return (DataLoader) super.getDataLoader();
    }

    @Override
    public DataSource getDataSource() {
        return (DataSource) super.getDataSource();
    }

}
