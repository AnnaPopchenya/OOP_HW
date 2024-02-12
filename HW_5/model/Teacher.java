package model;

public class Teacher {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;

    public Teacher(int id, String lastName, String firstName, String middleName) {
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