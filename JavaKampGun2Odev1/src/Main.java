
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C# Kursu", "Yazılım");
		Course course2 = new Course(2, "Java Kursu", "Yazılım");
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);

	}

}
