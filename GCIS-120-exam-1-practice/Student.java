import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Student {
    private static int ID_TRACKER = 10000;

    private String name;
    private String username;
    private int id;

    public Student (String name, String username, int id) {
        this.name = name;
        this.username = username;
        this.id = ID_TRACKER;
        ID_TRACKER += 1;
    }

    public static void trackId() {
        ID_TRACKER += 1;
    }

    public String getName() {
        return this.name;
    }

    public String getUsername() {
        return this.username;
    }

    public int getId() {
        return this.id;
    }
    
    @Override
    public boolean equals(Object other) {
       if (other instanceof Student) {
           Student otherStudent = (Student) other;
            return this.username.equals(otherStudent.username);
       } else {
           return false;
       }
    }

    @Override
    public String toString() {
        return this.name + "(" + this.username + ")";
    }

    public static void recursivePrint (Student [] students, int index) {
        if (index == students.length) {
            return;
        } else {
            System.out.println(students[index]);
            recursivePrint(students, index + 1);
        }
    }

    public static void main(String[] args) {         
        File file = new File("Students.txt");
        FileReader fr;
        try {
            fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            int size = Integer.parseInt(reader.readLine());
            Student [] students = new Student [size];
            int index = 0;
            String nextLine = reader.readLine();
            while (nextLine != null) {
                String [] lineBreakdown = nextLine.split(":");
                students[index] = new Student (lineBreakdown[1], lineBreakdown[0], 0);
                index++;
                nextLine = reader.readLine();
            }
            reader.close();
            
            Student student_1 = new Student ("Bob", "bb123", 0);
            Student student_2 = new Student ("Billy", "bb123", 0);
            System.out.println(student_1);
            System.out.println(student_2);
            System.out.println("True? " + student_1.equals(student_2));
            System.out.println("False? " + student_1.equals("bb123"));
            System.out.println(Arrays.toString(students));
            recursivePrint(students, 0);
        } catch (IOException e) {
            System.out.println(":(");
            // Alternate way - System.err.println (":(");
        }
        
        // My Attempt:
        //     String line = reader.readLine();
        //     while (line != null) {
        //         String lines [] = line.split(":");
        //         String name = lines[0];
        //         String username = lines[1];
        //         Student student_a = new Student(name, username, 0);
        //         students [length] = student_a;
        //         length += 1;
        //     }
        // System.out.println(students);
    }
}
