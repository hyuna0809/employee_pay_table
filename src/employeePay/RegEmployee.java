package employeePay;

public class RegEmployee extends Employee {
	
	String dept;
	long regpay;
	String regtitle;
	
	public RegEmployee(String ename, String esno,String dept, long regpay, String regtitle) {
		super(ename,esno);
		this.dept = dept;
		this.regpay = regpay;
		this.regtitle = regtitle;
	}

	@Override
	public String toString() {
		return super.toString() + ", 부서:" + regtitle + ", 담당업무:" + dept + ", 급여액: ";
	}

	@Override
	public long earnings(long pay) {
		return regpay+10;
	}
	
	

}
