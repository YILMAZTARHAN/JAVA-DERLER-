package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
		/*1- Verilen sayi1 ve sayi2 variable�larinin degerlerini degistiren (SWAP) bir
		program yaziniz

		Orn : sayi1=10 ve sayi2=20;
		kod calistiktan sonra
		sayi1=20 ve sayi2=10

		2- Verilen sayi1 ve sayi2 variable�larinin degerlerini 3.bir variable olmadan
		degistiren (SWAP) bir program yapiniz*/
		
		
		/*int sayi1=10;
		int sayi2=20;
		
		//Ba�lang��ta say�1=10 ve say�=20 yazd�ral�m
		
		System.out.println("Ba�lang��ta sayi1="+ sayi1 + " ve say�2=" + sayi2);
		
		//Bo� bir variable olu�tural�m
		int bos;
		//Say�2 yi bo� variable atayal�m
		bos=sayi2;
				
		// ���nc� Ad�m sayi2=sayi1	
			sayi2=sayi1;
		// bos variabledeki de�eri 1 e atayal�m
		
		sayi1=bos;
		
		System.out.println("sonu�ta sayi1="+ sayi1 + " ve say�2=" + sayi2);*/
		
		
		
		int sayi1=30;
		int sayi2=40;		
		
		System.out.println("Ba�lang��ta sayi1="+ sayi1 + " ve say�2=" + sayi2);
		
		int bos;
		
		bos=sayi2;
		sayi2=sayi1;
		sayi1=bos;
		System.out.println("Sonu�ta sayi1="+ sayi1 + " ve say�2=" + sayi2);
		
		
		

	}

}
