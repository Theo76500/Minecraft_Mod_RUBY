package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.MainMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTutorialArmor extends ItemArmor {

	private final Potion potionEffect;

	public final int duration;
	public final int ampli;



	public ItemTutorialArmor(ArmorMaterial material, EntityEquipmentSlot equipmentSlot, String unlocalizedName, String registryName, Potion potionEffect, int duration, int ampli) {
		super(material, 0, equipmentSlot);
		this.potionEffect = potionEffect;
		this.duration = duration;
		this.ampli = ampli;

		setTranslationKey(MainMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(MainMod.TUTORIAL_TAB);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (!player.isPotionActive(potionEffect)) {
			player.addPotionEffect(new PotionEffect(potionEffect, duration, ampli));
		}
	}
}
