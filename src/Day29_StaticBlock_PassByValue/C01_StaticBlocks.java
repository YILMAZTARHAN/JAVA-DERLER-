package Day29_StaticBlock_PassByValue;

public class C01_StaticBlocks {
 static {
	 System.out.println("static blok ne zaman çalýþacak ?");
 }
	
	
	public static void main(String[] args) {
		System.out.println("Javada önce main method çalýþýr");

	}
	static {
		 System.out.println("static blok nereye yazýlýrsa yazýlsýn main method'dan bile önce çalýþýr");
		 
		 // eðer birden fazla static blok varsa Java yukarýdakini daha önce çalýþtýrýr.
	}
}
