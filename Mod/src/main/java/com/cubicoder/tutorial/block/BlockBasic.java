package com.cubicoder.tutorial.block;

import com.cubicoder.tutorial.MainMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

	public BlockBasic(Material material, String unlocalizedName, String registryName) {
		this(material, SoundType.STONE, unlocalizedName, registryName);
	}
	
	public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName) {
		super(material);
		setTranslationKey(MainMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(MainMod.TUTORIAL_TAB);
		setSoundType(sound);
		setHardness(5.0F);
	}

}
