package Day15_MEthodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Kullan�c�dan ismini ve soyismini isteyin
		// iki farkl� method olu�turun methodlardan biri girilen kelimeleribirle�tirsin.
		// ilk harf b�y�k, de�erleri k���k olacak �ekilde birle�tirsin
		// ikinci method isim ve soyismin ilk harfleri b�y�k harf,
		// kalan harfler * olacak �ekilde birle�tirsin
		
		// kullan�c�ya ismin a��k olarak yaz�lmas� veya gizlenmesi tercihini sorun
		// ve program�n kalan k�sm�nda isim ve soyismi kullan�c�n�n istedi�i �ekilde kullan�n
		
		   Scanner scan = new Scanner(System.in);
	        
		   System.out.println("Lutfen isim ve soyisminizi girin \nisimden sonra enter'a basin");
	        
	       String isim=scan.next();
	       String soyisim=scan.next();
	       
	       System.out.println("�sminizin a��k �ekilde yaz�lmas�n� istiyorsan�z 1"
	    		   + "\nIlk harf hari� gizli yaz�lmas�n� istiyorsan�z 2'e bas�n");
	       
	       int tercih=scan.nextInt();
	       
	       String birlesmisisIsim=null;//
	       
	       if (tercih==1) {
	    	   birlesmisisIsim=acikIsim(isim,soyisim);
		} else if(tercih==2) {
			birlesmisisIsim=isimGizle(isim,soyisim);
		}
		else {
			System.out.println("L�tfen 1 veya 2 se�in");
		}
	       
	       // Bu sat�rdan itibaren kullan�c�n isim ve soyismi kullan�c� tercihine ba�l� olarak 
	       // kaydedildi
	       
	       System.out.println("Kullan�c�n�n tercihi: " + birlesmisisIsim);
	       
	       scan.close();
	       
	      // acikIsim(isim,soyisim); method olu�tuktan sonra silebilirz.
	       
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
