package func;

public class TestPeople {
	
	public static void main(String[] args) {
		
		People p = new People();
		p.height = 1.7;//32
		p.weight = 70;
		p.s1 = 10;
		System.out.printf("BMI=%.2f\r\n",p.getBMI()); //format時 用%n也可換行喔~
		System.out.println("過重BMI="+p.overWeightBMI);
		
		double bmi = People.BMI(1.7, 70);
		System.out.println("Static BMI = "+bmi);
		
		System.out.println(Math.pow(2, 5));
		System.out.println( String.join("~","+", "a","b","Hello","World")); //string的靜態方法
		

	}

}
