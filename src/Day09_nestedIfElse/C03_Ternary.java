package Day09_nestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
	
	int x=10;
	
	String tekMiCiftMi=x%2==0 ? "�ift sayi" :"tek sayi";
		
		System.out.println(tekMiCiftMi);
		
		// ternary iki t�rl� kullan�labilir
		//ya d�nen sonuca g�re bir variable olu�turup assign ederiz
		// veya direk syso i�ine yazip sonucu yazdiririz.
		
		
		
		//E�er ternary de d�necek sorular ayn� data t�r�nden de�ilse
		// atama yapamay�z, sadece syso ile yazabiliriz
		
		System.out.println(x>5 ?"Aferin": 4 );
		
		//String sonuc=x>5 ? "Aferin" : 4;
		
		

	}

}
