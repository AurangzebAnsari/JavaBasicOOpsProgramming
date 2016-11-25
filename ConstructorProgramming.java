package com;

public class ConstructorProgramming {
	int rollno;
	String name,collagename,gender;
	String date;
	
	ConstructorProgramming(int rollno,String name)
	{
		rollno=rollno;
		name=name;
		System.out.println(rollno +name);
	}
	void display(String collagename,String gender,String date)
	{
		
		collagename=collagename;
		gender=gender;
		date=date;
		System.out.println(collagename +gender +date);
	}
	
	

}
