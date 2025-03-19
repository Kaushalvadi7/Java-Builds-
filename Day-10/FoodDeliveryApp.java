//without Optional class we have to check manually for null value

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        User user1 = new User("Ajay", "ajay@example.com");
        User user2 = new User("karan", null);  

        System.out.println(getUserEmail(user1));  
        System.out.println(getUserEmail(user2));  
    }

    public static String getUserEmail(User user) {
        if (user != null && user.getEmail() != null) {
            return user.getEmail();
        } else {
            return "No Email Provided";
        }
    }
}
