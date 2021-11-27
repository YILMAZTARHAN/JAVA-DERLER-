package Day12_StringManipulation;

import java.util.Scanner;

public class C04_LastÝndexOf {

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
			  
			  int ilkIndex=cumle.indexOf(kelime);
              int sonIndex=cumle.lastIndexOf(kelime);
              
              
              
              if (ilkIndex==(-1)) {
				System.out.println("Girilen Kelime cümlede kullanýlmamýþ");
			}
              else if (ilkIndex==sonIndex) {
				System.err.println("Girilen Kelime Cümlede 1 Kere Kullanýlmýþ");
			}
	
              else {
				System.out.println("Girilen  Kelime Cümlede 1'den Fazla Kullanýlmýþ");
			}
	
	scan.close();
	}
	

}
