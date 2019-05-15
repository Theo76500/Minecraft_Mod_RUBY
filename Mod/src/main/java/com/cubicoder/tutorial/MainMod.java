package com.cubicoder.tutorial;

import com.cubicoder.tutorial.tabs.MarvelTab;
import net.minecraft.world.storage.loot.LootTable;
import org.apache.logging.log4j.Logger;

import com.cubicoder.tutorial.proxy.IProxy;
import com.cubicoder.tutorial.recipes.TutorialRecipes;
import com.cubicoder.tutorial.tabs.ModTab;
import com.cubicoder.tutorial.world.gen.WorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MainMod.MODID, name = MainMod.NAME, version = MainMod.VERSION, acceptedMinecraftVersions = MainMod.MC_VERSION)
public class MainMod {
	
	public static final String MODID = "mainmod";
	public static final String NAME = "Cubicoder's Tutorial Mod";
	public static final String VERSION = "1.0";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final String CLIENT = "com.cubicoder.tutorial.proxy.ClientProxy";
	public static final String SERVER = "com.cubicoder.tutorial.proxy.ServerProxy";
	
	public static final CreativeTabs TUTORIAL_TAB = new ModTab("mod_ruby");
	public static final CreativeTabs MARVEL_TAB = new MarvelTab("marvel");
	
	@SidedProxy(clientSide = MainMod.CLIENT, serverSide = MainMod.SERVER)
	public static IProxy proxy;
	
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		TutorialRecipes.initSmelting();
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
