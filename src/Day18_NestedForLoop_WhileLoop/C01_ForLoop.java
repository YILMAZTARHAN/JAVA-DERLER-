package Day18_NestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// Kullanýcýdan iki tam sayý isteyin
		// ilk sayýdan baþlayarak ikinci sayýya kadar üçer, ücer yazdýrýn
        // (ikinci sayý dahil olmak zorunda deðil)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lüyfen aradaki sayýlarý üçer üçer yazdýrmak için iki tam sayý girin...");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();					
		
		if (sayi1>sayi2) {// azalarak gidecek
			for (int i = sayi1; i >=sayi2;i-=3) {
				System.out.println(i+ " ");
			}
			
			
			
		} else if(sayi1<sayi2) {// artarak gidecek
			for (int i = sayi1; i <=sayi2;i+=3)
				System.out.println(i+ " ");

		}else {
			System.out.println("Girilen sayýlar eþit");
		}
		scan.close();
	}

}
