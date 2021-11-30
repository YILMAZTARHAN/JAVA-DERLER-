package Day29_StaticBlock_PassByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// Main method'dan diðer method'lara veya diðer method'lardan main method'a
		// bir variable gönderirseniz Java orjinal variable 'larý deðil
		// onlarýn deðerlerini(value) götürür, orjinal varibale'in deðeri deðiþmez
		
		int fiyat=100;
		
		
		System.out.println(indirimYap25(fiyat));  //75                
		System.out.println("method'dan sonra main method'daki fiyat: " + fiyat);//100
		fiyat=indirimYap10(fiyat);
		
		// indirimi kalýcý yapmak istiyorsanýz main method'a atama yapmanýz gerekir
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
