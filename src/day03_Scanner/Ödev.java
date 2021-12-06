package Day03_Scanner;

import java.util.Scanner;

public class Ödev {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
		 
		Scanner scan=new Scanner(System.in);
		int a,b;
		
	
		
		System.out.println("A Sayýsýný Giriniz: ");
		a=scan.nextInt();
		System.out.println("B Sayýsýný Giriniz:");
		b=scan.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b); 
		
		
		
		
		
		//Soru 2) Kullanicidan karenin bir kenar uzunluðunu alin ve karenin cevresini ve alanini
	   // hesaplayip yazdirin
		
		
		
		int uzunlugu;
		double cevre,alan;
		
		System.out.println("Karenin Bir Kenar Uzunluðunu Belirtiniz:");
		uzunlugu=scan.nextInt();
		
		cevre=uzunlugu*4;
		alan=uzunlugu*uzunlugu;
		
		System.out.println("Karenin Çevresi: " + cevre);
		System.out.println("Karenin Alaný: " + alan);
		
	//Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		
		int r;
		double cevr,ala,pi=3.14;
		
		
		System.out.println("Çemberin Yarýçapýný Belirtiniz");
		r=scan.nextInt();
		
		cevr=2*r*pi;
		ala=r*r;
		
		System.out.println("Çemberin Çevresi: "+ cevr);
		System.out.println("Çemberin Alaný:" + ala);
		
		//Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
	    //prizmanin hacmini hesaplayip yazdirin
		
		int uzun,kisakenar,yükseklik;
		double hacim;
		
		System.out.println("Diktörtgenin Prizmasýnýn Uzunluðunu Yazýnýz:");
		uzun=scan.nextInt();
		System.out.println("Diktörtgen Prizmasýnýn Kýsa Kenarýný Yazýnýz:");
		kisakenar=scan.nextInt();
		System.out.println("Diktörtgen Prizmasýnýn Yüksekliðini Yazýnýz:");
		yükseklik=scan.nextInt();
		
		hacim=uzun*kisakenar*yükseklik;
		
		System.out.println("Dikdörtgen Prizmasýnýn Hacmi: " + hacim);
		
		
		/*Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin

		Ýsminiz : YILMAZ
		Soyisminiz :TARHAN
		Kursumuza katiliminiz alinmistir,tesekkur ederiz*/
		
		String isminizi, soyisminizi;
		System.out.print("Ýsminiz:");
		isminizi=scan.nextLine();
		System.out.print("Soyisminiz:");
		soyisminizi=scan.nextLine();
		
		System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");
		
		 
		
		/*Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki
	    sekilde yazdirin
	    Isim – soyisim :YILMAZ TARHAN*/
		
		String isim,soyisim;
		System.out.println("Ýsminiz: ");
		isim=scan.nextLine();
		System.out.println("Soyisminiz: ");
		soyisim=scan.nextLine();
		
		System.out.println("Ýsim-Soyisim: " + isim +" " + soyisim);
		
		 
		
		 
		scan.close(); 
		
		
		

	}

}
