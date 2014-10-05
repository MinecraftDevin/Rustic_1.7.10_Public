package com.bigbaddevil7.rustic.block;

import com.bigbaddevil7.rustic.creativeTab.CreativeTabRustic;
import com.bigbaddevil7.rustic.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by bigbaddevil7 on 10/5/2014.
 */
public class BlockRustic extends Block {
    public BlockRustic(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabRustic.RUSTIC_TAB);
    }

    public BlockRustic(){
        this(Material.rock);
        this.setCreativeTab(CreativeTabRustic.RUSTIC_TAB);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedname){
        return unlocalizedname.substring(unlocalizedname.indexOf(".") + 1);
    }

}
