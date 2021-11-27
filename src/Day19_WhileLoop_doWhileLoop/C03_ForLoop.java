package Day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen rakamlar toplamýný bulmak için pozitif bir tam sayý giriniz");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;
          String sayiStr=""+sayi;
          // int olarak verilen bir sayýnýn basamak sayýsýný bulmak istersek
          // kýsa yoldan o sayýyý String'e çevirip, str.lenngth() method'unu kullanabiliriz
		
		for (int i = 0; i <sayiStr.length(); i++) {
			 rakam=sayi%10;
			 rakamlarToplami+=rakam;
			 sayi/=10;
		}
		
		System.out.println("Girdiðiniz Sayýnýn Toplamý: " + rakamlarToplami);

		scan.close();
		
		
		
	}

}
