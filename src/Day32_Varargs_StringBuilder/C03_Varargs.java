package Day32_Varargs_StringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
	
		
		KafanaGoreTopla(5,10,13,0);


	}

	private static void KafanaGoreTopla(int sayi1,int...say�lar ) {
		
		int toplam=0;
		
		for (int each:say�lar) {
			toplam+=each;
		}
		System.out.println("�lk say� ile de�erlerinin toplam�n�n �arp�m� : " +sayi1* toplam);

	}

}
