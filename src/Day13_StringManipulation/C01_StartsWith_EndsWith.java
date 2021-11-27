package Day13_StringManipulation;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		
		// kullnýcýdan bir cümle ve bir kelime alýn
		// verilen cümlenin verilen kelime(char squence) ile baþlayýp ,baþlamadýðýný
		// ve bitip bitmediðini yazdýrýn
		
		 
		 Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen Bir Cümle Giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lütfen Bir Kelime Giriniz");
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("Girilen cümle "+ kelime + " ile baþlýyor");
		} else {
            System.out.println("Girilen cümle "+ kelime + " ile baþlamýyor");
		}
		
		if (cumle.endsWith(kelime)) {
			System.out.println("Girilen cümle "+ kelime + " ile bitiyor");
		} else {
            System.out.println("Girilen cümle "+ kelime + " ile bitmiyor");
		}
		
		
		scan.close();

	}

}
