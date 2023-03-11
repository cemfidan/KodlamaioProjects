package OopWithNLayeredApp.dataAccess;

import OopWithNLayeredApp.entities.Product;

//Dao = Data Access Object
public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Added to database with JDBC");
	}

}
