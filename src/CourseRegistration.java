/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_system;

public class CourseRegistration {
    public static void RegisterStudentCourse(Student student,Course course) {
        student.registercourse(course);
} 
    public static void AssignInstructorCourse(Instructor instructor,Course course) {
        instructor.assignCourse(course);
    }
}