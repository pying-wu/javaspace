
public class TestString {

	public static void main(String[] args) {
        //pool, new, immutable
		String name = "vincent";//pool會產生此字,回傳記憶體位置給name變數
		String name1 = "vincent";//第二次再要,pool直接回傳此字記憶體位置給name1,不會再產生新的字
		
		//name = "vincent1";//immutable
		String name2 = new String("vincent");//new會產生在heap區,不會在pool內
		
		System.out.println(name == name1);//兩者記憶體位置一樣
		
		System.out.println(name2 == name1);//heap(new) != pool(")
		//兩者記憶體位置不一樣
		
		System.out.println("equals="+ name2.equals(name1));//文字逐字比較,要用equals()
		//沒括號的是屬性,有括號的是方法
		
		System.out.println("來去吃飯.yo".length());//字串長度
		
		System.out.println("來去吃飯.yo".indexOf("來"));//第一字位置是0,找不到時會回傳-1
		
		System.out.println("來去吃飯.yo".contains("來1"));//true or false
		
		System.out.println("來去吃飯.yo".substring(2));//從第幾字開始截字
		System.out.println("來去吃飯.yo".substring(2,5));//2是含的,5是不含的
		
		System.out.println(  String.format("Hello World %s", "Helena")  );
		System.out.println(  String.format("Hello World %10s", "Helena")  );//10個字
		System.out.println(  String.format("%.4f", 10/3.0 )  );//小數點後4位
		System.out.println(  String.format("%12.1f", 10/3.0 )  );//總長12位,小數點後1位
		
		System.out.println(  String.format("rrr qqq %12d%%", 10 )  );//%%百分比
		System.out.printf("rrr qqq %12d%%", 10); //f: format;可寫比較少
		
		
		
	}

}
