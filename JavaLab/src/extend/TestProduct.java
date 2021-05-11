package extend;

public class TestProduct {

	public static void main(String[] args) {
		
		Notebook nb = new Notebook("Asus", 30000, 365);
		System.out.printf("%s,%d,%d%n",nb.getName(),nb.getPrice(),nb.getWarranty());

		System.out.println(nb.desc());
		
		Product a = new Product("冷氣",50000);
		System.out.println(a.name);
		
		
	}

}
