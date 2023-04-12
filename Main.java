public class Main {
    public static void main(String[] args) {
        int threadCount = 6;
        //double[] stop_duration = {4.0, 8.0, 1.0, 9.0, 7.0, 5.0, 3.0, 2.0, 6.0};
        double[] stop_duration = {4.0, 1.0, 6.0, 5.0, 3.0, 2.0};
        Breaker breaker = new Breaker(stop_duration);
        new ThreadController(threadCount, breaker);
        new Thread(breaker).start();
    }
}

