package Day08_IfVeElseStatements;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
	
		//Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		//ve dikdortgenin kare olup olmadigini yazdirin
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Dikdörtgenin bir kenar uzunluðunu girin");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("Lütfen dikdörtgeninin diðer kenar uzunluðunu girin");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikdörtgen karedir");
		} 
		
		else {
          System.out.println("Girilen dikdörtgen kare deðil");
		}
		
		
		
		scan.close();
		
		
		
		
		
	}

}
