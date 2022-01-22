public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(1)).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        Director director = new Director();
        String result = director.doWork((n) -> {
            for (int i = 0; i < n; i++) System.out.println("I'm working");
            return "Success";
        }, 10);
        System.out.println(result);
    }

}
