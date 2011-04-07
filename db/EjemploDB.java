import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

// import java.sql.*;

public class EjemploDB {	
	public static void main(String[] args) throws SQLException {
		
		Client clientDB = Client.find(1);
		// http://www.chuidiang.com/java/mysql/PreparedStatement-java-mysql.php
		
		clientDB.setClassification("D");
		clientDB.save();
		
		print(clientDB.toString());
		
		// Insertando nuevo registro
		Client clientNew = new Client(null, "Pacifico", "C");
		clientNew.save();
		
		print(clientNew.toString());
		
	}
	
	public static void print(Object data)
	{
		System.out.println(data);
	}
}