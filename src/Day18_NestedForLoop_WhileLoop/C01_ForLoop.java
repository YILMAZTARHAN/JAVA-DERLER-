package Day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// Kullan�c�dan iki tam say� isteyin
		// ilk say�dan ba�layarak ikinci say�ya kadar ��er, �cer yazd�r�n
        // (ikinci say� dahil olmak zorunda de�il)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�yfen aradaki say�lar� ��er ��er yazd�rmak i�in iki tam say� girin...");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();					
		
		if (sayi1>sayi2) {// azalarak gidecek
			for (int i = sayi1; i >=sayi2;i-=3) {
				System.out.println(i+ " ");
			}
			
			
			
		} else if(sayi1<sayi2) {// artarak gidecek
			for (int i = sayi1; i <=sayi2;i+=3)
				System.out.println(i+ " ");

		}else {
			System.out.println("Girilen say�lar e�it");
		}
		scan.close();
	}

}
