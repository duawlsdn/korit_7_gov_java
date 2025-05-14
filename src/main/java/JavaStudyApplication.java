import entity.User;
import service.UserService;

import java.util.List;

public class JavaStudyApplication {
    public static void main(String[] args) {
        UserService userService = UserService.getInstance();

        userService.register(
                "testuser",
                "1234",
                "김준일",
                "skjil1218@kakao.com",
                "010-9988-1916",
                "부산 동래구 중앙대로",
                32,
                List.of("ROLE_USER", "ROLE_ADMIN"));

        userService.register(
                "testuser",
                "1234",
                "김준일",
                "skjil1218@kakao.com",
                "010-9988-1916",
                "부산 동래구 중앙대로",
                32,
                List.of("ROLE_USER", "ROLE_ADMIN"));

        userService.printAll();
        userService.printByUsername("testuser");
        userService.printByUsername("testuser2");

    }

}
