package br.com.fabianoLuiz3103.oo.interfaceFuncional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Maria", 21),
                new User("João", 34),
                new User("Carlos", 67),
                new User("Mumu", 45)
        );
        /*
        users.forEach((User user) -> {
                        System.out.println(user);
                    }
        );
         */

        printStringValues(User::name,users);

    }

    private static void printStringValues(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
