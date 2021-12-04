package Day30_ImmutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
	// Java da String iki t�rl� olu�turulabilir
	// 1-non-primitive oldu�u i�in new keyword ile
	//  java �nce e�itli�in sa��na bakt���ndan
	// new kelimesi oldu�u i�in �nce obje olu�turur
	// sonra de�eri atar
	// Yani bir olu�turma �eklinde her zaman
	// yeni bir obje olu�ur
		
	//2- b�g�ne kadar ��rendi�imiz gibi olu�turursak
	//   String str2="Mustafa"
	//   Java bu durumda e�itli�in sa��nda olan
	// String'in STR�NG HAVUZU 	
		
		
		
		
	
	String str1="Mustafa";
	String str2="Mustafa";
	
	
	
	
	String str3=new String("Mustafa");
	String str4=new String("Mustafa");
	
	System.out.println(str1==str3);// false
	System.out.println(str1.equals(str3));//true 
	
	System.out.println(str4==str3);// false
	System.out.println(str4.equals(str3));//true 
	
	System.out.println(str1==str2);//true
		
	}

}
