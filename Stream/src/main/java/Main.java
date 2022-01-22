import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
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
//        System.out.println(result);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add((int) ((Math.random() * 100) + 100));
        }
//        List<Integer> filtered = filter(numbers, (a) -> a % 10 == 0);
//        List<String> mapped = map(filtered);


//        List<Integer> filtered = numbers.stream().filter((n) -> n % 10 == 0).map(new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return "Number: " + integer;
//            }
//        })
//        List<String> list = numbers.stream()
//                .filter((n) -> n % 2 == 0)
//                .map(((n) -> "Number: " + n))
//                .filter((string) -> string.endsWith("0"))
//                .map((string) -> string + " !").collect(Collectors.toList());

        List<String> list = numbers.stream()
                .filter((integer -> (integer % 2 == 0)&&(integer % 5 == 0) ))
                .map(Math::sqrt)
                .map((d)-> "Корень: "+d)
                .collect(Collectors.toList());

        for (String i : list) {
            System.out.println(i);
        }

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
