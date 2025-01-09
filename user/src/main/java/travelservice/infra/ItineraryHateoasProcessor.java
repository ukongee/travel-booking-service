package travelservice.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import travelservice.domain.*;

@Component
public class ItineraryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Itinerary>> {

    @Override
    public EntityModel<Itinerary> process(EntityModel<Itinerary> model) {
        return model;
    }
}
