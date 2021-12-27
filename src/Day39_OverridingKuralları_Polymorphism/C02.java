package Day39_OverridingKurallarý_Polymorphism;

public class C02 extends C01 {

	public static void main(String[] args) {
		
	C02 obj1=new C02();
	obj1.privateMethod();
	obj1.staticMethod();
	
	C01 obj2=new C02();
	//obj2.privateMethod();
	// Data türü C01 olduðundan öncelikle C01 classýndaki
	// method a bakmamýz gerekir ancak privite olduðundan ulaþamayýz
	//ulaþamadýðýmýz bir methodu override yapamayýz
	//Dolayýsýyla signure ayný olmasýna RAÐMEN bu ikisi farký iki method olarak çalýþýr
	
	obj2.staticMethod();
	// static method'lar override edilemez
	// //Dolayýsýyla signure ayný olmasýna RAÐMEN bu ikisi farký iki method olarak çalýþýr
	
	
	
	
	
	}
	
	
	
	public static void staticMethod() {
		System.out.println("Child class static method çalýþtý");
	}
	
	private void privateMethod() {
		System.out.println("Child class private method");
	}
	
	/*public final void finalMethod() {
		System.out.println("Final class private method");

	}*/
 

}

