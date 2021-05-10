
public class Test9x9 {

	public static void main(String[] args) {
		//ixj
		//1x1=1 ...
		//2x1=2 ...

	    for (int i=1 ; i<=9; i++ ) { //連續,可跑出1-9的乘法表
		
		    for(int j=1 ; j<=9; j++ ) {
			   System.out.print(i+ "x" + j + "=" +(i*j) + "\t " ); //對齊
		    }
		    System.out.println(); //換行
	    }	
		
	}

}
