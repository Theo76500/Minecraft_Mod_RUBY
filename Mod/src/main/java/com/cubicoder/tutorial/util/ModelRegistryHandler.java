package com.cubicoder.tutorial.util;

import com.cubicoder.tutorial.init.ModBlocks;
import com.cubicoder.tutorial.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.BASIC_ITEM);
		registerModel(ModItems.TUTORIAL_AXE);
		registerModel(ModItems.TUTORIAL_PICKAXE);
		registerModel(ModItems.TUTORIAL_HOE);
		registerModel(ModItems.TUTORIAL_SHOVEL);
		registerModel(ModItems.TUTORIAL_SWORD);
		registerModel(ModItems.TUTORIAL_HELMET);
		registerModel(ModItems.TUTORIAL_CHESTPLATE);
		registerModel(ModItems.TUTORIAL_LEGGINGS);
		registerModel(ModItems.TUTORIAL_BOOTS);
		registerModel(ModItems.THOR_HAMMER);
		registerModel(ModItems.THANOS_GAUNTLET);
		registerModel(ModItems.THANOS_GAUNTLET_EMPTY);
		registerModel(ModItems.CA_SHIELD);
		
		registerModel(Item.getItemFromBlock(ModBlocks.BASIC_BLOCK));
		registerModel(Item.getItemFromBlock(ModBlocks.RUBY_BLOCK));
	}
	
	private static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
