package Day33_StringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Java");
		StringBuilder sb2=new StringBuilder("Java");
		
		System.out.println(sb1==sb2); // False
		System.out.println(sb1.equals(sb2)); // False
		// sb'da equals method'u String'deki Mantýkla Çalýþmaz,==mantýðý ile çalýþýr
		
		
		
		
		System.out.println(sb1.compareTo(sb2)); // 0
		
		// Ýlk harflerden baþlayarak bire bire sb'larý karþýlaþtýrýr
		// eðer tüm karakterler ayný ise sonuç olarak o döner
		// farklý karakter bulursa  ilk yazýlan sb, ikinci yazýlandan kaç char önde onu döner
		
		
		// eðer iki sb'in eþit olup olmadýðýný anlamak istersek
		// if(sb1.CompareTo(sb2)==0) ile bakabiliriz
		
		String str="Java";
		
		//System.out.println(sb1==str); == sb ile Stringi karþýlaþtýramaz
		
		System.out.println(sb1.equals(str)); //false
		// System.out.println(sb1.compareTo(str)); compare String için kullanýlamaz
		
		//System.out.println(sb1=="Java");
		
		System.out.println(sb1.equals("Java"));//false
		//System.out.println(sb1.compareTo("Java"));
		
		
		
		

	}

}
