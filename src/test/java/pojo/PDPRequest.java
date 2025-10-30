package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PDPRequest {
    @JsonProperty("skus")
    final List<String> skus;

    @JsonProperty("storeId")
    final Integer storeId;

    @JsonProperty("cityId")
    final Integer cityId;
}
