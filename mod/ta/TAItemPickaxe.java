package src.mod.ta;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class TAItemPickaxe extends ItemPickaxe
{

	public TAItemPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) 
	{
		super(par1, par2EnumToolMaterial);
		// TODO Auto-generated constructor stub
	}
	public boolean canHarvestBlock(Block par1Block)
	 {
		 if(par1Block==mod_TransitionalAssistance.CobaltOre||par1Block==mod_TransitionalAssistance.CobaltBlock)
		 {
			 if(this.toolMaterial.getHarvestLevel() == 2)
			 {
				 return true;
			 }
		 }
		 return true;
	 }
	 public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) 
	 {
		 if(par2Block.blockID == mod_TransitionalAssistance.CobaltOre.blockID||par2Block.blockID == mod_TransitionalAssistance.CobaltBlock.blockID)
		 {
			 return 20F;
		 }
		 else
			 return par2Block != null && (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
	 }
	 public String getTextureFile()
	 {
	  return "/mod_KD_textures/sprites.png";
	 }
}
