import java.util.ArrayList;

public class StudentManagement {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents() {

        if(students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        for(Student s : students) {
            System.out.println("----------------------");
            System.out.println(s);
        }
    }

    public void searchStudent(int id) {

        for(Student s : students) {
            if(s.getId() == id) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public void updateStudent(int id, String name, int age, String course) {

        for(Student s : students) {

            if(s.getId() == id) {

                s.setName(name);
                s.setAge(age);
                s.setCourse(course);

                System.out.println("Student Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public void deleteStudent(int id) {

        for(Student s : students) {

            if(s.getId() == id) {
                students.remove(s);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }
}