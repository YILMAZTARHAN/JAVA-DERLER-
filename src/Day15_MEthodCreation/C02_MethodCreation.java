package Day15_MEthodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		/*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
        Kullanici 2,3 veya 4 degerini girerse, 
        kullanicidan bu sayilari girmesini isteyin 
        ve sayilarin toplamini yazdirin. 
        Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
        “Cok sayi girdiniz, ben toplayamam” yazdirin.*/
		
		  Scanner scan = new Scanner(System.in);
	        
		   System.out.println("Lutfen toplamak istediðiniz sayi adedini 2,3 veya 4 den biri olarak seçin");
		   
		   
		   int tercih=scan.nextInt();
		   if (tercih>4) {
			tercih=5;
		}
		   
		   switch(tercih){
            		
		   case 2:
			   ikiSayiTopla();
			  break;
		   case 3:
			   ucsayiTopla();
		      break;
		   case  4:
			   dörtsayiTopla();
			   break;
		   case 5:
			   System.out.println("Çok Sayý Girdiniz, ben toplayamam");
		   break;
		   default:
			   System.out.println("geçersiz tercih");
		   
		   scan.close();
		   
		   }
	}

	private static void dörtsayiTopla() {
		 Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen 4 Sayý Girin \nher sayýdan sonra entera basýn"); 
			 double sayi1=scan.nextDouble();
			 double sayi2=scan.nextDouble();
			 double sayi3=scan.nextDouble();
			 double sayi4=scan.nextDouble();
			 System.out.println("Girdiðiniz dört Sayýnýn toplamý: " + (sayi1+sayi2+sayi3+sayi4));
			scan.close();
	}

	private static void ucsayiTopla() {
		 Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen 3 Sayý Girin \nher sayýdan sonra entera basýn"); 
			 double sayi1=scan.nextDouble();
			 double sayi2=scan.nextDouble();
			 double sayi3=scan.nextDouble();
			 
			 System.out.println("Girdiðiniz Üç Sayýnýn toplamý: " + (sayi1+sayi2+sayi3));
			scan.close();
		
	}

	private static void ikiSayiTopla() {
		 Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki Sayý Girin \nher sayýdan sonra entera basýn"); 
		 double sayi1=scan.nextDouble();
		 double sayi2=scan.nextDouble();
		 
		 System.out.println("Girdiðiniz Ýki Sayýnýn toplamý: " + (sayi1+sayi2));
		scan.close();
	}

}
