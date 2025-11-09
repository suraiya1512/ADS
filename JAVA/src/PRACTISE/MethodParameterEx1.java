package PRACTISE;

public class MethodParameterEx1 {
	void method(String name) {
		System.out.println(name+" Arafat");
	}
	static	void met(String name) {
		System.out.println(name+" Naadiya");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParameterEx1 Obj = new MethodParameterEx1();
		Obj.method("Yasser");
		met("Almass");
		Obj.method("Syed");
		return ;
	}
}
