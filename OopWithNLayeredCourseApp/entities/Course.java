package OopWithNLayeredCourseApp.entities;

public class Course {

	private int id;
	private String name;
	private double price;
	private Instructor instructor;
	private Category category;

	public Course() {

	}

	public Course(int id, String name, double price, Instructor instructor, Category category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.instructor = instructor;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
