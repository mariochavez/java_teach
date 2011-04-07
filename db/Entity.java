public abstract class Entity {
	private int id;

	public void setId(int value) {
		id = value;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return 	"Id: " + id;
	}
}