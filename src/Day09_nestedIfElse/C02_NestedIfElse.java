package Day09_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		//Soru12)Kullan�c�dan 4 basamakli bir sayi girmesini isteyin. 
        //Girdi�i sayi 5�e  b�l�n�yorsa son rakam�n� kontrol edin. 
        // Son rakam� 0 ise ekrana �5�e b�l�nen  �ift say�� yazd�r�n. 
        // Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.  
         //Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.

	    Scanner scan = new Scanner(System.in);
        System.out.println("L�tfen 4 basamakl�   bir say� giriniz:");
        int sayi=scan.nextInt();
        
        if (sayi<1000||sayi>9999) {
			System.out.println("4 basamakl�  pozitif sayi girmelisiniz");
		} else {
           if (sayi%5==0) { // be�e tam b�l�nenler
			if (sayi%10==0) {//son rakam 0
				System.out.println("Be�e tam b�l�nen �ift say�");
			
			} else {// son rakam 5
                System.out.println("Be�e Tam b�l�nen tek sayi");
			}

           
           } else {// be�e tam b�l�nemeyenler
  
			System.out.println("Tekrar Deneyin");
		}
		}
        
        
        scan.close();

	}

}
