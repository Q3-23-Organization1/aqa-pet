package hw11.User;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Створити список з 10 обєктів типу User
        List<User> userList = Arrays.asList(
                new User("John", "Snack", 17),
                new User("Anna", "Due", 17),
                new User("Sam", "Bubble", 30),
                new User("John", "Alala", 27),
                new User("Paula", "Black", 18));

        //відсортувати за віком та записати в нову колекцію
        System.out.println("Sorted by age:");
        List<User> otherList = userList.stream().sorted(Comparator.comparingInt(User::getAge))
                .toList();

        otherList.forEach(System.out::println);
        System.out.println("-----");

        //Підрахувати середній вік юзерів
        OptionalDouble averageAge = userList.stream().mapToDouble(User::getAge).average();
        System.out.println("Average age of users " + averageAge.getAsDouble());
        System.out.println("-----");

        //Сортувати по декількам властивостям: firstName і age
        System.out.println("Sorted by age and firstName :");
        userList.stream()
                .sorted(Comparator.comparing(User::getFirstName))
                .sorted(Comparator.comparingInt(User::getAge))
                .toList().forEach(System.out::println);

        System.out.println("-----");

        //Перевірити чи є юзери у яких прізвище починається з літери "S' або "А"
        System.out.println("Check users secondName :");
        userList.stream().filter(users ->
                users.getSecondName().startsWith("S") ||
                        users.getSecondName().startsWith("A")).toList().forEach(System.out::println);

        System.out.println("-----");

        //Перевірити чи всі юзери старше 18 років
        System.out.println("Check users older then 18 :");
        userList.stream().filter(users ->
                users.getAge() >= 18).toList().forEach(System.out::println);
    }
}
