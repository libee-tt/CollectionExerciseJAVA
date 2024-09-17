import java.util.ArrayList;
import java.util.List;

public class Student{
    String name;
    String id;

    List<Course> enrolledCourses = new ArrayList<>(  );

    public Student( String name, String id ){
        this.name = name;
        this.id = id;
    } //Student

    public String getName(){
        return name;
    } //getName

    public void setName( String name )  {
        this.name = name;
    } //setName

    public String getId()   {
        return id;
    }//getId

    public void setId( String id )    {
        this.id = id;
    } //setId

    public void enroll(Course course){
        enrolledCourses.add( course );
    } //enroll

    public void unEnroll(Course course){
        enrolledCourses.remove( course );
    } //unEnroll

    public int totalEnrolledCourses(){
        return enrolledCourses.size();
    } //totalEnrolledCourses

    public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    } //getEnrolledCourses

    @Override
    public String toString()    {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", enrolledCourses=" + enrolledCourses
            + '}';
    } //toString
} //class Student