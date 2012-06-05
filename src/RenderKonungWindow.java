package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderKonungWindow extends TileEntitySpecialRenderer {
	private ModelKonungWindow model;

	public RenderKonungWindow() {
		model = new ModelKonungWindow();
	}

	public void renderAModelAt(TileEntityKonungWindow tile, double d, double d1, double d2, float f)
	{
		int i = tile.getBlockMetadata(); //this is for rotation
		int j = 0;
		if (i == 0)
		{
			j = 0;//������� �� 0 �������� ���� ��������� �������
		}
		if (i == 1)
		{
			j = 90;//������� �� 90 �������� ���� ��������� �����
		}
		if (i == 2)
		{
			j = 180;//������� �� 180 �������� ���� ��������� �����
		}
		if (i == 3)
		{
			j = 270;//������� �� 270 �������� ���� ��������� ������
		}
		bindTextureByName("/textures/konung/window.png");
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glRotatef(j, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		model.renderModel(0.0625F);
		GL11.glPopMatrix();
	}
	
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		renderAModelAt((TileEntityKonungWindow) tileentity, d, d1, d2, f);
	}
}
