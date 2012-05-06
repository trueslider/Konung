package net.minecraft.src;
import java.util.Random;

public class mod_konung extends BaseMod
{
	//Blocks
	public static final Block WoodH = new BlockWoodH(181,0).setHardness(2.0F).setBlockName("WoodH!");
	
	//Items
	public static final Item KonungKnife = new ItemKonungKnife(500).setItemName("Knife!");
	public static final Item KonunGladius = new ItemKonungGladius(501).setItemName("Gladius!");
	public static final Item KonungSpata = new ItemKonungSpata(502).setItemName("Spata!");
	public static final Item KonungLongSword = new ItemKonungLongSword(503).setItemName("LongSword!");
	
	public static int woodHBark_V;
	public static int woodHBark_H;
	public static int woodHCut;
	
	public mod_konung()
	{
		//Register
		ModLoader.registerBlock(WoodH);
		
		//Name
		ModLoader.addName(WoodH, "Horizontal Wood");
		ModLoader.addName(KonungKnife, "Knife");
		ModLoader.addName(KonunGladius, "Gladius");
		ModLoader.addName(KonungSpata, "Spata");
		ModLoader.addName(KonungLongSword, "Long Sword");
		
		//Texture
		woodHBark_V = ModLoader.addOverride("/terrain.png", "/woodHBark_V.png");
		woodHBark_H = ModLoader.addOverride("/terrain.png", "/woodHBark_H.png");
		woodHCut = ModLoader.addOverride("/terrain.png", "/woodHCut.png");
		KonungKnife.iconIndex = ModLoader.addOverride("/gui/items.png", "/knife.png");
		KonunGladius.iconIndex = ModLoader.addOverride("/gui/items.png", "/gladius.png");
		KonungSpata.iconIndex = ModLoader.addOverride("/gui/items.png", "/spata.png");
		KonungLongSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/longsword.png");
		
		//Recipe
		ModLoader.addRecipe(new ItemStack(WoodH, 1), new Object[]
				{
					"#", "#", "#", Character.valueOf('#'), Block.wood
				});
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
