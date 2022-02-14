class Accounting{
 public static double valueOfSupply;
 public static double vatRate = 0.1;
 public Accounting(double valueOfSupply) {
	 this.valueOfSupply = valueOfSupply;
 }
 public double getVAT() {
        return valueOfSupply * vatRate;
    }
public double getTotal() {
    	return valueOfSupply + getVAT();
    }
}
  // 인스턴스화 시킨 Accountion에서 접근할려면 static이 있으면안된다.



public class AccountiongApp {
    public static void main(String[] args) {
    	//수십가지의 변수가 생길수 있을 경우도 있음으로 인스턴스화 시켜 훨신 효율적으로 사용한다
    	Accounting a1 = new Accounting(10000.0);
    	Accounting a2 = new Accounting(20000.0);
    	
    	System.out.println("Valu of supply:" + a1.valueOfSupply);
    	System.out.println("Valu of supply:" + a2.valueOfSupply);
    	
    	System.out.println("VAT:" + a1.getVAT());
    	System.out.println("VAT:" + a2.getVAT());
    	
    	System.out.println("Total:" + a1.getTotal());
    	System.out.println("Total:" + a2.getTotal());
    	
    	
    	
//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//    	Accounting.valueOfSupply = 20000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply); 
//        
//        System.out.println("VAT : " + Accounting.getVAT());
//        System.out.println("Total : " + Accounting.getTotal());
    }
 
}