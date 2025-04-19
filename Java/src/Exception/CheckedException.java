package Exception;
import java.sql.*;
class DbConnection{
	Connection cn=null;
	public Connection getCon()
	{
		try {
			Class.forName("oracle.jdbc.driver.oracleDriver");
			cn=DriverManager.getConnection("oracle.jdbc");
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
			
		}
		return cn;
	}
}

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
