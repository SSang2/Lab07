package edu.handong.csee.java.lab07.prob1;

/**
 * This lab07 prob1 is for YearToCentury
 * by java programming 
 * 
 * @author LeeSangHyun
 */
public class YeartoCentury {
	int year;			//integer variable 'year'

	public YeartoCentury()		//public modifiers
	{
	year = 0;			//int variable's original value 
	}

	public YeartoCentury(int year) 		//primitive type		//declaration
	{
	this.year = year;		//referring % receiving instance variable
	}

	public int calc_century()	//public modifiers
	{
	if(year % 100 == 0)		//if year modified by 100 is equal to 0
	year = year / 100;		// year is equal to year divided by 100
	else
	{
	year = (year / 100) + 1;	//else year is equal to year divided by 100 plus 1
	}
	return year;		//executed in year (last)
	}

}
