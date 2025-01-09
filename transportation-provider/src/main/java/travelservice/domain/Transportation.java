package travelservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import travelservice.TransportationProviderApplication;
import travelservice.domain.CheckAvailability;

@Entity
@Table(name = "Transportation_table")
@Data
//<<< DDD / Aggregate Root
public class Transportation {

    @PostPersist
    public void onPostPersist() {
        CheckAvailability checkAvailability = new CheckAvailability(this);
        checkAvailability.publishAfterCommit();
    }

    public static TransportationRepository repository() {
        TransportationRepository transportationRepository = TransportationProviderApplication.applicationContext.getBean(
            TransportationRepository.class
        );
        return transportationRepository;
    }
}
//>>> DDD / Aggregate Root
