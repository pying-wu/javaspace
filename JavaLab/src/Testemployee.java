
public class Testemployee {

	public static void main(String[] args) {
		
		int      a = 1;
		Employee emp = new Employee ();//產生物件
        emp.empno = 1;
        emp.name = "Helena";
		
        Employee emp2 = new Employee ();
        emp2.empno = 2;
        emp2.name = "Mary";
        //取值跟設值都是用.
        System.out.println(emp.name);
        System.out.println(emp2.empno +",name=" + emp2.name );
        System.out.println(a == 1);//true
		System.out.println(emp == emp2 );//0800 == 0900
		
		emp2 = emp;// emp2 = 0800
		System.out.println(emp == emp2 );//0800 == 0900
		
		//emp = null;
		//emp2 = null;
		System.out.println(emp.name);
		
		
		
	}

}
