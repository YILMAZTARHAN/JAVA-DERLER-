package Day11_StringMAnipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		//PArametre olarak girilen bir char veya strin'in
		// ilk index'ini verir.
		
		
		
		String str="Cal�s�rsan�z, Java ogrenmek �ok kolay";
		
		System.out.println(str.indexOf('s')); //4
		System.out.println(str.indexOf('J')); //14
		
		int index=str.indexOf("r");// indexof() method'u bize herzaman int bir de�er d�ner
		System.out.println(index);// 6
		
		System.out.println(str.indexOf('q'));
		
		//Bir String i�inde olmayan bir karakter veya kelime ararsak java -1 sonucunu d�nd�r�r
		
		System.out.println(str.indexOf('A')); // -1
		
		System.out.println(str.indexOf("va og"));
		//arad���m�z charSquence anlaml� veya anlams�z bir kelime olabilir.
		// bu durumda java arad���m�z CS i tek bir paket gibi d���n�r ve o paketin ba�lang�� indexini bize verir
		
		System.out.println(str.indexOf('e',15));
		
		

	}

}
