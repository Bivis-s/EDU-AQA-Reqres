package objects.requests;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUpdateRequest {
    private String name;
    private String job;
}
