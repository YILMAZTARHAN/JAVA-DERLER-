package day10_ternary_SwitchCase;

public class C06_NestedTernary {

	public static void main(String[] args) {
		// Soru2 : Kullanicidan bir harf isteyin
				// kucuk harf ise consola �Kucuk Harf� ,
				// buyuk harfse consola �Buyuk Harf�
				// yoksa �girdiginiz karakter harf degil� yazdirin.

	 char krk='s';
	
		
		
		
		//String sonuc=(krk>='a'&& krk<='z') ? "K���k Harf" :(//�art yanl�� ise sonu�);
	
	String sonuc=(krk>='a' && krk<='z') ? "K���k Harf" :(
			      (krk>='A' && krk<='Z') ? "B�y�k Harf" :"girilen karakter harf de�il"
	                  );
	
	
	System.out.println(sonuc);
	
	
	
	}

}
