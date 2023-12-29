package data;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Data {
    private int id;
    private String name;
    private int year;
    private String color;

    @JsonProperty("pantone_value")
    private String pantoneValue;
}