package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderKonungWoodTablePine extends TileEntitySpecialRenderer {
	private ModelKonungWoodTable model;

	public RenderKonungWoodTablePine() {
		model = new ModelKonungWoodTable();
	}

	public void renderAModelAt(TileEntityKonungWoodTablePine tile, double d, double d1, double d2, float f)
	{
		int i = tile.getBlockMetadata(); //this is for rotation
		int j = 0;
		if (i == 0)
		{
			j = 0;//поворот на 0 градусов если поставить впереди
		}
		if (i == 1)
		{
			j = 90;//поворот на 90 градусов если поставить слева
		}
		if (i == 2)
		{
			j = 0;//поворот на 180 градусов если поставить сзади
		}
		if (i == 3)
		{
			j = 90;//поворот на 270 градусов если поставить справа
		}
		bindTextureByName("/textures/konung/woodtablepine.png");
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glRotatef(j, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		model.renderModel(0.0625F);
		GL11.glPopMatrix();
	}
	
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		renderAModelAt((TileEntityKonungWoodTablePine) tileentity, d, d1, d2, f);
	}
}
