package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		//Kullan�c�da isim ve soyisim ayr� ayr� isteyip
		// girilen ismi asa��daki gibi yazd�r�n�z
		
		//girilen isim:YILMAZ TARHAN
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen isminiz giriniz...");
		
		String isim=scan.next();
		
		System.out.println("L�tfen Soyisminiz yaz�n�z...");
		String soyisim=scan.next();
		
		System.out.println("girilen isim: "+ isim + " "+ soyisim);
		
		 scan.close();

	}

}
