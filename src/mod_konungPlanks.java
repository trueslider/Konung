package net.minecraft.src;

public class mod_konungPlanks extends BaseMod
{
	public static final Block defPlanks = (new BlockKonungPlanks(174,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("defPlanks");
	public static final Block pinePlanks = (new BlockKonungPlanks(175,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("pinePlanks");
	public static final Block birchPlanks = (new BlockKonungPlanks(176,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("birchPlanks");
	public static final Block junglePlanks = (new BlockKonungPlanks(177,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("junglePlanks");

	public mod_konungPlanks()
	{
		ModLoader.registerBlock(defPlanks);
		ModLoader.registerBlock(pinePlanks);
		ModLoader.registerBlock(birchPlanks);
		ModLoader.registerBlock(junglePlanks);
		
		ModLoader.addName(defPlanks, "Def Stairs");
		ModLoader.addName(pinePlanks, "Pine Stairs");
		ModLoader.addName(birchPlanks, "Birch Stairs");
		ModLoader.addName(junglePlanks, "Jungle Stairs");
		
		defPlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/defPlanks.png");
		pinePlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/pinePlanks.png");
		birchPlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/birchPlanks.png");
		junglePlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/junglePlanks.png");
		
		ModLoader.addRecipe(new ItemStack(defPlanks, 1), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungLog.logDef,1)});
		ModLoader.addRecipe(new ItemStack(pinePlanks, 1), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungLog.logPine,1)});
		ModLoader.addRecipe(new ItemStack(birchPlanks, 1), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungLog.logBirch,1)});
		ModLoader.addRecipe(new ItemStack(junglePlanks, 1), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungLog.logJungle,1)});		
	}
	

	
	public void load(){};
	public String getVersion(){return "1.3.1";}
}
