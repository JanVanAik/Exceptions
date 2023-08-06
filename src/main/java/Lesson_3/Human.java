package Lesson_3;


public class Human {
    private String lastName;
    private String firstName;
    private String patronym;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public Human(String lastName, String firstName, String patronym, String dateOfBirth, String phoneNumber, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronym = patronym;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", getLastName(), getFirstName(),
                getPatronym(), getDateOfBirth(),
                getPhoneNumber(), getGender())
                ;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getPatronym() {
        return patronym;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}