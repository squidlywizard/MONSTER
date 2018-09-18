package Monster.control;

import model.MarshmallowMonster;
import javax.swing.JOptionPane;

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
		JOptionPane.showMessageDialog(null, "Ebin \nfug XDDDD");
		// use this method instead of "System.out.println("words");
		JOptionPane.showMessageDialog(null, myMonster);
		System.out.println(myMonster);
	    myMonster.setArmCount(2147483647);
		System.out.println("My monster has " + myMonster.getArmCount() + " arms");	
		JOptionPane.showMessageDialog(null, "My monster has " + myMonster.getArmCount() + " arms");
		//Make a new monster
		MarshmallowMonster userMonster;
		
		Scanner userMonsterScanner = new Scanner(System.in);
		
	   System.out.println("what is its name");
	   String name = JOptionPane.showInputDialog(null, "what is its name?");
	   //String name = userMonsterScanner.nextLine();
	   
       System.out.println("how many legs do you think it has");
       
       int Legs = 0;
       
        try {
			 //Legs = userMonsterScanner.nextInt();
        	 String LegsUserInput = JOptionPane.showInputDialog(null, "How many legs will it have?");
        	 Legs = Integer.parseInt(LegsUserInput);
		} catch (NumberFormatException e) 
        {
			System.out.println("you are silly put in a number");
			JOptionPane.showMessageDialog(null, "you are silly put in a number");
		}
       System.out.println("how many arms does it have");
       
       double Arms = 0;
        try {
			 //Arms = userMonsterScanner.nextDouble();
        	String armsUserInput = JOptionPane.showInputDialog(null, "How many arm(s) will it have?");
        	Arms = Double.parseDouble(armsUserInput);
		} catch (NumberFormatException e) {
			System.out.println("you are silly put in a number");
			JOptionPane.showMessageDialog(null, "you are silly put in a number");
		}
       System.out.println("does it have a nose (true or false)");
       
       String nose = "false";
       int noseir = 1;
        	 nose = JOptionPane.showInputDialog(null, "does it have a nose(true or false)");
        	switch (nose) {
        		case "true":
        			noseir = 1;
        	    break;
        		case "false":
        			noseir = 0;
        		break;
        	    default:
        	    	JOptionPane.showMessageDialog(null, "you didn't put a boolean silly");
        			
        	}
			 //nose = userMonsterScanner.nextBoolean();
		
       System.out.println("how many eyes does it got?");
       int eyes = 0;
        try {
			 //eyes = userMonsterScanner.nextInt();
        	String eyeUserInput = JOptionPane.showInputDialog(null, "how many eye(s) does it have");
        	eyes = Integer.parseInt(eyeUserInput);
		} catch (InputMismatchException e) 
        {
			System.out.println("you are silly put in a number");
			JOptionPane.showMessageDialog(null, "you are silly put in a number");
		}
        
        System.out.println("your monsters name is " + name);	
		System.out.println("your monster has " + Legs + " legs");
		System.out.println("your monster has " + Arms + " arms"); 
		System.out.println("your monster has " + eyes + " eyes" );
		JOptionPane.showMessageDialog(null, "your monsters name is " + name 
				// \n makes another line
				+ "\nyour monster has " + Legs + " legs"
				+ "\nyour monster has " + Arms + " arms"
				+ "\nyour monster has " + eyes + " eyes" );
		if( noseir == 1)
		{
			
			System.out.println("\nyour monster has a nose ");
			JOptionPane.showMessageDialog(null, "your monster has a nose");
		}
		else
		{
			
			System.out.println("\nyour monster doesn't have a nose ");
			JOptionPane.showMessageDialog(null, "your monster does not have a nose");
			
		}
		
		userMonsterScanner.close();
		
	}

}
