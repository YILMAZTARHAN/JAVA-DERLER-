package Day33_StringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
	
	StringBuilder sb=new StringBuilder("Java ��rendik");
	
	// araya �ok iyi ekleyelim
	
	sb.insert(4, "yi �ok iyi");
	System.out.println(sb); // Javayi �ok iyi ��rendik
	
	
	//
	String str2="�ok iyiyim";
	sb.insert(7, str2, 0, 4);
	
	System.out.println(sb);
		
		
		
		
		
	}

}
