import java.util.HashMap;

public class CourseService {
	HashMap<String, Student> students = new HashMap<>();
	HashMap<String, Course> courses = new HashMap<>();

	public CourseService() {
		students.put("120120", new Student("Santiago", "120120"));
		students.put("884545", new Student("Kate", "884545"));
		students.put("458787", new Student("Alejandra", "458787"));
		students.put("135464", new Student("Maria", "135464"));
		students.put("778979", new Student("Peter", "778979"));

		courses.put("math_01", new Course("Mathematics 1", "math_01", 8));
		courses.put("biol_01", new Course("Biology 1", "biol_01", 8));
		courses.put("phys_01", new Course("Physics 1", "phys_01", 8));
		courses.put("art_01", new Course("Arts 1", "art_01", 8));
		courses.put("chem_01", new Course("Chemistry 1", "chem_01", 8));
		courses.put("sport_01", new Course("Sports 1", "sport_01", 8));
	} // CourseService

	public void enrollStudent(String studentId, String courseId) {
		Student student = students.get(studentId);
		Course course = courses.get(courseId);

		if (student != null && course != null) {
			student.enroll(course);
			System.out.println("Student " + student.getName() + " has been enrolled in " + course.name);
			System.out.println("---");
		} else {
			System.out.println("Student or course not found");
		} // else
	} // enrollStudent

	public void unEnrollStudent(String studentId, String courseId) {
		// TODO implement so it removes the given course form the student
		Student student = students.get(studentId);
		Course course = courses.get(courseId);

		if (student != null & course != null) {
			student.unEnroll(course);
			System.out.println("Student " + student.getName() + " has been unEnroll from " + course.name);
			System.out.println("---");
		} else {
			System.out.println("Student or course not found");
		} // else

	} // unEnrollStudent

	public void displayCourseInformation(String courseId) {
		// TODO implement so it shows the course name, id and credits
		Course course = courses.get(courseId);

		if (course != null) {
			System.out.println("Course: " + course.name + ", ID: " + course.id + ", Credits: " + course.credits);
			System.out.println("---");
		} else {
			System.out.println("Course not found");
		} // else

	} // displayCourseInformation

	public void displayStudentInformation(String studentId) {
		// TODO implement so it shows the student name, id and list of enrolled courses
		Student student = students.get(studentId);

		if (student != null) {
			System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
			System.out.print("Enrolled courses: ");

			if (student.getEnrolledCourses().isEmpty()) {
				System.out.println(" 0");
			} else {
				for (Course course : student.getEnrolledCourses()) {
					System.out.println(course.name + " (ID: " + course.id + ", Credits: " + course.credits + ")");
				} // for
			}//else
			System.out.println("---");
		} else {
			System.out.println("Student not found");
		} // else

	}// displayStudentInformation

	public int calculateTotalCredits(String studentId) {
		Student student = students.get(studentId);

		if (student != null) {
			int totalCredits = 0;
			for (Course course : student.getEnrolledCourses()) {
				totalCredits += course.credits;
			} // for
			return totalCredits;
		} else {
			System.out.println("Student not found");
			return 0;
		} // else

	}// calculateTotalCredits

}// cierre class CourseService