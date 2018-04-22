package se.oneagency.codechallenge.elevator.resources;

import se.oneagency.codechallenge.elevator.api.Elevator;

/**
 * Request made from outside an elevator
 **/
public class OutsideRequest {
    private Elevator.DirectionEnum direction;   //!!dependant on Elevator - future outsourcing!!
    private int floorNumber;

    public OutsideRequest(int floorNumber, Elevator.DirectionEnum direction) {
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    public long getFloorNumber() {
        return floorNumber;
    }

    public Elevator.DirectionEnum getDirection() {
        return this.direction;
    }
}

