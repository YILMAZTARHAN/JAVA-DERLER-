package Day12_StringManipulation;

import java.util.Scanner;

public class C02_Indexof {

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
		  
		  int index=cumle.indexOf(kelime);
		  
		if (index<0) {
			System.out.println("Girilen kelime c�mlede kullan�lmam��");
		}
		else if(cumle.indexOf(kelime, index+1)<0) {
			
			System.out.println("Girilen kelime c�mlede 1 kere kullan�lm��");	
			
		}else {
			System.out.println("Girilen Kelime c�mlede 1 den fazla kullan�l�m��");
		}
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}
