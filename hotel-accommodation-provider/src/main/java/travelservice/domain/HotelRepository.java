package travelservice.domain;

import travelservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="hotels", path="hotels")
public interface HotelRepository extends PagingAndSortingRepository<Hotel, >{
}