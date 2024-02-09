package datasource;

import java.util.*;
import java.io.*;

public class ProductInputDataSource implements ProductDataSource{

	public void saveProduct(Product product){
		
		Product obj = new Product();
		
		obj.idPro = product.idPro;
		obj.name = product.name;
		obj.price = product.price;
		obj.productNum = product.productNum;
		
		Scanner scanner = new Scanner(System.in);
		
		String s = "";
		
		s += obj.idPro + " " + obj.name + " " + obj.price + " " + obj.productNum;
		
		System.out.println(s);

		
	}

	public void saveProducts(List<Product> products) {


		List<String> s = new ArrayList<String>();
		
		for(int i = 0; i < products.size(); i++) {
			
			Product obj = new Product();
			
			obj.idPro = products.get(i).idPro;
			obj.name = products.get(i).name;
			obj.price = products.get(i).price;
			obj.productNum = products.get(i).productNum;
			
			String temp = "";
			
			temp += obj.idPro + " " + obj.name + " " + obj.price + " " + obj.productNum;
			
			s.add(temp);
			
		}
		
		for(int i = 0; i < s.size(); i++) {
			
			System.out.println(s.get(i));
		}
		
	}

	public List<Product> getProducts(int n){


			
		Scanner scanner = new Scanner(System.in);
		
		List<Product> p = new ArrayList<Product>();
		
		for(int i = 0; i < n; i++) {
			
			String temp = scanner.nextLine();
			Scanner input = new Scanner(temp);
			Product obj = new Product();
			
			obj.idPro = input.nextInt();
			obj.name = input.next();
			obj.price = input.nextInt();
			obj.productNum = input.nextInt();
			
			p.add(obj);
		}
		
		return p;
		
	}

	public  Product getProduct(){

		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		Scanner input = new Scanner(s);
		
		Product obj = new Product();
		
		obj.idPro = input.nextInt();
		obj.name = input.next();
		obj.price = input.nextInt();
		obj.productNum = input.nextInt();
		
		return obj;
	}
}
