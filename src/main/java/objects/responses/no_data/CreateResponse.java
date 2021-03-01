package objects.responses.no_data;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import objects.responses.ResponseData;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class CreateResponse extends ResponseData {
    private String name;
    private String job;
    private int id;
    private String date;
}
