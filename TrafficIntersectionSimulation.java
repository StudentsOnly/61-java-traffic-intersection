public class TrafficIntersectionSimulation {
    public static void main(String[] args) {

        Thread northSouth = new Thread(new TrafficLane("North-South Lane"));
        Thread eastWest = new Thread(new TrafficLane("East-West Lane"));
        Thread diagonal = new Thread(new TrafficLane("Diagonal lane"));

        northSouth.start();
        try {
            northSouth.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        eastWest.start();
        try {
            eastWest.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        diagonal.start();
        try {
            diagonal.join();
        } catch (InterruptedException e) {
            System.out.println();
        }
    }
}
