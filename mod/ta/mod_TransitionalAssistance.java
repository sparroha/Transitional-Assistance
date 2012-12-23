package src.mod.ta;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="mod_TransitionalAssistance", name="Transitional Assistance", version="0.1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class mod_TransitionalAssistance {

        // The instance of your mod that Forge uses.
        @Instance("mod_TransitionalAssistance")
        public static mod_TransitionalAssistance instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="src.mod.ta.client.ClientProxy", serverSide="src.mod.ta.CommonProxy")
        public static CommonProxy proxy;
        
        //Minerals
        	public static final Block TalcBlock = new TABlock(500,0,Material.ground).setBlockName("TalcBlock").setHardness(0.5F).setResistance(1F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	public static final Block GypsumBlock = new GypsumBlock(501,2,Material.ground).setBlockName("GypsumBlock").setHardness(1F).setResistance(2F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	public static final Block Calcite = new TABlock(502,3,Material.ground).setBlockName("Calcite").setHardness(1.5F).setResistance(3F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	public static final Block Flourite = new TABlock(503,4,Material.ground).setBlockName("Flourite").setHardness(2F).setResistance(4F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	public static final Block Apatite = new TABlock(504,5,Material.ground).setBlockName("Apatite").setHardness(2.5F).setResistance(5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	public static final Block Feldspar = new TABlock(505,6,Material.ground).setBlockName("Feldspar").setHardness(3F).setResistance(6F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	public static final Block Quartz = new TABlock(506,7,Material.ground).setBlockName("Quartz").setHardness(3.5F).setResistance(7F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	public static final Block Topaz = new TABlock(507,8,Material.ground).setBlockName("Topaz").setHardness(4F).setResistance(8F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	public static final Block Corundum = new TABlock(508,9,Material.ground).setBlockName("Corundum").setHardness(4.5F).setResistance(9F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	//tool material blocks
        	public static final Block CobaltOre = new TABlock(520,16,Material.rock).setBlockName("CobaltOre").setHardness(5F).setResistance(10F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	public static final Block CobaltBlock = new TABlock(521,17,Material.rock).setBlockName("CobaltBlock").setHardness(5F).setResistance(10F).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock);
        	//items//items
        	public static final Item keithium = new TAItem(5000).setIconIndex(33).setItemName("itemKeithium").setCreativeTab(CreativeTabs.tabBlock);
        	public static final Item keithiumIngot = new TAItem(5001).setIconIndex(34).setItemName("itemKeithiumIngot").setCreativeTab(CreativeTabs.tabBlock);
        	//enums
        	static	EnumToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 3, 755, 7F, 3, 12);
        	static	EnumArmorMaterial COBALT2 = EnumHelper.addArmorMaterial("COBALT", 24, new int[] {3, 7, 5, 2}, 10);
        	static	EnumToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 4, 3122, 9F, 4, 20);
        	static	EnumArmorMaterial TITANIUM2 = EnumHelper.addArmorMaterial("TITANIUM", 42, new int[] {4, 10, 8, 4}, 22);
        	//TOOL SETS
        	//cobalt
        	public static final Item CobaltPickaxe = new TAItemPickaxe(200, COBALT).setIconIndex(16).setItemName("CobaltPickaxe");
        	public static final Item CobaltAxe = new TAItemAxe(201, COBALT).setIconIndex(17).setItemName("CobaltAxe");
        	public static final Item CobaltShovel = new TAItemSpade(202, COBALT).setIconIndex(18).setItemName("CobaltShovel");
        	public static final Item CobaltSword = new TAItemSword(203, COBALT).setIconIndex(19).setItemName("CobaltSword");
        	public static final Item CobaltHoe = new TAItemHoe(204, COBALT).setIconIndex(32).setItemName("CobaltHoe");
        	//ARMOR SETS
        	//cobalt
        	/*GameRegistry.addArmor("cobaltArmor"),*/
        	public static final Item CobaltHelmet = new TAItemArmor(301, COBALT2, ModLoader.addArmor("CobaltArmor"), 0).setIconIndex(0).setItemName("CobaltHelmet");
        	public static final Item CobaltChestplate = new TAItemArmor(302, COBALT2, ModLoader.addArmor("CobaltArmor"), 1).setIconIndex(1).setItemName("CobaltChestplate");
        	public static final Item CobaltLeggings = new TAItemArmor(303, COBALT2, ModLoader.addArmor("CobaltArmor"), 2).setIconIndex(2).setItemName("CobaltLeggings");
        	public static final Item CobaltBoots = new TAItemArmor(304, COBALT2, ModLoader.addArmor("CobaltArmor"), 3).setIconIndex(3).setItemName("CobaltBoots");
        @Init
        public void load(FMLInitializationEvent event) {
        //Minerals Registry
        	GameRegistry.registerBlock(TalcBlock);
        	LanguageRegistry.addName(TalcBlock, "Talc");
        	GameRegistry.registerBlock(GypsumBlock);
        	LanguageRegistry.addName(GypsumBlock, "Gypsum");
        	GameRegistry.registerBlock(Calcite);
        	LanguageRegistry.addName(Calcite, "Calcite");
        	GameRegistry.registerBlock(Flourite);
        	LanguageRegistry.addName(Flourite, "Flourite");
        	GameRegistry.registerBlock(Apatite);
        	LanguageRegistry.addName(Apatite, "Apatite");
        	GameRegistry.registerBlock(Feldspar);
        	LanguageRegistry.addName(Feldspar, "Feldspar");
        	GameRegistry.registerBlock(Quartz);
        	LanguageRegistry.addName(Quartz, "Quartz");
        	GameRegistry.registerBlock(Topaz);
        	LanguageRegistry.addName(Topaz, "Topaz");
        	GameRegistry.registerBlock(Corundum);
        	LanguageRegistry.addName(Corundum, "Corundum");
        	
        	proxy.registerRenderers();
        }

        public String getVersion()
        {
         return "Transitional Assistance 0.1.0 (1.4.6)";
        }
}
