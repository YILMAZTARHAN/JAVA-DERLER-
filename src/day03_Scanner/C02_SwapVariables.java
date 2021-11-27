package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
		/*1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir
		program yaziniz

		Orn : sayi1=10 ve sayi2=20;
		kod calistiktan sonra
		sayi1=20 ve sayi2=10

		2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan
		degistiren (SWAP) bir program yapiniz*/
		
		
		/*int sayi1=10;
		int sayi2=20;
		
		//Baþlangýçta sayý1=10 ve sayý=20 yazdýralým
		
		System.out.println("Baþlangýçta sayi1="+ sayi1 + " ve sayý2=" + sayi2);
		
		//Boþ bir variable oluþturalým
		int bos;
		//Sayý2 yi boþ variable atayalým
		bos=sayi2;
				
		// Üçüncü Adým sayi2=sayi1	
			sayi2=sayi1;
		// bos variabledeki deðeri 1 e atayalým
		
		sayi1=bos;
		
		System.out.println("sonuçta sayi1="+ sayi1 + " ve sayý2=" + sayi2);*/
		
		
		
		int sayi1=30;
		int sayi2=40;		
		
		System.out.println("Baþlangýçta sayi1="+ sayi1 + " ve sayý2=" + sayi2);
		
		int bos;
		
		bos=sayi2;
		sayi2=sayi1;
		sayi1=bos;
		System.out.println("Sonuçta sayi1="+ sayi1 + " ve sayý2=" + sayi2);
		
		
		

	}

}
