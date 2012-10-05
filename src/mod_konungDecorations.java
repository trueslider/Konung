package net.minecraft.src;

public class mod_konungDecorations extends BaseMod
{
	/*
	 * Устанавливаем ID блока и предмета.
	 */	
	public static int blockWindowID = 160;

	/*
	 * Переменная для хранения ссылки на модель. 
	 */
	public static int modelID; 
	
	/* 
	 * Создаем блок.
	 */
	public static final Block blockWindow = (new KonungBlockWindow(blockWindowID, 0, KonungTileEntityWindow.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("window").setCreativeTab(CreativeTabs.tabBlock);

	/*
	 * blockWindowID-256 связывает ID блока с предметом.
	 */
	public static final Item itemWindow = (new KonungItemWindow (blockWindowID-256, blockWindow).setItemName("window")).setTabToDisplayOn(CreativeTabs.tabBlock);


	
	public mod_konungDecorations()
	{
		
		/*
		 * Устанавливаем имя блока.
		 */
		ModLoader.addName(new ItemStack(blockWindow, 1, 0), "Window");
		
		/*
		 * Регистрируем TileEntity.
		 */
		ModLoader.registerTileEntity(KonungTileEntityWindow.class, "WindowTileEntity", new KonungRenderWindow());
		
		
		/*
		 * Добавляем рецепт блока.
		 */
		ModLoader.addRecipe(new ItemStack(blockWindow, 1, 0), new Object[] { "#X#", "XYX", "#X#", Character.valueOf('X'), Block.planks ,Character.valueOf('Y'), Block.thinGlass});

		/*
		 * Задаем уникальный ID для блока модели.
		 */
		modelID = ModLoader.getUniqueBlockModelID(this, true);

	}
		
	/*
	 * Метод позволяющий блоку рендериться в инвентаре.
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
