package travelservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import travelservice.domain.*;
import travelservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RecommendTouristAttractions extends AbstractEvent {

    private String recommendedattractions;

    public RecommendTouristAttractions(TouristAttraction aggregate) {
        super(aggregate);
    }

    public RecommendTouristAttractions() {
        super();
    }
}
//>>> DDD / Domain Event
