package Day32_Varargs_StringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		
		KafanaGoreÝslem(5,10,13,0);
		
      // Varargs'da hiç eleman olmasada java itiraz etmez
	  // Önce int olarak tanýmlanan sayýlarý eþleþtirir
	// kalan tüm sayýlarý varargs'a doldurur.	

	}

	private static void KafanaGoreÝslem(int sayi1,int sayi2,int sayi3,int sayi4,int...sayýlar ) {
		
		int toplam=0;
		
		for (int each:sayýlar) {
			toplam+=each;
		}
		System.out.println("Ýlk sayý ile deðerlerinin toplamýnýn çarpýmý : " +sayi1* toplam);

	}

}
