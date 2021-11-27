package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
	
		List <String>isimler=new ArrayList<>();
		System.out.println("Bo� Liste : " + isimler);
		
		isimler.add("Ali");
		
		System.out.println("Bir eleman :" + isimler);
		
		isimler.add("Veli");
		
		System.out.println("�ki Eleman : " + isimler);
		// add method'u listenin sonuna ekleme yapar
		
		isimler.add("Can");
		System.out.println("�� Eleman : " + isimler);//[Ali, Veli, Can]
		
		isimler.add(1, "Ay�e");
		System.out.println("1.indexe ay�e ekledik : " + isimler);
		
		// isimler.add(5); declare ederken belirtti�imiz data t�r�nden ba�ka data t�r�nden ekleme yapamay�z.
		
		List <String> liste2=new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("Liste2 : "  + liste2);
		
		isimler.addAll(4, liste2);
		
		System.out.println("Sona Liste 2 yi ekledik: " +isimler);
		
	    isimler.addAll(liste2);
	    System.out.println("�ndex olmadan liste 2 yi tekrar ekledik : " + isimler);
		

	}

}
