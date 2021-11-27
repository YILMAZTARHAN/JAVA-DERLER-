package Day15_MEthodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Kullanýcýdan ismini ve soyismini isteyin
		// iki farklý method oluþturun methodlardan biri girilen kelimeleribirleþtirsin.
		// ilk harf büyük, deðerleri küçük olacak þekilde birleþtirsin
		// ikinci method isim ve soyismin ilk harfleri büyük harf,
		// kalan harfler * olacak þekilde birleþtirsin
		
		// kullanýcýya ismin açýk olarak yazýlmasý veya gizlenmesi tercihini sorun
		// ve programýn kalan kýsmýnda isim ve soyismi kullanýcýnýn istediði þekilde kullanýn
		
		   Scanner scan = new Scanner(System.in);
	        
		   System.out.println("Lutfen isim ve soyisminizi girin \nisimden sonra enter'a basin");
	        
	       String isim=scan.next();
	       String soyisim=scan.next();
	       
	       System.out.println("Ýsminizin açýk þekilde yazýlmasýný istiyorsanýz 1"
	    		   + "\nIlk harf hariç gizli yazýlmasýný istiyorsanýz 2'e basýn");
	       
	       int tercih=scan.nextInt();
	       
	       String birlesmisisIsim=null;//
	       
	       if (tercih==1) {
	    	   birlesmisisIsim=acikIsim(isim,soyisim);
		} else if(tercih==2) {
			birlesmisisIsim=isimGizle(isim,soyisim);
		}
		else {
			System.out.println("Lütfen 1 veya 2 seçin");
		}
	       
	       // Bu satýrdan itibaren kullanýcýn isim ve soyismi kullanýcý tercihine baðlý olarak 
	       // kaydedildi
	       
	       System.out.println("Kullanýcýnýn tercihi: " + birlesmisisIsim);
	       
	       scan.close();
	       
	      // acikIsim(isim,soyisim); method oluþtuktan sonra silebilirz.
	       
	      //isimGizle(isim,soyisim); 

	}

	public static String isimGizle(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		
		
		
		return isim+" "+soyisim;		
	}

	public static String acikIsim(String isim, String soyisim) {
		 
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
		
		return isim+" "+soyisim;
				
	
	}

}
