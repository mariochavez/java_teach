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
	
	@Override
	public String toString() {
		return 	"Id: " + id;
	}
}