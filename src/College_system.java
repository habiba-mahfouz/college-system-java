package college_system;

import java.util.ArrayList;

public class College_system {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addInstructor(Instructor t) {
        instructors.add(t);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Student findStudentById(long id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public Instructor findInstructorById(long id) {
        for (Instructor i : instructors) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public Course findCourseById(int id) {
        for (Course c : courses) {
            if (c.getCourseID() == id) {
                return c;
            }
        }
        return null;
    }

    public void displayCollegeInfo() {
        System.out.println("\n========================================");
        System.out.println("   College: Faculty of Science");
        System.out.println("   Established: 1942");
        System.out.println("========================================");
        System.out.println("Main Departments:");
        System.out.println("- Physics\n- Chemistry\n- Natural Sciences\n- SIM");
        System.out.println("========================================");
    }
}
