package net.minecraft.src;

import java.util.Random;

public class mod_konungAlchemy extends BaseMod
{

	public static final Block KonungNut = new KonungBlockAlchemyNut(150, ModLoader.addOverride("/terrain.png", "/textures/konung/itemnut.png")).setStepSound(Block.soundGrassFootstep).setBlockName("Nut!");
	public static final Block KonungWhiteRoot = new KonungBlockAlchemyWhiteRoot(151, ModLoader.addOverride("/terrain.png", "/textures/konung/itemroot.png")).setStepSound(Block.soundGrassFootstep).setBlockName("WhiteRoot!");
	
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
	
	public static final Item KonungBragaPotion02 = new ItemFood(4010, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 3, 0.2F).setAlwaysEdible().setItemName("Braga1!");
	public static final Item KonungBragaPotion04 = new ItemFood(4011, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 3, 0.4F).setAlwaysEdible().setItemName("Braga2!");
	public static final Item KonungBragaPotion06 = new ItemFood(4012, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 3, 0.6F).setAlwaysEdible().setItemName("Braga3!");
	public static final Item KonungBragaPotion08 = new ItemFood(4013, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 3, 0.8F).setAlwaysEdible().setItemName("Braga4!");
	public static final Item KonungBragaPotion10 = new ItemFood(4014, 0, 1F, false).setPotionEffect(Potion.damageBoost.id, 60, 3, 1.0F).setAlwaysEdible().setItemName("Braga5!");
	
	public static final Item KonungPoisonPotion02 = new ItemFood(4015, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 0.2F).setAlwaysEdible().setItemName("Poison1!");
	public static final Item KonungPoisonPotion04 = new ItemFood(4016, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 0.4F).setAlwaysEdible().setItemName("Poison2!");
	public static final Item KonungPoisonPotion06 = new ItemFood(4017, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 0.6F).setAlwaysEdible().setItemName("Poison3!");
	public static final Item KonungPoisonPotion08 = new ItemFood(4018, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 0.8F).setAlwaysEdible().setItemName("Poison4!");
	public static final Item KonungPoisonPotion10 = new ItemFood(4019, 0, 1F, false).setPotionEffect(Potion.harm.id, 1, 0, 1.0F).setAlwaysEdible().setItemName("Poison5!");
	
	public static final Item KonungPotionPotion02 = new ItemFood(4020, 0, 1F, false).setPotionEffect(Potion.jump.id, 360, 3, 0.2F).setPotionEffect(Potion.moveSpeed.id, 120, 1, 0.2F).setAlwaysEdible().setItemName("Potion1!");
	public static final Item KonungPotionPotion04 = new ItemFood(4021, 0, 1F, false).setPotionEffect(Potion.jump.id, 360, 3, 0.4F).setPotionEffect(Potion.moveSpeed.id, 120, 1, 0.4F).setAlwaysEdible().setItemName("Potion2!");
	public static final Item KonungPotionPotion06 = new ItemFood(4022, 0, 1F, false).setPotionEffect(Potion.jump.id, 360, 3, 0.6F).setPotionEffect(Potion.moveSpeed.id, 120, 1, 0.6F).setAlwaysEdible().setItemName("Potion3!");
	public static final Item KonungPotionPotion08 = new ItemFood(4023, 0, 1F, false).setPotionEffect(Potion.jump.id, 360, 3, 0.8F).setPotionEffect(Potion.moveSpeed.id, 120, 1, 0.8F).setAlwaysEdible().setItemName("Potion4!");
	public static final Item KonungPotionPotion10 = new ItemFood(4024, 0, 1F, false).setPotionEffect(Potion.jump.id, 360, 3, 1.0F).setPotionEffect(Potion.moveSpeed.id, 120, 1, 1.0F).setAlwaysEdible().setItemName("Potion5!");
	
	public static final Item KonungAntidotePotion02 = new KonungItemAntidotePotion(4025).setItemName("Antidote1!");
	public static final Item KonungAntidotePotion04 = new KonungItemAntidotePotion(4026).setItemName("Antidote2!");
	public static final Item KonungAntidotePotion06 = new KonungItemAntidotePotion(4027).setItemName("Antidote3!");
	public static final Item KonungAntidotePotion08 = new KonungItemAntidotePotion(4028).setItemName("Antidote4!");
	public static final Item KonungAntidotePotion10 = new KonungItemAntidotePotion(4029).setItemName("Antidote5!");
	
