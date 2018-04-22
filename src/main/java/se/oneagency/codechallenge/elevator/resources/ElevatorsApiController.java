package se.oneagency.codechallenge.elevator.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import se.oneagency.codechallenge.elevator.api.ElevatorsApi;

/**
 * Rest Resource.
 *
 */
@RestController
public final class ElevatorsApiController implements ElevatorsApi{
    Logger log = LoggerFactory.getLogger(ElevatorsApiController.class);


    @Override
    public ResponseEntity<Void> elevators() {
        log.debug("# ElevatorAPI PING #");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }



}
