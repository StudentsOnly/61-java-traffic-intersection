public class TrafficIntersectionSimulation {

  public static void main(String[] args) {

    TrafficLane lane1 = new TrafficLane("North-South Lane", 5);
    TrafficLane lane2 = new TrafficLane("East-West Lane", 4);
    TrafficLane lane3 = new TrafficLane("Diagonal Lane", 3);

    lane1.start();
    try {
      lane1.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
//    try {
//      Thread.sleep(1000);
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }

    lane2.start();
    try {
      lane2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
//    try {
//      Thread.sleep(1000);
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }

    lane3.start();
    try {
      lane3.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("Night falls on the intersection and there are no vehicles left ...");
  }
}
