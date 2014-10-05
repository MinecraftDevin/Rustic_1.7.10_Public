package com.bigbaddevil7.rustic.init;

import com.bigbaddevil7.rustic.block.BlockCopperBlock;
import com.bigbaddevil7.rustic.block.BlockRustic;
import com.bigbaddevil7.rustic.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by bigbaddevil7 on 10/5/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockRustic copperBlock = new BlockCopperBlock();

    public static void init(){
        GameRegistry.registerBlock(copperBlock, "copperBlock");
    }
}
