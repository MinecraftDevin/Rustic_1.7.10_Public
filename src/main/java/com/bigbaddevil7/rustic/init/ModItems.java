package com.bigbaddevil7.rustic.init;

import com.bigbaddevil7.rustic.item.ItemCopperIngot;
import com.bigbaddevil7.rustic.item.ItemRustic;
import com.bigbaddevil7.rustic.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bigbaddevil7 on 10/4/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemRustic copperIngot = new ItemCopperIngot();

    public static void init(){
        GameRegistry.registerItem(copperIngot, "copperIngot");
    }
}
