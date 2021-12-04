package Day32_Varargs_StringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
	
		
		KafanaGoreTopla(5,10,13,0);


	}

	private static void KafanaGoreTopla(int sayi1,int...sayýlar ) {
		
		int toplam=0;
		
		for (int each:sayýlar) {
			toplam+=each;
		}
		System.out.println("Ýlk sayý ile deðerlerinin toplamýnýn çarpýmý : " +sayi1* toplam);

	}

}
