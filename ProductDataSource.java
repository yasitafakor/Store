package datasource;

import java.io.FileNotFoundException;
import java.util.*;

public interface ProductDataSource {

	List<Product> getProducts(int n) throws FileNotFoundException;

	Product getProduct() throws FileNotFoundException;

	void saveProducts(List<Product> products);

	void saveProduct(Product product) throws FileNotFoundException;
}
