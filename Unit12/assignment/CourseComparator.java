package assignment;
import java.util.Comparator;

public class CourseComparator implements Comparator<Course> {

    @Override
    public int compare(Course course_a, Course course_b) {
        String a = course_a.getName();
        String b = course_b.getName();
        return a.compareTo(b);
    }      
}
