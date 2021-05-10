
public class Ttest {

	public static void main(String[] args) {
		
		double ccc = 10.34567;
		int aaa = (int)ccc; //強制轉型
		System.out.println("aaa="+aaa);

		int age = 20;
		boolean isAdult = age == 18;// ==, !=
		System.out.println(isAdult );
		
		int years = 31;
		boolean Dinge = years != 30;
		System.out.println(Dinge);
		
		int jahre = 25;
		boolean istKind = (jahre > 18 || jahre < 30);//&&,||,!
		System.out.println(istKind);
		
		System.out.println( 12 & 6 );//bit &
		
		System.out.println( 2 << 2 );// << *2的n次方
		
		System.out.println(2>>1);
		
		//age++;
		
		System.out.println("age="+ (++age) );
	
		System.out.println("age="+ (age++) );
	    System.out.println(age); 
	    
	    jahre += 10;// age = age +10
	    System.out.println(age);
		
	    System.out.println(age > 18 ? "成年" : "未成年" );
	    
	    int sales = 2000;
	    int salary = 100;
	    salary = sales > 1000 ? salary*2 : salary-500;
	    System.out.println("salary="+salary);
	    
	    int egg = 40;
	    if ( egg >= 30) {//先打一個括號,按enter,自動幫你補另一個括號
	    	System.out.println("溫泉蛋");	        
	    }else if ( egg >= 18 ) {
	    	System.out.println("糖心蛋");
	    }else {
	    	System.out.println("生蛋");
	    }
	    
	    int eee = 41;
	    if ( eee >= 18) {
	    	
	    	System.out.println("溫泉蛋");	        
	    	if ( egg >= 30) {
	    	  System.out.println("糖心蛋");
	    	}
	    
	    }else {
	    	System.out.println("生蛋");
	    }	    
		
		int classroom = 204;
		switch (classroom) {
		    case 204:
		        System.out.println("人數大於等於30人");
		        break;
		    case 305:
		    	System.out.println("人數小於等於30人");
		    	break;
            default:
            	System.out.println("default 其它");
		    	
		}
		
		
		
		
	}

}