	public static final Item KonungPureTearPotion02 = new ItemFood(4030, 0, 1F, false).setPotionEffect(Potion.digSpeed.id, 360, 10, 0.2F).setAlwaysEdible().setItemName("PureTear1!");
	public static final Item KonungPureTearPotion04 = new ItemFood(4031, 0, 1F, false).setPotionEffect(Potion.digSpeed.id, 360, 10, 0.4F).setAlwaysEdible().setItemName("PureTear2!");
	public static final Item KonungPureTearPotion06 = new ItemFood(4032, 0, 1F, false).setPotionEffect(Potion.digSpeed.id, 360, 10, 0.6F).setAlwaysEdible().setItemName("PureTear3!");
	public static final Item KonungPureTearPotion08 = new ItemFood(4033, 0, 1F, false).setPotionEffect(Potion.digSpeed.id, 360, 10, 0.8F).setAlwaysEdible().setItemName("PureTear4!");
	public static final Item KonungPureTearPotion10 = new ItemFood(4034, 0, 1F, false).setPotionEffect(Potion.digSpeed.id, 360, 10, 1.0F).setAlwaysEdible().setItemName("PureTear5!");
	
	public static final Item KonungElixirOfWisdomPotion02 = new KonungItemElixirOfWisdom(4035).setItemName("ElixirOfWisdom1!");
	public static final Item KonungElixirOfWisdomPotion04 = new KonungItemElixirOfWisdom(4035).setItemName("ElixirOfWisdom2!");
	public static final Item KonungElixirOfWisdomPotion06 = new KonungItemElixirOfWisdom(4035).setItemName("ElixirOfWisdom3!");
	public static final Item KonungElixirOfWisdomPotion08 = new KonungItemElixirOfWisdom(4035).setItemName("ElixirOfWisdom4!");
	public static final Item KonungElixirOfWisdomPotion10 = new KonungItemElixirOfWisdom(4035).setItemName("ElixirOfWisdom5!");
	
	public static final Item KonungLiveWaterPotion02 = new ItemFood(4040, 0, 1F, false).setPotionEffect(Potion.fireResistance.id, 60, 3, 0.2F).setAlwaysEdible().setItemName("LiveWater1!");
	public static final Item KonungLiveWaterPotion04 = new ItemFood(4041, 0, 1F, false).setPotionEffect(Potion.fireResistance.id, 60, 3, 0.4F).setAlwaysEdible().setItemName("LiveWater2!");
	public static final Item KonungLiveWaterPotion06 = new ItemFood(4042, 0, 1F, false).setPotionEffect(Potion.fireResistance.id, 60, 3, 0.6F).setAlwaysEdible().setItemName("LiveWater3!");
	public static final Item KonungLiveWaterPotion08 = new ItemFood(4043, 0, 1F, false).setPotionEffect(Potion.fireResistance.id, 60, 3, 0.8F).setAlwaysEdible().setItemName("LiveWater4!");
	public static final Item KonungLiveWaterPotion10 = new ItemFood(4044, 0, 1F, false).setPotionEffect(Potion.fireResistance.id, 60, 3, 1.0F).setAlwaysEdible().setItemName("LiveWater5!");
	
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
		
		ModLoader.addName(KonungPotionPotion02, "Potion - Concentration 1");
		ModLoader.addName(KonungPotionPotion04, "Potion - Concentration 2");
		ModLoader.addName(KonungPotionPotion06, "Potion - Concentration 3");
		ModLoader.addName(KonungPotionPotion08, "Potion - Concentration 4");
		ModLoader.addName(KonungPotionPotion10, "Potion - Concentration 5");
		
		ModLoader.addName(KonungAntidotePotion02, "Antidote - Concentration 1");
		ModLoader.addName(KonungAntidotePotion04, "Antidote - Concentration 2");
		ModLoader.addName(KonungAntidotePotion06, "Antidote - Concentration 3");
		ModLoader.addName(KonungAntidotePotion08, "Antidote - Concentration 4");
		ModLoader.addName(KonungAntidotePotion10, "Antidote - Concentration 5");
		
