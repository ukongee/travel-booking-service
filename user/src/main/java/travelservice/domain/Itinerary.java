package travelservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import travelservice.UserApplication;

@Entity
@Table(name = "Itinerary_table")
@Data
//<<< DDD / Aggregate Root
public class Itinerary {

    public static ItineraryRepository repository() {
        ItineraryRepository itineraryRepository = UserApplication.applicationContext.getBean(
            ItineraryRepository.class
        );
        return itineraryRepository;
    }
}
//>>> DDD / Aggregate Root
