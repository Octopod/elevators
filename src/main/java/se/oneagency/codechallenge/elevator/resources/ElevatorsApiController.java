package se.oneagency.codechallenge.elevator.resources;

import com.google.common.eventbus.EventBus;
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
    EventBus requests;

    // Write api methods here
    // They should put all new requests into the eventbus

    @Override
    public ResponseEntity<Void> elevators() {
        log.debug("# ElevatorAPI PING #");
        return new ResponseEntity<>(HttpStatus.OK);
    }

}