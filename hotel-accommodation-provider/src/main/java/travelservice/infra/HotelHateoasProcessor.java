package travelservice.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import travelservice.domain.*;

@Component
public class HotelHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Hotel>> {

    @Override
    public EntityModel<Hotel> process(EntityModel<Hotel> model) {
        return model;
    }
}
