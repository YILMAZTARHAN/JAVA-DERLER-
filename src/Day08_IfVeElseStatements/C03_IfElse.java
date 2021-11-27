package Day08_IfVeElseStatements;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
	
		//Soru 3) Kullaniciya yasini sorun, 
        //eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        //65’den buyukse “Emekli olabilirsin” yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yaþýnýzý giriniz:");
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("emekli olamazsýn, çalýþmalýsýn");
		} else {
           System.out.println("emekli olabilirsin");
		}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
