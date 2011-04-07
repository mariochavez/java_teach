import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

// import java.sql.*;

public class EjemploDB {	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionManager.getConnection();
		
		ClientData clientData = new ClientData(connection);
		Client clientDB = clientData.find(1);
		// http://www.chuidiang.com/java/mysql/PreparedStatement-java-mysql.php
		
		clientDB.setClassification("B");
		clientData.save(clientDB);
		
		print(clientDB.toString());
		
		// Insertando nuevo registro
		Client clientNew = new Client("Ricardo", "Pacifico", "C");
		clientData.save(clientNew);
		
		print(clientNew.toString());
		
		connection.close();
	}
	
	public static void print(Object data)
	{
		System.out.println(data);
	}
}