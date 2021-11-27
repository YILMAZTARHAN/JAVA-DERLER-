package Day12_StringManipulation;

import java.util.Scanner;

public class C02_Indexof {

	public static void main(String[] args) {
	  //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
	// Girilen kelime cumlede kullanilmamis.
	// Girilen kelime cumlede 1 kere kullanilmis.
	// Girilen kelime cumlede 1’den fazla kullanilmis.
	
	

		  Scanner scan=new Scanner(System.in);
		  System.out.println("Lütfen Bir Cümle Giriniz");
		  
		  String cumle=scan.nextLine();
		  System.out.println("Lütfen Varlýðýný kontrol etmek için bir kelime giriniz:");
		  
		  String kelime=scan.next();
		  
		  int index=cumle.indexOf(kelime);
		  
		if (index<0) {
			System.out.println("Girilen kelime cümlede kullanýlmamýþ");
		}
		else if(cumle.indexOf(kelime, index+1)<0) {
			
			System.out.println("Girilen kelime cümlede 1 kere kullanýlmýþ");	
			
		}else {
			System.out.println("Girilen Kelime cümlede 1 den fazla kullanýlýmýþ");
		}
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}
