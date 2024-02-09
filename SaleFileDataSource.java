package datasource;

import java.util.*;
import java.io.*;

public class SaleFileDataSource implements SaleDataSource {

	static File f = new File("src/datasource/test2.txt");
	
	public  List<Sale> getSales(int n)


	throws FileNotFoundException{
		
		List<Sale> s1 = new ArrayList<Sale>();
		
		Scanner input = new Scanner(f);
		
		String S = "";
		
		
		while(input.hasNextLine()) {
			
			Sale obj = new Sale();
			
			S = input.nextLine();
			
			Scanner scanner = new Scanner(S);
			
			obj.idSale = scanner.nextInt();
			obj.numSale = scanner.nextInt();
			obj.date = scanner.next();
			
			
			s1.add(obj);
		}
		
		List<Sale> s2 = new ArrayList<Sale>(n);
		
		if(n > s1.size()) {
			n = s1.size();
		}
		
		for(int i = s1.size() - n; i < s1.size(); i++) {
			
			s2.add(s1.get(i));
		}
		
		
		
		return s2;
	}
	
	public  Sale getSale() 



	throws FileNotFoundException{
		
		Scanner input = new Scanner(f);
		
		Sale obj = new Sale();
		
		String S = "";
		
		while(input.hasNextLine()) {
			
			S = input.nextLine();
			
			Scanner scanner = new Scanner(S);
			
			obj.idSale = scanner.nextInt();
			obj.numSale = scanner.nextInt();
			obj.date = scanner.next();
		}
		
		
		
		return obj;
	}
	
	public  void saveSales(List<Sale> sales){


		
		for(int i = 0; i < sales.size(); i++) {
			
			String temp = "";
			temp += sales.get(i).idSale + " " + sales.get(i).numSale + " " + sales.get(i).date;
			
			try {
				
				FileWriter out = new FileWriter(new File("src/datasource/test2.txt"),true);
					
					out.append(temp +"\n");

					
					out.close();
					
				}catch(IOException e){
				
					e.printStackTrace();	
				}
			
		}
		
	}

	public  void saveSale(Sale sale) {


		Sale obj = new Sale();
		
		obj.idSale = sale.idSale;
		obj.numSale = sale.numSale;
		obj.date = sale.date;
		
		String s = "";
		
		try {
			
		FileWriter out = new FileWriter(new File("src/datasource/test2.txt"),true);
			
			s += obj.idSale +" "+ obj.numSale + " "+obj.date;
			
			out.append(s+"\n");

			
			out.close();
			
		}catch(IOException e){
		
			e.printStackTrace();	
		}
	}
}
