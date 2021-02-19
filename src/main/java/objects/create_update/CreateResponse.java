package objects.create_update;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateResponse {
    private String name;
    private String job;
    private int id;
    private String date;
}
