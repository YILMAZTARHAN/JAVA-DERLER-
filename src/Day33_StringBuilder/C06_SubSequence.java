package Day33_StringBuilder;

public class C06_SubSequence {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java ne kadar kolay");
		
		sb.substring(14);
		System.out.println(sb.substring(14));
		
		sb.subSequence(14, 19);
		System.out.println(sb.subSequence(14, 19));
		
		
		         // ikisi de ayni sonucu dondurur
				// ancak substring() String class'indan geldigi icin 
				// substring() kullandigimda arkasindan String method'larini kullanabilirim
				// Ancak, subSequence kullandigimda bu mumkun olmaz

	}

}
