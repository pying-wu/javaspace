package interFace;
//ctrl+1: fix
public class Notebook extends Product implements Warrantable {
	//有繼承
    //	public String name;
    //	public int price;
	//Notebook具備三種型態:Notebook,Product,Warrantable
	@Override
	public int 保固天數() {		
		return warranty;
	}
	public int warranty;
	
	public Notebook(String name, int price, int warranty) {
		//super();//當沒指令時，compiler會自動加一個沒參數的建構類別在這裡
		super(name,price); //用super呼叫 來取代下面兩行
		//this.name = name; //如父類別封裝起來,無法直接繼承
		//this.price = price;
		//setName(name);
		//setPrice(price);
		this.warranty = warranty;
	}
    //annotation 註記
	@Override
	public String desc() {	
		String info = super.desc();//呼叫父類別的 名稱:%s,價錢:%d
		
		return String.format("%s,保固:%d天呦!", info ,warranty);
	}
	
	
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
	
	
	
}
