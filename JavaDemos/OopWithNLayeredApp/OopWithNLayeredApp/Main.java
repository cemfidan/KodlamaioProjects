package OopWithNLayeredApp;

import OopWithNLayeredApp.business.ProductManager;
import OopWithNLayeredApp.core.logging.DatabaseLogger;
import OopWithNLayeredApp.core.logging.FileLogger;
import OopWithNLayeredApp.core.logging.Logger;
import OopWithNLayeredApp.core.logging.MailLogger;
import OopWithNLayeredApp.dataAccess.HibernateProductDao;
import OopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product(1, "Iphone Xr", 10000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		// When ProductManager is new, it asks for an argument in the form of
		// ProductDao. You can use structures that implement ProductDao
		// ProductManager productManager = new ProductManager(new JdbcProductDao());
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
