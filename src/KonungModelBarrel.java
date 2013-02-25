package net.minecraft.src;

public class KonungModelBarrel extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
  
  public KonungModelBarrel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 19);
      Shape1.addBox(0F, 0F, 0F, 1, 1, 10);
      Shape1.setRotationPoint(-5F, 23F, -5F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 19);
      Shape2.addBox(0F, 0F, 0F, 1, 1, 10);
      Shape2.setRotationPoint(4F, 23F, -5F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 16);
      Shape3.addBox(0F, 0F, 0F, 8, 1, 1);
      Shape3.setRotationPoint(-4F, 23F, 4F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 16);
      Shape4.addBox(0F, 0F, 0F, 8, 1, 1);
      Shape4.setRotationPoint(-4F, 23F, -5F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(-5.5F, 0F, -5.5F, 11, 3, 11);
      Shape5.setRotationPoint(0F, 20F, 0F);
      Shape5.setTextureSize(64, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 31);
      Shape6.addBox(-5F, 0F, -5F, 10, 8, 10);
      Shape6.setRotationPoint(0F, 12F, 0F);
      Shape6.setTextureSize(64, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(-5.5F, 0F, -5.5F, 11, 3, 11);
      Shape7.setRotationPoint(0F, 10F, 0F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 19);
      Shape8.addBox(0F, 0F, 0F, 1, 1, 10);
      Shape8.setRotationPoint(-5F, 9F, -5F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 16);
      Shape9.addBox(0F, 0F, 0F, 8, 1, 1);
      Shape9.setRotationPoint(-4F, 9F, -5F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 0, 19);
      Shape10.addBox(0F, 0F, 0F, 1, 1, 10);
      Shape10.setRotationPoint(4F, 9F, -5F);
      Shape10.setTextureSize(64, 64);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 0, 16);
      Shape11.addBox(0F, 0F, 0F, 8, 1, 1);
      Shape11.setRotationPoint(-4F, 9F, 4F);
      Shape11.setTextureSize(64, 64);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity par7Entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, par7Entity);
  }

 public void renderModel(float f)
  {
	    Shape1.render(f);
	    Shape2.render(f);
	    Shape3.render(f);
	    Shape4.render(f);
	    Shape5.render(f);
	    Shape6.render(f);
	    Shape7.render(f);
	    Shape8.render(f);
	    Shape9.render(f);
	    Shape10.render(f);
	    Shape11.render(f);
  }
  
}