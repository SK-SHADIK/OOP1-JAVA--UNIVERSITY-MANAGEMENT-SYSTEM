package Class;
import java.lang.*;
import java.util.*;
import java.io.*;
import Interface.*;
import ForCreateFile.*;

public class Faculty 
{
	private String name;
	private String fid;
	private double salary;
	
	public void setName (String name)
	{
		this.name = name;		
	}
	public void setFid (String fid)
	{
		this.fid = fid;
	}
	public void setSalary (double salary)
	{
		this.salary = salary;
	}
	public String getName ()
	{
		return name;
	}
	public String getFid ()
	{
		return fid;
	}
	public double getSalary ()
	{
		return salary;
	}
}