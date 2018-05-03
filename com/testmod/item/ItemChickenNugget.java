package testmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import testmod.TestMod;

public class ItemChickenNugget extends ItemFood {
	
	public ItemChickenNugget() {
		super(2, false);
		this.setMaxStackSize(64);
		setRegistryName(new ResourceLocation(TestMod.MOD_ID, "chicken_nugget"));
        setUnlocalizedName("chicken_nugget");
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
                player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 0, false, false));
        }
    }

}
