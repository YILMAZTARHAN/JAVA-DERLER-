package Day15_MEthodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		/*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
        Kullanici 2,3 veya 4 degerini girerse, 
        kullanicidan bu sayilari girmesini isteyin 
        ve sayilarin toplamini yazdirin. 
        Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse 
        �Cok sayi girdiniz, ben toplayamam� yazdirin.*/
		
		  Scanner scan = new Scanner(System.in);
	        
		   System.out.println("Lutfen toplamak istedi�iniz sayi adedini 2,3 veya 4 den biri olarak se�in");
		   
		   
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
			   d�rtsayiTopla();
			   break;
		   case 5:
			   System.out.println("�ok Say� Girdiniz, ben toplayamam");
		   break;
		   default:
			   System.out.println("ge�ersiz tercih");
		   
		   scan.close();
		   
		   }
	}

	private static void d�rtsayiTopla() {
		 Scanner scan = new Scanner(System.in);
			System.out.println("L�tfen 4 Say� Girin \nher say�dan sonra entera bas�n"); 
			 double sayi1=scan.nextDouble();
			 double sayi2=scan.nextDouble();
			 double sayi3=scan.nextDouble();
			 double sayi4=scan.nextDouble();
			 System.out.println("Girdi�iniz d�rt Say�n�n toplam�: " + (sayi1+sayi2+sayi3+sayi4));
			scan.close();
	}

	private static void ucsayiTopla() {
		 Scanner scan = new Scanner(System.in);
			System.out.println("L�tfen 3 Say� Girin \nher say�dan sonra entera bas�n"); 
			 double sayi1=scan.nextDouble();
			 double sayi2=scan.nextDouble();
			 double sayi3=scan.nextDouble();
			 
			 System.out.println("Girdi�iniz �� Say�n�n toplam�: " + (sayi1+sayi2+sayi3));
			scan.close();
		
	}

	private static void ikiSayiTopla() {
		 Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen iki Say� Girin \nher say�dan sonra entera bas�n"); 
		 double sayi1=scan.nextDouble();
		 double sayi2=scan.nextDouble();
		 
		 System.out.println("Girdi�iniz �ki Say�n�n toplam�: " + (sayi1+sayi2));
		scan.close();
	}

}
