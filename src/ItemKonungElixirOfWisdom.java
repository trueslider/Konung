//Комментарий
package net.minecraft.src;

public class ItemKonungElixirOfWisdom extends Item
{
    
    public ItemKonungElixirOfWisdom(int par1)
    {
        super(par1);
        setMaxStackSize(64);
    }
       
    public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par1ItemStack.stackSize--;

        if (!par2World.isRemote)
        {
            par3EntityPlayer.addExperience(300);
        }
		return par1ItemStack;
    }
    
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 32;
    }
   
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
        
        return par1ItemStack;
    }
    
}
	