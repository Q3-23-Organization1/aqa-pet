package hw14;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class UserService {

    //Підрахувати середній вік юзерів
    public double calcAverageAge(List<User> userList) {
        OptionalDouble averageAge = userList.stream().mapToDouble(User::getAge).average();
        System.out.println("Average age of users " + averageAge.getAsDouble());

        return averageAge.getAsDouble();
    }

    //Сортувати по декількам властивостям: firstName і age
    public List<User> sortByAgeAndFirstName(List<User> userList) {
        System.out.println("Sorted by age and firstName :");
        List<User> otherList = userList.stream()
                .sorted(Comparator.comparing(User::getFirstName))
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();

        otherList.forEach(System.out::println);

        return otherList;
    }

    //Перевірити чи є юзери у яких прізвище починається з літери "S' або "А"
    public List<User> getBySecondName(List<User> userList) {
        System.out.println("Check users secondName :");
        List<User> otherList = userList.stream().filter(users ->
                users.getSecondName().startsWith("S") ||
                        users.getSecondName().startsWith("A")).toList();

        otherList.forEach(System.out::println);

        return userList.isEmpty() ? List.of() : otherList;
    }


    //Перевірити чи всі юзери старше 18 років
    public List<User> checkAge(List<User> userList) {
        System.out.println("Check users older then 18 :");
        List<User> otherList = userList.stream().filter(users ->
                users.getAge() >= 18).toList();

        otherList.forEach(System.out::println);

        return otherList;
    }

    //відсортувати за віком та записати в нову колекцію
    public List<User> sortByAge(List<User> userList) {
        System.out.println("Sorted by age:");
        List<User> otherList = userList.stream().sorted(Comparator.comparingInt(User::getAge))
                .toList();

        otherList.forEach(System.out::println);
        return otherList;
    }

}
