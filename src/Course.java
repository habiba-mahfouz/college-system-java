/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_system;

public class Course {

    private String courseName;
    private int courseID;

    public Course() {
    }

    public Course(String courseName, int courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseinfo() {
        return (courseName + " (" + courseID + ")");
    }
}