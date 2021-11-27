package Day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip
		// toplamaya devap edin
		// kullanici sifira bastiginda,
		// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		// Kullanýcýdan 5 sayý alýn
		
		for (int i = 1; i <=5; i++) {
			// kullanýcýdan bir deðer alýp ,toplama eklerim
		}

	    Scanner scan=new Scanner(System.in);
	   // loop'un içinde kullanacaðým obje ve variable'lRI
	    // loop'dan önce oluþturmak daha güzeldir
	    // çünkü loop'un içinde oluþturursak,
	    // loop her döndüðünde yenibir obje veya variable oluþturur ve bu da hafýzayý doldurur.
	    
	    int sayi=01;// 0'ýn dýþýnda ne yazarsak olur
	    int toplam=0;
	    int sayac=0;
	    
	    while (sayi!=0) {
			
	    	System.out.println("Lütfen toplama eklemek içi n bir tam sayý yazýn \nbitirmek için 0'a basýn");
	    	sayi=scan.nextInt();
	    	toplam+=sayi;
	    	sayac++;
		}
	    
	    
	
	
	// Kullanýcý 0'a bastýðýnda loop iþlevini son kez yapýp 
	// sonra baþa dönecek ve loop bitecek
	// 0 toplanmak üzere verilmeyip sadece bitirmek için verildiðinden    
	// sýfýrý sayac'a eklememek için 46.satýrda sayac-1 yaptýk
	    
	    System.out.println("Girilen Sayý adedi: " + (sayac-1));
	    System.out.println("Girilen Sayýlarýn toplamý:  "+ toplam);
	
	scan.close();
	}

}
