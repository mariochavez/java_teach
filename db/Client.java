public class Client extends Company {
	private String classification;
	
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