package day10_ternary_SwitchCase;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {

	public static void main(String[] args) {
	//Verilen Stringin Tamam�n� b�y�k veya K���k harfe �evirir.
		
		
		String isim="aL�"; // bunu ali olarak yazd�ral�m
				System.out.println(""+isim.toUpperCase().charAt(0)+
						           isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));

				
				
			// t�rk�e lokal harfler kullanarak tamam�n� k���k harfle �evirelim
				System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
				
	}

}
