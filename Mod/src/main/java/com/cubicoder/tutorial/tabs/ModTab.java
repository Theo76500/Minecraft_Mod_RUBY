package com.cubicoder.tutorial.tabs;

import com.cubicoder.tutorial.MainMod;
import com.cubicoder.tutorial.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTab extends CreativeTabs {

	public ModTab(String name) {
		super(MainMod.MODID + "." + name);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModItems.BASIC_ITEM);
	}



}
