package Day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen rakamlar toplam�n� bulmak i�in pozitif bir tam say� giriniz");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;
          String sayiStr=""+sayi;
          // int olarak verilen bir say�n�n basamak say�s�n� bulmak istersek
          // k�sa yoldan o say�y� String'e �evirip, str.lenngth() method'unu kullanabiliriz
		
		for (int i = 0; i <sayiStr.length(); i++) {
			 rakam=sayi%10;
			 rakamlarToplami+=rakam;
			 sayi/=10;
		}
		
		System.out.println("Girdi�iniz Say�n�n Toplam�: " + rakamlarToplami);

		scan.close();
		
		
		
	}

}
