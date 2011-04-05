import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

// import java.sql.*;

public class EjemploDB {
	private static Connection connection = null;
	
	public static void main(String[] args) throws SQLException {
		loadDriver();
		
		connection = openConnection();
		readData();
		
		connection.close();
	}
	
	public static void readData() throws SQLException {
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
	
	public static Connection openConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/CursoSperantus?user=sperantus&password=sperantus");
		} catch(SQLException ex) {
			System.out.println(ex.toString());
		}
		
		return connection;
	}
	
	public static void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex)
		{
			print(ex);
			// No hacemos nada
		}
	}
	
	public static void print(Object data)
	{
		System.out.println(data);
	}
}