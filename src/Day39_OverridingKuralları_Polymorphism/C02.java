package Day39_OverridingKurallar�_Polymorphism;

public class C02 extends C01 {

	public static void main(String[] args) {
		
	C02 obj1=new C02();
	obj1.privateMethod();
	obj1.staticMethod();
	
	C01 obj2=new C02();
	//obj2.privateMethod();
	// Data t�r� C01 oldu�undan �ncelikle C01 class�ndaki
	// method a bakmam�z gerekir ancak privite oldu�undan ula�amay�z
	//ula�amad���m�z bir methodu override yapamay�z
	//Dolay�s�yla signure ayn� olmas�na RA�MEN bu ikisi fark� iki method olarak �al���r
	
	obj2.staticMethod();
	// static method'lar override edilemez
	// //Dolay�s�yla signure ayn� olmas�na RA�MEN bu ikisi fark� iki method olarak �al���r
	
	
	
	
	
	}
	
	
	
	public static void staticMethod() {
		System.out.println("Child class static method �al��t�");
	}
	
	private void privateMethod() {
		System.out.println("Child class private method");
	}
	
	/*public final void finalMethod() {
		System.out.println("Final class private method");

	}*/
 

}

