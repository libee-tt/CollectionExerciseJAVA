public class Main
{
    public static void main( String[] args ){
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);

        int totalCredits = courseService.calculateTotalCredits(studentId);
        System.out.println("Total credits for student "+studentId+" : "+totalCredits);
        System.out.println("---");
        
        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        
        
    }//main
}//class main