package travelservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import travelservice.domain.*;
import travelservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProvideItinerary extends AbstractEvent {

    private String itinerary;

    public ProvideItinerary(Itinerary aggregate) {
        super(aggregate);
    }

    public ProvideItinerary() {
        super();
    }
}
//>>> DDD / Domain Event
