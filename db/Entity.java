import java.sql.SQLException;

public abstract class Entity {
	private int id;

	public void setId(int value) {
		id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public boolean isNew() {
		return id == 0;
	}
	
	public static <T> T find(int id) throws SQLException {
		throw new SQLException("Not implemented");
	}
	
	public static <T> T findByName(String name) throws SQLException {
		throw new SQLException("Not implemented");
	}
	
	public void Save() throws SQLException {
		throw new SQLException("Not implemented");
	}
	
	@Override
	public String toString() {
		return 	"Id: " + id;
	}
}