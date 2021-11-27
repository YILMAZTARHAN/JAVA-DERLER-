package Day08_IfVeElseStatements;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		//Soru 2) Kullanicidan bir karakter girmesini isteyin 
       // ve girilen karakterin harf olup olmadigini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Bir Karakter Giriniz");
		
		char karakter=scan.next().charAt(0);
		
		if ((karakter>='A'&& karakter<='Z')||(karakter>='a'&& karakter<='z')) {
			System.out.println("girdiğniz:" + karakter+ " bir harf harftir");
		} 
		
		else {
         System.out.println("girdiğniz:" + karakter+ " bir harf değildir");
		
		}
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
