package Interface;
import java.lang.*;
import java.util.*;
import java.io.*;
import Class.*;
import ForCreateFile.*;

public interface StudentOperations
{
	void setStudent(Student s);
	Student getStudent(int sid);
	void insertStudent(Student s);
	void removeStudent(Student s);
	void showAllStudents();
}