package Day11_StringMAnipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		//PArametre olarak girilen bir char veya strin'in
		// ilk index'ini verir.
		
		
		
		String str="Calýsýrsanýz, Java ogrenmek çok kolay";
		
		System.out.println(str.indexOf('s')); //4
		System.out.println(str.indexOf('J')); //14
		
		int index=str.indexOf("r");// indexof() method'u bize herzaman int bir deðer döner
		System.out.println(index);// 6
		
		System.out.println(str.indexOf('q'));
		
		//Bir String içinde olmayan bir karakter veya kelime ararsak java -1 sonucunu döndürür
		
		System.out.println(str.indexOf('A')); // -1
		
		System.out.println(str.indexOf("va og"));
		//aradýðýmýz charSquence anlamlý veya anlamsýz bir kelime olabilir.
		// bu durumda java aradýðýmýz CS i tek bir paket gibi düþünür ve o paketin baþlangýç indexini bize verir
		
		System.out.println(str.indexOf('e',15));
		
		

	}

}
