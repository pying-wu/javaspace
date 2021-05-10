package func;

public class TestFunc {

	public static void main(String[] args) {
		
		 add(1, 1);//void不會有回傳值
		 int sum = add1(1,1);
		System.out.println(sum);
		

	}
    //            2    =     1  +    1
	//void:表示這個方法沒有回傳,單純只是要執行方法內的程式
	public static void add(int a , int b ) {
		
		int c = a +b; // c=1+1
		System.out.println("c="+c);
		//return c; //int...return
		
	}
     public static int add1(int a , int b ) {
		
		int c = a +b; // c=1+1
		System.out.println("c="+c);
		return c; //int...return
		
	}
	
}
