package Day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		//Soru 4) Kullanicidan 100�den kucuk bir tamsayi isteyin. 
        //        1�den baslayarak girilen sayiya kadar(say� dahil) 3�un kati olan sayilari yazdirin.

	Scanner scan=new Scanner(System.in);
	System.out.println("L�tfen Y�zden k���k bir say� giriniz...");
	double num=scan.nextDouble();
	int sayi=(int) num;
	
	// say� negatifse veya tam say� de�ilse uyar� verelim
	
	if (num<0) {
		System.out.println("Negatif sayi giremezsiniz");
	} else if(sayi!=num) {
        System.out.println("L�tfen Tam Say� Giriniz");
	}else if(sayi>100) {
		System.out.println("L�tfen 100'den k���k say� giriniz");
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
