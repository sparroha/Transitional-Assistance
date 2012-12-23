package src.mod.ta;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class TAItemArmor extends ItemArmor implements IArmorTextureProvider
{

	public TAItemArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) 
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}
	public String getTextureFile()
	 {
	  return "/mod_KD_textures/sprites.png";
	 }
	public String getArmorTextureFile(ItemStack par1)
	{
		if(par1.itemID == mod_TransitionalAssistance.CobaltHelmet.shiftedIndex||par1.itemID == mod_TransitionalAssistance.CobaltChestplate.shiftedIndex||par1.itemID == mod_TransitionalAssistance.CobaltBoots.shiftedIndex)
		{
			return "/armor/cobaltArmor_1.png";
		}
		if(par1.itemID == mod_TransitionalAssistance.CobaltLeggings.shiftedIndex)
		{
			return "/armor/cobaltArmor_2.png";
		}
		return"";
	}

}