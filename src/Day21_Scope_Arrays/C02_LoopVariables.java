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
		
		// Loop içerisinde oluþturulan variable 'lar loop dýþýnda kullanýlamazlar
		// Bunun için loop dýþýnda da ihtiyacýmýz olan bir deðiþken varsa
		// loop'dan önce oluþturur ve emniyette kalmak için initialize yaparýz.
		
		for (int i = 0; i <10; i++) {
			//int sayi=20; sayý variable'i main method'un içinde oluþturulduðundan tüm main method'da 
			// geçerlidir, dolayýsýyla yeniden ayni isimde bir variable oluþturamazsýnýz.
			String isim="veli";
		}
		
		
		
		
		
	}

}
