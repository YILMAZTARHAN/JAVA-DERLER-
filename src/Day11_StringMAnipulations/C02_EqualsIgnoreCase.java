package Day11_StringMAnipulations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		//EqualsIgnoreCase iki Stringi karþýlaþtýrýrken case sensitive olmadan kýyaslama yapar 
		
		
		
		
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1+" "+str2;
		
		System.out.println(str4);// ali can
		System.out.println(str3==str4); // False hem deðerler hem de referans farklý
		System.out.println(str3.equals(str4)); // false deðerler farklý
		
		System.out.println(str3.equalsIgnoreCase(str4));// true içerik ayni, case sensitive deðil

	}

}
