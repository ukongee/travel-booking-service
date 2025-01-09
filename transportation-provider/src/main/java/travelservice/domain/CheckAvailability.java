package travelservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import travelservice.domain.*;
import travelservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CheckAvailability extends AbstractEvent {

    private Boolean availability;

    public CheckAvailability(Transportation aggregate) {
        super(aggregate);
    }

    public CheckAvailability() {
        super();
    }
}
//>>> DDD / Domain Event
