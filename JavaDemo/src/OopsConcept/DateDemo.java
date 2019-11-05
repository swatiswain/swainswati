package OopsConcept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mmm/yyyy");
		String todaysDate = sdf.format(date);
				System.out.println(todaysDate);
	
	}

}
