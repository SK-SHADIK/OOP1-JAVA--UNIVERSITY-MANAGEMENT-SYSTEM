import java.lang.*;
import java.util.*;
import java.io.*;
import Class.*;
import Interface.*;
import ForCreateFile.*;

public class Start
{
	public static void main(String args[])
	{
		
		System.out.println("\n### WELCOME TO OUR UNIVERSITY MANAGEMENT SYSTEM ###\n");
		
		Scanner input = new Scanner(System.in);
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		ForCreateFile fc = new ForCreateFile();
		
		University U = new University();
		
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("----------------------------------------------");
			System.out.println("PLEASE SELECT A OPTION \n THE OPTIONS ARE : \n");
			System.out.println("1) Faculty Management \n2) Student Management \n3) Course Transactions \n4) EXIT");
			
			System.out.print("\nPLEASE ENTER A OPTION : ");
			int option = input.nextInt();
			System.out.println("----------------------------------------------");
			
			switch(option)
			{
				case 1:
				System.out.println("----------------------------------------------");
					System.out.println("OPTIONS FOR FACULTY MANAGEMENT : \n");
					System.out.println("\n1) Insert New Faculty \n2) Remove Existing Faculty \n3) Show All Faculty \n4) Going Back");

					
					System.out.print("\nPLEASE ENTER A OPTION : ");
					int fOption = input.nextInt();
					System.out.println("----------------------------------------------");
					switch(fOption)
					{
						case 1:
						
						System.out.println("----------------------------------------------");
						
							System.out.println("FOR INSERT NEW FACULTY : \n");
							
							Faculty F = new Faculty();
							
							System.out.print("PLEASE ENTER FACULTY NAME : ");
							String name = input.next();
							F.setName(name);
							
							System.out.print("PLEASE ENTER FACULTY ID : ");
							String fid = input.next();
							F.setFid(fid);
							
							System.out.print("PLEASE ENTER FACULTY SELARY : ");
							double salary = input.nextDouble();
							F.setSalary(salary);
							
							
							U.insertFaculty(F);
							System.out.println("----------------------------------------------");
							
							break;
							
						case 2:
						System.out.println("----------------------------------------------");
							System.out.println("FOR REMOVED EXISTING FACULTY : \n");
							
							System.out.print("PLEASE ENTER FACULTY ID : ");
							String fid2 = input.next();
							
							U.removeFaculty(U.getFaculty(fid2));
						System.out.println("----------------------------------------------");
						
							break;
						
						
						
						case 3:
						
						System.out.println("----------------------------------------------");	
							System.out.println("LIST OF ALL FACULTY : \n");
							
							U.showAllFaculty();
							System.out.println("----------------------------------------------");
							break;
						
						case 4:
							System.out.println("\nGOING BACK !!!\n");
						
							break;
						
						default:
						
							System.out.println("\nINVALID OPTION !!! \nCAUSE THIS OPTION IS GIVEN \nPLEASE CHOOSE OPTION AGAIN \n");
						
							break;
					}
					
					break;
				
				case 2:
				System.out.println("----------------------------------------------");
	
					System.out.println("OPTIONS FOR STUDENT MANAGEMENT : \n");
					
					System.out.println("\n1) Insert New Student \n2) Remove Existing Student \n3) Show All Student \n4) Going Back");
			
					
					System.out.print("\nPLEASE ENTER A OPTION : ");
					int SOption = input.nextInt();
					System.out.println("----------------------------------------------");
					
					switch(SOption)
					{
						case 1:
						System.out.println("----------------------------------------------");
							System.out.println("FOR INSERT NEW STUDENT : \n");
							
							Student S = new Student();						
							Course C = new Course();
							
							
							System.out.print("PLEASE ENTER STUDENT NAME : ");
							String name = input.next();							
							S.setName(name);
							System.out.print("PLEASE ENTER STUDENT ID : ");
							int sid = input.nextInt();
							S.setSid(sid);
							
							U.insertStudent(S);
						
							System.out.print("PLEASE ENTER COURSE NUMBER : ");
							int cn = input.nextInt();
							C.setCourseNumber(cn);
							System.out.print("PLEASE ENTER CREDIT : ");
							int credit = input.nextInt();
							C.setCredit(credit);
							
							U.getStudent(sid).insertCourse(C);
							
						System.out.println("----------------------------------------------");	
							break;
							
						case 2:
						System.out.println("----------------------------------------------");
							System.out.println("FOR REMOVED EXISTING STUDENT : \n");
							
							System.out.print("PLEASE ENTER STUDENT ID : ");
							int sid2 = input.nextInt();	
							
							Student S2 = U.getStudent(sid2);
							
							U.removeStudent(S2);
							System.out.println("----------------------------------------------");
							break;
				
						case 3:
						
						System.out.println("----------------------------------------------");
							
							System.out.println("LIST OF ALL STUDENT : ");
							
							U.showAllStudents();
							
							System.out.println("----------------------------------------------");
							break;
						
						case 4:							
						
							System.out.println("\nGOING BACK !!!\n");
							
							break;
						
						default:
					
							System.out.println("\nINVALID OPTION !!! \nCAUSE THIS OPTION IS GIVEN \nPLEASE CHOOSE OPTION AGAIN\n");
							
							break;
					}

					
					break;
					
									
				case 3:
				System.out.println("----------------------------------------------");
			
					System.out.println("OPTIONS FOR COURSE TRANSACTION : \n");
					System.out.println("\n1) Adding Course \n2) Dropping Course \n3) Going Back");
					
					
					System.out.print("\nPLEASE ENTER A OPTION : ");
					
					int COption = input.nextInt();
					System.out.println("----------------------------------------------");
					switch(COption)
					{
						case 1:
						System.out.println("----------------------------------------------");
						
							System.out.println("FOR ADDING COURSE : \n");
												
							System.out.print("PLEASE ENTER STUDENT ID : ");
							int sid = input.nextInt();
							
							System.out.print("PLEASE ENTER COURSE NUMBER : ");
							int cn = input.nextInt();
							
							System.out.print("PLEASE ENTER CREDIT : ");
							int crd2 = input.nextInt();
							
							if(crd2 > 0)
							{								
								Student S3 = U.getStudent(sid);
								Course C2 = S3.getCourse(cn);
								C2.adding(crd2);
								
								fc.writeInFile(crd2 +" ADDING COURSE NUMBER : "+cn);
							}
							
							System.out.println("----------------------------------------------");
							break;
							
						case 2:
						System.out.println("----------------------------------------------");
						
							System.out.println("FOR DROPPING COURSE : \n");
							
							System.out.print("PLEASE ENTER STUDENT ID : ");
							int sid3 = input.nextInt();
							
							System.out.print("PLEASE ENTER COURSE NUMBER : ");
							int cn2 = input.nextInt();
							System.out.print("PLEASE ENTER CREDIT : ");
							int credit3 = input.nextInt();
							
								
							Student S3 = U.getStudent(sid3);
							Course C2 = S3.getCourse(cn2);
							C2.dropping(credit3);
								
							fc.writeInFile(credit3 +" DROPPING COURSE NUMBER : "+cn2);
								
							
							System.out.println("----------------------------------------------");
							break;
							
						
						case 3:
						
							System.out.println("\nGOING BACK !!!\n");
						
							break;
							
						default:
						
							
							System.out.println("\nINVALID OPTION !!! \nCAUSE THIS OPTION IS GIVEN \nPLEASE CHOOSE OPTION AGAIN\n");
							break;
					}
					
					break;
					
				case 4:
				System.out.println("\nEXIT !!!\n");
					return;
					
					
				default:
				
					System.out.println("\nINVALID OPTION !!! \nCAUSE THIS OPTION IS GIVEN \nPLEASE CHOOSE OPTION AGAIN\n");
					
					break;
			}
		}
	}
}