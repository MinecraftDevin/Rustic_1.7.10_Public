package com.bigbaddevil7.rustic.client.gui;

import com.bigbaddevil7.rustic.handler.ConfigurationHandler;
import com.bigbaddevil7.rustic.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;


/**
 * Created by bigbaddevil7 on 10/3/2014.
 */
public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig(GuiScreen guiScreen){
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
