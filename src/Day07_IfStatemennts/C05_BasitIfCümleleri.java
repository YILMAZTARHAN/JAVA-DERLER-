package Day07_IfStatemennts;

import java.util.Scanner;

public class C05_BasitIfC�mleleri {

	public static void main(String[] args) {
		/*Soru 5) Kullanicidan bir gun alin eger gun �Cuma� ise ekrana �Muslumanlar icin kutsal 
	gun� yazdirin. �Cumartesi� ise ekrana �Yahudiler icin kutsal gun� yazdirin. �Pazar� 
	ise ekrana �Hiristiyanlar icin kutsal gun� yazdiri*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Bir G�n Yaz�n�z");
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("cuma")) {
			System.out.println("M�sl�manlar i�in Kutsal G�n");
		}
       
		
		if (gun.equals("cumartesi")) {
			System.out.println("Yahudiler i�in kutsal g�n");
		}
	
	   if (gun.equals("pazar")) {
		System.out.println("Hristiyanlar i�in Kutsal G�n");
	}
	
	scan.close();
	
	}
	
	
	
	

}
