package se.oneagency.codechallenge.elevator.api;

import static se.oneagency.codechallenge.elevator.api.StandardElevator.DirectionEnum.*;

public class StandardElevator implements Elevator{
    private int elevatorId;
    private int currentFloor;
    private int addressedFloor;

    enum DirectionEnum {
        UP, DOWN, NONE
    }

    public StandardElevator(int elevatorId, int currentFloor){
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
    }

    // Direction of elevator
    @Override
    public DirectionEnum getDirection() {
        if (currentFloor>addressedFloor){
            return DOWN;
        }
        if(currentFloor<addressedFloor){
            return UP;
        }
        return NONE;
    }

    @Override
    public int getAddressedFloor() { return this.addressedFloor; }

    @Override
    public int getElevatorId() {
        return this.elevatorId;
    }

    @Override
    public void moveElevator(int toFloor) {
        this.addressedFloor = toFloor;
        if(this.getDirection() == DOWN){
            this.currentFloor--;
        }
        if(this.getDirection() == UP){
            this.currentFloor++;
        }
    }

    @Override
    public boolean isBusy() {
        return this.currentFloor != this.addressedFloor;
    }

    @Override
    public int currentFloor() {
        return this.currentFloor;
    }
}
