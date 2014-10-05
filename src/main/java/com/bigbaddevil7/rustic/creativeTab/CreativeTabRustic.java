package com.bigbaddevil7.rustic.creativeTab;

import com.bigbaddevil7.rustic.init.ModItems;
import com.bigbaddevil7.rustic.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by bigbaddevil7 on 10/5/2014.
 */
public class CreativeTabRustic {
    public static final CreativeTabs RUSTIC_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.copperIngot;
        }

        @Override
        public String getTranslatedTabLabel(){
            return "Rustic";
        }
    };
}
