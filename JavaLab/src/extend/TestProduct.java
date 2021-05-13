package extend;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

	public static void main(String[] args) {
		//Notebook具備兩個型態,一個是本身的Notebook,另一個是繼承來的Product 俗稱多型
		Notebook nb = new Notebook("Asus", 30000, 365);
		System.out.println(nb.desc());
		
		Product item = nb;   //Notebook-> Product,子類別轉型成父類別
		System.out.println(item instanceof Notebook );//true
		System.out.println(item instanceof Food );//false
		if ( item instanceof Notebook  ) {
			Notebook nb1 = (Notebook)item;
			System.out.println("保固"+nb1.getWarranty());
		}
		
		
		Notebook nb1 = (Notebook)item; //Product -> Notebook 父類別轉型成子類別
		//Food f1 = (Food)item;//Product -> Food 父類別轉型成子類別 因實際上不是Food,所以會有問題
		//System.out.printf("%s,%d,%d%n",nb.getName(),nb.getPrice(),nb.getWarranty());
		//nb.getWarranty();  Product上並無此方法
		//nb.getName();
		
		//先取得日曆,再取得日期  月份起始值為0(一月)
		//GregorianCalendar calendar = new GregorianCalendar(2021, 4, 13);
		GregorianCalendar calendar = new GregorianCalendar(2021, Calendar.MAY, 13);
		
		Date date = calendar.getTime();
		
		Food food = new Food("肉鬆",200, date  );
		System.out.println(food.desc());
		
//		Product[] items = new Product[] {nb, food};
		Product[] items = {nb, food};
		buy(items);
//		buy(nb);
//		buy(food);
	
	}
	
	public static void buy(Product[] ps) {
		int sum = 0 ;
		for( Product eachItem : ps) {
			System.out.println("買入:"+eachItem.desc());
            sum = sum + eachItem.getPrice(); 			
		}
		System.out.println("總金額:"+sum);
	}
	
    /*
	public static void buy(Notebook n) {
		System.out.println("買入:"+n.desc());
	}
	public static void buy(Food f) {
		System.out.println("買入:"+f.desc());
	}
	*/
}
