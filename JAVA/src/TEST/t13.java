package TEST;

public class t13 {

	public static void main(String[] args) {
		// SUM OF DIGIT IN A NO

	int n=1234567;
	int sum = 0;
	
	while(n!=0)
	{
		int rem =n%10;
		sum = sum+rem;
		n=n/10;
	}
	System.out.println("Sum of Digit :"+sum);
		
	}

}
