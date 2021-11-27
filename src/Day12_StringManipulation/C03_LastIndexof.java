package Day12_StringManipulation;

import java.util.Scanner;

public class C03_LastIndexof {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin
			
			  Scanner scan=new Scanner(System.in);
			  System.out.println("Lütfen Bir Cümle Giriniz");
			  
			  String cümle=scan.nextLine();
			  System.out.println("Lütfen Varlýðýný kontrol etmek için bir harf giriniz:");
			  char krk=scan.next().charAt(0);
			  
			  int index=cümle.lastIndexOf(krk);
			  
			  if (index==(-1)) {
				System.out.println("Harf Cümlede Kullanýlmamýþ");
			} else {
				System.out.println("Harf Cümlede Kullanýlmýþ");
			}
	

	}

}
