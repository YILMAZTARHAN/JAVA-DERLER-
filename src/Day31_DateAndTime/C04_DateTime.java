package Day31_DateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		// bir String ve bir int variable oluþturalým
		// bir loop içerisinde bu variable'larý 1000 kere deðiþtirelim
		// ve iþlem surelerini kýyalayalým

		// verilen iki doðum tarihinin hangisinin daha önce olduðunu bulunuz

		LocalTime saat = LocalTime.now();

		System.out.println("Baþlangýç Saati" + saat);// 23:03:36.831509

		int sayi = 10;
		for (int i = 0; i < 10000; i++) {
			sayi++;

		}
		LocalTime saatBitis = LocalTime.now();
		System.out.println("Bitiþ Saati" + saatBitis);

		double nano1 = saat.getNano();
		double nanobitis = saatBitis.getNano();

		System.out.println("For loop " + (nanobitis - nano1) + " nano saniyede tamamladý");

		LocalTime saatS = LocalTime.now();

		System.out.println("baslangic saati " + saatS); //

		String str = "celil";

		for (int i = 0; i < 10000; i++) {
			str += " ";
		}

		LocalTime saatBitisS = LocalTime.now();
		System.out.println("bitis saati " + saatBitisS);
		double nanoS = saatS.getNano();
		double nanobitisS = saatBitisS.getNano();

		System.out.println("String For loop " + (nanobitisS - nanoS) + " nano saniyede tamamlandi");

		double stringSure = nanobitisS - nanoS; // 7.28346E7 72.834.600 nono saniye
		double intSure = nanobitis - nano1; // 7.999.700 nono saniye

		System.out.println("int String'den " + (stringSure - intSure) + " nano saniye daha hizli bitirdi");

	}

}