package Day12_StringManipulation;

import java.util.Scanner;

public class C03_LastIndexof {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin
			
			  Scanner scan=new Scanner(System.in);
			  System.out.println("L�tfen Bir C�mle Giriniz");
			  
			  String c�mle=scan.nextLine();
			  System.out.println("L�tfen Varl���n� kontrol etmek i�in bir harf giriniz:");
			  char krk=scan.next().charAt(0);
			  
			  int index=c�mle.lastIndexOf(krk);
			  
			  if (index==(-1)) {
				System.out.println("Harf C�mlede Kullan�lmam��");
			} else {
				System.out.println("Harf C�mlede Kullan�lm��");
			}
	

	}

}
