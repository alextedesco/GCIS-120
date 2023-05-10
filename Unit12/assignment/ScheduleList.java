package assignment;

import java.util.ArrayList;

public class ScheduleList {

    public static ArrayList<Course> scheduleListMaker () {
        ArrayList<Course> schedule = new ArrayList<>();
        Course course_a = new Course("Graphic Design", 10, 11);
        schedule.add(course_a);
        Course course_b = new Course("Java", 10, 14);
        schedule.add(course_b);
        Course course_c = new Course("Calculus", 9, 11);
        schedule.add(course_c);
        Course course_d = new Course("Physics", 10, 12);
        schedule.add(course_d);
        Course course_e = new Course("Python", 8, 10);
        schedule.add(course_e);
        Course course_f = new Course("Statistics", 12, 13);
        schedule.add(course_f);
        Course course_g = new Course("Engineering", 13, 15);
        schedule.add(course_g);
        Course course_h = new Course("Wellness", 11, 13);
        schedule.add(course_h);
        Course course_i = new Course("Phycology", 14, 16);
        schedule.add(course_i);
        Course course_j = new Course("Economics", 15, 17);
        schedule.add(course_j);
        Course course_k = new Course("Sociology", 17, 18);
        schedule.add(course_k);
        return schedule;
    }
}
