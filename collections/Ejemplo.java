import java.io.*;

public class Ejemplo {
	public static void main(String[] args) throws Exception {
		//primitiveCast();
		//classCast();
		//exceptions();

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
	
	public static void classCast() {
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
	
	public static void exceptions() {
		int x = 3;
		int y = 0;
		
		try {
			y = x/0;
		} catch(ArithmeticException e) {
			print(e.toString());
		}
		finally {
			print("Todo bien");
		}
		
		throw new FileNotFoundException("El archivo readme.txt no fue encontrado");
		
		//print(y);
	}
}