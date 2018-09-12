package Monster.control;

import model.MarshmallowMonster;

import java.util.InputMismatchException;
import java.util.Scanner;

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
	    myMonster.setArmCount(2147483647);
		System.out.println("My monster has " + myMonster.getArmCount() + " arms");	
		
		//Make a new monster
		MarshmallowMonster userMonster;
		Scanner userMonsterScanner = new Scanner(System.in);
		
	   System.out.println("what would you like the name to be? ");
		String name = userMonsterScanner.nextLine();
        
       System.out.println("how many legs do you think it has");
       int Legs = 0;
        try {
			 Legs = userMonsterScanner.nextInt();
		} catch (InputMismatchException e) 
        {
			System.out.println("you are silly put in a number");
		}
       System.out.println("how many arms does it have");
       double Arms = 0;
        try {
			 Arms = userMonsterScanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("you are silly put in a number");
		}
       System.out.println("does it have a nose (true or false)");
       boolean nose = false;
        try {
			 nose = userMonsterScanner.nextBoolean();
		} catch (InputMismatchException e) {
			System.out.println("you are silly put in a boolean value");
		} 
       System.out.println("how many eyes does it got?");
       int eyes = 0;
        try {
			 eyes = userMonsterScanner.nextInt();
		} catch (InputMismatchException e) 
        {
			System.out.println("you are silly put in a number");
		}
        
        System.out.println("your monsters name is " + name);	
		System.out.println("your monster has " + Legs + " legs");
		System.out.println("your monster has " + Arms + " arms"); 
		System.out.println("your monster has " + eyes + " eyes" );
		if ( nose = true) {
			System.out.println("your monster has a nose ");
		} else {
			System.out.println("your monster doesn't have a nose ");
		}
		
		userMonsterScanner.close();
		
	}

}
