package travelservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import travelservice.AirlineApplication;
import travelservice.domain.CheckAvailability;

@Entity
@Table(name = "Flight_table")
@Data
//<<< DDD / Aggregate Root
public class Flight {

    @PostPersist
    public void onPostPersist() {
        CheckAvailability checkAvailability = new CheckAvailability(this);
        checkAvailability.publishAfterCommit();
    }

    public static FlightRepository repository() {
        FlightRepository flightRepository = AirlineApplication.applicationContext.getBean(
            FlightRepository.class
        );
        return flightRepository;
    }
}
//>>> DDD / Aggregate Root
