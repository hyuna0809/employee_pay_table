package employeePay;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {
	

	public static void main(String[] args) {
		
		//Employee ep = new Employee(",");
		RegEmployee rg = new RegEmployee(null, null, null, 0, null);
		TempEmployee tp = new TempEmployee(null, null, null, 0);
		Staff st = new Staff(null, null, null, 0);
		
		
		Scanner in = new Scanner(System.in);
		
		int[] num;
		
		System.out.print("입력 자료 수 : ");
		 int A = in.nextInt();
		num = new int[A];
		
		int[] x = new int[A];
		
		for(int i=0; i<num.length; i++) {
		
		System.out.print("사원번호, 이름... ");
		//ep.name = in.next();
		//ep.sno = in.next();
		
		String a = in.next();
		String b = in.next();
		
		Employee ep = new Employee(a,b);
		ep.name =in.next();
		
		System.out.print("사원의 근무유형: (1:CEO, 2:정규직, 3:임시직)...");
		 x[i] = in.nextInt();
		 
		
		 
		 
		 
		 
		switch (x[i]) {
		case 1:
			System.out.print("직책, 월 임금....");
			a="가";
			st.title = in.next();
			st.staffpay = in.nextInt();
			//Employee ep1 = new Staff(null, null, null, A);
			break;
		case 2:
			System.out.print("부서, 업무, 월 임금....");
			rg.regtitle = in.next();
			rg.dept = in.next();
			rg.regpay = in.nextInt();
			break;
		case 3:
			System.out.print("부서, 월 근무시간 수....");
			tp.dept = in.next();
			tp.temphour = in.nextInt();
			break;
		default :
			System.out.print("근무유형 오류 재입력...");
			i -=1;
			System.out.println();
		}
		
		}	
		
		
		
		System.out.println("급여보고서");
		
		
		for(int i=0; i<A; i++) {
			if(x[i]==1)
				System.out.println(st.toString() + st.earnings(A));
			else if(x[i]==2)
				System.out.println(rg.toString() + rg.earnings(A));
			else if(x[i]==3)
				System.out.println(tp.toString()+ tp.earnings(A));
			
			
		}
		
		
		
	}

	
}



/*
 
 String no,name;
 
 //main메서드 매개변수인 args를 배열 선언한다.
 int n = Integer.parsdInt(args[0]);
 Scanner scan = new Scanner(System.in);
 //부모의 클래스를 입력하는 개수로 배열 만든다.
 Employee[] emp = new Employee[n];
 
 System.out.println("입력 자료 수 :" +n);
 

for(데이터타입 변수 : emp){ }
 
 

 */


























