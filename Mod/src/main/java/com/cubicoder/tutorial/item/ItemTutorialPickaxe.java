package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.MainMod;

import net.minecraft.item.ItemPickaxe;

public class ItemTutorialPickaxe extends ItemPickaxe {
	
	public ItemTutorialPickaxe(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material);
		
		setTranslationKey(MainMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(MainMod.TUTORIAL_TAB);
	}

}
