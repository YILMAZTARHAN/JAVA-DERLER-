package Day08_IfVeElseStatements;

import java.util.Scanner;

public class C08_NestedIf {

	public static void main(String[] args) {
		// E�er �al��an kad�nsa 60 ya��ndan b�y�k oldu�unda emekli olabilir,
		// �al��an erkekse 65 ya��ndan b�y�kse emekli olabilir.
		
		Scanner scan=new Scanner(System.in);
       System.out.println("L�tfen Cinsiyetinizi Giriniz \nErkek i�in E, Kadin i�in K");
       char cinsiyet=scan.next().toUpperCase().charAt(0);
       
       System.out.println("L�tfen ya��n�z� giriniz:");
       double yas=scan.nextDouble();
       
       if (cinsiyet=='E') {
		if (yas>65) {
			System.out.println("Emekli Olabilirsin");
		}
		else {
			System.out.println("Emekli Olamazs�n");
		}
        }
       else if(cinsiyet=='K') {
       if (yas>60) {
		System.out.println("Emekli Olabilirsin");
	}
       else {
    	   System.out.println("Emekli Olamazs�n");
       }
       
       
       
       }
       
    
scan.close();
	
	}
}