package OopWithNLayeredCourseApp;

import OopWithNLayeredCourseApp.business.ProductManager;
import OopWithNLayeredCourseApp.core.DatabaseLogger;
import OopWithNLayeredCourseApp.core.Logger;
import OopWithNLayeredCourseApp.core.MailLogger;
import OopWithNLayeredCourseApp.dataAccess.JdbcProductDao;
import OopWithNLayeredCourseApp.entities.Category;
import OopWithNLayeredCourseApp.entities.Course;
import OopWithNLayeredCourseApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
		Category category1 = new Category(1, "Programming");
		Course course1 = new Course(1, "Java", 750, instructor1, category1);
		
		Logger[] loggers = {new DatabaseLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(course1, category1);
		

	}

}
