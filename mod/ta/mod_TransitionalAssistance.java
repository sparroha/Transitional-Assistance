package src.mod.ta;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
        	public static final Block TalcBlock = new TalcBlock(500,0,Material.ground).setBlockName("TalcBlock").setHardness(1F).setResistance(0F);
        	public static final Block GypsumBlock = new TalcBlock(501,0,Material.ground).setBlockName("GypsumBlock").setHardness(2F).setResistance(2F);
        	public static final Block Calcite = new TalcBlock(502,0,Material.ground).setBlockName("Calcite").setHardness(3F).setResistance(3F);
        	public static final Block Flourite = new TalcBlock(503,0,Material.ground).setBlockName("Flourite").setHardness(4F).setResistance(4F);
        	public static final Block Apatite = new TalcBlock(504,0,Material.ground).setBlockName("Apatite").setHardness(5F).setResistance(5F);
        	public static final Block Feldspar = new TalcBlock(505,0,Material.ground).setBlockName("Feldspar").setHardness(6F).setResistance(6F);
        	public static final Block Quartz = new TalcBlock(506,0,Material.ground).setBlockName("Quartz").setHardness(7F).setResistance(7F);
        	public static final Block Topaz = new TalcBlock(507,0,Material.ground).setBlockName("Topaz").setHardness(8F).setResistance(8F);
        	public static final Block Corundum = new TalcBlock(508,0,Material.ground).setBlockName("Corundum").setHardness(9F).setResistance(9F);
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
