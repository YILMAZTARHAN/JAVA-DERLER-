package Day12_StringManipulation;

import java.util.Scanner;

public class C01_�ndexOf {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin
	
	  Scanner scan=new Scanner(System.in);
	  System.out.println("L�tfen Bir C�mle Giriniz");
	  
	  String c�mle=scan.nextLine();
	  System.out.println("L�tfen Varl���n� kontrol etmek i�in bir harf giriniz:");
	  char krk=scan.next().charAt(0);
	  
	  int index=c�mle.indexOf(krk);// girilen karakterin c�mledeki index'ini verir.
	  if (index<0) {
		System.out.println("Girdi�iniz harf verilen c�mlede yok");
	}
	  else {
		System.out.println("Girdi�iniz harf verilen c�mlede yok");
	}
	
	
	
	
	
	
	
	
	
	
	}

}
