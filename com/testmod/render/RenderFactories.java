package testmod.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import testmod.entity.EntityLad;

public class RenderFactories {

	public static void registerEntityRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityLad.class, RenderFactoryEntityLad.INSTANCE);
    }

    public static class RenderFactoryEntityLad implements IRenderFactory<EntityLad>
    {
        public final static RenderFactoryEntityLad INSTANCE = new RenderFactoryEntityLad();
    
        @Override
        public Render<EntityLad> createRenderFor(RenderManager manager)
        {
            return new RenderLad(manager);
        }
    }

}
