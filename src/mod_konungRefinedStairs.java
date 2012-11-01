package net.minecraft.src;

public class mod_konungRefinedStairs extends BaseMod
{	
	
	public static final Block refinedStairs = (new KonungBlockRefinedStairs(180, mod_konungRefinedPlanks.refinedPlanks, 0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("refinedStairs");
	public static final Block spruceRefinedStairs = (new KonungBlockRefinedStairs(181, mod_konungRefinedPlanks.refinedPlanks, 1)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("refinedStairs");
	public static final Block birchRefinedStairs = (new KonungBlockRefinedStairs(182, mod_konungRefinedPlanks.refinedPlanks, 2)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("refinedStairs");
	public static final Block jungleRefinedStairs = (new KonungBlockRefinedStairs(183, mod_konungRefinedPlanks.refinedPlanks, 3)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("refinedStairs");
	
	//public static int oakRefinedStairsTexture;
	//public static int spruceRefinedStairsTexture;
	//public static int birchRefinedStairsTexture;
	//public static int jungleRefinedStairsTexture;
	
	public mod_konungRefinedStairs()
	{
		ModLoader.registerBlock(refinedStairs);
		ModLoader.registerBlock(spruceRefinedStairs);
		ModLoader.registerBlock(birchRefinedStairs);
		ModLoader.registerBlock(jungleRefinedStairs);
		
		refinedStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/Stairs_oak.png");
		spruceRefinedStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/Stairs_spruce.png");
		birchRefinedStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/Stairs_birch.png");
		jungleRefinedStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/Stairs_jungle.png");
		
		//ModLoader.addName(defStairs, "Def Stairs");
		//ModLoader.addName(pineStairs, "Pine Stairs");
		//ModLoader.addName(birchStairs, "Birch Stairs");
		//ModLoader.addName(jungleStairs, "Jungle Stairs");
			
		ModLoader.addRecipe(new ItemStack(refinedStairs, 4, 0), new Object[]{ "X  ","XX ","XXX",Character.valueOf('X'), new ItemStack(mod_konungRefinedPlanks.refinedPlanks, 1, 0)});
		ModLoader.addRecipe(new ItemStack(spruceRefinedStairs, 4, 1), new Object[]{ "X  ","XX ","XXX",Character.valueOf('X'), new ItemStack(mod_konungRefinedPlanks.refinedPlanks, 1, 1)});
		ModLoader.addRecipe(new ItemStack(birchRefinedStairs, 4, 2), new Object[]{ "X  ","XX ","XXX",Character.valueOf('X'), new ItemStack(mod_konungRefinedPlanks.refinedPlanks, 1, 2)});
		ModLoader.addRecipe(new ItemStack(jungleRefinedStairs, 4, 3), new Object[]{ "X  ","XX ","XXX",Character.valueOf('X'), new ItemStack(mod_konungRefinedPlanks.refinedPlanks, 1, 3)});
		
		//Item.itemsList[refinedStairs.blockID] = (new ItemTree(refinedStairs.blockID - 256, refinedStairs)).setItemName("refinedStairs");

	}
	
	
	
	
	
	public void load(){};
	public String getVersion(){return "1.3.2";}
	
}
