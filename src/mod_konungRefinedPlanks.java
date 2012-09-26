package net.minecraft.src;

public class mod_konungRefinedPlanks extends BaseMod
{
	
	public static final Block refinedPlanks = (new KonungBlockRefinedPlanks(179)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("refinedPlanks");

	public static int oakRefinedPlanksTexture;
	public static int spruceRefinedPlanksTexture;
	public static int birchRefinedPlanksTexture;
	public static int jungleRefinedPlanksTexture;
	
	public mod_konungRefinedPlanks()
	{
		ModLoader.registerBlock(refinedPlanks);
				
		oakRefinedPlanksTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/Planks_oak.png");
		spruceRefinedPlanksTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/Planks_spruce.png");
		birchRefinedPlanksTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/Planks_birch.png");
		jungleRefinedPlanksTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/Planks_jungle.png");
		
    	//ModLoader.addName(new ItemStack(refinedPlanks,0), "Refined Oak Planks");
    	//ModLoader.addName(new ItemStack(refinedPlanks,1), "Refined Spruce Planks");
    	//ModLoader.addName(new ItemStack(refinedPlanks,2), "Refined Birch Planks");
    	//ModLoader.addName(new ItemStack(refinedPlanks,3), "Refined Jungle Planks");
		
		ModLoader.addRecipe(new ItemStack(refinedPlanks, 4, 0), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungRefinedWood.refinedWood, 1, 0)});
		ModLoader.addRecipe(new ItemStack(refinedPlanks, 4, 1), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungRefinedWood.refinedWood, 1, 1)});
		ModLoader.addRecipe(new ItemStack(refinedPlanks, 4, 2), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungRefinedWood.refinedWood, 1, 2)});
		ModLoader.addRecipe(new ItemStack(refinedPlanks, 4, 3), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungRefinedWood.refinedWood, 1, 3)});

		Item.itemsList[refinedPlanks.blockID] = (new ItemTree(refinedPlanks.blockID - 256, refinedPlanks)).setItemName("refinedPlanks");
	}
	

	
	public void load(){};
	public String getVersion(){return "1.3.1";}
}
