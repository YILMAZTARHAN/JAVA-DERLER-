package Day19_WhileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
	
		int i=0;
		while (i<5) {
			System.out.print(i+ " ");
			i++;
		}
	     // while loop �nce kontrol eder sonra kodu �al��t�r�r
		// loop i�inde art�� yap�lsada bir sonraki kontrole kadar kod �al��maya devam eder
		// bu da baz� durumlarda hatal� sonu�lara ula�mam�za sebep OLAB�L�R
	 
		
		
		// do-while loop ise �nce i�lemi yapar ve sonra �art� kontrol eder
		// �zellikle kullan�c�dan de�er almalarda do while loop tercih edilir
		
		
		int a=0;
	  do {
		System.out.println(a + " ");
		a++;
	} while (a<5);
	
	
	
	
	
	
	
	
	
	}

}
