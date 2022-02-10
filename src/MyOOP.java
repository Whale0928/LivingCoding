
public class MyOOP {

	public static void main(String[] args) {
			
			Print p1 = new Print("----","Lemon");
			p1.A();
			p1.A(); 
			p1.B();
			p1.B();
			
			Print p2 = new Print("***", "_Lemon");
			p2.A();
			p2.A();
			p2.B();
			p2.B();
	
			p1.B();
			p2.A();
			p1.B();
			p2.A();
	}
}

