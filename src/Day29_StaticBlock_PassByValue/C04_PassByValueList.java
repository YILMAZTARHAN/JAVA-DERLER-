package Day29_StaticBlock_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
	// bir list olu�tural�m
	// sonra list elemanlar�n� de�i�tir method'u yaz�p orada
	// list elemanlar�ndan baz�lar�n� de�i�tirelim
    // method void olsun
	// main method'a d�nd�kten sonra yeniden list'i yazd�ral�m
		
		List<String>harfler=new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		
		
		listElemanlarDegistir(harfler);//[D, B, C]
		System.out.println("Main Method'a d�n�nce list: " + harfler);
		
		//java'da list ve Array gibi objeler i�in de pass By Value ge�erlidir
		// Yani farkl�  bir method'a array veya List'e yeni de�er atamna yaparsan�z
		// orjinal array veya list de�i�mez
		
		
		listDegistir(harfler); // method 'da yeni de�er atad���m halde harfler listesi de�i�medi
		System.out.println("List'e yeni list atad�ktan sonra Main Method'a d�n�nce list: " + harfler);
	}

	private static void listDegistir(List<String> harfler) {
	harfler=new ArrayList<>();
	System.out.println("List'e yani de�er atay�nca " + harfler);
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		System.out.println("Method'da De�i�tirdi�imiz list: " + harfler);
		
	}

}
