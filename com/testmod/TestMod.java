package testmod;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=TestMod.MOD_ID, name=TestMod.MOD_NAME, version=TestMod.VERSION)
public class TestMod {

	public static final String MOD_ID = "testmod";
	public static final String MOD_NAME = "Test Mod";
	public static final String VERSION = "0.0.1";
	
	@Instance(MOD_ID)
	public static TestMod instance;
	
	@SidedProxy(clientSide="testmod.ClientProxy", serverSide="testmod.Proxy")
	public static Proxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
