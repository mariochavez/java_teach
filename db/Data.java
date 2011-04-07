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
	
	protected int saveData(String sql, Parameter[] parameters) throws SQLException {
		return saveData(sql, parameters, false);
	}
	
	protected int saveData(String sql, Parameter[] parameters, boolean insert) throws SQLException {
		PreparedStatement statement = null;
		
		try {
			statement = insert ? connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS) : connection.prepareStatement(sql);
			setParameters(statement, parameters);
			
			statement.executeUpdate();
			
			if(insert) {
				ResultSet keys = statement.getGeneratedKeys();
				while(keys.next()) {
					int primaryKey = keys.getInt(1);
					return primaryKey;
				}
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
		
		return 0;
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