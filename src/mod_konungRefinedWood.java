package net.minecraft.src;

public class mod_konungRefinedWood extends BaseMod
{

	public static final Block oakRefinedWood = (new BlockLog(178)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("oakRefinedWood");
	//public static final Block spruceStairs = (new BlockKonungStairs(171,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("pineStairs");
	//public static final Block birchStairs = (new BlockKonungStairs(172,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("birchStairs");
	//public static final Block jungleStairs = (new BlockKonungStairs(173,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("jungleStairs");
	
	public static int topRefinedWoodTexture;
	public static int oakRefinedWoodTexture;
	public static int spruceRefinedWoodTexture;
	public static int birchRefinedWoodTexture;
	public static int jungleRefinedWoodTexture;
	
	
	public mod_konungRefinedWood()
	{
		ModLoader.registerBlock(oakRefinedWood);
		//ModLoader.registerBlock(spruceStairs);
		//ModLoader.registerBlock(birchStairs);
		//ModLoader.registerBlock(jungleStairs);
		
		topRefinedWoodTexture 		= ModLoader.addOverride("/terrain.png", "/textures/konung/log_top.png");
    	oakRefinedWoodTexture 		= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x.png");
    	spruceRefinedWoodTexture 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_pine.png");
    	birchRefinedWoodTexture 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_birch.png");
    	jungleRefinedWoodTexture 	= ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_jungle.png");
		
		ModLoader.addName(oakRefinedWood, "New Refined Wood");
		//ModLoader.addName(spruceStairs, "Spruce Stairs");
		//ModLoader.addName(birchStairs, "Birch Stairs");
		//ModLoader.addName(jungleStairs, "Jungle Stairs");
		
		//oakRefinedWood.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/oakRefinedWood.png");
		//spruceStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_pine_stair.png");
		//birchStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_birch_stair.png");
		//jungleStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_jungle_stair.png");
		
		ModLoader.addRecipe(new ItemStack(oakRefinedWood, 3), new Object[]{ "X","X","X",Character.valueOf('X'), new ItemStack(Block.wood,3)});
		//ModLoader.addRecipe(new ItemStack(spruceStairs, 3), new Object[]{ "X##","XX#","XXX",Character.valueOf('X'), new ItemStack(mod_konungPlanks.sprucePlanks,1)});
		//ModLoader.addRecipe(new ItemStack(birchStairs, 3), new Object[]{ "X##","XX#","XXX",Character.valueOf('X'), new ItemStack(mod_konungPlanks.birchPlanks,1)});
		//ModLoader.addRecipe(new ItemStack(jungleStairs, 3), new Object[]{ "X##","XX#","XXX",Character.valueOf('X'), new ItemStack(mod_konungPlanks.junglePlanks,1)});

	}
	
	
	
	
	
	public void load(){};
	public String getVersion(){return "1.3.1";}
	
}
