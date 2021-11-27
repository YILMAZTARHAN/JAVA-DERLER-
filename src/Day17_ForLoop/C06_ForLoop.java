package Day17_ForLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		//Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin
		 //ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		 Scanner scan = new Scanner(System.in);
	      System.out.println("Faktoriyel bulmak için 10'dan küçük bir tam sayý girin...");
	      int sayi=scan.nextInt();
	      
	      int faktoryel=1;
	      
	      for (int i = sayi; i >0; i--) {
			faktoryel*=i;
		}
        System.out.println(faktoryel);
	scan.close();
	
	}

}
