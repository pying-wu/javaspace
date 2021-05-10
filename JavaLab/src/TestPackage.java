import category.Item; //import category.*;


//category.TestPackage
public class TestPackage {

	public static void main(String[] args) {
        // 在package下的類別必須使用全名
//	    category.Item item = new category.Item();	
	    Item item = new Item();	
		item.name = "Asus notebook";
	    
	    System.out.println("TestPackage's main : "+item.name);	
	    
	}

}
