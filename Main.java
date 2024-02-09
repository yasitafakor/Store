package datasource;
import java.io.*;
import java.util.*;
import datasource.ProductDataSource;
import datasource.ProductFileDataSource;


public class Main extends Repository{
	
	public static void main(String[] args)
	throws IOException{
	
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("1. Print Products");
	System.out.println("2. Print last Product");
	System.out.println("3. Print Sales");
	System.out.println("4. Print last Sale");
	System.out.println("5. Save a new Product");
	System.out.println("6. Save new Products");
	System.out.println("7. Save a new Sale");
	System.out.println("8. Save new Sales");
	System.out.println("9. Exit");
		
	while(1 > 0) {
		
		int command = scanner.nextInt();
		
		if(command == 1) {
			System.out.println("Please enter number of Products to show : ");
			int n = scanner.nextInt();
			printProducts(n);
			
		}
		else if(command == 2) {
			
			printProduct();
			
		}else if(command == 3) {
			System.out.println("Please enter number of Sales to show : ");
			int n = scanner.nextInt();
			printSales(n);
		}else if(command == 4) {
			printSale();
		}else if(command == 5) {
			saveProduct();
		}else if(command == 6) {
			System.out.println("Please enter number of Products to save : ");
			int n = scanner.nextInt();
			saveProducts(n);
		}else if(command == 7) {
			saveSale();
		}else if(command == 8){
			System.out.println("Please enter number of Sales to save : ");
			int n = scanner.nextInt();
			saveSales(n);
		}else {
			break;
		}
	}
		
		
		
		
		
		
		}
		

	}



