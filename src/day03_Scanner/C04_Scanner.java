package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		//Kullanýcýdan deðer almak için 3 adim takip edilir
		//1.Adým Scanner objesi oluþturmak
		
		Scanner scan=new Scanner(System.in);
		
		//ikinci adim kullanýcýya ne istediðimizi söylemek
		
		System.out.println("lütfen isminizi yazýnýz");
		
		String isim= scan.next();
		System.out.println("isminiz:" + isim);
		
		
		
		//scan bir scanner objesidir
		//isim olarak farklý isim yazsak da çalýþýr  ama biz scan demeyi tercih ederiz
		//scan bir obje olduðu için data  türü non-primitive'dir
		//non-primitive data türleri deðerin yanýnda method'lar barindirir
		//scan.   dediðimizde kullanabileceðimiz bu method'larý görebiliriz.
		
		 scan.close();
		
		
		
		
		
		

	}

}
