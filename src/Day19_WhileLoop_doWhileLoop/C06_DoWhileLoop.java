package Day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

	public static void main(String[] args) {
	   /*  Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
         Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
	      -Sifre kucuk harf icermelidir
         - Sifre buyuk harf icermelidir
	     - Sifre ozel karakter icermelidir
	    - Sifre en az 8 karakter olmalidir.*/
		
		
		 Scanner scan=new Scanner(System.in);
		
		 String sifre="";
		 boolean khk=false;
		 boolean bhk=false;
		 boolean okk=false;
		 boolean uk=false;
		
		
		 do {
			 System.out.println("Lütfen bir þifre giriniz");
			 sifre=scan.nextLine();
			 
			khk= kucukHarfKontrol(sifre);
			 bhk=buyukHarfKontrol(sifre);
			okk=ozelKarakterKontrol(sifre);
			uk=uzunlukKontrolu(sifre);
			 
		} while (!khk||!bhk||!okk||!uk);
		
		System.out.println("Þifreniz baþarýlý bir þekilde kaydedildi");
		
		scan.close();
		
		
		

	}

	private static boolean uzunlukKontrolu(String sifre) {
		  boolean uk=false;
	        if (sifre.length()>=8) {
	            uk=true;
	        } else {
	            System.out.println("sifreniz en az 8 karakter olmalidir");
	        }
	        return uk;
		
	}

	private static boolean ozelKarakterKontrol(String sifre) {
		boolean okk=false;
		String harfler="!@#$%^&*()_-+=/?<,>.|";
		for (int i = 0; i <sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i+1))) {
				okk=true;
				break; 
			}
		
		}
		//
	if (!okk) {
		System.out.println("Þifreniz en az bir küçük harf içermelidir");
	}
		
		
		return okk;
		
	}

	private static boolean buyukHarfKontrol(String sifre) {
		boolean bhk=false;
		String harfler="ABCDEFGHIJKLMNOPRSTUVYZQWX";
		for (int i = 0; i <sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i+1))) {
				bhk=true;
				break; 
			}
		
		}
		//
	if (!bhk) {
		System.out.println("Þifreniz en az bir küçük harf içermelidir");
	}
		
		
		return bhk;
	}

	private static boolean kucukHarfKontrol(String sifre) {
		boolean khk=false;
		
		String harfler="abcdefghijklmeoprstuvyzqwx";
		for (int i = 0; i <sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i+1))) {
				khk=true;
				break; // Break kullanmamýz sebebi : soruda 1 tane küçük harf olmasý yeterli
				       // biz küçük harfi bulduktan sonra kodu durdurmazsak 
				       // sonradan karþýmýza çýkacak Büyük harfler bizi yanýltýr.
			}
		
		}
		// bu satýra geldiðimde þifrede küçük harf varsa khk=true,hiç küçük harf yoksa khk=false
	if (!khk) {
		System.out.println("Þifreniz en az bir küçük harf içermelidir");
	}
	return khk;
	}
	

}
