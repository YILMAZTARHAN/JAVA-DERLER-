package Day13_StringManipulation;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		
		String str="*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll methodlar� kullanarak Java ogrenmek �ok kolay
		
		str=str.replaceAll("\\d", "");//*Java ogrenmek c..ok kolay
		
		str=str.replaceAll("\\s", "x"); //*Javaxogrenmekxc..okxkolay
		
		str=str.replaceAll("\\W", ""); // Javaxogrenmekxcokxkolay
			
		str=str.replace("x", " "); //  Java ogrenmek cok kolay
		
		System.out.println(str);
		

	}

}
