package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {
	List<String>harfler=new ArrayList<>();
	
	harfler.add("A");
	harfler.add("Z");
	harfler.add("F");
	harfler.add("D");
	
	System.out.println(harfler);//[A, Z, F, D]
	
	harfler.remove(1);// bu sat�r gidip 1 index'indeki eleman� remove eder
	                                      // ve delil olarak remove etti�i eleman� bize getirir.
	// listenin kalan�n� g�remek isterseniz listeyi yazd�rabilirsiniz
	System.out.println(harfler);//[A, F, D]
	
	System.out.println(harfler.remove(2));//D
	
	System.out.println(harfler);//[A, F]
	
	// gidip F yi remove eder.
	
	System.out.println(harfler.remove("F"));// gidip F yi remove eder ve true d�nd�r�r
	
	System.out.println(harfler.remove("B"));// listede B olmad��� i�in remove yapamaz
	                                        // g�revi yapamad��� i�in false d�ner
	
	System.out.println(harfler);//[A]
	
	harfler.add("A");
	harfler.add("Z");
	harfler.add("F");
	
	System.out.println(harfler);//[A, A, Z, F]
	
	System.out.println(harfler.remove("A"));// True
	
	System.out.println(harfler);//[A, Z, F]
	harfler.add("A");
	
	System.out.println(harfler);//[A, Z, F, A]
	
	harfler.removeAll(harfler); // verilen bir listeyi siler
	System.out.println(harfler);
	
	harfler.add("A");
	harfler.add("Z");
	harfler.add("F");
	harfler.add("D");
	
	List<String> silinecekHarfler= new ArrayList<>();
	silinecekHarfler.add("A");
	silinecekHarfler.add("C");
	silinecekHarfler.add("F");
	
	System.out.println(harfler); // [A, Z, F, D]
	System.out.println(silinecekHarfler); // [A, C, F]
	
	System.out.println(harfler.removeAll(silinecekHarfler)); // true
	System.out.println(harfler); // [A, Z, F, D]
	System.out.println(silinecekHarfler); // [A, C, F]
	
	

	}

}
