package Day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip
		// toplamaya devap edin
		// kullanici sifira bastiginda,
		// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		// Kullan�c�dan 5 say� al�n
		
		for (int i = 1; i <=5; i++) {
			// kullan�c�dan bir de�er al�p ,toplama eklerim
		}

	    Scanner scan=new Scanner(System.in);
	   // loop'un i�inde kullanaca��m obje ve variable'lRI
	    // loop'dan �nce olu�turmak daha g�zeldir
	    // ��nk� loop'un i�inde olu�turursak,
	    // loop her d�nd���nde yenibir obje veya variable olu�turur ve bu da haf�zay� doldurur.
	    
	    int sayi=01;// 0'�n d���nda ne yazarsak olur
	    int toplam=0;
	    int sayac=0;
	    
	    while (sayi!=0) {
			
	    	System.out.println("L�tfen toplama eklemek i�i n bir tam say� yaz�n \nbitirmek i�in 0'a bas�n");
	    	sayi=scan.nextInt();
	    	toplam+=sayi;
	    	sayac++;
		}
	    
	    
	
	
	// Kullan�c� 0'a bast���nda loop i�levini son kez yap�p 
	// sonra ba�a d�necek ve loop bitecek
	// 0 toplanmak �zere verilmeyip sadece bitirmek i�in verildi�inden    
	// s�f�r� sayac'a eklememek i�in 46.sat�rda sayac-1 yapt�k
	    
	    System.out.println("Girilen Say� adedi: " + (sayac-1));
	    System.out.println("Girilen Say�lar�n toplam�:  "+ toplam);
	
	scan.close();
	}

}
