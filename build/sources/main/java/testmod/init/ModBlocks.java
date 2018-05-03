package testmod.init;

import com.google.common.base.Preconditions;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import testmod.TestMod;
import testmod.block.BlockHappyMeal;

public class ModBlocks {
	
	public static final BlockHappyMeal HAPPY_MEAL = new BlockHappyMeal();
	
	@Mod.EventBusSubscriber(modid = TestMod.MOD_ID)
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			Block[] blocks = {
				HAPPY_MEAL
			};
			
			final IForgeRegistry<Block> registry = event.getRegistry();
			registry.registerAll(blocks);
		}
		
		@SubscribeEvent
		public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
			ItemBlock[] items = {
				new ItemBlock(HAPPY_MEAL)
			};
			
			final IForgeRegistry<Item> registry = event.getRegistry();
			ResourceLocation registryName;
			ModelResourceLocation modelLocation;
			for (ItemBlock item : items) {
				Block block = item.getBlock();
				registry.register(item.setRegistryName(block.getRegistryName()));
				modelLocation = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
				ModelLoader.setCustomModelResourceLocation(item, 0, modelLocation);
			}
		}
	}
	
}
