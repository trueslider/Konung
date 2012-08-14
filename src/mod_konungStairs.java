package net.minecraft.src;

public class mod_konungStairs extends BaseMod
{	
	public static final Block defStairs = (new BlockKonungStairs(170,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("defStairs");
	public static final Block pineStairs = (new BlockKonungStairs(171,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("pineStairs");
	public static final Block birchStairs = (new BlockKonungStairs(172,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("birchStairs");
	public static final Block jungleStairs = (new BlockKonungStairs(173,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("jungleStairs");
	
	public mod_konungStairs()
	{
		ModLoader.registerBlock(defStairs);
		ModLoader.registerBlock(pineStairs);
		ModLoader.registerBlock(birchStairs);
		ModLoader.registerBlock(jungleStairs);
		
		ModLoader.addName(defStairs, "Def Stairs");
		ModLoader.addName(pineStairs, "Pine Stairs");
		ModLoader.addName(birchStairs, "Birch Stairs");
		ModLoader.addName(jungleStairs, "Jungle Stairs");
		
		defStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_stair.png");
		pineStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_pine_stair.png");
		birchStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_birch_stair.png");
		jungleStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/log_x_jungle_stair.png");
		
		ModLoader.addRecipe(new ItemStack(defStairs, 3), 	new Object[]{ "X##","XX#","XXX",Character.valueOf('X'), new ItemStack(mod_konungPlanks.defPlanks,1)});
		ModLoader.addRecipe(new ItemStack(pineStairs, 3), 	new Object[]{ "X##","XX#","XXX",Character.valueOf('X'), new ItemStack(mod_konungPlanks.pinePlanks,1)});
		ModLoader.addRecipe(new ItemStack(birchStairs, 3), 	new Object[]{ "X##","XX#","XXX",Character.valueOf('X'), new ItemStack(mod_konungPlanks.birchPlanks,1)});
		ModLoader.addRecipe(new ItemStack(jungleStairs, 3), new Object[]{ "X##","XX#","XXX",Character.valueOf('X'), new ItemStack(mod_konungPlanks.junglePlanks,1)});

	}
	
	
	
	
	
	public void load(){};
	public String getVersion(){return "1.3.1";}
	
}
