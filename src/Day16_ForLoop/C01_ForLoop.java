package Day16_ForLoop;

public class C01_ForLoop {

	public static void main(String[] args) {
		
for (int i = 0; i <= 10; i++) {
	
	System.out.print(i+ " ");
}		
		// for loop ba�lang�� ve biti� �art� bir say�n�n de�erine ba�l� olan 
        // durumlarda tercih edilir.

      /* for (int i = 0; i < 10; i--) {
    	   System.out.println(i+ " ");
    	  }*/ 
    	   // e�er ba�lang�� say�s� art�� /azal�� ile biyi� de�erine yakla�m�yor,uzakla��yor ise
    	   // loop hi� bir zaman durmaz
    	   // bu duruma sozsuz loop deriz ve bu durumun ger�ekle�mesini istemeyiz.
	
         
          for (int i = 0; i >10; i++) {
			System.out.println(i+ "acaba �al���rm�");
	       }
           // e�er ild de�er i�in biti� �art� true olmazsa 
          // daha ilk ad�mda loop broken olur
          // dolay�s�yla  loop body hi� �al��madan , loop'un sonras�na ge�ilir
          // loop �ALI�IR, ama hi� bir i�lem yapmaz.
       

	}

}
