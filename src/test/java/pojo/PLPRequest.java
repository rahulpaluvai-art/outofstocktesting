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
public class PLPRequest
{
    @JsonProperty("query")
    String query;

    @JsonProperty("filters")
    Filters filters;

    @JsonProperty("numericFilters")
    List<Object> numericFilters;

    @JsonProperty("pageOffset")
    Integer pageOffset;

    @JsonProperty("pageSize")
    Integer pageSize;

    @JsonProperty("storeId")
    Integer storeId;

    @JsonProperty("collectionData")
    Boolean collectionData;

    @JsonProperty("code")
    Integer code;

    @JsonProperty("contextRuleId")
    String contextRuleId;

    @JsonProperty("categoryLevel")
    Integer categoryLevel;

    @Data
    @NoArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static class Filters {
    }
}
