package com.cubicoder.tutorial.materials;

import com.cubicoder.tutorial.MainMod;

import net.minecraft.block.state.pattern.BlockMaterialMatcher;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import sun.applet.Main;

public class TutorialMaterials {

    public static final ToolMaterial TUTORIAL_TOOL = EnumHelper.addToolMaterial(MainMod.MODID + ":" + "tutorial_tool", 4, 2000, 10.0F, 3.0F, 100);

    public static final ArmorMaterial TUTORIAL_ARMOR = EnumHelper.addArmorMaterial(MainMod.MODID + ":" + "tutorial_armor", MainMod.MODID + ":tutorial", 40, new int[]{4, 7, 8, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);

    public static final ToolMaterial HAMMER_MATERIAL = EnumHelper.addToolMaterial(MainMod.MODID + ":" + "hammer_meterial", 5, 50000, 20.0F, 100.0F, 50);

    public static final ToolMaterial THANOS_GAUNTLET_FULL = EnumHelper.addToolMaterial(MainMod.MODID + ":" + "hammer_meterial", 5, 50000, 20.0F, 100.0F, 100);

}
