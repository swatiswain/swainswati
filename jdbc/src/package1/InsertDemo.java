package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement stmt = connection.createStatement();
			int count= stmt.executeUpdate("insert into product values(104,'dell_ispiron',65000)");
			System.out.println(count+"rows effected");
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
			
		}

	}

}