		ModLoader.addName(KonungPureTearPotion02, "Pure Tear - Concentration 1");
		ModLoader.addName(KonungPureTearPotion04, "Pure Tear - Concentration 2");
		ModLoader.addName(KonungPureTearPotion06, "Pure Tear - Concentration 3");
		ModLoader.addName(KonungPureTearPotion08, "Pure Tear - Concentration 4");
		ModLoader.addName(KonungPureTearPotion10, "Pure Tear - Concentration 5");
		
		ModLoader.addName(KonungElixirOfWisdomPotion02, "Elixir of Wisdom - Concentration 1");
		ModLoader.addName(KonungElixirOfWisdomPotion04, "Elixir of Wisdom - Concentration 2");
		ModLoader.addName(KonungElixirOfWisdomPotion06, "Elixir of Wisdom - Concentration 3");
		ModLoader.addName(KonungElixirOfWisdomPotion08, "Elixir of Wisdom - Concentration 4");
		ModLoader.addName(KonungElixirOfWisdomPotion10, "Elixir of Wisdom - Concentration 5");
		
		ModLoader.addName(KonungLiveWaterPotion02, "Live Water - Concentration 1");
		ModLoader.addName(KonungLiveWaterPotion04, "Live Water - Concentration 2");
		ModLoader.addName(KonungLiveWaterPotion06, "Live Water - Concentration 3");
		ModLoader.addName(KonungLiveWaterPotion08, "Live Water - Concentration 4");
		ModLoader.addName(KonungLiveWaterPotion10, "Live Water - Concentration 5");
		
		
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
		
		KonungPotionPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_potion_02.png");
		KonungPotionPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_potion_04.png");
		KonungPotionPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_potion_06.png");
		KonungPotionPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_potion_08.png");
		KonungPotionPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_potion_10.png");
		
		KonungAntidotePotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_antidote_02.png");
		KonungAntidotePotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_antidote_04.png");
		KonungAntidotePotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_antidote_06.png");
		KonungAntidotePotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_antidote_08.png");
		KonungAntidotePotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_antidote_10.png");
		
		KonungPureTearPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_pure_tear_02.png");
		KonungPureTearPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_pure_tear_04.png");
		KonungPureTearPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_pure_tear_06.png");
		KonungPureTearPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_pure_tear_08.png");
		KonungPureTearPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_pure_tear_10.png");
		
		KonungElixirOfWisdomPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_elixir_of_wisdom_02.png");
		KonungElixirOfWisdomPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_elixir_of_wisdom_04.png");
		KonungElixirOfWisdomPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_elixir_of_wisdom_06.png");
		KonungElixirOfWisdomPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_elixir_of_wisdom_08.png");
		KonungElixirOfWisdomPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_elixir_of_wisdom_10.png");
		
