package Day09_nestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
	
	int x=10;
	
	String tekMiCiftMi=x%2==0 ? "Çift sayi" :"tek sayi";
		
		System.out.println(tekMiCiftMi);
		
		// ternary iki türlü kullanýlabilir
		//ya dönen sonuca göre bir variable oluþturup assign ederiz
		// veya direk syso içine yazip sonucu yazdiririz.
		
		
		
		//Eðer ternary de dönecek sorular ayný data türünden deðilse
		// atama yapamayýz, sadece syso ile yazabiliriz
		
		System.out.println(x>5 ?"Aferin": 4 );
		
		//String sonuc=x>5 ? "Aferin" : 4;
		
		

	}

}
