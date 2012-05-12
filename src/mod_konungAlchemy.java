package net.minecraft.src;
import net.minecraft.src.Konung.*;
import java.util.Random;

public class mod_konungAlchemy extends BaseMod
{

	public static final Block KonungNut = new BlockKonungAlchemyNut(161, ModLoader.addOverride("/terrain.png", "/textures/konung/itemnut.png")).setStepSound(Block.soundGrassFootstep).setBlockName("Nut!");
	public static final Block KonungWhiteRoot = new BlockKonungAlchemyWhiteRoot(162, ModLoader.addOverride("/terrain.png", "/textures/konung/itemroot.png")).setStepSound(Block.soundGrassFootstep).setBlockName("WhiteRoot!");
	
	public static final Item KonungHealingPotion02 = new ItemFood(161, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.2F).setAlwaysEdible().setItemName("Heal1!");
	public static final Item KonungHealingPotion04 = new ItemFood(162, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.4F).setAlwaysEdible().setItemName("Heal2!");
	public static final Item KonungHealingPotion06 = new ItemFood(163, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.6F).setAlwaysEdible().setItemName("Heal3!");
	public static final Item KonungHealingPotion08 = new ItemFood(164, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.8F).setAlwaysEdible().setItemName("Heal4!");
	public static final Item KonungHealingPotion10 = new ItemFood(165, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 1.0F).setAlwaysEdible().setItemName("Heal5!");
	
	public static final Item KonungOilPotion02 = new ItemFood(166, -4, 1F, false).setAlwaysEdible().setItemName("Oil1!");
	public static final Item KonungOilPotion04 = new ItemFood(167, -4, 1F, false).setAlwaysEdible().setItemName("Oil2!");
	public static final Item KonungOilPotion06 = new ItemFood(168, -4, 1F, false).setAlwaysEdible().setItemName("Oil3!");
	public static final Item KonungOilPotion08 = new ItemFood(169, -4, 1F, false).setAlwaysEdible().setItemName("Oil4!");
	public static final Item KonungOilPotion10 = new ItemFood(170, -4, 1F, false).setAlwaysEdible().setItemName("Oil5!");
	
	public static final Item KonungBragaPotion02 = new ItemFood(171, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 0.2F).setAlwaysEdible().setItemName("Braga1!");
	public static final Item KonungBragaPotion04 = new ItemFood(172, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 0.4F).setAlwaysEdible().setItemName("Braga2!");
	public static final Item KonungBragaPotion06 = new ItemFood(173, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 0.6F).setAlwaysEdible().setItemName("Braga3!");
	public static final Item KonungBragaPotion08 = new ItemFood(174, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 0.8F).setAlwaysEdible().setItemName("Braga4!");
	public static final Item KonungBragaPotion10 = new ItemFood(175, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 1.0F).setAlwaysEdible().setItemName("Braga5!");
	
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
		
		ModLoader.addName(KonungHealingPotion02, "Balsam - Concentration 1");
		ModLoader.addName(KonungHealingPotion04, "Balsam - Concentration 2");
		ModLoader.addName(KonungHealingPotion06, "Balsam - Concentration 3");
		ModLoader.addName(KonungHealingPotion08, "Balsam - Concentration 4");
		ModLoader.addName(KonungHealingPotion10, "Balsam - Concentration 5");
		
		ModLoader.addName(KonungOilPotion02, "Oil - Concentration 1");
		ModLoader.addName(KonungOilPotion04, "Oil - Concentration 2");
		ModLoader.addName(KonungOilPotion06, "Oil - Concentration 3");
		ModLoader.addName(KonungOilPotion08, "Oil - Concentration 4");
		ModLoader.addName(KonungOilPotion10, "Oil - Concentration 5");
		
		ModLoader.addName(KonungBragaPotion02, "Braga - Concentration 1");
		ModLoader.addName(KonungBragaPotion04, "Braga - Concentration 2");
		ModLoader.addName(KonungBragaPotion06, "Braga - Concentration 3");
		ModLoader.addName(KonungBragaPotion08, "Braga - Concentration 4");
		ModLoader.addName(KonungBragaPotion10, "Braga - Concentration 5");
		
		
		KonungHealingPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionheal02.png");
		KonungHealingPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionheal04.png");
		KonungHealingPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionheal06.png");
		KonungHealingPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionheal08.png");
		KonungHealingPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionheal10.png");
		
		KonungOilPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionoil02.png");
		KonungOilPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionoil04.png");
		KonungOilPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionoil06.png");
		KonungOilPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionoil08.png");
		KonungOilPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionoil10.png");
		
		KonungBragaPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionbraga02.png");
		KonungBragaPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionbraga04.png");
		KonungBragaPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionbraga06.png");
		KonungBragaPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionbraga08.png");
		KonungBragaPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potionbraga10.png");
		
		//Healing Recipe
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungWhiteRoot, Character.valueOf('#'), Item.potion});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), Item.potion, Character.valueOf('#'), KonungWhiteRoot});
		
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungWhiteRoot});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungWhiteRoot, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungWhiteRoot});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungWhiteRoot, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		
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
		
		//Oil Recipe
		ModLoader.addRecipe(new ItemStack(KonungOilPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungNut, Character.valueOf('#'), Item.potion});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), Item.potion, Character.valueOf('#'), KonungNut});
		
		ModLoader.addRecipe(new ItemStack(KonungOilPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungNut});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungNut, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		
		ModLoader.addRecipe(new ItemStack(KonungOilPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungNut});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungNut, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		
		ModLoader.addRecipe(new ItemStack(KonungOilPotion08, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungNut});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungNut, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		
		ModLoader.addRecipe(new ItemStack(KonungOilPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungNut});
		ModLoader.addRecipe(new ItemStack(KonungOilPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungNut, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		
		//Braga Recipe 0.2
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});

		//Braga Recipe 0.4
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02});
		
		//Braga Recipe 0.6
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		
		//Braga Recipe 0.8
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion08, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04});
		
		//Braga Recipe 1.0
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});

		ModLoader.addRecipe(new ItemStack(KonungBragaPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungBragaPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		
		
	}
	
	public void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
		for(int a = 0; a < 5; a++)
        {
             int Xcoord = chunkX + random.nextInt(16) + 8;
             int Ycoord = random.nextInt(8+100);
             int Zcoord = chunkZ + random.nextInt(16) + 8;
			(new WorldGenKonungSapling(KonungNut.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
			(new WorldGenKonungSapling(KonungWhiteRoot.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
	
	
	public void load(){};
	public String getVersion(){return "1.2.5";}
}
