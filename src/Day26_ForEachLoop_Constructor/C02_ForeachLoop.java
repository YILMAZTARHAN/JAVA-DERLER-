package Day26_ForEachLoop_Constructor;

public class C02_ForeachLoop {

	public static void main(String[] args) {
		//Bir integer array olusturunuz ve bu array�deki tum sayilarin carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		int arr[]= {3,4,2,5};
		
		int carp�m=1;
		
		for (int each:arr) {
			carp�m *=each;
			
		}
		
		
		System.out.println("Arrayin elemanlar� �arp�m� : " + carp�m);
		
		
		
		
		
		
		
	}

}
