package Day18_NestedForLoop_WhileLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		//Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan 
		//15, 20 ve 90�na tam bolunebilen sayilari yazdirin.

      for (int i = 100; i <1000; i++) {
		 if (i%15==0 && i%20==0 && i%90==0) {
			System.out.println(i);
		}
	}
		
      
      int sayi=100; // ba�lang�� de�erim
      
      while (sayi<1000) {
    	  if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
  			System.out.println(sayi);
  		}
	}sayi++;
      
		// E�er ba�lang�� ve biti� �art� bir say�n�n art���na ba�l� ise
	    // tekrar edilecek i�lem ededi belli ise forloop tercih edilir.
	    //i�lem tekrar say�s� belli de�il ise veya
	     //biti� i�in bir s�n�r de�erinden b�y�k olma gibi bir �art varsa while loop tercih edilir.
	}

}
