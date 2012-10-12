package net.minecraft.src;

public class KonungModelBench extends ModelBase
{
  //fields
    ModelRenderer top;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer pole;
  
  public KonungModelBench()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      top = new ModelRenderer(this, 0, 8);
      top.addBox(-8F, 0F, -3F, 16, 3, 6);
      top.setRotationPoint(0F, 16F, 0F);
      top.setTextureSize(64, 32);
      top.mirror = true;
      setRotation(top, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 0);
      leg1.addBox(0F, 0F, 0F, 2, 5, 2);
      leg1.setRotationPoint(-6F, 19F, -3F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 0);
      leg2.addBox(0F, 0F, 0F, 2, 5, 2);
      leg2.setRotationPoint(4F, 19F, 1F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 0);
      leg3.addBox(0F, 0F, 0F, 2, 5, 2);
      leg3.setRotationPoint(4F, 19F, -3F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 0);
      leg4.addBox(0F, 0F, 0F, 2, 5, 2);
      leg4.setRotationPoint(-6F, 19F, 1F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      pole = new ModelRenderer(this, 9, 0);
      pole.addBox(-8F, -1F, -1F, 14, 2, 2);
      pole.setRotationPoint(1F, 22F, 0F);
      pole.setTextureSize(64, 32);
      pole.mirror = true;
      setRotation(pole, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    top.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    pole.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

 public void renderModel(float f)
  {
	top.render(f);
	leg1.render(f);
	leg2.render(f);
	leg3.render(f);
	leg4.render(f);
	pole.render(f);

  }
  
}