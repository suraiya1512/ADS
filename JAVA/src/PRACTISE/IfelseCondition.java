package PRACTISE;

public class IfelseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x = 10, t = 25 ;
    
    if(x>=18) {
    	System.out.println("Eligible for Voting");
    }
    else {
    	System.out.println("Not eligible for Voting");
    }
    
 String r = (t < 18) ? "Good Day":"Good Evning"; // Ternary Operations
 System.out.println(r);
}
}
