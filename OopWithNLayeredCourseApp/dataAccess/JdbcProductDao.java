package OopWithNLayeredCourseApp.dataAccess;

import OopWithNLayeredCourseApp.entities.Course;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added with Jdbc");
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course deleted with Jdbc");
	}

}
