package net.minecraft.src;
import net.minecraft.src.Konung.*;
import java.util.Random;

public class mod_konungAlchemy extends BaseMod
{

	public static final Block KonungNut = new BlockKonungAlchemyNut(161, ModLoader.addOverride("/terrain.png", "/textures/konung/itemnut.png")).setStepSound(Block.soundGrassFootstep).setBlockName("Nut!");
	public static final Block KonungWhiteRoot = new BlockKonungAlchemyWhiteRoot(162, ModLoader.addOverride("/terrain.png", "/textures/konung/itemroot.png")).setStepSound(Block.soundGrassFootstep).setBlockName("WhiteRoot!");
	
	public static final Item KonungHealingPotion02 = new ItemFood(163, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.2F).setAlwaysEdible().setItemName("Heal!");
	public static final Item KonungHealingPotion04 = new ItemFood(163, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.4F).setAlwaysEdible().setItemName("Heal!");
	public static final Item KonungHealingPotion06 = new ItemFood(163, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.6F).setAlwaysEdible().setItemName("Heal!");
	public static final Item KonungHealingPotion08 = new ItemFood(163, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.8F).setAlwaysEdible().setItemName("Heal!");
	public static final Item KonungHealingPotion10 = new ItemFood(163, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 1.0F).setAlwaysEdible().setItemName("Heal!");
	
	public mod_konungAlchemy()
	{
		//Plants
		
		ModLoader.registerBlock(KonungNut);
		ModLoader.registerBlock(KonungWhiteRoot);
				
		ModLoader.addName(KonungNut, "Nut");
		ModLoader.addName(KonungWhiteRoot, "White root");
				
		KonungNut.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/nut.png");
		KonungWhiteRoot.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/root.png");
		
		//Bottles
		
		ModLoader.addName(KonungHealingPotion02, "Healing Bottle");
		ModLoader.addName(KonungHealingPotion04, "Healing Bottle");
		ModLoader.addName(KonungHealingPotion06, "Healing Bottle");
		ModLoader.addName(KonungHealingPotion08, "Healing Bottle");
		ModLoader.addName(KonungHealingPotion10, "Healing Bottle");
		
		KonungHealingPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potionheal02.png");
		KonungHealingPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potionheal04.png");
		KonungHealingPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potionheal06.png");
		KonungHealingPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potionheal08.png");
		KonungHealingPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potionheal10.png");
				
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungWhiteRoot, Character.valueOf('#'), Item.potion});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), Item.potion, Character.valueOf('#'), KonungWhiteRoot});
		
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungWhiteRoot});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungWhiteRoot, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungWhiteRoot});
		
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion08, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungWhiteRoot});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungWhiteRoot, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungWhiteRoot});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungWhiteRoot, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		
		
	}
	
	public void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
		for(int a = 0; a < 2; a++)
        {
             int Xcoord = chunkX + random.nextInt(16) + 8;
             int Ycoord = random.nextInt(8+100);
             int Zcoord = chunkZ + random.nextInt(16) + 8;
			(new WorldGenKonungSapling(KonungNut.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
			(new WorldGenKonungSapling(KonungWhiteRoot.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
	
	
	public void load(){};
	public String getVersion()
	{
		return "1.2.5";
	}
}
