package Day08_IfVeElseStatements;

import java.util.Scanner;

public class C09_IfElseIF {

	public static void main(String[] args) {
		//Kullan�c�dan g�n ismini yazmas�n� isteyin,
		//Girilen isim ge�erli bir g�n ise g�n isminin 1,2 ve 3. harflerini
		//ilk harf b�y�k di�er ikisi k���k olarak yazd�r�n.
		//G�n ismi ge�erli de�ilse "Ge�erli g�n ismi giriniz " yazd�r�n
			
		Scanner scan =	new Scanner(System.in);
		System.out.println("L�tfen g�n ismini yaz�n�z.");
		String g�n = scan.next().toLowerCase();
		
		
		if (g�n.equals("pazartesi") || g�n.equals("sal�") || g�n.equals("�ar�amba") || g�n.equals("per�embe")||g�n.equals("cuma") || g�n.equals("cumartesi") || g�n.equals("pazar ")) {
			System.out.println(g�n.toUpperCase().charAt(0)+""+g�n.toLowerCase().charAt(1)+""+g�n.toLowerCase().charAt(2));
		} else {
	        System.out.println("Ge�erli g�n ismi giriniz");
		}

	
	scan.close();
	
	
	
	}

}
