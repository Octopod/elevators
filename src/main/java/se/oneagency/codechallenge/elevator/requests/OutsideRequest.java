package se.oneagency.codechallenge.elevator.requests;

import se.oneagency.codechallenge.elevator.api.Elevator;

/**
 * Request made from outside an elevator
 * Future addition: what direction does the caller want to go? UP or DOWN
 **/
public class OutsideRequest {
    private int floorNumber;

    public OutsideRequest(int floorNumber, Elevator.DirectionEnum direction) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

}

