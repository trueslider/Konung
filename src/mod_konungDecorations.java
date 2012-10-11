package net.minecraft.src;

public class mod_konungDecorations extends BaseMod
{
	/*
	 * Устанавливаем ID блока и предмета.
	 */	
	public static int blockWindowID = 160;
	public static int blockTableID = 161;

	/*
	 * Переменная для хранения ссылки на модель. 
	 */
	public static int modelWindowID; 
	public static int modelTableID;
	
	/* 
	 * Создаем блок.
	 */
	public static final Block blockWindow = (new KonungBlockWindow(blockWindowID, 0, KonungTileEntityWindow.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Window").setCreativeTab(CreativeTabs.tabBlock);
	public static final Block blockTable = (new KonungBlockTable(blockTableID, 0, KonungTileEntityTable.class)).setHardness(2.0F).setResistance(1.0F).setStepSound(Block.soundWoodFootstep).setBlockName("Table").setCreativeTab(CreativeTabs.tabBlock);
	
	/*
	 * blockWindowID-256 связывает ID блока с предметом.
	 */
	public static final Item itemWindow = (new KonungItemWindow (blockWindowID-256, blockWindow).setItemName("Window")).setTabToDisplayOn(CreativeTabs.tabBlock);
	public static final Item itemTable = (new KonungItemTable (blockTableID-256, blockTable).setItemName("Table")).setTabToDisplayOn(CreativeTabs.tabBlock);
	

	
	public mod_konungDecorations()
	{
		
		/*
		 * Устанавливаем имя блока.
		 */
		ModLoader.addName(new ItemStack(blockWindow, 1, 0), "Oak Window");
		ModLoader.addName(new ItemStack(blockWindow, 1, 0), "ru_RU", "Дубовое окно");
		ModLoader.addName(new ItemStack(blockTable, 1, 0), "Oak Table");
		ModLoader.addName(new ItemStack(blockTable, 1, 0), "ru_RU", "Дубовый стол");

		
		/*
		 * Регистрируем TileEntity.
		 */
		ModLoader.registerTileEntity(KonungTileEntityWindow.class, "WindowTileEntity", new KonungRenderWindow());
		ModLoader.registerTileEntity(KonungTileEntityTable.class, "TableTileEntity", new KonungRenderTable());
		
		
		/*
		 * Добавляем рецепт блока.
		 */
		ModLoader.addRecipe(new ItemStack(blockWindow, 1, 0), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), new ItemStack (mod_konungRefinedPlanks.refinedPlanks, 1, 0) ,Character.valueOf('Y'), Block.thinGlass});
		ModLoader.addRecipe(new ItemStack(blockTable, 1, 0), new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), new ItemStack(mod_konungRefinedPlanks.refinedPlanks, 1, 0)});
		

		/*
		 * Задаем уникальный ID для блока модели.
		 */
		modelWindowID = ModLoader.getUniqueBlockModelID(this, true);
		modelTableID = ModLoader.getUniqueBlockModelID(this, true);

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
		if (var2 == blockTable)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new KonungTileEntityTable(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
	}	
	
	public void load(){};
	public String getVersion(){return "1.3.2";}
	
}
