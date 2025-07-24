package main;

import exceptions.InvalidAgeException;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {

        UserService obj = new UserService();
        User user = new User("Adrin", 21);
        User user2 = new User("Bershik", 10);

        try {
            obj.registerUser(user);
            obj.registerUser(user2);
        } catch (InvalidAgeException e) {
            System.out.print("Registration failed: " + e.getMessage());
        }
    }
}
