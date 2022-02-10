class Print {
	public String delimiter = "";
	public String code = "";
	
	//this는 인스턴스를 가르키는 특수한 기호이다
	public Print(String delimiter, String code) {
		this.delimiter = delimiter; //this으로 인해 생성자와 메소드를 구분할 수 있게 되엇다`
		this.code = code;
	}
	
    //public static void에서 static은 클래스의 소속일때 , just public void일 경우에는 인스턴스의 소속이다
    
    public void A() {  
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }
 
    public void B() {
        System.out.println(this.delimiter);
        System.out.println(this.code);
    }
}