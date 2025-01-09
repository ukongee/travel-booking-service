package travelservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import travelservice.TouristAttractionProviderApplication;

@Entity
@Table(name = "TouristAttraction_table")
@Data
//<<< DDD / Aggregate Root
public class TouristAttraction {

    public static TouristAttractionRepository repository() {
        TouristAttractionRepository touristAttractionRepository = TouristAttractionProviderApplication.applicationContext.getBean(
            TouristAttractionRepository.class
        );
        return touristAttractionRepository;
    }
}
//>>> DDD / Aggregate Root
