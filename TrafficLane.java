import java.util.Random;

class TrafficLane extends Thread {
    private final String laneName;
    private final Object intersectionLock;

    public TrafficLane(String laneName, Object intersectionLock) {
        this.laneName = laneName;
        this.intersectionLock = intersectionLock;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(random.nextInt(500));

                // Ensure only one vehicle is in the intersection at a time
                synchronized (intersectionLock) {
                    System.out.printf("Vehicle %d from %s enters the intersection.\n", i, laneName.toUpperCase());

                    // Simulate the time it takes for the vehicle to cross the intersection
                    Thread.sleep(1000);

                    System.out.printf("Vehicle %d from %s exits the intersection.\n", i, laneName.toUpperCase());

                    // Notify other waiting threads that the intersection is available
                    intersectionLock.notify();
                }

            } catch (InterruptedException e) {
                System.err.println(laneName.toUpperCase() + " was interrupted.");
            }
        }

        System.out.println("All vehicles from " + laneName.toUpperCase() + " have passed.");
    }
}