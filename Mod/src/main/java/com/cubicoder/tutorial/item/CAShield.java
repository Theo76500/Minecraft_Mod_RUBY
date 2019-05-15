package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.MainMod;
import net.minecraft.item.ItemShield;

public class CAShield extends ItemShield
{
    public CAShield(String unlocalizedName, String registryName) {

        setTranslationKey(MainMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(MainMod.MARVEL_TAB);
    }
}