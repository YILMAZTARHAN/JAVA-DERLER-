package Day29_StaticBlock_PassByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		// biz 100 tl ye satýlan bir ürün için 2 farklý indirim uygulayan iki method oluþturalým
		
		int fiyat=100;
		
		
		indirimYap25(fiyat);
		System.out.println("method'dan sonra main method'daki fiyat: " + fiyat);
		indirimYap10(fiyat);
		System.out.println("method'dan sonra main method'daki fiyat: " + fiyat);

	}

	private static void indirimYap25(int fiyat) {
		fiyat *=0.75;
		System.out.println("%25 indirimli fiyat: " + fiyat);
		
	}

	private static void indirimYap10(int fiyat) {
	fiyat *=0.90;
	System.out.println("%10 indirimli fiyat: " + fiyat);
		
	}

}
