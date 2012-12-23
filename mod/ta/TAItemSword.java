package src.mod.ta;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class TAItemSword extends ItemSword
{
 public TAItemSword(int itemID, EnumToolMaterial toolMaterial)
 {
  super(itemID, toolMaterial);
 }
 public String getTextureFile()
 {
  return "/mod_KD_textures/sprites.png";
 }
}