package datasource;

import java.util.*;
import java.io.*;

public class Repository {

    private static ProductDataSource productInputDataSource = new ProductInputDataSource();
    private static ProductDataSource productFileDataSource = new ProductFileDataSource();
    private static SaleDataSource saleInputDataSource = new SaleInputDataSource();
    private static SaleDataSource saleFileDataSource = new SaleFileDataSource();

    public Repository() {
        //TODO
    }

    public static void saveProduct() throws IOException{
        productFileDataSource.saveProduct(productInputDataSource.getProduct());
    }

    public static void saveProducts(int n) throws IOException{
        productFileDataSource.saveProducts(productInputDataSource.getProducts(n));
    	
    }

    public static void saveSale() throws IOException{
        saleFileDataSource.saveSale(saleInputDataSource.getSale());
    }

    public static void saveSales(int n) throws IOException{
        saleFileDataSource.saveSales(saleInputDataSource.getSales(n));
    }

    public static void printProduct() throws IOException{
       
    	try {
    		productInputDataSource.saveProduct(productFileDataSource.getProduct());
    	}catch(IOException e){
    		System.out.println("No Product!");
    	}
    }

    public static void printProducts(int n) throws IOException{
        
    	try {
    		productInputDataSource.saveProducts(productFileDataSource.getProducts(n));
    	}catch(IOException e) {
    		System.out.println("error !");
    	}
    }

    public static void printSale() throws IOException{
        
    	try {
    		saleInputDataSource.saveSale(saleFileDataSource.getSale());
    	}catch(IOException e){
    		System.out.println("No sale!");
    	}
    }

    public static void printSales(int n) throws IOException {
        
    	try {
    		saleInputDataSource.saveSales(saleFileDataSource.getSales(n));
    	}catch(IOException e){
    		System.out.println("error !");
    	}
    }
}
