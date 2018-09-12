package Monster.control;

import model.MarshmallowMonster;

public class Cotrol
{
	//data member section
	private MarshmallowMonster myMonster;
	
	//Constructor section
	public Cotrol()
	{
		//Job 1: initialize data members!
		myMonster = new MarshmallowMonster("spurdo", 2.5, 0, false, 3 );
	}
	
	//methods section
	public void start() 
	{
		System.out.println(myMonster);
	}

}
