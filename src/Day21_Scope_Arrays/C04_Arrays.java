package Day21_Scope_Arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
	int arr[]= {2,4,5,6,78,89};
	
	//t�m elemntleri yazd�rabiliriz
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}

	System.out.println();
	System.out.println(Arrays.toString(arr));

}
}