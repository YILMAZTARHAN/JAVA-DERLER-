package Day21_Scope_Arrays;

public class C02_LoopVariables {

	public static void main(String[] args) {
		int sayi=10;
		
		for (int i = 0; i <6; i++) {
			String isim="Ali";
			System.out.println(sayi + " "+ isim);
		}
		
		//System.out.println(isim);
         // System.out.println(i); 
		
		// Loop i�erisinde olu�turulan variable 'lar loop d���nda kullan�lamazlar
		// Bunun i�in loop d���nda da ihtiyac�m�z olan bir de�i�ken varsa
		// loop'dan �nce olu�turur ve emniyette kalmak i�in initialize yapar�z.
		
		for (int i = 0; i <10; i++) {
			//int sayi=20; say� variable'i main method'un i�inde olu�turuldu�undan t�m main method'da 
			// ge�erlidir, dolay�s�yla yeniden ayni isimde bir variable olu�turamazs�n�z.
			String isim="veli";
		}
		
		
		
		
		
	}

}
