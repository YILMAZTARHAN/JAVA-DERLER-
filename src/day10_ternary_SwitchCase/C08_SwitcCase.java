package day10_ternary_SwitchCase;

public class C08_SwitcCase {

	public static void main(String[] args) {
		// Gün numarasýna göre hafta içi hafta sonu yazdýralým
		
		int gunNo=7;

		switch(gunNo) {
		 
		case 1:
		case 2:
		case 3:
     	case 4:
     	case 5:
			System.out.println("Hafta Ýçi");
			break;
		case 6:
		case 7:
			System.out.println("Hafta Sonu");
			break;
			default:
				System.out.println("Lütfen Geçerli bir gün numarasýný yazýnýz");
		
		}
	}

}
