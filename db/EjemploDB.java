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
		Client client = clientData.find(2); //findByName("Mario");
		
		// Implementar esto ...
		// http://www.chuidiang.com/java/mysql/PreparedStatement-java-mysql.php
		
		client.setClassification("A");
		clientData.save(client);
		// Hasta aqui ...
		
		print(client.toString());
		
		connection.close();
	}
	
	public static void print(Object data)
	{
		System.out.println(data);
	}
}