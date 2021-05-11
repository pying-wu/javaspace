package extend;

public class Notebook extends Product{
    //有繼承
//	public String name;
//	public int price;
	public int warranty;
	
	public Notebook(String name, int price, int warranty) {
		this.name = name; //如父類別封裝起來,無法直接繼承
		//setName(name);
		this.price = price;
		setPrice(price);
		
		this.warranty = warranty;
	}
    //annotation 註記
	@Override
	public String desc() {	
		return String.format("名稱:%s,價錢:%d,保固:%d天", name,price,warranty);
	}
	
	
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
	
	
	
}
