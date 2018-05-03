package testmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import testmod.TestMod;

public class ItemCookedChickenNugget extends ItemFood {
	
	public ItemCookedChickenNugget() {
		super(6, false);
		this.setMaxStackSize(64);
		setRegistryName(new ResourceLocation(TestMod.MOD_ID, "cooked_chicken_nugget"));
        setUnlocalizedName("cooked_chicken_nugget");
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 600, 10, false, false));
        }
    }
	
}
