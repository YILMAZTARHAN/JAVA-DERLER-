package Day11_StringMAnipulations;

public class C03_Length {

	public static void main(String[] args) {
		
		String str1="Ali Kahyao�lu";
		System.out.println(str1.length());
		
		// verilen str'in son harfini yazd�r�n
		
		System.out.println(str1.charAt(str1.length()-1));
		
		
		
		String str2="";
		System.out.println(str2.length());
		
		String str3=null; // null de�eri bizim bu variable i bilerek olu�turdu�umuzu  ve bilerek atamad���m�z� belirtiyor.
		//System.out.println(str3.length()); // java.lang.NullPointerException
	
	     String str4;
	     System.out.println(str3);// null
	    // System.out.println(str4);// e�er Stringi olu�turur ama de�er atamazsak yazd�rd���m�zda hata verir.
	 
	    // null pointer olu�turdu�umuz fakat sonra kullanaca��m�z bir String'i i�aretlemek i�in kullan�l�r
	     // Bir Strin i yazd�rd���m�da null ��k�yorsa t�rk�e olarak
	     // "Ben bu de�i�keni olu�turdum ama hen�z de�er atamad�m" demek istiyor
	
	}

}
