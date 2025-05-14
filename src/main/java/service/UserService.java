package service;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> userList;

    private static UserService instance;

    private UserService() {
        userList = new ArrayList<>();
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public void register(
            String username,
            String password,
            String name,
            String email,
            String phone,
            String address,
            int age,
            List<String> roles) {
        userList.stream()
                .filter(user -> user.getUsername().equals(username))
                .findAny()
                .ifPresentOrElse(user ->
                    System.out.println("이미 존재하는 User정보입니다. 찾은 정보 -> " + user),
                        () -> userList.add(new User(username, password, name, email, phone, address, age, roles)));

    }

    public void printAll() {
        userList.forEach(System.out::println);
    }

    public void printByUsername(String username) {
        userList.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .ifPresentOrElse(user -> System.out.println("찾은 사용자: " + user), () -> System.out.println("해당 username은 존재하지 않습니다."));
    }

}
