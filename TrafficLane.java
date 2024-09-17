import java.util.Random;

class TrafficLane extends Thread {
    private String laneName;

    public TrafficLane(String laneName) {
        this.laneName = laneName;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(random.nextInt(500));

                System.out.printf("Vehicle %d from %s enters the intersection.\n", i, laneName);

            } catch (InterruptedException e) {
                System.err.println(laneName + " was interrupted.");
            }
        }

        System.out.println("All vehicles from " + laneName + " have passed.");
    }
}