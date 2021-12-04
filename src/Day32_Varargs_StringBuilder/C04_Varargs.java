package Day32_Varargs_StringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		
		KafanaGore�slem(5,10,13,0);
		
      // Varargs'da hi� eleman olmasada java itiraz etmez
	  // �nce int olarak tan�mlanan say�lar� e�le�tirir
	// kalan t�m say�lar� varargs'a doldurur.	

	}

	private static void KafanaGore�slem(int sayi1,int sayi2,int sayi3,int sayi4,int...say�lar ) {
		
		int toplam=0;
		
		for (int each:say�lar) {
			toplam+=each;
		}
		System.out.println("�lk say� ile de�erlerinin toplam�n�n �arp�m� : " +sayi1* toplam);

	}

}
