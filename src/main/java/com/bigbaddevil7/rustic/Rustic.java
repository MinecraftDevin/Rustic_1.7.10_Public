package com.bigbaddevil7.rustic;

import com.bigbaddevil7.rustic.proxy.IProxy;
import com.bigbaddevil7.rustic.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by bigbaddevil7 on 9/27/2014.
 */

@Mod(modid= Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION) //Tells Forge that this is a mod
public class Rustic {

    @Mod.Instance("Rustic")
    public static Rustic instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    //The preInit would be where you would initalize configs, network handlers, key binding, blocks, items, ect...
    public void preInit(FMLPreInitializationEvent event){

    }


    @Mod.EventHandler
    //The init is where you would initialize gui handler, tile entities, rendering, event handlers, and recipes
    public void Init(FMLInitializationEvent event){

    }


    @Mod.EventHandler
    //The postInit is where you would wrap things up. Like do stuff after all mods have finished
    public void postInit(FMLPostInitializationEvent event){

    }
}
