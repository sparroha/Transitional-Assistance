package src.mod.ta;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class TAItemSpade extends ItemSpade
{
 public TAItemSpade(int itemID, EnumToolMaterial toolMaterial)
 {
  super(itemID, toolMaterial);
 }
 public String getTextureFile()
 {
  return "/mod_KD_textures/sprites.png";
 }
}