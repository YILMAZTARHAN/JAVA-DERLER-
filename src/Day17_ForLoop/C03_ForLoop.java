package Day17_ForLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		//Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren 
	    // bir method yazin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen tersten yazd�rmak i�in bir yaz� girin...");
        String str=scan.nextLine();
        
        // Fatih
        
       System.out.println( tersineCevir(str));
scan.close();
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		
		for (int i = str.length()-1; i>=0; i--) {
			tersStr+=str.substring(i,i+1);
		}
		
	
	return tersStr;
	
	}

}
