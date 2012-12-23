package src.mod.ta;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;

public class TAItemHoe extends ItemHoe
{
 public TAItemHoe(int itemID, EnumToolMaterial toolMaterial)
 {
  super(itemID, toolMaterial);
 }
 public String getTextureFile()
 {
  return "/mod_KD_textures/sprites.png";
 }
}