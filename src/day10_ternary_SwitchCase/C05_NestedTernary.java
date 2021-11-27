package day10_ternary_SwitchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// Eðer çalýþan kadýnsa 60 yaþýndan büyük olduðunda emekli olabilir,
	     // Çalýþan erkekse 65 yaþýndan büyükse emekli olabilir.
	
	     // her seferinde scanner oluþturmak yerine
		//test datalarýmýzý variable olarak da oluþturabiliriz
		// ve kodn yazýmý bittiðinde bu test datalarýný deðiþtirerek 
		// kodlarýmýzý test edebiliriz.
		
		
		char cinsiyet='E';
	     int yas=71;
	     
	    String sonuc= cinsiyet=='K'?(yas>=60 ? "Emekli Olabilirsin":"Emekli Olamazsýn" ):
	    	                        (yas>=65 ? "Emekli Olabilirsin":"Emekli Olamazsýn");
	
	
	    System.out.println(sonuc);
	
	
	
	 
	
	}

}
