package Day07_IfStatemennts;

import java.util.Scanner;

public class C02_BasitIfC�mleleri {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Bir tam sayi giriniz:");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Girdi�iniz Say� �ift Say�");
		}

		
		if (sayi%2==1) {
			System.out.println("Girdi�iniz Say� Tek bir Say�d�r");
		}
	
	scan.close();
	
	}
	

}
