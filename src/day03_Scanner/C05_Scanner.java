package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		//Kullanýcýda isim ve soyisim ayrý ayrý isteyip
		// girilen ismi asaðýdaki gibi yazdýrýnýz
		
		//girilen isim:YILMAZ TARHAN
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen isminiz giriniz...");
		
		String isim=scan.next();
		
		System.out.println("Lütfen Soyisminiz yazýnýz...");
		String soyisim=scan.next();
		
		System.out.println("girilen isim: "+ isim + " "+ soyisim);
		
		 scan.close();

	}

}
