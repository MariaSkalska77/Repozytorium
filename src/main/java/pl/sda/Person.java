package pl.sda;

public class Person {

    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public String toString() {
        StringBuilder nowy = new StringBuilder(name);
        nowy.append(surname).append(age);
        return nowy.toString();
    }
}
