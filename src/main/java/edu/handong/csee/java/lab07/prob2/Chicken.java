package edu.handong.csee.java.lab07.prob2;
/**
 * This lab07 prob2 is for Fried Chicken Menu
 * by java programming 
 * 
 * @author LeeSangHyun
 */
public class Chicken {			//public class modifier
	private String name;		//private instance variable 
	private double price;		//private instance variable
	private int stars;			//private instance variable 

	public Chicken()
	{
	this.name = "";			//referring instance variable 
	this.price = 0.0;		//referring instance variable 
	this.stars = 0;			//referring instance variable 
	}

	public Chicken(String name, double price, int stars)	//public modifier for name, price and stars
	{
	this.name = name;		//referring instance variable 
	this.price = price;		//referring instance variable 
	this.stars = stars;		//referring instance variable 
	}

	public String get_name()		//public accessor for gets name
	{
	return this.name;				//type of value return
	}

	public double get_price()		//public accessor for gets price
	{
	return this.price;				//type of value return
	}

	public int get_stars()		//public accessor for gets star
	{
	return this.stars;			//type of value return
	}

	public void set_name(String name)	//public mutator for the name
	{
	this.name = name;				//referring instance variable 
	}

	public void set_price(double price)	//public mutator for the price
	{
	this.price = price;				//referring instance variable 
	}

	public void set_stars(int stars)	//public mutator for the star
	{
	this.stars = stars;				//referring instance variable 
	}
}
