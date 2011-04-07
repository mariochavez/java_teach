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
	
	public void save(Client client) throws SQLException {
		Parameter[] parameters = new Parameter[client.isNew() ? 3 : 4];
		parameters[0] = new Parameter("String", client.getName(), 1);
		parameters[1] = new Parameter("String", client.getAddress(), 2);
		parameters[2] = new Parameter("String", client.getClassification(), 3);
		
		if(!client.isNew()) {
			parameters[3] = new Parameter("int", client.getId(), 4);
		
			saveData("update clients set name = ?, address = ?, classification = ? where id = ?", parameters);
		} else {
			int id = saveData("insert into clients (name, address, classification) values(?, ?, ?)", parameters, true);
			client.setId(id);
		}
	}
	
	private Client loadEntity(ResultSet data) throws SQLException {
		Client client = null;
		
		if (data != null) {
			data.first();
			
			client = new Client();
			client.setId(data.getInt("Id"));
			client.setName(data.getString("Name"));
			client.setAddress(data.getString("Address"));
			client.setClassification(data.getString("Classification"));
		}
		
		return client;
	}
}