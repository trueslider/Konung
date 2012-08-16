package net.minecraft.src;

public class mod_konungRefinedPlanks extends BaseMod
{
	public static final Block defPlanks = (new KonungBlockPlanks(174,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("defPlanks");
	//public static final Block pinePlanks = (new KonungBlockPlanks(175,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("pinePlanks");
	//public static final Block birchPlanks = (new KonungBlockPlanks(176,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("birchPlanks");
	//public static final Block junglePlanks = (new KonungBlockPlanks(177,0)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setBlockName("junglePlanks");

	public mod_konungRefinedPlanks()
	{
		ModLoader.registerBlock(defPlanks);
		//ModLoader.registerBlock(pinePlanks);
		//ModLoader.registerBlock(birchPlanks);
		//ModLoader.registerBlock(junglePlanks);
		
		ModLoader.addName(defPlanks, "Def Planks");
		//ModLoader.addName(pinePlanks, "Pine Planks");
		//ModLoader.addName(birchPlanks, "Birch Planks");
		//ModLoader.addName(junglePlanks, "Jungle Planks");
		
		defPlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/defPlanks.png");
		//pinePlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/pinePlanks.png");
		//birchPlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/birchPlanks.png");
		//junglePlanks.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/textures/konung/junglePlanks.png");
		
		ModLoader.addRecipe(new ItemStack(defPlanks, 1), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungRefinedWood.defRefinedWood,1)});
		//ModLoader.addRecipe(new ItemStack(pinePlanks, 1), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungRefinedWood.defRefinedWood,1)});
		//ModLoader.addRecipe(new ItemStack(birchPlanks, 1), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungRefinedWood.defRefinedWood,1)});
		//ModLoader.addRecipe(new ItemStack(junglePlanks, 1), new Object[]{ "X",Character.valueOf('X'), new ItemStack(mod_konungRefinedWood.defRefinedWood,1)});

	   	//create planks from vertical clear wood
 	   	ModLoader.addRecipe(new ItemStack(defPlanks, 1), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungRefinedWood.defRefinedWood,1,0)});
	   	//ModLoader.addRecipe(new ItemStack(pinePlanks, 1), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungRefinedWood.defRefinedWood,1,1)});
	   	//ModLoader.addRecipe(new ItemStack(birchPlanks, 1), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungRefinedWood.defRefinedWood,1,2)});
	   	//ModLoader.addRecipe(new ItemStack(junglePlanks, 1), new Object[]{ "#",  Character.valueOf('#'), new ItemStack(mod_konungRefinedWood.defRefinedWood,1,3)});
	}
	

	
	public void load(){};
	public String getVersion(){return "1.3.1";}
}
