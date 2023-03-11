package OopWithNLayeredCourseApp.dataAccess;

import OopWithNLayeredCourseApp.entities.Course;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added with Hibernate");
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course deleted with Hibernate");
	}

}
