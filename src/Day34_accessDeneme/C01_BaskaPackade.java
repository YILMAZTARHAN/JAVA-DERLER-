package Day34_accessDeneme;

import Day34_AccessModifier_Encapsulation.C01;

public class C01_BaskaPackade {

	public static void main(String[] args) {
		C01 obj=new C01();
		// System.out.println(obj.sayiPrivate);
		// System.out.println(obj.sayiDefault); // sadece ayni pacgace dakiler ulasabilir
		// System.out.println(obj.sayiProtected); // ayni package'daki class'lar ve child class'lar ulasabilir
		System.out.println(obj.sayiPublic);

	}

}