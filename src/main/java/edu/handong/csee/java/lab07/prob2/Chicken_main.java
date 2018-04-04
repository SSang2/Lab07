package edu.handong.csee.java.lab07.prob2;

/**
 * This lab07 prob2 is for Fried Chicken Menu
 * by java programming 
 * 
 * @author LeeSangHyun
 */
public class Chicken_main {			//declaring & defining the public class for chicken
public static void main(String[] args) 
	{

	Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);		//receiving new object menu1 
	Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);		//receiving new object menu2
	Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);		//receiving new object menu3

	menu1.set_stars(3);		//read data
	menu2.set_stars(4);		//read data
	menu3.set_stars(1);		//read data

	System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());		//print out
	System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());		//print out
	System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());		//print out
	}

}