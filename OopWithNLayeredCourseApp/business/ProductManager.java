package OopWithNLayeredCourseApp.business;

import OopWithNLayeredCourseApp.core.Logger;
import OopWithNLayeredCourseApp.dataAccess.ProductDao;
import OopWithNLayeredCourseApp.entities.Category;
import OopWithNLayeredCourseApp.entities.Course;

public class ProductManager {

	private Course courses = new Course();
	private Category categories = new Category();
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Course course, Category category) throws Exception {
		if (course.getName().equals(courses.getName())) {
			throw new Exception("Course cannot be repeated");
		}

		if (category.getName().equals(categories.getName())) {
			throw new Exception("Category cannot be repeated");
		}

		if (course.getPrice() <= 0) {
			throw new Exception("Course price cannot be less than 0");
		}

		productDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
