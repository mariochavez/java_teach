import java.sql.*;
import java.util.*;

public abstract class Data {
	protected Connection connection = null;
	
	public Data(Connection connection) {
		this.connection = connection;
	}
	
	protected ResultSet loadData(String sql, Parameter[] parameters) throws SQLException {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = connection.prepareStatement(sql);
			setParameters(statement, parameters);
			
			resultSet = statement.executeQuery();
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
		
		return resultSet;
	}
	
	protected void saveData(String sql, Parameter[] parameters) throws SQLException {
		PreparedStatement statement = null;
		
		try {
			statement = connection.prepareStatement(sql);
			setParameters(statement, parameters);
			
			statement.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}
	
	private void setParameters(PreparedStatement statement, Parameter[] parameters) throws SQLException {
		for(int i = 0; i < parameters.length; i++) {
			Parameter parameter = parameters[i];
			
			if(parameter.dataType == "String") {
				statement.setString(parameter.order, (String)parameter.value);
			} else if(parameter.dataType == "int") {
				statement.setInt(parameter.order, Integer.parseInt(parameter.value.toString()));
			}
		}
	}
}