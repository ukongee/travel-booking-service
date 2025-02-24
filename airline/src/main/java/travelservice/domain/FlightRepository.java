package travelservice.domain;

import travelservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="flights", path="flights")
public interface FlightRepository extends PagingAndSortingRepository<Flight, >{
}