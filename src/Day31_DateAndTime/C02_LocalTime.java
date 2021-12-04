package Day31_DateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
	
		
	LocalTime saat=LocalTime.now();
	
	System.out.println("Ba�lang�� Saati"+saat);//23:03:36.831509
	
	int sayi=10;
	for (int i = 0; i <100000; i++) {
		sayi++;
		
		
	}
	LocalTime saatBitis=LocalTime.now();
		System.out.println("Biti� Saati"+ saatBitis);
		
		// e�er bir i�elemin ba�lang�� ve biti� zaman�n� kaydetmek istiyorsak
		// Hem ba��nda,hem de sonunda LocalTime objesi olu�turmal�y�z
		
		//System.out.println(saat.getNano());
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("For loop "+(nanobitis-nano1) +" nano saniyede tamamlad�");
		
		System.out.println(saat.getMinute());
		System.out.println(saat.plusMinutes(10000));
		System.out.println(saat.minusHours(20));
		
		LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
		
		System.out.println(yerelSaat);
		
	}

}
