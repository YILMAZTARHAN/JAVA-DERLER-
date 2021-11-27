package Day14_methodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Verilen iki sayýnýn toplamýný vr çarpýmýný yapýp yazdýran iki ayri method oluþturun
		
		// methot oluþturmak için 4 adým takip edelim
		//1.adým method call yazalým
		//2.adým öethod'a arguman yazacakmýyýz karar vermeliyiz
		
		int sayi1=44;
		int sayi2=55;
		
		
		çarpma(sayi1,sayi2);
		toplama(sayi1,sayi2); // method call
		
		//3.adým 1. ve 2.adýmý yaptýktan sonra java'dan yardým alýp method'u oluþturunuz
		
		
		çarpma(sayi1,sayi2);
		
	}

	public static void çarpma(int sayi1, int sayi2) {
		System.out.println("Sayýlarýn çarpýmý: " + (sayi1*sayi2));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		// 4.adým eriþim düzenleyici ve return type karar vermeliyiz.
		// eriþim düzenleyici axcess modifier: puplic yaptýk
		// return type: bizden sadece yazdýrma iztediði için void kalabilir.
		
		System.out.println("Sayýlarýn toplamý: " + (sayi1+sayi2));
		
	}
	

}
