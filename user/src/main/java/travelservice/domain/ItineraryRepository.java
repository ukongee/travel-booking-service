package travelservice.domain;

import travelservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="itineraries", path="itineraries")
public interface ItineraryRepository extends PagingAndSortingRepository<Itinerary, >{
}