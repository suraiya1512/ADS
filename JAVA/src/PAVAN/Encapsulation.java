package PAVAN;

public class Encapsulation {
    private int accNo;
	private String name;
	private double amt;

	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	
	public static void main(String[] args) {
	
		Encapsulation O = new Encapsulation();
		O.setAccNo(12345);
		O.setName("Suraiya");
		O.setAmt(100000);

		System.out.println(O.getAccNo());
		System.out.println(O.getName());
		System.out.println(O.getAmt());
	}

}
