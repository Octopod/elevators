package se.oneagency.codechallenge.elevator.api;

import static se.oneagency.codechallenge.elevator.api.StandardElevator.DirectionEnum.DOWN;
import static se.oneagency.codechallenge.elevator.api.StandardElevator.DirectionEnum.NONE;
import static se.oneagency.codechallenge.elevator.api.StandardElevator.DirectionEnum.UP;

public class StandardElevator implements Elevator {
    private int id;
    private int currentFloor;
    private int addressedFloor;

    enum DirectionEnum {
        UP, DOWN, NONE
    }

    public StandardElevator(int id, int currentFloor){
        this.id = id;
        this.currentFloor = currentFloor;
    }

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
    public int getId() {
        return this.id;
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
