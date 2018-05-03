package testmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.CHICKEN_NUGGET, new ItemStack(ModItems.COOKED_CHICKEN_NUGGET, 1), 1.0f);
	}

}
