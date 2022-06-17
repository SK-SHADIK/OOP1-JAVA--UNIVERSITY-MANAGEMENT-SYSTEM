package Class;
import java.lang.*;
import java.util.*;
import java.io.*;
import Interface.*;
import ForCreateFile.*;


public class Student implements CourseOperations
{
	private String name;
	private int sid;
	private Course courses[] = new Course [1000];


	public void setName(String name)
	{
		this.name = name;
	}

	public void setSid(int sid)
	{
		this.sid = sid;
	}


	public String getName()
	{
		return name;
	}

	public int getSid()
	{
		return sid;
	}

	public void insertCourse(Course c)
	{
		for(int i = 0; i < courses.length; i++)
		{
			if(courses[i] == null)
			{
				courses[i] = c;
				
				System.out.println("COURSE INSERTION IS SUCCESSFULLY");
				
				break;
			}
		}
	}

	public void removeCourse(Course c)
	{
		for(int i = 0; i < courses.length; i++)
		{
			if(courses[i] == c)
			{
				courses[i] = null;
				
				System.out.println("COURSE REMOVED IS SUCCESSFULLY");
				
				break;
			}
		}
	}

	public void showAllCourse()
	{
		for(Course c : courses)
		{
			if(c != null)
			{
				c.showInfo();
			}
		}
	}

	public Course getCourse(int courseNumber)
	{
		Course c = null;

		for(int i=0; i < courses.length; i++)
		{
			if(courses[i] != null)
			{
				if(courses[i].getCourseNumber() == courseNumber)
				{
					c = courses[i];
					
					break;
				}
			}
		}
		return c;
	}
}