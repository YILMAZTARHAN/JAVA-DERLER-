package Day12_StringManipulation;

import java.util.Scanner;

public class C04_Last�ndexOf {

	public static void main(String[] args) {
		  //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		// Girilen kelime cumlede kullanilmamis.
		// Girilen kelime cumlede 1 kere kullanilmis.
		// Girilen kelime cumlede 1�den fazla kullanilmis.
		
		

			  Scanner scan=new Scanner(System.in);
			  System.out.println("L�tfen Bir C�mle Giriniz");
			  
			  String cumle=scan.nextLine();
			  System.out.println("L�tfen Varl���n� kontrol etmek i�in bir kelime giriniz:");
			  
			  String kelime=scan.next();
			  
			  int ilkIndex=cumle.indexOf(kelime);
              int sonIndex=cumle.lastIndexOf(kelime);
              
              
              
              if (ilkIndex==(-1)) {
				System.out.println("Girilen Kelime c�mlede kullan�lmam��");
			}
              else if (ilkIndex==sonIndex) {
				System.err.println("Girilen Kelime C�mlede 1 Kere Kullan�lm��");
			}
	
              else {
				System.out.println("Girilen  Kelime C�mlede 1'den Fazla Kullan�lm��");
			}
	
	scan.close();
	}
	

}
