package Day30_ImmutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
	// Java da String iki türlü oluþturulabilir
	// 1-non-primitive olduðu için new keyword ile
	//  java önce eþitliðin saðýna baktýðýndan
	// new kelimesi olduðu için önce obje oluþturur
	// sonra deðeri atar
	// Yani bir oluþturma þeklinde her zaman
	// yeni bir obje oluþur
		
	//2- bügüne kadar öðrendiðimiz gibi oluþturursak
	//   String str2="Mustafa"
	//   Java bu durumda eþitliðin saðýnda olan
	// String'in STRÝNG HAVUZU 	
		
		
		
		
	
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
