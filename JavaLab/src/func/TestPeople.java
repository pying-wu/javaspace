package func;

public class TestPeople {
	
	public static void main(String[] args) {
		
		People p = new People();
		p.height = 1.7;//32
		p.weight = 70;
		System.out.printf("BMI=%.2f\r\n",p.getBMI());
		System.out.println("過重BMI="+People.overWeightBMI);
		
		System.out.println(Math.pow(2, 5));
		
		double bmi = People.BMI(1.7, 70);
		System.out.println("Static BMI = "+bmi);

	}

}