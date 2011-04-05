import java.io.*;
import java.util.*;

public class Ejemplo {
	public static void main(String[] args) {
		//primitiveCast();
		//classCast();
		//exceptions();
		//arrayExample();

		Hashtable<String, Client> clients = new Hashtable<String, Client>();
		Client client = new Client();
		client.setName("Empresa1");
		
		clients.put(client.getName(), client);
		
		client = new Client();
		client.setName("Empresa2");
		
		clients.put(client.getName(), client);
		
	print(clients.get("Empresa1").toString());
	
		for(Client c : clients.values()) {
			print(c.toString());
		}
		
		for(String k : clients.keySet()) {
			print(k);
		}
		
		print(clients.containsKey("Empresa3"));
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
	
	public static void exceptions() throws Exception {
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
	
	public static void arrayExample() {
		//Client[] clients = new Client[2];
		ArrayList<Client> clients = new ArrayList<Client>();
		
		Client client = new Client();
		client.setName("Empresa1");
		
		//clients[0] = client;
		clients.add(client);
		
		client = new Client();
		client.setName("Empresa2");
		
		//clients[1] = client;
		clients.add(client);
		
		//clients.add(5);
		
		/*for(int i = 0; i < clients.length; i++) {
			print(clients[i].toString());
			print("**************");
		}*/
		
		for(Client c : clients) {
			//Client c = (Client)i.next();
			print(c.getName());
			print("**************");
		}
		
		print(clients.size());
		print(clients.get(1).toString());
		print(clients.contains(new Client()));
	}
}