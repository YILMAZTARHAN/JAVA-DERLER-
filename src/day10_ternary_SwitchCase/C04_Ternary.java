package Day10_ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		//Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse �Sayi pozitif� yazdirin, negatifse  sayinin karesini yazdirin

	

		Scanner scan=new Scanner(System.in);
	    System.out.println("L�tfen bir say� giriniz");
	     double sayi=scan.nextDouble();
	
	   //sayi>0 ? System.out.println("say� pozitif");System.out.println(sayi*sayi);
	   // ternary de direk sonu� veya sonu� d�nd�recek bir i�lem yapabiliriz.
	     
	     System.out.println((sayi>0?"Say� pozitif":sayi*sayi));
	
	
	scan.close();
	
	
	
	
	
	
	}

}
