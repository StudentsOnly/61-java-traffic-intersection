## Exercise: Traffic Intersection

#### Objective:

The objective of this exercise is to practice creating and managing multiple threads in a traffic intersection simulation.

#### Instructions:

1.	Create a Java class named TrafficIntersectionSimulation with a main method.
2.	Create a class named TrafficLane that extends the Thread class. Each TrafficLane should have the following responsibilities:
    -	Represent a lane at a traffic intersection.
    -	Simulate vehicles arriving at the intersection from that lane.
    -	Print a message when a vehicle from that lane enters the intersection.
    -	Sleep for a random short time (e.g., 500 milliseconds) to simulate vehicles arriving at different times.
3.	In the main method of the TrafficIntersectionSimulation class, create at least three instances of the TrafficLane class, representing different lanes at the intersection (e.g., North-South, East-West, and Diagonal lanes).
4.	Start each TrafficLane to simulate vehicles arriving from their respective lanes at the intersection.
5.	Use proper thread naming to distinguish between the lanes (e.g., "North-South Lane," "East-West Lane," "Diagonal Lane").
6.	Implement a simple mechanism to ensure that vehicles from different lanes do not enter the intersection simultaneously (you can use Thread.sleep).
