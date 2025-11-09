package PRACTISE;

// OVERLOADING - DIFFERENT DATA TYPES
class Add {
	static int add(int a, int b) {
		return a+b;
	}
	static String add(String a, String b) {
		return a + b;
	}
}

public class Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add.add("sum of first number + ", "sum of second number"));
        System.out.println(Add.add(5, 10));
	}
}
