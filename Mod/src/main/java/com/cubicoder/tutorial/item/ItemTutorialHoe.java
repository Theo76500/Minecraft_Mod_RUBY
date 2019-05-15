package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.MainMod;

import net.minecraft.item.ItemHoe;

public class ItemTutorialHoe extends ItemHoe {
	
	public ItemTutorialHoe(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material);
		
		setTranslationKey(MainMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(MainMod.TUTORIAL_TAB);
	}

}
