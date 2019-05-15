package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.MainMod;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;

import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemThorHammer extends ItemSword
{
    public ItemThorHammer(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setTranslationKey(MainMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(MainMod.MARVEL_TAB);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        Block block = worldIn.getBlockState(pos).getBlock();
        worldIn.spawnEntity(new EntityLightningBolt(worldIn, pos.getX(), pos.getY(), pos.getZ(), false));
        worldIn.createExplosion(player, pos.getX(),pos.getY(),pos.getZ(), 1, true);

        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

}
