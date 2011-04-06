import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static Connection connection = null;
	
	public static Connection getConnection() {
		return getConnection(null);
	}
	
	public static Connection getConnection(String connectionString) {
		if(connection == null) {
			loadDriver();
			connection = openConnection(connectionString);
		}
			
		return connection;
	}
	
	private static void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex)
		{
			System.out.println(ex);
			// No hacemos nada
		}
	}
	
	private static Connection openConnection(String connectionString) {
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(connectionString == null ? "jdbc:mysql://localhost/CursoSperantus?user=sperantus&password=sperantus" : connectionString);
		} catch(SQLException ex) {
			System.out.println(ex.toString());
		}
		
		return connection;
	}
}