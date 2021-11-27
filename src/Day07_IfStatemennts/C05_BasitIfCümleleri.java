package Day07_IfStatemennts;

import java.util.Scanner;

public class C05_BasitIfCümleleri {

	public static void main(String[] args) {
		/*Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal 
	gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar” 
	ise ekrana “Hiristiyanlar icin kutsal gun” yazdiri*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Bir Gün Yazýnýz");
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("cuma")) {
			System.out.println("Müslümanlar için Kutsal Gün");
		}
       
		
		if (gun.equals("cumartesi")) {
			System.out.println("Yahudiler için kutsal gün");
		}
	
	   if (gun.equals("pazar")) {
		System.out.println("Hristiyanlar için Kutsal Gün");
	}
	
	scan.close();
	
	}
	
	
	
	

}
