package Day07_IfStatemennts;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Dikdörtgenin bir kenar uzunluðunu girin");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("Lütfen dikdörtgeninin diðer kenar uzunluðunu girin");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikdörtgen kare");
		}
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdörtgen kare deðil");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
