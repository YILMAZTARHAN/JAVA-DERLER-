package Day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		//Soru 6 ) Kullanicidan bir sayi alin
		// ve bu sayiyi tam bolen sayilari 
		// ve toplam kac tane olduklarini ekranda yazdirin

	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen bölenlerini bulmak için pozitif bir tam sayý giriniz");
	int sayi=scan.nextInt();
	
	int sayac=0;
	int bölen=1;
	while (bölen<=sayi) {
		if (sayi%bölen==0) {
			System.out.print(bölen + " ");
		    sayac++;
		}   
	   bölen++;
	}
	System.out.println("");
	System.out.println(sayi+ " Sayýsýnýn " + sayac + " adet tam böleni vardýr ");
	scan.close();
	}

}
