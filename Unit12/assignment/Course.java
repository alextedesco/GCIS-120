package assignment;

public class Course implements Comparable<Course> {
    String name;
    int start;
    int end;

    public Course (String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getDuration() {
        return end - start;
    }

    public boolean overlaps (Course course) {
        if (this.start == course.start && this.end == course.end) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Course course) {
        return this.start - course.start;
    }

    @Override
    public String toString() {
        return name + "{" + start + "-" + end + "}";
    }
}