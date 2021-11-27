package Day16_ForLoop;

public class C01_ForLoop {

	public static void main(String[] args) {
		
for (int i = 0; i <= 10; i++) {
	
	System.out.print(i+ " ");
}		
		// for loop baþlangýç ve bitiþ þartý bir sayýnýn deðerine baðlý olan 
        // durumlarda tercih edilir.

      /* for (int i = 0; i < 10; i--) {
    	   System.out.println(i+ " ");
    	  }*/ 
    	   // eðer baþlangýç sayýsý artýþ /azalýþ ile biyiþ deðerine yaklaþmýyor,uzaklaþýyor ise
    	   // loop hiç bir zaman durmaz
    	   // bu duruma sozsuz loop deriz ve bu durumun gerçekleþmesini istemeyiz.
	
         
          for (int i = 0; i >10; i++) {
			System.out.println(i+ "acaba çalýþýrmý");
	       }
           // eðer ild deðer için bitiþ þartý true olmazsa 
          // daha ilk adýmda loop broken olur
          // dolayýsýyla  loop body hiç çalýþmadan , loop'un sonrasýna geçilir
          // loop ÇALIÞIR, ama hiç bir iþlem yapmaz.
       

	}

}
