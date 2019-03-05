package encapsulation.task.task.user;

public class UserManager {
    private UserModel user;

    public void createUser(String firstName, String lastName, String lastName3, int age) {
        user = new UserModel(firstName,lastName, lastName3, age);
    }
    public UserModel getUser() {
        return user;
    }
}
