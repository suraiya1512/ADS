package PRACTISE;

public class BreakAndContinueInWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		while(i<5) {
			System.out.println("i= " +i);
			i++;
      if(i==4) {
    	  break;
      }
	}
	int j=1;
	while(j<7) {
		if(j==3) {
			j++;
			continue;
		}
			System.out.println("j = "+j);
			j++;
		}
	}
	}

