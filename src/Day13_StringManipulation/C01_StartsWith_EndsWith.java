package Day13_StringManipulation;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		
		// kulln�c�dan bir c�mle ve bir kelime al�n
		// verilen c�mlenin verilen kelime(char squence) ile ba�lay�p ,ba�lamad���n�
		// ve bitip bitmedi�ini yazd�r�n
		
		 
		 Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen Bir C�mle Giriniz");
		String cumle=scan.nextLine();
		System.out.println("L�tfen Bir Kelime Giriniz");
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("Girilen c�mle "+ kelime + " ile ba�l�yor");
		} else {
            System.out.println("Girilen c�mle "+ kelime + " ile ba�lam�yor");
		}
		
		if (cumle.endsWith(kelime)) {
			System.out.println("Girilen c�mle "+ kelime + " ile bitiyor");
		} else {
            System.out.println("Girilen c�mle "+ kelime + " ile bitmiyor");
		}
		
		
		scan.close();

	}

}
