package Day17_ForLoop;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		// 1 den 4 'e kadar say�lar� yan yana aralar�nda bir bo�luk b�rakarak yaz�n
		
		for (int sat�r = 1; sat�r <=4; sat�r++) {
			for (int i = 1; i <=4; i++) {
				System.out.print(sat�r*i+ " ");
			}
          System.out.println();
		}
	}

}
