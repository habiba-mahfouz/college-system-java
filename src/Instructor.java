/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_system;

import java.util.ArrayList;

public class Instructor extends Person {

    private double netSalary;
    private ArrayList<Course> teachingCourses;

    public Instructor() {
        teachingCourses = new ArrayList<>();
    }

    public Instructor(String name, long id, double grossSalary, double taxRate) {
        super(name, id);
        this.netSalary = calculateNetSalary(grossSalary, taxRate);
        this.teachingCourses = new ArrayList<>();
    }

    private double calculateNetSalary(double grossSalary, double taxRate) {
        return grossSalary - (grossSalary * taxRate);
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double grossSalary, double taxRate) {
        this.netSalary = calculateNetSalary(grossSalary, taxRate);
    }

    public void assignCourse(Course course) {
        teachingCourses.add(course);
    }

    public ArrayList<Course> getCourses() {
        return teachingCourses;
    }

    @Override
    public String toString() {
        return super.toString() + " | Net Salary: " + this.netSalary;
    }

    @Override
    public void display() {
        System.out.println("--- Instructor Information ---");
        System.out.println(this.toString());
        System.out.print("Teaching Courses: ");
        if (teachingCourses.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println();
            for (Course c : teachingCourses) {
                System.out.println("  * " + c.getCourseinfo());
            }
        }
    }
}