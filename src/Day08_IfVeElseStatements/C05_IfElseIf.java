package Day08_IfVeElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
	//Soru 6) Kullanicidan iki sayi isteyin, 
    //sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, 
    //sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
    //sayilarin ikisi farkli isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin, 
   //sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir� yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki sayi yaz�n�z \nilk sayidan sonra di�er sayi i�in enter'e bas�n�z :");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1>0 && sayi2>0) {
			System.out.println("Say�lar�n toplam�:"+(sayi1+sayi2));
		} 
		else if(sayi1<0 && sayi2<0) {
            System.out.println("Say�lar�n �Arp�m�: " + sayi1*sayi2);
		}
		else if(sayi1*sayi2<0) {
			System.out.println("Farkl� i�retlerde say�larla i�lem yapamazs�n");
		}
		
		else {
			System.out.println("S�f�r �arpmaya g�re yutan elemand�r");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
