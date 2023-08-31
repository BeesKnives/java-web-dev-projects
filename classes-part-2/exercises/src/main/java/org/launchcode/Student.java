package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private double totalQualityScore = 0.0;
    private String gradeLevel;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        int creditNum = this.numberOfCredits;

//        HashMap<Integer, String> levelNums = new HashMap<>();
//        levelNums.put(0, "Freshman");
//        levelNums.put(30, "Sophomore");
//        levelNums.put(60, "Junior");
//        levelNums.put(90, "Senior");
//
//        for(Map.Entry<Integer, String> level : levelNums.entrySet()){
//            if (creditNum > level.getKey()){
//                this.gradeLevel = level.getValue();
//            }
//        }

        if (creditNum < 30){
            this.gradeLevel = "Freshman";
        }else if (creditNum <60){
            this.gradeLevel = "Sophomore";
        }else if (creditNum < 90){
            this.gradeLevel = "Junior";
        }else {
            this.gradeLevel = "Senior";
        }
        return gradeLevel;
        //This method returns the student’s level based on the number of credits they have earned:
        // Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits).
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        //gpa = (total quality score)/(num credits)
        Double qualityScore = courseCredits * grade;
        totalQualityScore += qualityScore;
        numberOfCredits += courseCredits;
        gpa = totalQualityScore / numberOfCredits;

        // Update the appropriate fields: numberOfCredits, gpa
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                ", totalQualityScore=" + totalQualityScore +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(gpa, student.gpa) == 0 && Double.compare(totalQualityScore, student.totalQualityScore) == 0 && Objects.equals(name, student.name) && Objects.equals(gradeLevel, student.gradeLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa, totalQualityScore, gradeLevel);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}