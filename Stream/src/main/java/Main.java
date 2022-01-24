import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.Option;
import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        new Thread(() -> System.out.println(1)).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();
//
//        Director director = new Director();
//        String result = director.doWork((n) -> {
//            for (int i = 0; i < n; i++) System.out.println("I'm working");
//            return "Success";
//        }, 10);
////        System.out.println(result);
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            numbers.add((int) ((Math.random() * 100) + 100));
//        }
////        List<Integer> filtered = filter(numbers, (a) -> a % 10 == 0);
////        List<String> mapped = map(filtered);
//
//
////        List<Integer> filtered = numbers.stream().filter((n) -> n % 10 == 0).map(new Function<Integer, String>() {
////            @Override
////            public String apply(Integer integer) {
////                return "Number: " + integer;
////            }
////        })
////        List<String> list = numbers.stream()
////                .filter((n) -> n % 2 == 0)
////                .map(((n) -> "Number: " + n))
////                .filter((string) -> string.endsWith("0"))
////                .map((string) -> string + " !").collect(Collectors.toList());
//
//        List<String> list = numbers.stream()
//                .filter((integer -> (integer % 2 == 0)&&(integer % 5 == 0) ))
//                .map(Math::sqrt)
//                .map((d)-> "Корень: "+d)
//                .collect(Collectors.toList());
//
//        for (String i : list) {
//            System.out.println(i);
//        }

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));
        users.add(new User("Pavel", 19));
        users.add(new User("Sancho", 32));
        users.add(new User("Poncho", 43));

//        boolean result = users.stream()
//                .noneMatch((user -> user.getAge() <= 18));

//        users.stream()
//                .sorted(Comparator.comparing(User::getName))
//                .filter((usr) -> usr.getAge() < 40)
//                .limit(3)
//                .map(User::getName)
//                .forEach(System.out::println);


        Optional<User> oldest = users.stream()
                .filter(n -> n.getAge() < 8)
//                .max(Comparator.comparing(User::getName))
                .max((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
        oldest.ifPresent(System.out::println);
        oldest.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
//        if (oldest.isPresent())
//        System.out.println(oldest.get().getName());

    }

//    private static List<String> map(List<Integer> numbers) {
//        List<String> result = new ArrayList<>();
//        for (int number : numbers) {
//            result.add("Number: " + number);
//        }
//        return result;
//    }
//
//    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
//        List<Integer> result = new ArrayList<>();
//        for (int i : list) {
//            if (predicate.test(i)) result.add(i);
//        }
//        return result;
//    }

}
