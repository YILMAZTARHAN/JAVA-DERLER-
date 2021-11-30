package Day29_StaticBlock_PassByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// Main method'dan di�er method'lara veya di�er method'lardan main method'a
		// bir variable g�nderirseniz Java orjinal variable 'lar� de�il
		// onlar�n de�erlerini(value) g�t�r�r, orjinal varibale'in de�eri de�i�mez
		
		int fiyat=100;
		
		
		System.out.println(indirimYap25(fiyat));  //75                
		System.out.println("method'dan sonra main method'daki fiyat: " + fiyat);//100
		fiyat=indirimYap10(fiyat);
		
		// indirimi kal�c� yapmak istiyorsan�z main method'a atama yapman�z gerekir
		System.out.println("method'dan sonra main method'daki fiyat: " + fiyat);// 90	

	}

	private static int indirimYap25(int fiyat) {
		fiyat *=0.75;
		return fiyat;
		
	}

	private static int indirimYap10(int fiyat) {
	fiyat *=0.90;
	
	return fiyat;
		
	}

}
