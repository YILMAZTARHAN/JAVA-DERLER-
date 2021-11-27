package Day21_Scope_Arrays;

public class C01_LokalVariables {
	String okulIsmi;
	 @SuppressWarnings("unused")
	public static void main(String[] args) {
		//Java Lokal Variable'lara default deðer atamasý yapmaz
		// Kodlarýmýzda sorun yaþamamak için 
		// oluþturduðumuz variable'lara uygun bir deðer atamamýzda fayda ver
		
		int sayi=0;// int sayi; dersek java CTE veriyor
		System.out.println(sayi);
		
		//int sayi;// bir local'de ayný isimde birden fazla variable OLUÞTURAMAZ
         // String sayi; //Data türü farklý olsada Java buna izin vermez
		String isim="Ali";
		
	}
	public static void staticMethod() {
		//sayi; //Bir local'de oluþturulan variable (method'Larýn static olup olmamasýna 
	         // baðlý olmaksýzýn) farklý local'de kullanýlamaz.
	 
	@SuppressWarnings("unused")
	String isim="Ali";
	
	}
	

}

