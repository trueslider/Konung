package net.minecraft.src;

public class KonungItemStockade extends ItemBlock
{	
    public KonungItemStockade(int i, String pItemMatName)
    {
        super(i);		
		itemMatName = pItemMatName;
        setMaxDamage(0);
        setHasSubtypes(true);
    }    

    public int getMetadata(int i)
    {
        return i;
    }	
	
    public String getItemNameIS(ItemStack itemstack)
    {			
		return (new StringBuilder()).append("Kaev").append(itemMatName).append("Slopes").append(Kaevator_Materials[itemstack.getItemDamage()]).toString();		
    }

	public static final String Kaevator_Materials[] = {
        "QuadriCornerDown", "QuadriCornerDown", "QuadriCornerDown", "QuadriCornerDown",
		"QuadriCornerUp", "QuadriCornerUp", "QuadriCornerUp", "QuadriCornerUp", 
		"TriCornerDown", "TriCornerDown", "TriCornerDown", "TriCornerDown", 
		"TriCornerUp", "TriCornerUp", "TriCornerUp", "TriCornerUp"
    };	
	
	private String itemMatName;
}
