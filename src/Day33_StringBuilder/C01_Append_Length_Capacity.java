package Day33_StringBuilder;

public class C01_Append_Length_Capacity {

	public static void main(String[] args) {
	
	StringBuilder sb=new StringBuilder();
	
	sb.length(); // sb'in uzunlu�unu verir
	
	System.out.println(sb.length()); // 0 sb'in kullan�lan k�sm�n�n  uzunlu�unu verir
	System.out.println(sb.capacity()); // 16 sb'in kapasinesini veri
		
		
	StringBuilder sb2=new StringBuilder("Java Cand�r");
	

	
	System.out.println(sb2.length()); // 11
	System.out.println(sb2.capacity()); // 27
	
StringBuilder sb3=new StringBuilder(7);
sb3.append("Mehlika");
	

	
	System.out.println(sb3.length()); // 7
	System.out.println(sb3.capacity()); //7
	
	
	StringBuilder sb4=new StringBuilder(7);
	
		System.out.println(sb4.length()); //0
		System.out.println(sb4.capacity()); //7
		
		sb4.append("Nilg�n");
		System.out.println(sb4.length()); //6
		System.out.println(sb4.capacity()); // 7
		
		sb4.append(" candir");
		System.out.println(sb4.length()); // 13
		System.out.println(sb4.capacity()); // 16
		
		
		sb.append("Java");
		System.out.println(sb);
		
		sb.append(" Cand�r");
		System.out.println(sb);
		
		sb.append("anlas�ld� m�", 3, 6);
		System.out.println(sb); // Java Cand�ras�
		
		
		
		
	}

}
