package testmod.init;

import net.minecraft.block.material.MapColor;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import testmod.TestMod;
import testmod.entity.EntityLad;
import testmod.model.ModelLad;
import testmod.render.RenderFactories;
import testmod.render.RenderLad;

public class ModEntities {
	
	@Mod.EventBusSubscriber(modid = TestMod.MOD_ID)
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerEntities(final RegistryEvent.Register<EntityEntry> event) {
			EntityEntry[] entries = {
					 EntityEntryBuilder.create()
			            .entity(EntityLad.class)
			            .id(new ResourceLocation(TestMod.MOD_ID, "lad"), 0)
			            .name("lad")
			            .tracker(80, 3, false)
			            .egg(MapColor.BLUE.colorValue, MapColor.YELLOW.colorValue)
			            .spawn(EnumCreatureType.CREATURE, 20, 1, 5, BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST))
			            .build()
			};

			event.getRegistry().registerAll(entries);
//			RenderFactories.registerEntityRenderers();
			
//			RenderingRegistry.registerEntityRenderingHandler(EntityLad.class, new FactoryLad());
//			ResourceLocation nameLocation = new ResourceLocation(TestMod.MOD_ID, "lad");
//			EntityRegistry.registerModEntity(nameLocation, EntityLad.class, nameLocation.toString(), ++id, GunCraft.instance, 64, 10, false, 0xFFFFFF, 0x000000);
		}

	}
	
//	private static int entityID = 0;
//	
//	private static <E extends Entity> EntityEntryBuilder<E> createBuilder(final String name) {
//		final EntityEntryBuilder<E> builder = EntityEntryBuilder.create();
//		final ResourceLocation registryName = new ResourceLocation(TestMod.MOD_ID, name);
//		return builder.id(registryName, entityID++).name(registryName.toString());
//	}

}
