package day10_ternary_SwitchCase;

public class C07_SwitcCase {

	public static void main(String[] args) {
		// G�n numaras�na g�re g�n isimlerini yazal�m
		
		int gunNo=3;
		
		switch(gunNo) {
		 
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
			
			default:
				System.out.println("L�tfen Ge�erli bir g�n numaras�n� yaz�n�z");
		
		}

	}

}
