package net.minecraft.src;

public class mod_konungRefinedWood extends BaseMod
{

	public static final Block refinedWood = (new KonungBlockRefinedWood(178)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("refinedWood");
	
	public static int topRefinedWoodTexture;
	public static int oakRefinedWoodTexture;
	public static int spruceRefinedWoodTexture;
	public static int birchRefinedWoodTexture;
	public static int jungleRefinedWoodTexture;
	
	
	public mod_konungRefinedWood()
	{
		ModLoader.registerBlock(refinedWood);
		ModLoader.registerBlock(refinedWood, net.minecraft.src.KonungBlockRefinedWood.class);
		
		topRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/topRefinedWood.png");
    	oakRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/oakRefinedWood.png");
    	spruceRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/spruceRefinedWood.png");
    	birchRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/birchRefinedWood.png");
    	jungleRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/jungleRefinedWood.png");
    	
    	ModLoader.addName(new ItemStack(refinedWood,1,0), "Refined Oak Wood");
    	ModLoader.addName(new ItemStack(refinedWood,1,1), "Refined Spruce Wood");
    	ModLoader.addName(new ItemStack(refinedWood,1,2), "Refined Birch Wood");
    	ModLoader.addName(new ItemStack(refinedWood,1,3), "Refined Jungle Wood");
		
		//ModLoader.addName(refinedWood, "Refined Wood");
		//ModLoader.addName(refinedWood, "ru_RU", "Очищенная дубовая древесина");
		//ModLoader.addName(refinedWood, "Spruce Refined Wood");
		//ModLoader.addName(refinedWood, "ru_RU", "Очищенная еловая древесина");
		//ModLoader.addName(birchRefinedWood, "Birch Refined Wood");
		//ModLoader.addName(birchRefinedWood, "ru_RU", "Очищенная березовая древесина");
		//ModLoader.addName(jungleRefinedWood, "Jungle Refined Wood");
		//ModLoader.addName(jungleRefinedWood, "ru_RU", "Очищенная древесина тропического дерева");
			
		ModLoader.addRecipe(new ItemStack(refinedWood, 3, 0), new Object[]{ "X","X","X",Character.valueOf('X'), new ItemStack(Block.wood, 1, 0)});
		ModLoader.addRecipe(new ItemStack(refinedWood, 3, 1), new Object[]{ "X","X","X",Character.valueOf('X'), new ItemStack(Block.wood, 1, 1)});
		ModLoader.addRecipe(new ItemStack(refinedWood, 3, 2), new Object[]{ "X","X","X",Character.valueOf('X'), new ItemStack(Block.wood, 1, 2)});
		ModLoader.addRecipe(new ItemStack(refinedWood, 3, 3), new Object[]{ "X","X","X",Character.valueOf('X'), new ItemStack(Block.wood, 1, 3)});
		
		Item.itemsList[refinedWood.blockID] = (new ItemTree(refinedWood.blockID - 256, refinedWood)).setItemName("refinedWood");
		

}
	
	
	
	
	public void load(){};
	public String getVersion(){return "1.3.1";}
	
}
