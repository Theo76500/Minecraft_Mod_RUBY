package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.MainMod;

import net.minecraft.item.ItemSword;

public class ItemTutorialSword extends ItemSword {
	
	public ItemTutorialSword(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material);
		
		setTranslationKey(MainMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(MainMod.TUTORIAL_TAB);
	}

}
