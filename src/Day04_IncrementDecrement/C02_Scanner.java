package Day04_IncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
	//Kullan�c�dan ismini alip isminin ba� harfini yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("L�tfen isminizi yaz�n�z");
		 
		 char ilkHarf=scan.next().charAt(0);
		 
		 // �sminizin ilk harfi:Y
		 
		 System.out.println("�sminizin ilk harfi: " + ilkHarf);
		 
		 scan.close();

	}

}
