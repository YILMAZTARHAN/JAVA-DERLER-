package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_Array {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir cumle isteyin ve 
		//cumledeki kelime sayisini yazdirin
		
		
		String cumle="Her Þey ,Javayla kolay deðil mi?";
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));//[Her, Þey, ,Javayla, kolay]
		
		System.out.println("Girilen Cümlede "+kelimeler.length +" adet kelime var");

	}

}
