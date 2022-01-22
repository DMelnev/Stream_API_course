public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(1)).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        Director director = new Director();
        director.doWork(() -> System.out.println("Im working"));
    }

}
