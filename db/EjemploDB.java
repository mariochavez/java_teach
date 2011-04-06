import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

// import java.sql.*;

public class EjemploDB {	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionManager.getConnection();
		readData(connection);
		
		connection.close();
	}
	
	public static void readData(Connection connection) throws SQLException {
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from clients where name = 'Alberto'");	
		} catch (SQLException ex) {
			print(ex.toString());
		} finally {
			if (resultSet != null) {
				resultSet.first();
				print(resultSet.getString("Name"));
			}
			
			resultSet.close();
			statement.close();
		}
	}
	
	public static void print(Object data)
	{
		System.out.println(data);
	}
}