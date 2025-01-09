package travelservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import travelservice.HotelAccommodationProviderApplication;
import travelservice.domain.CheckAvailability;

@Entity
@Table(name = "Hotel_table")
@Data
//<<< DDD / Aggregate Root
public class Hotel {

    @PostPersist
    public void onPostPersist() {
        CheckAvailability checkAvailability = new CheckAvailability(this);
        checkAvailability.publishAfterCommit();
    }

    public static HotelRepository repository() {
        HotelRepository hotelRepository = HotelAccommodationProviderApplication.applicationContext.getBean(
            HotelRepository.class
        );
        return hotelRepository;
    }
}
//>>> DDD / Aggregate Root
