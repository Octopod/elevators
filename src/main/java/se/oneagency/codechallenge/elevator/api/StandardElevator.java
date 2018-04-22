package se.oneagency.codechallenge.elevator.api;

public class StandardElevator implements Elevator {
    @Override
    public DirectionEnum getDirection() {
        return null;
    }

    @Override
    public int getAddressedFloor() {
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void moveElevator(int toFloor) {

    }

    @Override
    public boolean isBusy() {
        return false;
    }

    @Override
    public int currentFloor() {
        return 0;
    }
}
