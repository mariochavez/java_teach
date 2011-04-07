import java.sql.SQLException;

public class Client extends Company implements Validate{
	private String classification;
	
	public Client() {}
	
	public Client(String name, String address, String classification) {
		this.name = name;
		this.address = address;
		this.classification = classification;
	}
	
	public void setClassification(String value) {
		classification = value;
	}
	
	public String getClassification() {
		return classification;
	}

	public boolean isValid() {
		if(name == null || address == null)
			return false;
		return true;
	}

	public static <Client> Client find(int id) throws SQLException {
		ClientData clientData = new ClientData(ConnectionManager.getConnection());
		
		return (Client)clientData.find(id);
	}
	
	public static <Client> Client findByName(String name) throws SQLException {
		ClientData clientData = new ClientData(ConnectionManager.getConnection());
		
		return (Client)clientData.findByName(name);
	}
	
	public void save() throws SQLException {
		if(!isValid())
			throw new SQLException("Client is not valid");
		
		ClientData clientData = new ClientData(ConnectionManager.getConnection());
		
		clientData.save(this);
	}
	
	@Override
	public String toString() {
		return "Client\n" + 
			super.toString() +
			"\nClassification: " + classification;
	}
}