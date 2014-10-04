package com.bigbaddevil7.rustic.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by bigbaddevil7 on 10/3/2014.
 */
public class ConfigurationHandler {
    public static void init (File configFile){
        Configuration configuration = new Configuration(configFile); //made a new configuration object and named it configuration

        try{
            configuration.load();
            //TODO read in the properties
            //configuration.get(Category; takes any string, name of config, default value, comment).getBoolean(default value);
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "TODO Comment").getBoolean(true);
        }catch(Exception e){
            //TODO log the exception
        }finally {
            configuration.save();
        }
    }
}
