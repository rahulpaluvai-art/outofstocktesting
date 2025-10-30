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
    final String query;

    @JsonProperty("filters")
    final Filters filters;

    @JsonProperty("numericFilters")
    final List<Object> numericFilters;

    @JsonProperty("pageOffset")
    final Integer pageOffset;

    @JsonProperty("pageSize")
    final Integer pageSize;

    @JsonProperty("storeId")
    final Integer storeId;

    @JsonProperty("collectionData")
    final Boolean collectionData;

    @JsonProperty("code")
    final Integer code;

    @JsonProperty("contextRuleId")
    final String contextRuleId;

    @JsonProperty("categoryLevel")
    final Integer categoryLevel;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public class Filters {
    }
}
