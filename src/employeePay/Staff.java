package employeePay;


public class Staff extends Employee {
	
	// 필드추가 title, staffpay

	String title;
	long staffpay;
	
	
	public Staff(String ename, String esno, String title, long staffpay) {
		super(ename, esno);
		this.title = title;
		this.staffpay = staffpay;
	}


	@Override
	public String toString() {
		return super.toString()+", 직책:" + title + "," + " 급여액: " ;
	}


	@Override
	public long earnings(long pay) {
		return staffpay+20;
	}
	
	
	
	
	
	
}

