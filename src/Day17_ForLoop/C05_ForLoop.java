package Day17_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
    //Soru 10 ) Kullanicidan iki sayi isteyin. 
   //Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
	//sonucu yazdiran bir program yaziniz
		
		
		 Scanner scan = new Scanner(System.in);
	      System.out.println("lutfen aradaki t�m say�lar� toplamak i�in iki tam say� giriniz...");
	      int sayi1=scan.nextInt();
	      int sayi2=scan.nextInt();
	      
	      int kucuk=0;
	      int buyuk=0;
	      
	      if (sayi1>sayi2) {
			buyuk=sayi1;
			kucuk=sayi2;
			
		}else {
			buyuk=sayi2;
			kucuk=sayi1;
			}
	      
	      int toplam=0;
	      
	      for (int i = kucuk; i <=buyuk; i++) {
			
	    	  toplam+=i;
		}
	      
	      
	     System.out.println("Girilen Say�lar aralar�ndaki say�lar�n toplam�: " + toplam); 
	      
	      
	      
	      scan.close();
	      
	      
	      
	      
	}

}
