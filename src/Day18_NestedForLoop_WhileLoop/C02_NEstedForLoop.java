package Day18_NestedForLoop_WhileLoop;


import java.util.Scanner;

public class C02_NEstedForLoop {

	public static void main(String[] args) {
		// Kullan�c�dan 10'dan k���k pozitif bir tamsay� girmesini isteyin
		// girdi�i say�ya g�re a�a��daki �ekli yazd�r�n
		// �nr:3 girerse
		// 1
		//1 2
		//1 2 3 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�yfen 10'dan k���k pozif bir tam say� girin...");
		
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
