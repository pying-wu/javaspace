package func;

public class People {
	//static不需要物件,也無法使用物件的屬性
	//定義常數表示過重
	static double overWeightBMI = 24.0;
	public static double BMI(double h,double w) {
		return w / ( h *h );
	}
	
    //下方為物件屬性跟方法,需要new才能使用	
	double height;
	double weight;
	double s1;
	double s2;
	double s3;
	double s4;
	
	public double getBMI() {
        //double BMI = weight / ( height * height );
		double BMI = People.BMI(height, weight);
		return BMI;
	}
	//下方物件方法可以呼叫上方靜態方法;然上方無法直接呼叫下方的
	
}
