package Day03_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		/*2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan
		degistiren (SWAP) bir program yapiniz*/
		
		int sayi1=15;
		int sayi2=20;
		
		//Baþlangýçta sayý1=10 ve sayý=20 yazdýralým
		
		System.out.println("Baþlangýçta sayi1="+ sayi1 + " ve sayý2=" + sayi2);
		
		//üçüncü variable kullanmayacaksak, verilen 2 sayýnýn farkýndan istifade ediyoruz
		
		// ilk  adým olarak sayýlarýn farkýný ilk sayýya assign ediyorum
		
		sayi1=sayi1-sayi2;
		
		//ikinci adým fark ile sayý2 yi toplayýp
		// sayi2 ye assign ediyorum
		
		sayi2=sayi1+sayi2;
		
		//3 üncü adým olaraks sayý1 'e sayi2-fark atiyorum
		
		sayi1=sayi2-sayi1;
		System.out.println("sonuçta sayi1="+ sayi1 + " ve sayý2=" + sayi2);
		
		
		
	}

}
