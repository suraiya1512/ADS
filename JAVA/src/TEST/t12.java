package TEST;

public class t12 {

	public static void main(String[] args) {
		// COUNT NO OF ODD & EVEN IN A DIGIT
	
		int n =123456789;
		int count =0, count1 = 0;
		
		while(n!=0)
		{
			n=n/10;
			if(n%2==0)
			
				count++;
			else 
			    count1++;
			
		}	
			System.out.println("Count of Even No.s :"+ count);
			System.out.println("Count of Odd No's :" + count1);
		
	}

}
 