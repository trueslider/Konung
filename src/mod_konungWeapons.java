package net.minecraft.src;
import java.util.Random;

public class mod_konungWeapons extends BaseMod
{

	//Итемы
	public static final Item KonungKnife = new ItemKonungKnife(500).setItemName("Knife!");
	public static final Item KonunGladius = new ItemKonungGladius(501).setItemName("Gladius!");
	public static final Item KonungSpata = new ItemKonungSpata(502).setItemName("Spata!");
	public static final Item KonungLongSword = new ItemKonungLongSword(503).setItemName("LongSword!");
	
	public mod_konungWeapons()
	{
	
		//Имя
		ModLoader.addName(KonungKnife, "Knife");
		ModLoader.addName(KonunGladius, "Gladius");
		ModLoader.addName(KonungSpata, "Spata");
		ModLoader.addName(KonungLongSword, "Long Sword");
		
		//Текстура
		KonungKnife.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/iconknife.png");
		KonunGladius.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/icongladius.png");
		KonungSpata.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/iconspata.png");
		KonungLongSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/textures/konung/iconlongsword.png");
		
		//Рецепт
		ModLoader.addRecipe(new ItemStack(KonungKnife, 1), new Object[]
				{
					"#  ", " # ", "  X", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), Item.stick
				});
		ModLoader.addRecipe(new ItemStack(KonunGladius, 1), new Object[]
				{
					"## ", "## ", "  X", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), Item.stick
				});
		ModLoader.addRecipe(new ItemStack(KonungSpata, 1), new Object[]
				{
					"#  ", " # ", "  X", Character.valueOf('#'), Item.ingotGold, Character.valueOf('X'), Item.stick
				});
		ModLoader.addRecipe(new ItemStack(KonunGladius, 1), new Object[]
				{
					"## ", "## ", "  X", Character.valueOf('#'), Item.ingotGold, Character.valueOf('X'), Item.stick
				});
		
		
	}
	
	

	
	public void load(){};
	public String getVersion()
	{
		return "1.2.5";
	}
}
