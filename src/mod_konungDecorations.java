package net.minecraft.src;

public class mod_konungDecorations extends BaseMod
{
	/**
	 * We use this to give the id to the block and item. Do it like this. it's better for the health of you custom block.
	 */	
	public static int blockWindowID = 160;

	/** 
	 * We use this to define the ID of your model. 
	 * If you have multiple custom blocks make a second one that would look like this:	
	 * public static int modelID2;
	 */
	public static int modelID; 
	
	/** 
	 * Make the new block. you should get error for now on blockPillar and TileEntityPillar. 
	 * BrickPillar is the ID number, which we defined in the int above. 
	 */
	public static final Block blockWindow = (new KonungBlockWindow(blockWindowID, 0, KonungTileEntityWindow.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("window").setCreativeTab(CreativeTabs.tabBlock);

	/**
	 * blockWindowID-256 is to associate the BlockID with the Item.
	 */
	public static final Item itemWindow = (new KonungItemWindow (blockWindowID-256, blockWindow).setItemName("window")).setTabToDisplayOn(CreativeTabs.tabBlock);


	
	public mod_konungDecorations()
	{
		
		/**
		 * As you can see, i made 11 different blocks. 0 included to 10. each with a different name.
		 */
		ModLoader.addName(new ItemStack(blockWindow, 1, 0), "Window");
		
		/**
		 *  Oobvious, registers the tile entity from tile entity pillar renderer to tile entity pillar
		 */
		ModLoader.registerTileEntity(KonungTileEntityWindow.class, "WindowTileEntity", new KonungRenderWindow());
		
		
		/**
		 * Add the different recipes.if you want to add your own custom block to a recipe, instead of 'F', Block.blockname you do 'F' new ItemStack(blockPillar, 1, 5) 5 can be changed to any number you used.
		 */
		ModLoader.addRecipe(new ItemStack(blockWindow, 1, 0), new Object[] { "#X#", "XYX", "#X#", Character.valueOf('X'), Block.planks ,Character.valueOf('Y'), Block.thinGlass});

		/**
		 * This is to get a unique blockmodel ID if you have two different custom blocks, add modelID2 to it etc.
		 */
		modelID = ModLoader.getUniqueBlockModelID(this, true);

	}
		
	/**
	 * This allows the block to render in you inventory
	 * All those zero's at the end are used for rendering in the players hand. leave it that way.
	 */
	public void renderInvBlock(RenderBlocks var1, Block var2, int var3, int var4)
	{
		super.renderInvBlock(var1, var2, var3, var4);

		if (var2 == blockWindow)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new KonungTileEntityWindow(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
	}

	
	
	
	
	public void load(){};
	public String getVersion(){return "1.3.2";}
	
}
