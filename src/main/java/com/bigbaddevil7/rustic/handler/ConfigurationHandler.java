package com.bigbaddevil7.rustic.handler;

import com.bigbaddevil7.rustic.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by bigbaddevil7 on 10/3/2014.
 */

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;


    public static void init (File configFile){
        if(configuration == null) {
            configuration = new Configuration(configFile); //made a new configuration object and named it configuration
            loadConfiguration();
        }
    }


    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            loadConfiguration();
        }
    }

    private static void loadConfiguration(){
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Add comment");
        if(configuration.hasChanged()){
            configuration.save();
        }
    }

}