		KonungLiveWaterPotion02.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_live_water_02.png");
		KonungLiveWaterPotion04.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_live_water_04.png");
		KonungLiveWaterPotion06.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_live_water_06.png");
		KonungLiveWaterPotion08.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_live_water_08.png");
		KonungLiveWaterPotion10.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/potions/potion_live_water_10.png");
		
		
		//Healing Recipe
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungWhiteRoot, Character.valueOf('#'), Item.potion});
		ModLoader.addRecipe(new ItemStack(KonungHealingPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), Item.potion, Character.valueOf('#'), mod_konungAlchemy.KonungWhiteRoot});
		
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
		ModLoader.addRecipe(new ItemStack(KonungOilPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), Item.potion, Character.valueOf('#'), mod_konungAlchemy.KonungNut});
		
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
		
		
		//Potion Recipe 0.2
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});

		//Potion Recipe 0.4
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion02});
		
		//Potion Recipe 0.6
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPotionPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPotionPotion04});
		
		//Potion Recipe 0.8
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPotionPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPotionPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion08, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion04});
		
		//Potion Recipe 1.0
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});

		ModLoader.addRecipe(new ItemStack(KonungPotionPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPotionPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPotionPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPotionPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPotionPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPotionPotion02});
		
		//Antidote Recipe 0.2
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});

		//Antidote Recipe 0.4
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		
		ModLoader.addRecipe(new ItemStack(KonungPotionPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02});
		
		//Antidote Recipe 0.6
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion04, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion04});
		
		//Antidote Recipe 0.8
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion06, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion02});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion08, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion04});
		
		//Antidote Recipe 1.0
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungHealingPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungHealingPotion10});

		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion08});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion04, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion06});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion06, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion04});
		ModLoader.addRecipe(new ItemStack(KonungAntidotePotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion08, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion02});
		
		//Pure Tear Recipe 0.2
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});

		//Pure Tear Recipe 0.4
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion02});
		
		//Pure Tear Recipe 0.6
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPureTearPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPureTearPotion04});
		
		//Pure Tear Recipe 0.8
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPureTearPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPureTearPotion02});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion08, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion04});
		
		//Pure Tear Recipe 1.0
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});

		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPureTearPotion08});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPureTearPotion06});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPureTearPotion04});
		ModLoader.addRecipe(new ItemStack(KonungPureTearPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPureTearPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPureTearPotion02});
		
		//Elixir of Wisdom 0.2
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion02});

		//Elixir of Wisdom 0.4
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion04});
		
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion02});
		
		//Elixir of Wisdom 0.6
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion06});
		
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungElixirOfWisdomPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungElixirOfWisdomPotion04});
		
		//Elixir of Wisdom Recipe 0.8
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion08});
		
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungElixirOfWisdomPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungElixirOfWisdomPotion02});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion08, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion04});
		
		//Elixir of Wisdom Recipe 1.0
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungBragaPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungPoisonPotion10});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungPoisonPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungBragaPotion10});

		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungElixirOfWisdomPotion08});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungElixirOfWisdomPotion06});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungElixirOfWisdomPotion04});
		ModLoader.addRecipe(new ItemStack(KonungElixirOfWisdomPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungElixirOfWisdomPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungElixirOfWisdomPotion02});
		
		//Live Water Recipe 0.2
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion10});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion02, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion02, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion02});

		//Live Water Recipe 0.4
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion10});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion04, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion04});
		
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion04, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion02});
		
		//Live Water Recipe 0.6
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion10});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion06, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion06});
		
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungLiveWaterPotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion06, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungLiveWaterPotion04});
		
		//Live Water Recipe 0.8
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion10});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});
		
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion08, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion08});
		
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungLiveWaterPotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungLiveWaterPotion02});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion08, 1), new Object[]{"X", "X", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion04});
		
		//Live Water Recipe 1.0
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungOilPotion10, Character.valueOf('#'), mod_konungAlchemy.KonungAntidotePotion10});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungAntidotePotion10, Character.valueOf('#'), mod_konungAlchemy.KonungOilPotion10});

		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion02, Character.valueOf('#'), mod_konungAlchemy.KonungLiveWaterPotion08});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion04, Character.valueOf('#'), mod_konungAlchemy.KonungLiveWaterPotion06});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion06, Character.valueOf('#'), mod_konungAlchemy.KonungLiveWaterPotion04});
		ModLoader.addRecipe(new ItemStack(KonungLiveWaterPotion10, 1), new Object[]{"X", "#", Character.valueOf('X'), mod_konungAlchemy.KonungLiveWaterPotion08, Character.valueOf('#'), mod_konungAlchemy.KonungLiveWaterPotion02});
		
	}
	
	public void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
		for(int a = 0; a < 5; a++)
        {
             int Xcoord = chunkX + random.nextInt(16) + 8;
             int Ycoord = random.nextInt(8+100);
             int Zcoord = chunkZ + random.nextInt(16) + 8;
			(new KonungWorldGenAlchemy(KonungNut.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
			(new KonungWorldGenAlchemy(KonungWhiteRoot.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
	}
	
	
	public void load(){};
	public String getVersion(){return "1.4.7";}
}
