package datasource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleInputDataSource implements SaleDataSource {

	static File f = new File("src/datasource/test2.txt");
	
	public  List<Sale> getSales(int n){

		
		Scanner scanner = new Scanner(System.in);
		
		List<Sale> p = new ArrayList<Sale>();
		
		for(int i = 0; i < n; i++) {
			
			String temp = scanner.nextLine();
			Scanner input = new Scanner(temp);
			Sale obj = new Sale();
			
			obj.idSale = input.nextInt();
			obj.numSale = input.nextInt();
			obj.date = input.next();
			
			p.add(obj);
		}
		
		return p;
		
		
	}
	
	public Sale getSale() {

		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		Scanner input = new Scanner(s);
		
		Sale obj = new Sale();
		
		obj.idSale = input.nextInt();
		obj.numSale = input.nextInt();
		obj.date = input.next();
		
		return obj;
	}
	
	public void saveSales(List<Sale> sales){




		
		List<String> s = new ArrayList<String>();
		
		for(int i = 0; i < sales.size(); i++) {
			
			Sale obj = new Sale();
			
			obj.idSale = sales.get(i).idSale;
			obj.numSale = sales.get(i).numSale;
			obj.date = sales.get(i).date;
			
			String temp = "";
			
			temp += obj.idSale + " " + obj.numSale+ " " + obj.date;
			
			s.add(temp);
			
		}
		
		for(int i = 0; i < s.size(); i++) {
			
			System.out.println(s.get(i));
		}
		
	}

	public void saveSale(Sale sale){

		
		Sale obj = new Sale();
		
		obj.idSale = sale.idSale;
		obj.numSale = sale.numSale;
		obj.date = sale.date;

		
		Scanner scanner = new Scanner(System.in);
		
		String s = "";
		
		s += obj.idSale + " " + obj.numSale + " " + obj.date;
		
		System.out.println(s);

		
	}
}
