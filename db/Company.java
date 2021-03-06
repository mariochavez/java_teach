public class Company extends Entity {
	protected String name;
	protected String address;
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public void setAddress(String value) {
		address = value;
	}
	
	@Override
	public String toString() {
		return 	super.toString() + "\n" +
			"Name: " + name + "\n" +
			"Address: " + address;
	}
}