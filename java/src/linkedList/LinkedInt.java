package linkedList;

import java.util.LinkedList;

public class LinkedInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer>ll = new LinkedList<Integer>(); 
		ll.add(654);
		ll.add(854);
		ll.add(648);
		ll.add(251);
		ll.add(984);
		
		System.out.println(ll);
		for(int i=0; i<5; i++)
		{
			System.out.println(ll.get(i));
		}

	}

}
