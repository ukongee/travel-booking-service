package travelservice.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import travelservice.domain.*;

@Component
public class TransportationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Transportation>> {

    @Override
    public EntityModel<Transportation> process(
        EntityModel<Transportation> model
    ) {
        return model;
    }
}
