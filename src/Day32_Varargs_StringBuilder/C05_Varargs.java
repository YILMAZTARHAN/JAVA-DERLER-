package Day32_Varargs_StringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
	topla(5,8,10,13,15,0);
		
		// Vararsd'dan önce farklý parametreler kullanýlabilir
	    // ama 
	}

	private static void topla(int...sayýlar) {
		
		int toplam=0;
		
		for (int each:sayýlar) {
			toplam+=each;
		}
		System.out.println("Girilen Sayýlarýn Toplamý : " + toplam);
	}

}