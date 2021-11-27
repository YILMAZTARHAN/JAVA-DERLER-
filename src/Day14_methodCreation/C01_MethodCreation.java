package Day14_methodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Verilen iki say�n�n toplam�n� vr �arp�m�n� yap�p yazd�ran iki ayri method olu�turun
		
		// methot olu�turmak i�in 4 ad�m takip edelim
		//1.ad�m method call yazal�m
		//2.ad�m �ethod'a arguman yazacakm�y�z karar vermeliyiz
		
		int sayi1=44;
		int sayi2=55;
		
		
		�arpma(sayi1,sayi2);
		toplama(sayi1,sayi2); // method call
		
		//3.ad�m 1. ve 2.ad�m� yapt�ktan sonra java'dan yard�m al�p method'u olu�turunuz
		
		
		�arpma(sayi1,sayi2);
		
	}

	public static void �arpma(int sayi1, int sayi2) {
		System.out.println("Say�lar�n �arp�m�: " + (sayi1*sayi2));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		// 4.ad�m eri�im d�zenleyici ve return type karar vermeliyiz.
		// eri�im d�zenleyici axcess modifier: puplic yapt�k
		// return type: bizden sadece yazd�rma iztedi�i i�in void kalabilir.
		
		System.out.println("Say�lar�n toplam�: " + (sayi1+sayi2));
		
	}
	

}
