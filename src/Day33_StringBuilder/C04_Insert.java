package Day33_StringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
	
	StringBuilder sb=new StringBuilder("Java Öðrendik");
	
	// araya çok iyi ekleyelim
	
	sb.insert(4, "yi çok iyi");
	System.out.println(sb); // Javayi çok iyi Öðrendik
	
	
	//
	String str2="çok iyiyim";
	sb.insert(7, str2, 0, 4);
	
	System.out.println(sb);
		
		
		
		
		
	}

}
