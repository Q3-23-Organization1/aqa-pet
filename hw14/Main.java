package hw14;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    private List<User> userList;
    UserService service = new UserService();

    public List<User> createListUser() {
        userList = Arrays.asList(
                new User("John", "Snack", 17),
                new User("Anna", "Due", 17),
                new User("Sam", "Bubble", 30),
                new User("John", "Alala", 27),
                new User("Paula", "Black", 18));

        return userList;
    }

    private static Stream<List<User>> createListUserForParameterizedTest() {
        return Stream.of(
                Arrays.asList(
                        new User("John", "Vnack", 17),
                        new User("Anna", "Due", 17),
                        new User("Sam", "Bubble", 30),
                        new User("John", "Blala", 27),
                        new User("Paula", "Black", 18)
                )
        );
    }

    private static Stream<List<User>> createListUserForParameterizedTest2() {
        return Stream.of(
                Arrays.asList(
                        new User("John", "Snack", 17),
                        new User("Anna", "Due", 17),
                        new User("Sam", "Bubble", 30),
                        new User("John", "Alala", 27),
                        new User("Paula", "Black", 18)
                )
        );
    }

    @BeforeAll
    public static void getUp() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Tests finished");
    }

    @BeforeEach
    public void setUp() {
        userList = createListUser();
    }

    @AfterEach
    public void printDelimiter() {
        System.out.println("-----");
    }

    @RepeatedTest(10)
    public void checkCalcAverageAge() {
        double averageAge = service.calcAverageAge(userList);
        Assertions.assertEquals(21.8, averageAge);
    }

    @ParameterizedTest()
    @MethodSource("createListUserForParameterizedTest")
    public void checkGetBySecondNameEmpty(List<User> list) {
        List<User> listUser = service.getBySecondName(list);
        Assertions.assertEquals(Collections.EMPTY_LIST, listUser, "Not empty list");
    }

    @ParameterizedTest()
    @MethodSource("createListUserForParameterizedTest2")
    public void checkGetBySecondNameNonEmpty(List<User> list) {
        List<User> expectList = Arrays.asList(
                new User("John", "Snack", 17),
                new User("John", "Alala", 27));

        List<User> listUser = service.getBySecondName(list);
        Assertions.assertArrayEquals(expectList.toArray(), listUser.toArray(), "Lists not equals");
    }

    @ParameterizedTest()
    @MethodSource("createListUserForParameterizedTest2")
    public void checkSortedByAge(List<User> list) {
        List<User> expectList = Arrays.asList(
                new User("John", "Snack", 17),
                new User("Anna", "Due", 17),
                new User("Paula", "Black", 18),
                new User("John", "Alala", 27),
                new User("Sam", "Bubble", 30));

        List<User> sortedList = service.sortByAge(list);
        Assertions.assertArrayEquals(expectList.toArray(), sortedList.toArray(), "Lists not equals");
    }

    @Test
    public void checkSortedByAgeAndFirstName() {
        List<User> expectList = Arrays.asList(
                new User("Anna", "Due", 17),
                new User("John", "Snack", 17),
                new User("Paula", "Black", 18),
                new User("John", "Alala", 27),
                new User("Sam", "Bubble", 30));

        List<User> sortedList = service.sortByAgeAndFirstName(userList);
        Assertions.assertArrayEquals(expectList.toArray(), sortedList.toArray(),
                "Lists not equals");
    }


    @Test
    public void isCheckAge() {
        List<User> expectList = Arrays.asList(
                new User("Sam", "Bubble", 30),
                new User("John", "Alala", 27),
                new User("Paula", "Black", 18));

        List<User> sortedList = service.checkAge(userList);
        Assertions.assertArrayEquals(expectList.toArray(), sortedList.toArray(),
                "Lists not equals");
    }
}