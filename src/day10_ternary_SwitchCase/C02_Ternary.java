package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		//Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

		Scanner scan=new Scanner(System.in);
	       System.out.println("L�tfen bir tamsay� giriniz");
	       int  sayi=scan.nextInt();
	       
	       System.out.println((sayi%2==0) ? "�ift Say� ":"tek sayi");
	
	
	
	
	
	
	scan.close();
	
	
	
	
	}

}
