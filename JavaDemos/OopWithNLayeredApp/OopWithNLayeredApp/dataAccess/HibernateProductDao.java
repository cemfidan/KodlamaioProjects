package OopWithNLayeredApp.dataAccess;

import OopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Added to database with Hibernate");
	}

}
