package Day11_StringMAnipulations;

public class C03_Length {

	public static void main(String[] args) {
		
		String str1="Ali Kahyaoðlu";
		System.out.println(str1.length());
		
		// verilen str'in son harfini yazdýrýn
		
		System.out.println(str1.charAt(str1.length()-1));
		
		
		
		String str2="";
		System.out.println(str2.length());
		
		String str3=null; // null deðeri bizim bu variable i bilerek oluþturduðumuzu  ve bilerek atamadýðýmýzý belirtiyor.
		//System.out.println(str3.length()); // java.lang.NullPointerException
	
	     String str4;
	     System.out.println(str3);// null
	    // System.out.println(str4);// eðer Stringi oluþturur ama deðer atamazsak yazdýrdýðýmýzda hata verir.
	 
	    // null pointer oluþturduðumuz fakat sonra kullanacaðýmýz bir String'i iþaretlemek için kullanýlýr
	     // Bir Strin i yazdýrdýðýmýda null çýkýyorsa türkçe olarak
	     // "Ben bu deðiþkeni oluþturdum ama henüz deðer atamadým" demek istiyor
	
	}

}
