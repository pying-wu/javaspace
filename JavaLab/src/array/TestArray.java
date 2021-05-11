package array;

public class TestArray {

	public static void main(String[] args) {

		//int, double float char boolean
		
		
//		int [] ages = new int[10];
		int [] ages = { 1,2,3 }; //length =3,快速產生陣列方式:用大括號
//		ages[0] = 1; //第一格,起始位置是0
//		ages[1] = 2;
//		ages[2] = 3;
		
		for( int a : ages ) {
			System.out.println(a);
		}
		
		System.out.println("-----------");
		
		
		System.out.println(ages[1]);
		System.out.println("-----------");
		System.out.println("length="+ages.length);//
		System.out.println(ages[9]);
		System.out.println("finish");
		ages = null;
		
		
	}

}
