package edu.handong.csee.java.lab07.prob3;
/**
 * This lab07 prob3 is for Attendance
 * by java programming 
 * 
 * @author LeeSangHyun
 */
import java.util.*;		//gets the * class from the library java.util
public class Attendence {			//public class modifier
	private String name = "";		//private instance string variable 'name'
	private int year = 0;			//private instance integer variable 'year'
	private String student_id = "";		//private instance string variable 's_id'
	private int missed = 0;				//private instance integer variable 'missed'

	//Constructors
	public Attendence()			//public modifier
	{
	this.name = "Null"; 		//referring & receiving instance variable 'name'
	this.year = 0;				//referring & receiving instance variable 'year'
	this.student_id = "Null";	//referring & receiving instance variable 's_id'
	this.missed = 0;			//referring & receiving instance variable 'missed'
	}

	public Attendence(String name, int year, String student_id, int missed)		//public modifier for name, year, s_id, missed
	{
	this.name = name;		//referring & receiving instance variable 'name'
	this.year = year;		//referring & receiving instance variable 'year'
	this.student_id = student_id;		//referring & receiving instance variable 's_id'
	this.missed = missed;				//referring & receiving instance variable 'missed'
	}

//Getters
public String get_name()		//public accessor for string 'name'
{
return name;					//return from the type
}
public int get_year()			//public accessor for integer variable 'year'
{
return year;					//return from the type
}

public String get_id()			//public accessor for string 's_id'
{
return student_id;				//return from the type
}
public int get_missed()			//public accessor for integer variable 'missed'
{
return missed;					//return from the type
}

//Setters
public void set_name(String name)	//public mutator for the string 'name'
{
this.name = name;					//referring instance variable 'name'
}
public void set_year(int year)		//public mutator for the integer variable 'year'
{
this.year = year;					//referring instance integer variable 'year'
}
public void set_id(String student_id)		//public mutator for the string 's_id'
{
this.student_id = student_id;		//referring instance variable 's_id'
}
public void set_missed(int missed)			//public mutator for the integer variable 'missed'
{
this.missed = missed;				//referring instance integer variable 'missed'
}
}

