
public class TestFor {

	public static void main(String[] args) {
		//for 迴圈
		
		int sum =0;
		for( int i = 1 ; i <= 100 ; i++ ) {
			if ( i % 2 == 0 ) {//i=1,skip
				               //i=2,不執行
				               //i=3,skip
				continue;
			}
			if ( i >= 50 ) {
				break;
			}
			
			System.out.println(i);
     		sum = sum + i;
		}
		System.out.println("總和="+sum);
        //System.out.println("final i="+ i);//101
	    System.out.println("-----------------");
		int i =1;
		int sumOfWhile = 0 ;
		while ( i <= 100 ) {
			sumOfWhile = sumOfWhile + i;
			i++;//計數字加1
			
		}
		System.out.println("finally i ="+i);
	    System.out.println("While總和="+sumOfWhile);
        
	    System.out.println("-------------do while---------");
	    int j =1;
	    int sumOfDoWhile =0;
	    do {
	    	sumOfDoWhile = sumOfDoWhile +j;
	    	j++;
	    }while ( j <= 100 );
	    System.out.println("Do While 總和="+sumOfDoWhile);
	    	
	    
	    	
	    	
	    	
	    }
	    
	    
	
	
	}
	

