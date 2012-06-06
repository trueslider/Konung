package net.minecraft.src;

public class mod_konungForestLand extends BaseMod
{
	
	public static final BiomeGenBase ForestLand = (new BiomeGenForestLand(25)).setColor(0xfa9418).setBiomeName("Forest Land!");
	
	public mod_konungForestLand()
	{
		ModLoader.addBiome(ForestLand);
	}

	
	
	
	
	public void load(){};
	public String getVersion(){return "1.2.5";}
	
}