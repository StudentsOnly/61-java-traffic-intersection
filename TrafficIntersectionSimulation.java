public class TrafficIntersectionSimulation {

    public static void main(String[] args) {
        Object intersectionLock = new Object();

        TrafficLane northLine = new TrafficLane("North-South Lane", intersectionLock);
        TrafficLane southLine = new TrafficLane("East-West Lane", intersectionLock);
        TrafficLane diagonalLane = new TrafficLane("Diagonal Lane", intersectionLock);

        northLine.start();
        southLine.start();
        diagonalLane.start();

        try {
            northLine.join();
            southLine.join();
            diagonalLane.join();

        } catch (InterruptedException e) {
            System.out.println("Simulation was interrupted.");
        }

        System.out.println("Traffic simulation complete.");
    }
}
