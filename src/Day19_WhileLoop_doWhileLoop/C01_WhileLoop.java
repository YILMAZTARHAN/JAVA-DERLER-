package Day19_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		//Soru 6 ) Kullanicidan bir sayi alin
		// ve bu sayiyi tam bolen sayilari 
		// ve toplam kac tane olduklarini ekranda yazdirin

	Scanner scan=new Scanner(System.in);
	System.out.println("L�tfen b�lenlerini bulmak i�in pozitif bir tam say� giriniz");
	int sayi=scan.nextInt();
	
	int sayac=0;
	int b�len=1;
	while (b�len<=sayi) {
		if (sayi%b�len==0) {
			System.out.print(b�len + " ");
		    sayac++;
		}   
	   b�len++;
	}
	System.out.println("");
	System.out.println(sayi+ " Say�s�n�n " + sayac + " adet tam b�leni vard�r ");
	scan.close();
	}

}
