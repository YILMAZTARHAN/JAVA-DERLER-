package Day03_Scanner;

import java.util.Scanner;

public class �dev {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
		 
		Scanner scan=new Scanner(System.in);
		int a,b;
		
	
		
		System.out.println("A Say�s�n� Giriniz: ");
		a=scan.nextInt();
		System.out.println("B Say�s�n� Giriniz:");
		b=scan.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b); 
		
		
		
		
		
		//Soru 2) Kullanicidan karenin bir kenar uzunlu�unu alin ve karenin cevresini ve alanini
	   // hesaplayip yazdirin
		
		
		
		int uzunlugu;
		double cevre,alan;
		
		System.out.println("Karenin Bir Kenar Uzunlu�unu Belirtiniz:");
		uzunlugu=scan.nextInt();
		
		cevre=uzunlugu*4;
		alan=uzunlugu*uzunlugu;
		
		System.out.println("Karenin �evresi: " + cevre);
		System.out.println("Karenin Alan�: " + alan);
		
	//Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		
		int r;
		double cevr,ala,pi=3.14;
		
		
		System.out.println("�emberin Yar��ap�n� Belirtiniz");
		r=scan.nextInt();
		
		cevr=2*r*pi;
		ala=r*r;
		
		System.out.println("�emberin �evresi: "+ cevr);
		System.out.println("�emberin Alan�:" + ala);
		
		//Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
	    //prizmanin hacmini hesaplayip yazdirin
		
		int uzun,kisakenar,y�kseklik;
		double hacim;
		
		System.out.println("Dikt�rtgenin Prizmas�n�n Uzunlu�unu Yaz�n�z:");
		uzun=scan.nextInt();
		System.out.println("Dikt�rtgen Prizmas�n�n K�sa Kenar�n� Yaz�n�z:");
		kisakenar=scan.nextInt();
		System.out.println("Dikt�rtgen Prizmas�n�n Y�ksekli�ini Yaz�n�z:");
		y�kseklik=scan.nextInt();
		
		hacim=uzun*kisakenar*y�kseklik;
		
		System.out.println("Dikd�rtgen Prizmas�n�n Hacmi: " + hacim);
		
		
		/*Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin

		�sminiz : YILMAZ
		Soyisminiz :TARHAN
		Kursumuza katiliminiz alinmistir,tesekkur ederiz*/
		
		String isminizi, soyisminizi;
		System.out.print("�sminiz:");
		isminizi=scan.nextLine();
		System.out.print("Soyisminiz:");
		soyisminizi=scan.nextLine();
		
		System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");
		
		 
		
		/*Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki
	    sekilde yazdirin
	    Isim � soyisim :YILMAZ TARHAN*/
		
		String isim,soyisim;
		System.out.println("�sminiz: ");
		isim=scan.nextLine();
		System.out.println("Soyisminiz: ");
		soyisim=scan.nextLine();
		
		System.out.println("�sim-Soyisim: " + isim +" " + soyisim);
		
		 
		
		 
		scan.close(); 
		
		
		

	}

}
