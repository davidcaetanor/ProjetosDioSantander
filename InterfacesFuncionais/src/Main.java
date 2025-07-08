import java.util.List;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {

        List<User> users = List.of(new User("David", 23), new User("Leticia", 23),
                new User("Cleber", 65), new User("Roberta", 29));
         /* users.forEach((User user) -> {
            System.out.println(user);
            }); *

                 OU
            users.forEach(System.out::println);*/

        printStringValue(User::toString, users);

    }

    public static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
