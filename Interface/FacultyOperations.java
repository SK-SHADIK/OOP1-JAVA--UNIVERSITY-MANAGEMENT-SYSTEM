package Interface;
import java.lang.*;
import java.util.*;
import java.io.*;
import Class.*;
import ForCreateFile.*;


public interface FacultyOperations
{
	void setFaculty(Faculty e);
	Faculty getFaculty(String fid);
	void insertFaculty(Faculty e);
	void removeFaculty(Faculty e);
	void showAllFaculty();
	
}