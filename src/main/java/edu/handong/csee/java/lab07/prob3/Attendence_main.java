package edu.handong.csee.java.lab07.prob3;
/**
 * This lab07 prob3 is for Attendance
 * by java programming 
 * 
 * @author LeeSangHyun
 */
import java.util.Random;		//insert

public class Attendence_main {		//declaring & defining the class

	public static void main(String[] args) {
	Attendence s_1 = new Attendence();		//creating an object of the attendence s_1
	Attendence s_2 = new Attendence();		//creating an object of the attendence s_2
	Attendence s_3 = new Attendence("Lucas", 1, "21833222", 0);		//creating an object of the attendence s_3
	Attendence s_4 = new Attendence("Martha", 2, "21733444", 0);	//creating an object of the attendence s_4
	
	s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0);		//set the object 
	s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);		//set the object

	Random randomGenerator = new Random();  //sets up the things to program can acccept input

	s_1.set_missed(randomGenerator.nextInt(10));	//Reads one int value from the rG and assigns it to set_missed
	s_2.set_missed(randomGenerator.nextInt(10));	//Reads one int value from the rG and assigns it to set_missed
	s_3.set_missed(randomGenerator.nextInt(10));	//Reads one int value from the rG and assigns it to set_missed
	s_4.set_missed(randomGenerator.nextInt(10));	//Reads one int value from the rG and assigns it to set_missed
	if(s_1.get_missed() > 6) //if s_1.get_missed is bigger than 6
	{
	System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");	//print out
	System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed());	//print out
	}
	else
	System.out.println("We'll see about the grade, " + s_1.get_name());	//print out
	if(s_2.get_missed() > 6)		//if s_2.get_missed is bigger than 6
	{
	System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");	//print out
	System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());	//print out
	}
	else
	System.out.println("We'll see about the grade, " + s_2.get_name());	//else, print out
	if(s_3.get_missed() > 6)		//if s_3.get_missed is bigger than 6
	{
	System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");	//print out
	System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());	//print out
	}
	else
	System.out.println("We'll see about the grade, " + s_3.get_name());		//else, print out
	if(s_4.get_missed() > 6)		//if s_4.get_missed is bigger than 6
	{
	System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");	//print out
	System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());	//print out
	}
	else
	System.out.println("We'll see about the grade, " + s_4.get_name());		//else, print out

	}

	}
