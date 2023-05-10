package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ScheduleMaker {

    public static ArrayList<Course> makeSchedule (ArrayList<Course> courses) {
        // 1. Arrange the courses in the list in order by their time. Earlier
        // classes are at the beginning of the list. Later classes are at the end

        // 2. If a courses start time is equal to another courses start time
        // then it cannot also be added to the schedule

        // 3. Add early classes first and then go through the list looking
        // for classes that start at the class end time. If there is multiple classes with the same start time
        // then pick the class with the shortest duration  [Repeat]

        // 4. return schedule

        /**
         * Most Classes Schedule:
         * Python{8-10}
         * Graphic Design{10-11}
         * Wellness{11-13}
         * Engineering{13-15}
         * Economics{15-17}
         */
        
        ArrayList<Course> schedule = new ArrayList<>();
        Collections.sort(courses); // Sorts by Start Time
        int count = 0;
        int size = courses.size();
        while (count < size - 1) {
            Course a = courses.get(count);
            Course b = courses.get (count + 1);
            
            if (a.getStart() < b.getStart()) {
                if (count == 0) {
                    schedule.add(a);
                    courses.remove(count + 1);
                    size--;
                } else {
                    if (schedule.get(count - 1).getStart() == a.getStart() ||
                    schedule.get(count - 1).getEnd() > a.getStart()) {
                        schedule.add(b);
                        courses.remove(count);
                        size--;
                    } else {
                        schedule.add(a);
                        courses.remove(count + 1);
                        size--;
                }
            }
        
        } else if (a.getStart() > b.getStart()) {
                if (count == 0) {
                    schedule.add(a);
                    courses.remove(count + 1);
                    size--;
                } else {
                    if (schedule.get(count - 1).getStart() == b.getStart() || 
                    schedule.get(count - 1).getEnd() > b.getStart()) {
                        schedule.add(a);
                        courses.remove(count + 1);
                        size--;
                    } else {
                        schedule.add(b);
                        courses.remove(count);
                        size--;
                }
            }

        } else if (a.getStart() == b.getStart()) {
            if (a.getDuration() > b.getDuration()) {
                schedule.add(b);
                courses.remove(count);
                size--;
            } else if (a.getDuration() < b.getDuration()) {
                schedule.add(a);
                courses.remove(count + 1);
                size--;
            }
                }
            count++;
            }
        return schedule;
    }

    public static void main(String[] args) {
        ArrayList<Course> courses = ScheduleList.scheduleListMaker();
        System.out.println(makeSchedule(courses));
    }   
}
