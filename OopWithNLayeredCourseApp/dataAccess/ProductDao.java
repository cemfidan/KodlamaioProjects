package OopWithNLayeredCourseApp.dataAccess;

import OopWithNLayeredCourseApp.entities.Course;

public interface ProductDao {
	
	void add(Course course);
	
	void delete(Course course);

}
