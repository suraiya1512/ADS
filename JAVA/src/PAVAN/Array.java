package PAVAN;

public class Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		int sum =0;
		int s=0;
		
		for(int i =0;i<a.length;i++)
		{
			sum =sum +a[i];
		}
		System.out.println("Sum of Array using Normal Loop= " +sum);
		System.out.println();
		for(int x:a)
		{
			 s = s+x;
		}
		System.out.println("Sum of Array using Enhanced Loop= " +sum);
		
		System.out.println("Even Nos. are ");
		for (int j=0; j<a.length; j++)
		{
		if(a[j]%2==0)
		{
		 System.out.print(a[j]+" ");
		}
		}
		System.out.println();
		System.out.println("Odd Nos. are ");
		for (int k=0;k<a.length;k++)
		{
		if(a[k]%2!=0)
		{
		 System.out.print(a[k]+ " ");
		}
		}
	}
	}

