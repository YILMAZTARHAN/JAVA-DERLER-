package Day03_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		/*2- Verilen sayi1 ve sayi2 variable�larinin degerlerini 3.bir variable olmadan
		degistiren (SWAP) bir program yapiniz*/
		
		int sayi1=15;
		int sayi2=20;
		
		//Ba�lang��ta say�1=10 ve say�=20 yazd�ral�m
		
		System.out.println("Ba�lang��ta sayi1="+ sayi1 + " ve say�2=" + sayi2);
		
		//���nc� variable kullanmayacaksak, verilen 2 say�n�n fark�ndan istifade ediyoruz
		
		// ilk  ad�m olarak say�lar�n fark�n� ilk say�ya assign ediyorum
		
		sayi1=sayi1-sayi2;
		
		//ikinci ad�m fark ile say�2 yi toplay�p
		// sayi2 ye assign ediyorum
		
		sayi2=sayi1+sayi2;
		
		//3 �nc� ad�m olaraks say�1 'e sayi2-fark atiyorum
		
		sayi1=sayi2-sayi1;
		System.out.println("sonu�ta sayi1="+ sayi1 + " ve say�2=" + sayi2);
		
		
		
	}

}
