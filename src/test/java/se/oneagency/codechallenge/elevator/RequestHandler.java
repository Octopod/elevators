package se.oneagency.codechallenge.elevator;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import se.oneagency.codechallenge.elevator.api.StandardElevator;
import se.oneagency.codechallenge.elevator.api.StandardElevatorController;
import se.oneagency.codechallenge.elevator.requests.InsideRequest;
import se.oneagency.codechallenge.elevator.requests.OutsideRequest;

import java.util.concurrent.ThreadPoolExecutor;

public class RequestHandler {
    private StandardElevatorController controller;
    private final ThreadPoolExecutor threads;


    @Autowired
    public RequestHandler(StandardElevatorController controller, ThreadPoolExecutor threads) {
        this.controller = controller;
        this.threads = threads;
    }

    @Subscribe
    @AllowConcurrentEvents
    public void newOutsideRequest(OutsideRequest request) {
        StandardElevator elevator = controller.requestElevator(request.getFloorNumber());
        elevator.moveElevator(request.getFloorNumber());
        //threads.execute(elevator);
    }

    @Subscribe
    @AllowConcurrentEvents
    public void newInsideRequest(InsideRequest request) {
        StandardElevator elevator = controller.requestElevator(request.getRequestedFloor());
        elevator.moveElevator(request.getRequestedFloor());
        //threads.execute(elevator);
    }

}




