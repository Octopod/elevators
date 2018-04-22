package se.oneagency.codechallenge.elevator.requests;

/**
 * Request made from inside an elevator
 **/
public class InsideRequest {
    private int elevatorId;
    private int requestedFloor;

    public InsideRequest(int elevatorId, int requestedFloor) {
        this.elevatorId = elevatorId;
        this.requestedFloor = requestedFloor;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public int getRequestedFloor() {
        return requestedFloor;
    }
}

