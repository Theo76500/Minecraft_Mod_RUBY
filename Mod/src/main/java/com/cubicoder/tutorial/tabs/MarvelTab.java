package com.cubicoder.tutorial.tabs;

import com.cubicoder.tutorial.MainMod;
import com.cubicoder.tutorial.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MarvelTab extends CreativeTabs
{
    public MarvelTab(String name) {
        super(MainMod.MODID + "." + name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ModItems.THANOS_GAUNTLET);
    }
}
