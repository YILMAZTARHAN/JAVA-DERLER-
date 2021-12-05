package Day10_ternary_SwitchCase;

public class C11_SMConcat {

	public static void main(String[] args) {
		// String olarak verilen bir de�i�ken + ile ba�ka bir de�i�lenler i�leme sokulursa 
		//JAVA bunlar� yan yana ekler.Buna Concatenation denir.
		
		String isim="Ali";
		String soyisim="Can";
		
		System.out.println(isim+" "+ soyisim);// Ali Can
		
		
		//ayni i�lemi + sembolu yerine concat() ile de yapabiliriz
		
		System.out.println(isim.concat(soyisim));
		
		System.out.println(isim.concat(" ").concat(soyisim));// Ali Can

	}

}
