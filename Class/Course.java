package Class;
import java.lang.*;
import java.util.*;
import java.io.*;
import Interface.*;
import ForCreateFile.*;

public class Course implements CourseTransactions
{
	private int courseNumber;
	private int credit;

	public void setCourseNumber(int courseNumber)
	{
		this.courseNumber = courseNumber;
	}

	public void setCredit(int credit)
	{
		this.credit = credit;
	}

	public int getCourseNumber()
	{
		return courseNumber;
	}

	public int getCredit()
	{
		return credit;
	}

	public void showInfo()
	{
		System.out.println("----------------------------------------------");
		System.out.println("COURSE NUMBER ARE : "+getCourseNumber());
		System.out.println("CREDIT IS : "+getCredit());
		System.out.println("----------------------------------------------");
	}

	public void adding(int quantity)
	{
			System.out.println("----------------------------------------------");
			System.out.println("ADDING CREDIT IS : "+ quantity);
			
			credit = credit + quantity;
			
			System.out.println("NOW TOTAL CREDIT IS : "+ credit);
			System.out.println("----------------------------------------------");
	}
	
	public void dropping(int quantity)
	{
			System.out.println("----------------------------------------------");
			System.out.println("DROPPING CREDIT IS : "+ quantity);
			
			credit = credit - quantity;
			
			System.out.println("NOW TOTAL CREDIT IS : "+ credit);
			System.out.println("----------------------------------------------");
			
	}

}