package Day19_WhileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {
	
		int i=0;
		while (i<5) {
			System.out.print(i+ " ");
			i++;
		}
	     // while loop önce kontrol eder sonra kodu çalýþtýrýr
		// loop içinde artýþ yapýlsada bir sonraki kontrole kadar kod çalýþmaya devam eder
		// bu da bazý durumlarda hatalý sonuçlara ulaþmamýza sebep OLABÝLÝR
	 
		
		
		// do-while loop ise önce iþlemi yapar ve sonra þartý kontrol eder
		// özellikle kullanýcýdan deðer almalarda do while loop tercih edilir
		
		
		int a=0;
	  do {
		System.out.println(a + " ");
		a++;
	} while (a<5);
	
	
	
	
	
	
	
	
	
	}

}
