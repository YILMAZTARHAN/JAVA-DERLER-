package Day12_StringManipulation;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
	  //Soru 1) Kullanicidan email adresini girmesini isteyin,
      // mail @gmail.com icermiyorsa �lutfen gmail adresi giriniz�, 
      //@gmail.com ile bitiyorsa �Email adresiniz kaydedildi � , 
     //  @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

		  Scanner scan=new Scanner(System.in);
		  System.out.println("L�tfen Mail Adresinizi Yaz�n�z:");
		  String email=scan.next();
		  
		  int uzunluk=email.length();
		  int index=email.lastIndexOf("@gmail.com");
		  
		  if (!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresi giriniz");
			  
		} else if(index==uzunluk-10) {
            System.out.println("Email adresiniz kaydedildi");
		}
		
		else {
			System.out.println("L�tfen yaz�m� kontrol edin");
		}
		
		
		
		
		
		
		
	}

}
