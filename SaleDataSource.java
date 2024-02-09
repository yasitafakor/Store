package datasource;

import java.util.*;
import java.io.*;

public interface SaleDataSource {

	List<Sale> getSales(int n) throws FileNotFoundException;

	Sale getSale() throws FileNotFoundException;

	void saveSales(List<Sale> sales);

	void saveSale(Sale sale);
}
