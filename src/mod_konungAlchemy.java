package net.minecraft.src;
import net.minecraft.src.Konung.*;
import java.util.Random;

public class mod_konungAlchemy extends BaseMod
{

	public static final Block KonungNut = new BlockKonungAlchemyNut(130, ModLoader.addOverride("/terrain.png", "/textures/konung/itemnut.png")).setStepSound(Block.soundGrassFootstep).setBlockName("Nut!");
	public static final Block KonungWhiteRoot = new BlockKonungAlchemyWhiteRoot(131, ModLoader.addOverride("/terrain.png", "/textures/konung/itemroot.png")).setStepSound(Block.soundGrassFootstep).setBlockName("WhiteRoot!");
	
	public static final Item KonungHealingPotion02 = new ItemFood(4000, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.2F).setAlwaysEdible().setItemName("Heal1!");
	public static final Item KonungHealingPotion04 = new ItemFood(4001, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.4F).setAlwaysEdible().setItemName("Heal2!");
	public static final Item KonungHealingPotion06 = new ItemFood(4002, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.6F).setAlwaysEdible().setItemName("Heal3!");
	public static final Item KonungHealingPotion08 = new ItemFood(4003, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 0.8F).setAlwaysEdible().setItemName("Heal4!");
	public static final Item KonungHealingPotion10 = new ItemFood(4004, 0, 1F, false).setPotionEffect(Potion.heal.id, 10, 1, 1.0F).setAlwaysEdible().setItemName("Heal5!");
	
	public static final Item KonungOilPotion02 = new ItemFood(4005, -4, 1F, false).setAlwaysEdible().setItemName("Oil1!");
	public static final Item KonungOilPotion04 = new ItemFood(4006, -4, 1F, false).setAlwaysEdible().setItemName("Oil2!");
	public static final Item KonungOilPotion06 = new ItemFood(4007, -4, 1F, false).setAlwaysEdible().setItemName("Oil3!");
	public static final Item KonungOilPotion08 = new ItemFood(4008, -4, 1F, false).setAlwaysEdible().setItemName("Oil4!");
	public static final Item KonungOilPotion10 = new ItemFood(4009, -4, 1F, false).setAlwaysEdible().setItemName("Oil5!");
	
	public static final Item KonungBragaPotion02 = new ItemFood(4010, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 0.2F).setAlwaysEdible().setItemName("Braga1!");
	public static final Item KonungBragaPotion04 = new ItemFood(4011, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 0.4F).setAlwaysEdible().setItemName("Braga2!");
	public static final Item KonungBragaPotion06 = new ItemFood(4012, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 0.6F).setAlwaysEdible().setItemName("Braga3!");
	public static final Item KonungBragaPotion08 = new ItemFood(4013, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 0.8F).setAlwaysEdible().setItemName("Braga4!");
	public static final Item KonungBragaPotion10 = new ItemFood(4014, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 0, 1.0F).setAlwaysEdible().setItemName("Braga5!");
	
	public static final Item KonungPoisonPotion02 = new ItemFood(4015, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 0.2F).setAlwaysEdible().setItemName("Poison1!");
	public static final Item KonungPoisonPotion04 = new ItemFood(4016, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 0.4F).setAlwaysEdible().setItemName("Poison2!");
	public static final Item KonungPoisonPotion06 = new ItemFood(4017, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 0.6F).setAlwaysEdible().setItemName("Poison3!");
	public static final Item KonungPoisonPotion08 = new ItemFood(4018, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 0.8F).setAlwaysEdible().setItemName("Poison4!");
	public static final Item KonungPoisonPotion10 = new ItemFood(4019, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 1.0F).setAlwaysEdible().setItemName("Poison5!");
	
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
		
		ModLoader.addName(KonungPoisonPotion02, "Poison - Concentration 1");
		ModLoader.addName(KonungPoisonPotion04, "Poison - Concentration 2");
		ModLoader.addName(KonungPoisonPotion06, "Poison - Concentration 3");
		ModLoader.addName(KonungPoisonPotion08, "Poison - Concentration 4");
		ModLoader.addName(KonungPoisonPotion10, "Poison - Concentration 5");
		
		ModLoader.addName(KonungBragaPotion02, "Braga - Concentration 1");
		ModLoader.addName(KonungBragaPotion04, "Braga - Concentration 2");
		ModLoader.addName(KonungBragaPotion06, "Braga - Concentration 3");
		ModLoader.addName(KonungBragaPotion08, "Braga - Concentration 4");
		ModLoader.addName(KonungBragaPotion10, "Braga - Concentration 5");
		
		
		KonungHealingPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_heal_02.png");
		KonungHealingPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_heal_04.png");
		KonungHealingPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_heal_06.png");
		KonungHealingPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_heal_08.png");
		KonungHealingPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_heal_10.png");
		
		KonungOilPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_oil_02.png");
		KonungOilPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_oil_04.png");
		KonungOilPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_oil_06.png");
		KonungOilPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_oil_08.png");
		KonungOilPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_oil_10.png");
		
		KonungPoisonPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_poison_02.png");
		KonungPoisonPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_poison_04.png");
		KonungPoisonPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_poison_06.png");
		KonungPoisonPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_poison_08.png");
		KonungPoisonPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_poison_10.png");
		
		KonungBragaPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_braga_02.png");
		KonungBragaPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_braga_04.png");
		KonungBragaPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_braga_06.png");
		KonungBragaPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_braga_08.png");
		KonungBragaPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_braga_10.png");
		
		
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
		
		//Poison Recipe
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungMobs.KonungPoisonSting, Character.valueOf('#'), Item.potion});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), Item.potion, Character.valueOf('#'), mod_konungMobs.KonungPoisonSting});
		
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungMobs.KonungPoisonSting});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungMobs.KonungPoisonSting, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungMobs.KonungPoisonSting});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungMobs.KonungPoisonSting, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion08, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungMobs.KonungPoisonSting});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungMobs.KonungPoisonSting, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungMobs.KonungPoisonSting});
		ModLoader.addRecipe(new ItemStack(KonungPoisonPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungMobs.KonungPoisonSting, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		
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
			(new WorldGenKonungAlchemy(KonungNut.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
			(new WorldGenKonungAlchemy(KonungWhiteRoot.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
	
	
	public void load(){};
	public String getVersion(){return "1.2.5";}
}
