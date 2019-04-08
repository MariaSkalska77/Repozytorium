package pl.sda.encapsulation.task.task.user;

public class UserModel {
    private String firstName;
    private String lastName;
    private String lastName3;

    private int age;

    public String getLastName() {
        return lastName + lastName3;
    }

    public int getAge() {
        return age;
    }

    public UserModel(String firstName, String lastName, String lastName3, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastName3 = lastName3;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;


    }
}
