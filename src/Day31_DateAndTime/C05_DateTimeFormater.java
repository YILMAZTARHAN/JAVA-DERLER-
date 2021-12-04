package Day31_DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormater {

	public static void main(String[] args) {
	
		LocalDateTime tarihSaat=LocalDateTime.now();
		
		System.out.println(tarihSaat);//2021-12-02T23:45:06.370517200
		
		// E�er tarih veya saati kendi istedi�imiz bi�imde yazd�rmak istersek
		//G�n/ Ay/ Y�l saat:dakika
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd / M / YYYY EEEE  HH : mm");
		
		System.out.println(duzenle.format(tarihSaat));
		
		/*
		 format olu�tururken
		 G�n
		 d:ba�ta 0 varsa onu yazmadan g�n numras�n�
		 dd:tek haneli g�nleri 01 gibi ba��na s�f�r yazarak g�n numaras�n�
		 DDD: y�l�n ka��nc� g�n� oldu�unu yazar
		 E,EE,EEE : g�n isminin ilk �� harfi
		 EEEE : isminin tamam�n�
		 
		 AY(Ay i�in M, dakika i�in m kullan�l�r)
		 M: ba�ta 0 varsa onu yazmadan ay numaras�
		 MM:dd:Tek haneli aylar� 01 gibi ba��na s�f�r yazark ay numaras�
		 MMM : Ay isminin ilk �� Harfi
		 MMMM : Ay �sminin Tamam�
		 
		 YY : y�l�n son iki rakam�n�
		 YYYY : Y�l�n Tamam�
		 
		 Saat:(24 saat �zerinden istiyorsak H, 12 Saat istiyorsak h)
		 
		  HH saatin tamam�, tek rakaml� saat olursa 02 gibi
		  H : tek rakaml� saat olursa sadece saati
		  
		  a yazarsak ya AM yada PM  de�erini yazar		 */
		
		
		
		
	}

}
