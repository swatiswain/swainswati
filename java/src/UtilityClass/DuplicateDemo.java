package UtilityClass;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=("In non-functional linguistics a sentence is a textual unit consisting of one or more words that are grammatically linked In functional linguistics a sentence is a unit of written texts delimited by graphological features such as upper case letters and markers such as periods question marks and exclamation marks");
		String[] split = str.split(" ");
		Set<String> set = new HashSet<String>();  
		for(String  string : split)
		{
			if(!set.add(string))
				
				System.out.println(string);
		}
		

	}

}
