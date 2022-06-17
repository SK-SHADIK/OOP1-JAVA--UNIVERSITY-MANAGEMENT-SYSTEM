package Interface;
import java.lang.*;
import java.util.*;
import java.io.*;
import Class.*;
import ForCreateFile.*;


public interface CourseOperations
{
	void insertCourse(Course c);
	void removeCourse(Course c);
	Course getCourse(int CourseNumber);
	void showAllCourse();
}