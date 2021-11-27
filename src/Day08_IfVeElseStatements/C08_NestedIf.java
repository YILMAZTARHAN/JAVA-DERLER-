package Day08_IfVeElseStatements;

import java.util.Scanner;

public class C08_NestedIf {

	public static void main(String[] args) {
		// Eðer çalýþan kadýnsa 60 yaþýndan büyük olduðunda emekli olabilir,
		// Çalýþan erkekse 65 yaþýndan büyükse emekli olabilir.
		
		Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen Cinsiyetinizi Giriniz \nErkek için E, Kadin için K");
       char cinsiyet=scan.next().toUpperCase().charAt(0);
       
       System.out.println("Lütfen yaþýnýzý giriniz:");
       double yas=scan.nextDouble();
       
       if (cinsiyet=='E') {
		if (yas>65) {
			System.out.println("Emekli Olabilirsin");
		}
		else {
			System.out.println("Emekli Olamazsýn");
		}
        }
       else if(cinsiyet=='K') {
       if (yas>60) {
		System.out.println("Emekli Olabilirsin");
	}
       else {
    	   System.out.println("Emekli Olamazsýn");
       }
       
       
       
       }
       
    
scan.close();
	
	}
}