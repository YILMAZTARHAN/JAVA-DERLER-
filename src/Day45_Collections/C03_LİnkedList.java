package Day45_Collections;

import java.util.LinkedList;
import java.util.List;

public class C03_LÝnkedList {

	public static void main(String[] args) {
     LinkedList<Integer>ll=new LinkedList<>();
     System.out.println(ll);
     
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll);//[5, 7]
		
		System.out.println(ll.peek());// Silmeden ilk elemaný bana getirir
		System.out.println(ll.peekFirst());//silmeden ilk elemaný bana getirir
		
		 LinkedList<Integer>ll2=new LinkedList<>();
		 
		 
		 System.out.println(ll2.peekFirst());
		 System.out.println(ll2.peek());
		 
		 System.out.println(ll.element());//5
		// System.out.println(ll2.element());//java.util.NoSuchElementException
		 
		 System.out.println(ll.poll());//5
		 System.out.println(ll);//[7]
		 
		 System.out.println(ll.poll());//7
		 System.out.println(ll);//[]
		 
		 System.out.println(ll.poll());//null
		 
		 System.out.println(ll.hashCode());//1 javanýn verdiði hash code'u döner
		 
		 ll2.add(7);
		 System.out.println(ll2.hashCode());//38
		 
		 System.out.println(ll2.offer(10));
		 System.out.println(ll2);
		 
		 ll2.push(2);
		 System.out.println(ll2);//[2, 7, 10]
		 
		 
		 
		
	}

}
