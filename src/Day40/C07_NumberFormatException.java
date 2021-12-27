package Day40;

public class C07_NumberFormatException {

	public static void main(String[] args) {
		
		String str ="123b";
		
		int sayi= Integer.parseInt(str) + 4;
		
		System.out.println(sayi);

	}

}