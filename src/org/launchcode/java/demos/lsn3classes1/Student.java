package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(int studentID) {
        this.studentId = studentId;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    private int getNumberOfCredits() {
        return numberOfCredits;
    };
    private double getGpa() {
        return gpa;
    }

}