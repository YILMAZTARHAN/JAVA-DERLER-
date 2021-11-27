package Day08_IfVeElseStatements;

import java.util.Scanner;

public class C09_IfElseIF {

	public static void main(String[] args) {
		//Kullanýcýdan gün ismini yazmasýný isteyin,
		//Girilen isim geçerli bir gün ise gün isminin 1,2 ve 3. harflerini
		//ilk harf büyük diðer ikisi küçük olarak yazdýrýn.
		//Gün ismi geçerli deðilse "Geçerli gün ismi giriniz " yazdýrýn
			
		Scanner scan =	new Scanner(System.in);
		System.out.println("Lütfen gün ismini yazýnýz.");
		String gün = scan.next().toLowerCase();
		
		
		if (gün.equals("pazartesi") || gün.equals("salý") || gün.equals("çarþamba") || gün.equals("perþembe")||gün.equals("cuma") || gün.equals("cumartesi") || gün.equals("pazar ")) {
			System.out.println(gün.toUpperCase().charAt(0)+""+gün.toLowerCase().charAt(1)+""+gün.toLowerCase().charAt(2));
		} else {
	        System.out.println("Geçerli gün ismi giriniz");
		}

	
	scan.close();
	
	
	
	}

}
