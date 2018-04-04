package edu.handong.csee.java.lab07.prob1;

/**
 * This lab07 prob1 is for YearToCentury
 * by java programming 
 * 
 * @author LeeSangHyun
 */
import java.util.Scanner;		//insert

public class YeartoCentury_main {

	public static void main(String[] args)
	{
		int yr = 0;						//integer variable year
		Scanner keyboard = new Scanner(System.in);	//create an object of the Scanner, data enter from the keyboard

		System.out.println("Input year: "); 	//print out 
		yr = keyboard.nextInt();			//read value from the keyboard and assign into yr

		YeartoCentury year = new YeartoCentury(yr);		//new instance variable
		System.out.println(yr + " is " + year.calc_century() + "th century.");	//print out the result
	}
}

