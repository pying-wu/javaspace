package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Product {
	//必須要是抽象類別 才能使用抽象方法  有抽象方法必為抽象類別
	//抽象類別不一定會有抽象方法
	//public abstract void calc();

	public static final double TAX;
	static {
		TAX = 0.05;
		//System.out.println("static black");
	}
	
	String name; //public,private,protected, 空
	 int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/*public Product() {
	}
     */ //都沒寫時 系統會送一個空的
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String desc() {
		return String.format("名稱:%s,價錢:%d", name,price);
	}
	
	public static Date getDate(int year,int month,int dayOfMonth) {
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, dayOfMonth);		
		Date date = calendar.getTime();	
		return date;
	}
	
	
}
