package Day31_DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormater {

	public static void main(String[] args) {
	
		LocalDateTime tarihSaat=LocalDateTime.now();
		
		System.out.println(tarihSaat);//2021-12-02T23:45:06.370517200
		
		// Eðer tarih veya saati kendi istediðimiz biçimde yazdýrmak istersek
		//Gün/ Ay/ Yýl saat:dakika
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd / M / YYYY EEEE  HH : mm");
		
		System.out.println(duzenle.format(tarihSaat));
		
		/*
		 format oluþtururken
		 Gün
		 d:baþta 0 varsa onu yazmadan gün numrasýný
		 dd:tek haneli günleri 01 gibi baþýna sýfýr yazarak gün numarasýný
		 DDD: yýlýn kaçýncý günü olduðunu yazar
		 E,EE,EEE : gün isminin ilk üç harfi
		 EEEE : isminin tamamýný
		 
		 AY(Ay için M, dakika için m kullanýlýr)
		 M: baþta 0 varsa onu yazmadan ay numarasý
		 MM:dd:Tek haneli aylarý 01 gibi baþýna sýfýr yazark ay numarasý
		 MMM : Ay isminin ilk Üç Harfi
		 MMMM : Ay Ýsminin Tamamý
		 
		 YY : yýlýn son iki rakamýný
		 YYYY : Yýlýn Tamamý
		 
		 Saat:(24 saat üzerinden istiyorsak H, 12 Saat istiyorsak h)
		 
		  HH saatin tamamý, tek rakamlý saat olursa 02 gibi
		  H : tek rakamlý saat olursa sadece saati
		  
		  a yazarsak ya AM yada PM  deðerini yazar		 */
		
		
		
		
	}

}
