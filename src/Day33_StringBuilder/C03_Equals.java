package Day33_StringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Java");
		StringBuilder sb2=new StringBuilder("Java");
		
		System.out.println(sb1==sb2); // False
		System.out.println(sb1.equals(sb2)); // False
		// sb'da equals method'u String'deki Mant�kla �al��maz,==mant��� ile �al���r
		
		
		
		
		System.out.println(sb1.compareTo(sb2)); // 0
		
		// �lk harflerden ba�layarak bire bire sb'lar� kar��la�t�r�r
		// e�er t�m karakterler ayn� ise sonu� olarak o d�ner
		// farkl� karakter bulursa  ilk yaz�lan sb, ikinci yaz�landan ka� char �nde onu d�ner
		
		
		// e�er iki sb'in e�it olup olmad���n� anlamak istersek
		// if(sb1.CompareTo(sb2)==0) ile bakabiliriz
		
		String str="Java";
		
		//System.out.println(sb1==str); == sb ile Stringi kar��la�t�ramaz
		
		System.out.println(sb1.equals(str)); //false
		// System.out.println(sb1.compareTo(str)); compare String i�in kullan�lamaz
		
		//System.out.println(sb1=="Java");
		
		System.out.println(sb1.equals("Java"));//false
		//System.out.println(sb1.compareTo("Java"));
		
		
		
		

	}

}
