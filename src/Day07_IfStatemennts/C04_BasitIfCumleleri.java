package Day07_IfStatemennts;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Dikd�rtgenin bir kenar uzunlu�unu girin");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("L�tfen dikd�rtgeninin di�er kenar uzunlu�unu girin");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikd�rtgen kare");
		}
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikd�rtgen kare de�il");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
