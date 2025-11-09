package PRACTISE;

public class JavaBreakForLoop {
	public static void main(String[] args) {
		
for (int i=1; i<10; i++)
{
	if(i==4)     // same as for loop but it stops when reached the value 4 even though i<10
	{
		break;
	}
	System.out.println(i);
}
}
}
