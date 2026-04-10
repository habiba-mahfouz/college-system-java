/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_system;

import java.util.ArrayList;

public class Student extends Person {
    private int level;
    private double GPA;
    private ArrayList<Course> registeredCourses;

    public Student() {
        registeredCourses = new ArrayList<>();
    }

    public Student(String name, long id, int level, double GPA) {
        super(name, id);
        this.level = level;
        this.GPA = GPA;
        this.registeredCourses = new ArrayList<>();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        if (GPA >= 0 && GPA <= 4.0) {
            this.GPA = GPA;
        } else {
            System.out.println("Invalid GPA. Must be between 0 and 4.0");
        }
    }

    public void registercourse(Course course) {
        registeredCourses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return registeredCourses;
    }

    @Override
    public void display() {
        System.out.println("--- Student Information ---");
        System.out.println(super.toString());
        System.out.println("Level: " + level + " | GPA: " + GPA);
        System.out.print("Courses Registered: ");
        if (registeredCourses.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println();
            for (Course c : registeredCourses) {
                System.out.println("  - " + c.getCourseinfo());
            }
        }
    }

}