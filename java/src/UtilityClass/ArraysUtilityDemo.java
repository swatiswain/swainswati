package UtilityClass;

import java.util.Arrays;

public class ArraysUtilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]={10,4,58,95,78,25,64};
		System.out.println("Before Sort");
		for(int i : numbers)
		{
			System.out.println(i);
			
		}
		Arrays.sort(numbers);
		System.out.println("after sort");
		for(int i : numbers)
		{
			System.out.println(i);
			
		}

	}

}
