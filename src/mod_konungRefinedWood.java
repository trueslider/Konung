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
		
		topRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/RefinedWood_top.png");
    	oakRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/RefinedWood_oak.png");
    	spruceRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/RefinedWood_spruce.png");
    	birchRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/RefinedWood_birch.png");
    	jungleRefinedWoodTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/RefinedWood_jungle.png");
    	
    	//ModLoader.addName(new ItemStack(refinedWood,0), "Refined Oak Wood");
    	//ModLoader.addName(new ItemStack(refinedWood,1), "Refined Spruce Wood");
    	//ModLoader.addName(new ItemStack(refinedWood,2), "Refined Birch Wood");
    	//ModLoader.addName(new ItemStack(refinedWood,3), "Refined Jungle Wood");
					
		ModLoader.addRecipe(new ItemStack(refinedWood, 3, 0), new Object[]{ "X","X","X",Character.valueOf('X'), new ItemStack(Block.wood, 1, 0)});
		ModLoader.addRecipe(new ItemStack(refinedWood, 3, 1), new Object[]{ "X","X","X",Character.valueOf('X'), new ItemStack(Block.wood, 1, 1)});
		ModLoader.addRecipe(new ItemStack(refinedWood, 3, 2), new Object[]{ "X","X","X",Character.valueOf('X'), new ItemStack(Block.wood, 1, 2)});
		ModLoader.addRecipe(new ItemStack(refinedWood, 3, 3), new Object[]{ "X","X","X",Character.valueOf('X'), new ItemStack(Block.wood, 1, 3)});
		
		Item.itemsList[refinedWood.blockID] = (new ItemTree(refinedWood.blockID - 256, refinedWood)).setItemName("refinedWood");
						
}
	
	public void load(){};
	public String getVersion(){return "1.3.2";}
	
}
