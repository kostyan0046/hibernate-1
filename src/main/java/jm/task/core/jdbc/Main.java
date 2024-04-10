package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Paul", "McСartney", (byte) 26);
        userService.saveUser("John", "Lennon", (byte) 28);
        userService.saveUser("Ringo", "Starr", (byte) 28);
        userService.saveUser("George", "Harrison", (byte) 25);

        List<User> list = userService.getAllUsers();
        for (User user : list) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
