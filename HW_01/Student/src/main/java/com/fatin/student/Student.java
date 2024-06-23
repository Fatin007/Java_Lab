package com.fatin.student;
/**
 *
 * @author MOHAMMAD FATIN NUR
 */
class Student {
    String name;
    int roll;
    int age;
    String grade;

    Student(String name, int roll, int age, String grade) {
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.grade = grade;
    }

    String getName() {
        return name;
    }

    int getRoll() {
        return roll;
    }

    int getAge() {
        return age;
    }

    String getGrade() {
        return grade;
    }

    void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + "; Roll Number: " + roll + "; Age: " + age + "; Grade: " + grade + ".";
    }
}