package day10_ternary_SwitchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// E�er �al��an kad�nsa 60 ya��ndan b�y�k oldu�unda emekli olabilir,
	     // �al��an erkekse 65 ya��ndan b�y�kse emekli olabilir.
	
	     // her seferinde scanner olu�turmak yerine
		//test datalar�m�z� variable olarak da olu�turabiliriz
		// ve kodn yaz�m� bitti�inde bu test datalar�n� de�i�tirerek 
		// kodlar�m�z� test edebiliriz.
		
		
		char cinsiyet='E';
	     int yas=71;
	     
	    String sonuc= cinsiyet=='K'?(yas>=60 ? "Emekli Olabilirsin":"Emekli Olamazs�n" ):
	    	                        (yas>=65 ? "Emekli Olabilirsin":"Emekli Olamazs�n");
	
	
	    System.out.println(sonuc);
	
	
	
	 
	
	}

}
