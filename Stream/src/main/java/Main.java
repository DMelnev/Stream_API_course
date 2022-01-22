import java.util.ArrayList;
import java.util.List;

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
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }

        for (int i : filter(numbers, (a) -> a % 10 == 0)) {
            System.out.println(i);
        }

    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) result.add(i);
        }
        return result;
    }

}
