package employeePay;

public class TempEmployee extends Employee {

	String dept;
	long temphour;
	
	public TempEmployee(String ename, String esno, String dept, long temphour) {
		super(ename,esno);
		this.dept = dept;
		this.temphour = temphour;
	}

	@Override
	public String toString() {
		return super.toString() +  ", 부서:" + dept + ", 근무시간수:" + temphour + ", 급여액:";
	}

	@Override
	public long earnings(long pay) {
		return temphour*3;
	
	}
	
	
	
}
