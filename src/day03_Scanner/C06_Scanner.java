package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		// Scanner iþleminde Strin için iki metot vardýr
		// Scan.next() dediðimizde sadece 1 kelime alir.
		// Scan
		
		//Kullanýcýda isim ve soyisim ayrý ayrý isteyip
				// girilen ismi asaðýdaki gibi yazdýrýnýz
				
				//girilen isim:YILMAZ TARHAN
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Lütfen isminiz giriniz...");
				
				String isim=scan.nextLine();
				
				System.out.println("Lütfen Soyisminiz yazýnýz...");
				String soyisim=scan.nextLine();
				
				System.out.println("girilen isim: "+ isim + " "+ soyisim);
				
				 scan.close();

	}

}
