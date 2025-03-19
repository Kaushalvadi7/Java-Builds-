import java.util.Optional;

class User {
    private String name;
    private Optional<String> email;  // Email is now Optional

    public User(String name, String email) {
        this.name = name;
        this.email = Optional.ofNullable(email);  // Wrap email in Optional
    }

    public Optional<String> getEmail() {
        return email;
    }
}

public class FoodDeliveryAppWithOptionalclass {
    public static void main(String[] args) {
        User user1 = new User("Ajay", "ajay@example.com");
        User user2 = new User("Karan", null);  // No email provided

        System.out.println(getUserEmail(user1));  // Output: alice@example.com
        System.out.println(getUserEmail(user2));  // Output: No Email Provided
    }

    public static String getUserEmail(User user) {
        return user.getEmail().orElse("No Email Provided");
    }
}
