package net.minecraft.src;

//import java.util.Random;
import net.minecraft.src.Konung.*;


public class mod_konungWoodWorking extends BaseMod
{
	public static final Block woodWorking 	= new BlockKonungWoodWorking(165, false).setHardness(1.0F).setResistance(0F).setStepSound(Block.soundWoodFootstep).setBlockName("woodWorking");
	
	public static int side1;
	public static int side2;
	public static int gui;
	
	public String getVersion()
	{
       return "mod for 1.2.5";
	}
	
	public void load()
	{
		ModLoader.registerBlock(woodWorking);
	    ModLoader.addName(woodWorking, "Wood Working");
	    ModLoader.registerTileEntity(TileEntityKonungWoodWorking.class, "woodWorking");
	    	    
	    side1 	= ModLoader.addOverride("/terrain.png", "/textures/konung/woodworking_01.png");
	    side2 	= ModLoader.addOverride("/terrain.png", "/textures/konung/woodworking_02.png");
	    	    
	    ModLoader.addRecipe(new ItemStack(woodWorking, 1), 	new Object[]{ "###", "#A#","###",Character.valueOf('#'), Block.dirt});
	}
}