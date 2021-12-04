package Day33_StringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
	
		StringBuilder sb=new StringBuilder("Java candýr can");
		
		sb.deleteCharAt(11);// sadece 11.index'deki karakteri siler
		System.out.println(sb);
		
		sb.delete(11, 13); // ilk index inclusive,ikinci index exclusive olduðundan
		System.out.println(sb);
		
		sb.delete(11, sb.length());
		
		System.out.println(sb);
		
		sb.delete(5, 20);
		System.out.println(sb);
		
		

	}

}
