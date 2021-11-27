package day10_ternary_SwitchCase;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {

	public static void main(String[] args) {
	//Verilen Stringin Tamamýný büyük veya Küçük harfe çevirir.
		
		
		String isim="aLÝ"; // bunu ali olarak yazdýralým
				System.out.println(""+isim.toUpperCase().charAt(0)+
						           isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));

				
				
			// türkçe lokal harfler kullanarak tamamýný küçük harfle çevirelim
				System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
				
	}

}
