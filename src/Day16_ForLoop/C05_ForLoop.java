package Day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		//Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 
        //        1’den baslayarak girilen sayiya kadar(sayý dahil) 3’un kati olan sayilari yazdirin.

	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen Yüzden küçük bir sayý giriniz...");
	double num=scan.nextDouble();
	int sayi=(int) num;
	
	// sayý negatifse veya tam sayý deðilse uyarý verelim
	
	if (num<0) {
		System.out.println("Negatif sayi giremezsiniz");
	} else if(sayi!=num) {
        System.out.println("Lütfen Tam Sayý Giriniz");
	}else if(sayi>100) {
		System.out.println("Lütfen 100'den küçük sayý giriniz");
	}
	else {
		
		for (int i = 1; i <=num ; i++) {
			
			if (i%3==0) {
				System.out.print(i+" ");
			}
			scan.close();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
