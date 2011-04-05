public class Ejemplo {
	public static void main(String[] args) {
		//primitiveCast();
		
		Client client = new Client();
		client.setName("Sperantus");
		client.setAddress("Tijuana");
		client.setClassification("A");
		
		print(client.toString());
		
		Company company = (Company)client;
		print(company.toString());
		
		Company company1 = new Client();
		company1.setName("Sperantus1");
		company1.setAddress("Tijuana1");
		((Client)company1).setClassification("B");
		print(company1.toString());
	}
	
	public static void print(Object data) {
		System.out.println(data);
	}
	
	public static void primitiveCast() {
		double x = 2.3;
		int y = 4;
		
		y = (int)x;
		
		String z = "4";
		z = Double.toString(y);
		
		x = Double.parseDouble(z);
		
		print(z);
	}
}