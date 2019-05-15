package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.MainMod;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;

public class ThanosGauntletEmpty extends ItemSword
{
    public ThanosGauntletEmpty(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setTranslationKey(MainMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(MainMod.MARVEL_TAB);
    }
}
