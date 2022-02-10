class Foo{
	public static String ClassVar = "I Class Var"; 
	public  String instanceVar = "I instanc Var";
	
	
	public static void ClassMethod() {  //static으로 인해 클래스로 판정
		System.out.println(ClassVar); //fine
	//	System.out.println(instanceVar); //can't
	}
	public void instancMethod() {   	//static이 없기 떄문에 인스턴스 메소드가 됨
		System.out.println(ClassVar); //fine
		System.out.println(instanceVar); //fine
	}
	
}	


public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.ClassVar); //ok 
		//System.out.println(Foo.instanceVar); //errer
		Foo.ClassMethod();
		//Foo.instancMethod();
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.ClassVar);  // FOO클래스 안의 클래스 바가 호출되어 출력됨
		System.out.println(f1.instanceVar);// FOO클래스 안의 인스턴스 바가 호출되어 출력됨
		
		f1.ClassVar = "changed by f1";  //static으로 선언된 클래스바는 원본이 수정된다
		System.out.println(f1.ClassVar);  // changed by f1
		System.out.println(f2.ClassVar);// changed by f1
		
		
		//인스턴스는 '복제'해서 사용하는것 이기 때문에 가능한것이다 static일 경우에는 복제가 아닌 참조이니 원복이 수정되는 것이다.
		f1.instanceVar = "changed by f1 instance";  //static으로 선언된 클래스바는 원본이 수정된다
		System.out.println(f1.instanceVar);  // changed by f1
		System.out.println(f2.instanceVar);// i instanceVar 
	
	}

}


//static = Class, no Static = Instance
//static variable 의 값을 바꾸면 Instance 전체의 값이 바뀌나
//no static variable 값을 바꾸면 해당 Instance 의 값만 바뀌고 다른 Instance 값은 바뀌지 않는다.
//따라서 Class 내 동일한 data 값이 필요한 variable은 static 이 바람직하다.

