public class Client extends Company {
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
	
	@Override
	public String toString() {
		return "Client\n" + 
			super.toString() +
			"\nClassification: " + classification;
	}
}