package ASSIGNMENTS;
/* ASSIGNMENT - 7
 * AUTHOR - SURAIYA
 * PROGRAM TO ILLUSTRATE SCANNER METHOD FOR FILLING APPLICATION FORM
 */
import java.util.Scanner;

public class ApplicationFormScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("	Enter the Student Details");
		System.out.println("        -------------------------");
		Scanner in = new Scanner(System.in);  // Creating Scanner Object
		System.out.println("Student Name :");
		String name =in.next();
		System.out.println("Date of Birth :");
		String dob =in.next();
		System.out.println("Class :");
		String std =in.next();
		System.out.println("Father's Name :");
		String name1 =in.next();
		System.out.println("Mother's Name :");
		String name2 =in.next();
		System.out.println("Father's Occupation :");
		String name3 =in.next(); 
		System.out.println("Mother's Occupation :");
		String name4 =in.next(); 
		System.out.println("");
		System.out.println("	Application For Admission");
		System.out.println("        -------------------------");
		System.out.println("Student Name : "+ name);
		System.out.println("Date of Birth : "+ dob);
		System.out.println("Class : "+ std);
		System.out.println("Father's Name : "+ name1);
		System.out.println("Mother's Name : "+ name2);
		System.out.println("Father's Occupation : "+ name3);
		System.out.println("Mother's Occupation : "+ name4);
		in.close();
	}

}
