package Day21_Scope_Arrays;

public class C01_LokalVariables {
	String okulIsmi;
	 @SuppressWarnings("unused")
	public static void main(String[] args) {
		//Java Lokal Variable'lara default de�er atamas� yapmaz
		// Kodlar�m�zda sorun ya�amamak i�in 
		// olu�turdu�umuz variable'lara uygun bir de�er atamam�zda fayda ver
		
		int sayi=0;// int sayi; dersek java CTE veriyor
		System.out.println(sayi);
		
		//int sayi;// bir local'de ayn� isimde birden fazla variable OLU�TURAMAZ
         // String sayi; //Data t�r� farkl� olsada Java buna izin vermez
		String isim="Ali";
		
	}
	public static void staticMethod() {
		//sayi; //Bir local'de olu�turulan variable (method'Lar�n static olup olmamas�na 
	         // ba�l� olmaks�z�n) farkl� local'de kullan�lamaz.
	 
	@SuppressWarnings("unused")
	String isim="Ali";
	
	}
	

}

