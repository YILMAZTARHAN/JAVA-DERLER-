package Day13_StringManipulation;

public class C03_Replace {

	public static void main(String[] args) {
		
		String str="Java ��renmek �ok Kolay";
				

		System.out.println(str.replace(" ", ""));	
		
		System.out.println(str.replace("��renmek", "kod yazmak"));
		
		System.out.println(str.replace("e", "a"));
				
	}

}
