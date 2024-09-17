public class TrafficIntersectionSimulation {

    public static void main(String[] args) {
        TrafficLane northLine = new TrafficLane("North-South Lane");
        TrafficLane southLine = new TrafficLane("East-West Lane");
        TrafficLane diagonalLane = new TrafficLane("Diagonal Lane");

        try {
            northLine.start();
            northLine.join();

            southLine.start();
            southLine.join();

            diagonalLane.start();
            diagonalLane.join();
        } catch (InterruptedException e) {
            System.out.println("Simulation was interrupted.");
        }

        System.out.println("Traffic simulation complete.");
    }
}
