package travelservice.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import travelservice.domain.*;

@Component
public class TouristAttractionHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TouristAttraction>> {

    @Override
    public EntityModel<TouristAttraction> process(
        EntityModel<TouristAttraction> model
    ) {
        return model;
    }
}
