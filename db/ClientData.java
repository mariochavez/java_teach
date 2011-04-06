import java.sql.*;

public class ClientData extends Data {
	
	public ClientData(Connection connection) {
		super(connection);
	}
	
	public Client find(int id) throws SQLException {
		Parameter[] parameters = new Parameter[1];
		parameters[0] = new Parameter("int", id, 1);
		
		ResultSet resultSet = loadData("select * from clients where id = ?", parameters);		
		
		Client client = loadEntity(resultSet);
		resultSet.close();
		
		return client;
	}
	
	public Client findByName(String name) throws SQLException {
		Parameter[] parameters = new Parameter[1];
		parameters[0] = new Parameter("String", name, 1);
		
		ResultSet resultSet = loadData("select * from clients where name = ?", parameters);
		
		Client client = loadEntity(resultSet);
		resultSet.close();
		
		return client;
	}
	
	public void save(Client client) {
		
	}
	
	private Client loadEntity(ResultSet data) throws SQLException {
		Client client = null;
		
		if (data != null) {
			data.first();
			
			client = new Client();
			client.setName(data.getString("Name"));
			client.setAddress(data.getString("Address"));
		}
		
		return client;
	}
}