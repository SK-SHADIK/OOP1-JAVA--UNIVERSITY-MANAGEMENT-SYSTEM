package Class;
import java.lang.*;
import java.util.*;
import java.io.*;
import Interface.*;
import ForCreateFile.*;


public class University implements FacultyOperations, StudentOperations
{
	private Faculty faculty[] = new Faculty [1000];
	private Student students[] = new Student [1000];

	public void setFaculty(Faculty e)
	{

	}

	public void insertFaculty(Faculty e)
	{

		for(int i = 0; i < faculty.length; i++)
		{
			if(faculty[i] == null)
			{
				faculty[i] = e;
				
				System.out.println("\nFACULTY INSERTION IS SUCCESSFULLY\n");
				
				break;
			}
		}

	}

	public void removeFaculty(Faculty e)
	{

		for(int i = 0; i < faculty.length; i++)
		{
			if(faculty[i] == e)
			{
				faculty[i] = null;
				
				System.out.println("\nFACULTY ID IS FOUND \n FACULTY REMOVED SUCCESSFULLY\n");
				
				break;
			}
			
		}

	}

	public void showAllFaculty()
	{
		for(Faculty e : faculty)
		{
			if(e != null){
				
				System.out.println("----------------------------------------------");
				System.out.println("THE FACULTY NAME IS : "+ e.getName());
				System.out.println("THE ID IS : "+ e.getFid());
				System.out.println("AND SALARY IS: "+ e.getSalary());
				System.out.println("----------------------------------------------");
			}
		}

	}

	public Faculty getFaculty(String fid)
	{
		Faculty e = null;

		for(int i = 0; i < faculty.length; i++)
		{
			if(faculty[i] != null)
			{
				if(faculty[i].getFid().equals(fid))
				{
					e = faculty[i];
					
					break;
				}
			}
		}
		
		return e;
	}

	public void setStudent(Student s)
	{

	}

	public void insertStudent(Student s)
	{

		for(int i = 0; i < students.length; i++)
		{
			if(students[i] == null)
			{
				students[i] = s;
				
				System.out.println("\nSTUDENT INSERTION IS SUCCESSFULLY\n");
				
				break;
			}
		}

	}

	public void removeStudent(Student s)
	{

		for(int i = 0; i < students.length; i++)
		{
			if(students[i] == s)
			{
				students[i] = null;
			
				System.out.println("\nSTUDENT ID IS FOUND \n STUDENT REMOVED SUCCESSFULLY\n");
				
				break;
			}
		}

	}

	public void showAllStudents()
	{
		for(Student s : students)
		{
			if(s != null)
			{
				System.out.println("----------------------------------------------");
				System.out.println("THE STUDENT NAME IS : "+ s.getName());
				System.out.println("THE ID NUMBER IS : "+ s.getSid());
				s.showAllCourse();
				System.out.println("----------------------------------------------");
			}
		}
	}

	public Student getStudent(int sid)
	{
		Student s = null;

		for(int i = 0; i < students.length; i++)
		{
			if(students[i] != null)
			{
				if(students[i].getSid() == sid)
				{
					s = students[i];
					
					break;
				}
			}
		}
		return s;
	}

}