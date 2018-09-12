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
	public String toString()
	{
		String descripption = "My mosters name is " + name + " it has " 
				+ legCount + " legs"
				+ " and the scary or silly thing it says is: ebin fug XDDDD";// Assigns the parameter into the data member
		
		return descripption;
	}

}
