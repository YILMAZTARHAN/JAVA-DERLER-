package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		//Kullan�c�dan de�er almak i�in 3 adim takip edilir
		//1.Ad�m Scanner objesi olu�turmak
		
		Scanner scan=new Scanner(System.in);
		
		//ikinci adim kullan�c�ya ne istedi�imizi s�ylemek
		
		System.out.println("l�tfen isminizi yaz�n�z");
		
		String isim= scan.next();
		System.out.println("isminiz:" + isim);
		
		
		
		//scan bir scanner objesidir
		//isim olarak farkl� isim yazsak da �al���r  ama biz scan demeyi tercih ederiz
		//scan bir obje oldu�u i�in data  t�r� non-primitive'dir
		//non-primitive data t�rleri de�erin yan�nda method'lar barindirir
		//scan.   dedi�imizde kullanabilece�imiz bu method'lar� g�rebiliriz.
		
		 scan.close();
		
		
		
		
		
		

	}

}
