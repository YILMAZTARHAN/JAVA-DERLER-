package Day29_StaticBlock_PassByValue;

public class C01_StaticBlocks {
 static {
	 System.out.println("static blok ne zaman �al��acak ?");
 }
	
	
	public static void main(String[] args) {
		System.out.println("Javada �nce main method �al���r");

	}
	static {
		 System.out.println("static blok nereye yaz�l�rsa yaz�ls�n main method'dan bile �nce �al���r");
		 
		 // e�er birden fazla static blok varsa Java yukar�dakini daha �nce �al��t�r�r.
	}
}
