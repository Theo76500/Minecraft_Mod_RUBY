package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.MainMod;

import net.minecraft.item.Item;

public class ItemBasic extends Item {

	public ItemBasic(String unlocalizedName, String registryName) {
		setTranslationKey(MainMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(MainMod.TUTORIAL_TAB);
	}
	
}
