package testmod.init;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.registries.IForgeRegistry;
import testmod.TestMod;
import testmod.item.ItemChickenNugget;
import testmod.item.ItemCookedChickenNugget;

public class ModItems {
	
	public static final ItemChickenNugget CHICKEN_NUGGET = new ItemChickenNugget();
	public static final ItemCookedChickenNugget COOKED_CHICKEN_NUGGET = new ItemCookedChickenNugget();
	
	@Mod.EventBusSubscriber(modid = TestMod.MOD_ID)
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			Item[] items = {
				CHICKEN_NUGGET,
				COOKED_CHICKEN_NUGGET
			};
			
			final IForgeRegistry<Item> registry = event.getRegistry();
			ModelResourceLocation modelLocation;
			for (Item item : items) {
				registry.register(item);
				modelLocation = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
				ModelLoader.setCustomModelResourceLocation(item, 0, modelLocation);
			}
		}
	}

}
