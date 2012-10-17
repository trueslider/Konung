package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class KonungRenderIdolIcon extends TileEntitySpecialRenderer 
{

	private KonungModelIdolIcon model;

	public KonungRenderIdolIcon() 
	{
		model = new KonungModelIdolIcon();
	}

	public void renderAModelAt(KonungTileEntityIdolIcon tile, double d, double d1, double d2, float f)
	{
		int i = 0;

		if(tile.worldObj != null) // Сообщаем миру, что блок создан.
		{
			i = (tile.worldObj.getBlockMetadata(tile.xCoord, tile.yCoord, tile.zCoord)); // Сообщает игре о необходимости получить метадату из блока
		}
		
		int j = 0;
		if (i == 0)
		{
			j = 0;//Поворот на 0 градусов, если поставить впереди
		}
		if (i == 1)
		{
			j = 90;//Поворот на 90 градусов, если поставить слева
		}
		if (i == 2)
		{
			j = 180;//Поворот на 180 градусов, если поставить сзади
		}
		if (i == 3)
		{
			j = 270;//Поворот на 270 градусов, если поставить справа
		}
	
		bindTextureByName("/textures/konung/IdolIcon.png");
			
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glRotatef(j, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		model.renderModel(0.0625F);
		GL11.glPopMatrix();
	}
	
	
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		renderAModelAt((KonungTileEntityIdolIcon) tileentity, d, d1, d2, f);
	}
}
