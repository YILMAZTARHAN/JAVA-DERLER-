package day10_ternary_SwitchCase;

public class C08_SwitcCase {

	public static void main(String[] args) {
		// G�n numaras�na g�re hafta i�i hafta sonu yazd�ral�m
		
		int gunNo=7;

		switch(gunNo) {
		 
		case 1:
		case 2:
		case 3:
     	case 4:
     	case 5:
			System.out.println("Hafta ��i");
			break;
		case 6:
		case 7:
			System.out.println("Hafta Sonu");
			break;
			default:
				System.out.println("L�tfen Ge�erli bir g�n numaras�n� yaz�n�z");
		
		}
	}

}
