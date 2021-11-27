package day10_ternary_SwitchCase;

public class C06_NestedTernary {

	public static void main(String[] args) {
		// Soru2 : Kullanicidan bir harf isteyin
				// kucuk harf ise consola “Kucuk Harf” ,
				// buyuk harfse consola “Buyuk Harf”
				// yoksa “girdiginiz karakter harf degil” yazdirin.

	 char krk='s';
	
		
		
		
		//String sonuc=(krk>='a'&& krk<='z') ? "Küçük Harf" :(//þart yanlýþ ise sonuç);
	
	String sonuc=(krk>='a' && krk<='z') ? "Küçük Harf" :(
			      (krk>='A' && krk<='Z') ? "Büyük Harf" :"girilen karakter harf deðil"
	                  );
	
	
	System.out.println(sonuc);
	
	
	
	}

}
