package datasource;

import java.util.*;
import java.io.*;

public class ProductFileDataSource implements ProductDataSource{
	
	 File f = new File("src/datasource/test3.txt");
	
	
	public void saveProduct(Product product)


	throws FileNotFoundException{
	
		Product obj = new Product();
		
		obj.idPro = product.idPro;
		obj.name = product.name;
		obj.price = product.price;
		obj.productNum = product.productNum;
		
		String s = "";
		
		try {
			
		FileWriter out = new FileWriter(new File("src/datasource/test3.txt"),true);
			
			s += obj.idPro +" "+ obj.name + " "+obj.price +" "+ obj.productNum;
			
			out.append(s+"\n");

			
			out.close();
			
		}catch(IOException e){
		
			e.printStackTrace();	
		}
	}
	
	public Product getProduct() throws FileNotFoundException{


		
		Scanner input = new Scanner(f);
		
		Product obj = new Product();
		
		String S = "";
		
		while(input.hasNextLine()) {
			S = input.nextLine();
			
			Scanner scanner = new Scanner(S);
			
			obj.idPro = scanner.nextInt();
			obj.name = scanner.next();
			obj.price = scanner.nextInt();
			obj.productNum = scanner.nextInt();
			
		}
		
		
		
		return obj;
	}
	
	public List<Product> getProducts(int n)
	throws FileNotFoundException{
		
		List<Product> s1 = new ArrayList<Product>();
		
		File f = new File("src/datasource/test3.txt");
		
		Scanner input = new Scanner(f);
		
		String S = "";
		
		
		while(input.hasNextLine()) {
			
			Product obj = new Product();
			
			S = input.nextLine();
			
			Scanner scanner = new Scanner(S);
			
			obj.idPro = scanner.nextInt();
			obj.name = scanner.next();
			obj.price = scanner.nextInt();
			obj.productNum = scanner.nextInt();
			
			s1.add(obj);
		}
		
		List<Product> s2 = new ArrayList<Product>(n);
		
		if(n > s1.size()) {
			n = s1.size();
		}
		
		for(int i = s1.size() - n; i < s1.size(); i++) {
			
			s2.add(s1.get(i));
		}
		
		
		
		return s2;
	}
	
	public void saveProducts(List<Product> products) {

		
		for(int i = 0; i < products.size(); i++) {
			
			String temp = "";
			temp += products.get(i).idPro + " " + products.get(i).name + " " + products.get(i).price + " " + products.get(i).productNum;
			
			try {
				
				FileWriter out = new FileWriter(new File("src/datasource/test3.txt"),true);
					
					out.append(temp +"\n");

					
					out.close();
					
				}catch(IOException e){
				
					e.printStackTrace();	
				}
			
		}
		
		
		
	}

}
