package src.mod.ta;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
public class TAItemAxe extends ItemAxe
{
 public TAItemAxe(int itemID, EnumToolMaterial toolMaterial)
 {
  super(itemID, toolMaterial);
 }
 public String getTextureFile()
 {
  return "/mod_KD_textures/sprites.png";
 }
}