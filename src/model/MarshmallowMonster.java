package model;

public class MarshmallowMonster
{
	//---------Data member section-----------
	//ALWAYS PRIVATE
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	public MarshmallowMonster()
	{
		//Default values are 0 , null , or false
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;//the dot refers to stuff in the class
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)//parameters

	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	//Getters Acessors
	
	public String getName()

	{
		
		return name;// this closes the method btw
		
	}
	public double getLegCount()
	{
		return legCount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	public int getArmCount()
	{
		return armCount;
	}
	//Setters change or set the value use if you need to export variables
	public void setName(String name)
	{
		this.name = name;
	}
	public void setLegCount(double legs)
	{
	    this.legCount = legs;	
	}
	public void setEyeCount(int eyes)
	{
	this.eyeCount = eyes;	
	}
	public void sethasNoses(boolean nose)
	{
		this.hasNoses = nose;
	}
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	public String toString( String fug)
    
    
	{
		String descripption = "My mosters name is " + name + " it has " 
				+ legCount + " legs"
				+ " and the scary or silly thing it says is: ebin fug XDDDD";// Assigns the parameter into the data member
		
		return descripption;
	}

}
