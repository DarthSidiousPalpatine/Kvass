package com.muurr.tfcpluskvass;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Kvass.MODID, version = Kvass.VERSION, dependencies = "required-after:terrafirmacraftplus;")
public class Kvass
{
    public static final String MODID = "tfcpluskvass";
    public static final String VERSION = "1.0";
    
    @SidedProxy(clientSide = "com.muurr.tfcpluskvass.Proxy", serverSide = "com.muurr.tfcpluskvass.Proxy")
	public static Proxy proxy;
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ItemSetup.setup();
		proxy.registerFluids();
		proxy.registerItems();
	}
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
		ItemSetup.setuprecipes();
    }
}
