package net.minecraft.src;

public class KonungModelIdol extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
  
  public KonungModelIdol()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 61);
      Shape1.addBox(-8F, 0F, -8F, 16, 15, 16);
      Shape1.setRotationPoint(0F, 9F, 0F);
      Shape1.setTextureSize(64, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 3.141593F, 0F);
      Shape2 = new ModelRenderer(this, 4, 45);
      Shape2.addBox(-7F, 0F, -7F, 14, 2, 14);
      Shape2.setRotationPoint(0F, 7F, 0F);
      Shape2.setTextureSize(64, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 3.141593F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(-8F, 0F, -8F, 16, 29, 16);
      Shape3.setRotationPoint(0F, -22F, 0F);
      Shape3.setTextureSize(64, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 3.141593F, 0F);
      Shape4 = new ModelRenderer(this, 4, 45);
      Shape4.addBox(-7F, 0F, -7F, 14, 2, 14);
      Shape4.setRotationPoint(0F, -24F, 0F);
      Shape4.setTextureSize(64, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 3.141593F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
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
	    Shape1.render(f);
	    Shape2.render(f);
	    Shape3.render(f);
	    Shape4.render(f);
  }
  
}