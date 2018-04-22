package se.oneagency.codechallenge.elevator.resources;

/**
 * Request made from inside an elevator
 **/
public class InsideRequest {
    private int id;
    private int requestedFloor;

    public InsideRequest(int id, int requestedFloor) {
        this.id = id;
        this.requestedFloor = requestedFloor;
    }

    public long getId() {
        return id;
    }

    public int getRequestedFloor() {
        return requestedFloor;
    }
}

