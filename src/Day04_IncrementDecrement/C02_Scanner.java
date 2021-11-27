package Day04_IncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
	//Kullanýcýdan ismini alip isminin baþ harfini yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("Lütfen isminizi yazýnýz");
		 
		 char ilkHarf=scan.next().charAt(0);
		 
		 // Ýsminizin ilk harfi:Y
		 
		 System.out.println("Ýsminizin ilk harfi: " + ilkHarf);
		 
		 scan.close();

	}

}
