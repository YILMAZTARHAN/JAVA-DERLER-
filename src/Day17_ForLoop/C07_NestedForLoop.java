package Day17_ForLoop;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		// 1 den 4 'e kadar sayýlarý yan yana aralarýnda bir boþluk býrakarak yazýn
		
		for (int satýr = 1; satýr <=4; satýr++) {
			for (int i = 1; i <=4; i++) {
				System.out.print(satýr*i+ " ");
			}
          System.out.println();
		}
	}

}
