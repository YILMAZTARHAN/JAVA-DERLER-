package Day12_StringManipulation;

import java.util.Scanner;

public class C01_ÝndexOf {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin
	
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Lütfen Bir Cümle Giriniz");
	  
	  String cümle=scan.nextLine();
	  System.out.println("Lütfen Varlýðýný kontrol etmek için bir harf giriniz:");
	  char krk=scan.next().charAt(0);
	  
	  int index=cümle.indexOf(krk);// girilen karakterin cümledeki index'ini verir.
	  if (index<0) {
		System.out.println("Girdiðiniz harf verilen cümlede yok");
	}
	  else {
		System.out.println("Girdiðiniz harf verilen cümlede yok");
	}
	
	
	
	
	
	
	
	
	
	
	}

}
