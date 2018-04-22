package se.oneagency.codechallenge.elevator.api;

import java.util.ArrayList;
import java.util.List;

class StandardElevatorController implements ElevatorController {
    private final List<StandardElevator> listOfElevators = new ArrayList<>();
    private int nrOfFloors;
    private int nrOfElevators;

    public StandardElevatorController(int nrOfFloors, int nrOfElevators){
        this.nrOfFloors = nrOfFloors;
        this.nrOfElevators = nrOfElevators;

        for (int i = 0; i < nrOfElevators; i++) {
            listOfElevators.add(new StandardElevator(i,0));
        }
    }

    /**
     * Placeholder.
     * returns the first non-busy elevator*/
    @Override
    public StandardElevator requestElevator(int toFloor) {
        List<StandardElevator> possibleElevators = getElevators();
        for (StandardElevator e : possibleElevators) {
            if(!e.isBusy()){
                return e;
            }
        }
        return null;
    }

    @Override
    public List<StandardElevator> getElevators() {
        return this.listOfElevators;
    }

    @Override
    public void releaseElevator(StandardElevator elevator) {
        elevator.moveElevator(elevator.currentFloor());

    }
}