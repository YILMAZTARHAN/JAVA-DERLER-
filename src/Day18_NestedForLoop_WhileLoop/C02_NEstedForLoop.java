package Day18_NestedForLoop_WhileLoop;


import java.util.Scanner;

public class C02_NEstedForLoop {

	public static void main(String[] args) {
		// Kullanýcýdan 10'dan küçük pozitif bir tamsayý girmesini isteyin
		// girdiði sayýya göre aþaðýdaki þekli yazdýrýn
		// önr:3 girerse
		// 1
		//1 2
		//1 2 3 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lüyfen 10'dan küçük pozif bir tam sayý girin...");
		
		int sayi=scan.nextInt();
   
	    for (int satir = 1; satir <=sayi; satir++) {
			for (int i = 1; i <=satir; i++) {
				System.out.print(i+ " ");
			}
			System.out.println("");
	    }	
		
		scan.close();
		
		
		
	}

}
