package Day13_StringManipulation;

import java.util.Scanner;

public class H03_Ödev {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
				Scanner scan=new Scanner(System.in);
				System.out.println("Lutfen isminizi giriniz ");
				String isim = scan.nextLine();
				System.out.println("Lutfen soyisminizi giriniz ");
				String soyisim = scan.nextLine();
				
				if (isim.length()==soyisim.length()) {
					System.out.println("girilen isim ve soyisim esit uzunlukta");
				}else if(isim.length()>soyisim.length()) {
					System.out.println("girilen isim soyisimden uzun");
				}else {
					System.out.println("girilen isim soyisimden kisa");
				}

				scan.close();
	}

}
