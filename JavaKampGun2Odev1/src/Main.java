
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C# Kursu", "Yaz�l�m");
		Course course2 = new Course(2, "Java Kursu", "Yaz�l�m");
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);

	}

}
