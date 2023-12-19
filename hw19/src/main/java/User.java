import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class User {

    private int code;
    private final String type;
    private final String message;
}