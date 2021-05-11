package encap;

public class TestCar {

	public static void main(String[] args) {
		Car c = new Car('P');
		//c.model = "Prius";
		//c.setModel("Yaris");//放到m中,m再放到model裡 (Car頁面)
		
		//c.price = 1000000;
		
		System.out.printf("型號:%s,價錢:%7d,顏色:%c",c.getModel(),c.getPrice(),c.getColor());
		//讓人可設model,不能設price
	}

}
