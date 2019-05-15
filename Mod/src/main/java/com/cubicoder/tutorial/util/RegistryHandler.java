package com.cubicoder.tutorial.util;

import com.cubicoder.tutorial.item.CAShield;
import com.cubicoder.tutorial.block.BlockBasic;
import com.cubicoder.tutorial.block.BlockRuby;
import com.cubicoder.tutorial.init.ModBlocks;
import com.cubicoder.tutorial.item.*;
import com.cubicoder.tutorial.materials.TutorialMaterials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				new BlockBasic(Material.ROCK, "blockBasic", "basic_block"),
				new BlockRuby(Material.ROCK, "blockRuby", "ruby_block")
		};
		
		event.getRegistry().registerAll(blocks);
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new ItemBasic("itemBasic", "basic_item"),
				new ItemTutorialAxe(TutorialMaterials.TUTORIAL_TOOL, "axeTutorial", "tutorial_axe"),
				new ItemTutorialPickaxe(TutorialMaterials.TUTORIAL_TOOL, "pickaxeTutorial", "tutorial_pickaxe"),
				new ItemTutorialHoe(TutorialMaterials.TUTORIAL_TOOL, "hoeTutorial", "tutorial_hoe"),
				new ItemTutorialShovel(TutorialMaterials.TUTORIAL_TOOL, "shovelTutorial", "tutorial_shovel"),
				new ItemTutorialSword(TutorialMaterials.TUTORIAL_TOOL, "swordTutorial", "tutorial_sword"),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.HEAD, "helmetTutorial", "tutorial_helmet", Potion.getPotionById(16), 1, 0),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.CHEST, "chestplateTutorial", "tutorial_chestplate", Potion.getPotionById(8), 1, 10),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.LEGS, "leggingsTutorial", "tutorial_leggings", Potion.getPotionById(8), 1, 10),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.FEET, "bootsTutorial", "tutorial_boots", Potion.getPotionById(22), 5, 1),

				new ItemThorHammer(TutorialMaterials.HAMMER_MATERIAL, "thorHammer", "thor_hammer"),
				new ThanosGauntlet(TutorialMaterials.THANOS_GAUNTLET_FULL, "thanosGauntlet", "thanos_gauntlet"),
				new ThanosGauntletEmpty(TutorialMaterials.THANOS_GAUNTLET_FULL, "thanosGauntletEmpty", "thanos_gauntlet_empty"),
				new CAShield ("cashiel", "ca_shield")
		};
		
		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.BASIC_BLOCK).setRegistryName(ModBlocks.BASIC_BLOCK.getRegistryName()),
				new ItemBlock(ModBlocks.RUBY_BLOCK).setRegistryName(ModBlocks.RUBY_BLOCK.getRegistryName())
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
}
