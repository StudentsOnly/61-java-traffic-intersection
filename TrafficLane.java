import java.util.Random;

public class TrafficLane extends Thread {
    private final Random r = new Random();
    private final String name;

    public TrafficLane(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(500 + r.nextInt(100, 500));
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            System.out.println("Vehicle #" + i + " from " + this.name + " enters intersection");
            try {
                sleep(500 + r.nextInt(500)); // Time for 1 vehicle to exit intersection
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            System.out.println("Vehicle #" + i + " from " + this.name + " exiting intersection");
        }
    }

}
