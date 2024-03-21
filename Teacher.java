/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Teacher extends Person {
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[30]; // Maksimal 30 mata kuliah
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; // Course already exists
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                // Course found, remove it
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false; // Course not found
    }

    @Override
    public String toString() {
        return "Teacher: " + super.name + " (" + super.Address + ")";
    }
}