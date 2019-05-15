package com.cubicoder.tutorial.recipes;

import com.cubicoder.tutorial.init.ModBlocks;
import com.cubicoder.tutorial.init.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialRecipes {

	public static void initSmelting() {
		GameRegistry.addSmelting(ModBlocks.BASIC_BLOCK, new ItemStack(ModItems.BASIC_ITEM), 10.0F);
	}
	
}
