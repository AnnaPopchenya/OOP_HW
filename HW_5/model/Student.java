package model;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;

    public Student(int id, String lastName, String firstName, String middleName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }
}