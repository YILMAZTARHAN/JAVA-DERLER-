package Day32_Varargs_StringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
	topla(5,8,10,13,15,0);
		
		// Vararsd'dan �nce farkl� parametreler kullan�labilir
	    // ama 
	}

	private static void topla(int...say�lar) {
		
		int toplam=0;
		
		for (int each:say�lar) {
			toplam+=each;
		}
		System.out.println("Girilen Say�lar�n Toplam� : " + toplam);
	}

}