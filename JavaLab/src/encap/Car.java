package encap;

public class Car {

	//Constructor
	public Car(char c) {
		//color = c;
		this("Yaris", c);//呼叫另一個建構方法
	}
	

	public Car(String model,char color) {
		//this.model = model;
		setModel(model);
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
		if ( model.equals("Yaris")) {
			this.price = 575000;
		}else if ( model.equals("Prius")) {
			this.price = 1090000;
		}else {
			System.out.println("Error:型號錯誤");
		}
	}
	private String model;//null
	private int price;//0
	private char color;//''
//	private String model; (可放上或下
//	private int price;
	public int getPrice() {
		return price;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	
		
}
