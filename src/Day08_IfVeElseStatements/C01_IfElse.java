package Day08_IfVeElseStatements;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
	
		//Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		//ve dikdortgenin kare olup olmadigini yazdirin
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Dikd�rtgenin bir kenar uzunlu�unu girin");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("L�tfen dikd�rtgeninin di�er kenar uzunlu�unu girin");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikd�rtgen karedir");
		} 
		
		else {
          System.out.println("Girilen dikd�rtgen kare de�il");
		}
		
		
		
		scan.close();
		
		
		
		
		
	}

}
