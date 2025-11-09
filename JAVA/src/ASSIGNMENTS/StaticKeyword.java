package ASSIGNMENTS;
/*ASSIGNMENT 4.1
 * AUTHOR - SURAIYA
 * PROGRAM TO ILLUSTRATE THE STATIC VARIABLE, METHOD & BLOCK
 */
public class StaticKeyword {
	String Emp,id;           // declaration
	static int n=1;         //initialization
	static String com = "Florence";   // Static variable
	
	static {                       // Static Block
		System.out.println("Florence Employee List : ");
		System.out.println("------------------------ ");
		System.out.println("S.No	EmpID  	Employee Name	Company Name ");
				}
    static void list(String id, String Emp)  //static method
    {
    	  	System.out.println(n+"	"+id+"	   "+Emp+"	 "+com);
       	   	n++;
    }
	public static void main(String[] args)  // Main Method 
	{   
		// TODO Auto-generated method stub
	if(n>0) {	
     list("FSC001", "Suraiya");
     list("FSC002", "Syed...");
     list("FSC003", "Imran..");
     list("FSC004", "Madhan");
       	}
	}
}
