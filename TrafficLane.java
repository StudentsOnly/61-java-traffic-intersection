import java.util.Random;

public class TrafficLane extends Thread {

  private final String lane;
  private final int vehiclesNo;
  private final Random random = new Random();

  public TrafficLane(String lane, int vehiclesNo) {
    this.lane = lane;
    this.vehiclesNo = vehiclesNo;
  }

  @Override
  public void run() {
    System.out.println(lane + " is starting...");
    for (int i = 1; i < vehiclesNo; i++) {
      System.out.println(lane + ": Vehicle " + i + " enters the intersection");
    }
    try {
      Thread.sleep(500 + random.nextInt(0, 400));
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted: " + e);
    }
    System.out.println(lane + " is ending...");
  }
}
