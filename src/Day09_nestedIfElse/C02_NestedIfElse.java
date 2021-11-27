package Day09_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		//Soru12)Kullanýcýdan 4 basamakli bir sayi girmesini isteyin. 
        //Girdiði sayi 5’e  bölünüyorsa son rakamýný kontrol edin. 
        // Son rakamý 0 ise ekrana “5’e bölünen  çift sayý” yazdýrýn. 
        // Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.  
         //Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.

	    Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklý   bir sayý giriniz:");
        int sayi=scan.nextInt();
        
        if (sayi<1000||sayi>9999) {
			System.out.println("4 basamaklý  pozitif sayi girmelisiniz");
		} else {
           if (sayi%5==0) { // beþe tam bölünenler
			if (sayi%10==0) {//son rakam 0
				System.out.println("Beþe tam bölünen çift sayý");
			
			} else {// son rakam 5
                System.out.println("Beþe Tam bölünen tek sayi");
			}

           
           } else {// beþe tam bölünemeyenler
  
			System.out.println("Tekrar Deneyin");
		}
		}
        
        
        scan.close();

	}

}
