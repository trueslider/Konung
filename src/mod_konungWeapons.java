package net.minecraft.src;

import java.util.Random;

public class mod_konungWeapons extends BaseMod
{

	//Items
	public static final Item KonungKnife = new ItemSword(4101, EnumToolMaterial.WOOD).setItemName("Knife!");
	public static final Item KonunGladius = new ItemSword(4102, EnumToolMaterial.STONE).setItemName("Gladius!");
	public static final Item KonungSpata = new ItemSword(4103, EnumToolMaterial.IRON).setItemName("Spata!");
	public static final Item KonungLongSword = new ItemSword(4104, EnumToolMaterial.EMERALD).setItemName("LongSword!");
	
	public mod_konungWeapons()
	{
	
		//Names
		ModLoader.addName(KonungKnife, "Knife");
		ModLoader.addName(KonunGladius, "Gladius");
		ModLoader.addName(KonungSpata, "Spata");
		ModLoader.addName(KonungLongSword, "Long Sword");
		
		//Textures
		KonungKnife.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconknife.png");
		KonunGladius.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/icongladius.png");
		KonungSpata.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconspata.png");
		KonungLongSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icon/iconlongsword.png");
		
		//Recipes
		ModLoader.addRecipe(new ItemStack(KonungKnife, 1), new Object[]
				{
					"# ", " X", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), Item.stick
				});
		ModLoader.addRecipe(new ItemStack(KonunGladius, 1), new Object[]
				{
					"#  ", " # ", "  X", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), Item.stick
				});
		ModLoader.addRecipe(new ItemStack(KonungSpata, 1), new Object[]
				{
					"## ", "## ", "  X", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), Item.stick
				});
		ModLoader.addRecipe(new ItemStack(KonunGladius, 1), new Object[]
				{
					"###", "###", "  X", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), Item.stick
				});
		
		
	}
	
	
	public void load(){};
	public String getVersion(){return "1.4.7";}
}
