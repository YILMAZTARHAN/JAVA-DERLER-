package Day10_ternary_SwitchCase;

public class C11_SMConcat {

	public static void main(String[] args) {
		// String olarak verilen bir deðiþken + ile baþka bir deðiþlenler iþleme sokulursa 
		//JAVA bunlarý yan yana ekler.Buna Concatenation denir.
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim+" "+ soyisim);// Ali Can
		
		
		//ayni iþlemi + sembolu yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim));
		
		System.out.println(isim.concat(" ").concat(soyisim));// Ali Can

	}

}
