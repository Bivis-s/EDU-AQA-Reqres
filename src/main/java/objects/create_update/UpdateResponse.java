package objects.create_update;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateResponse {
    private String name;
    private String job;
    private String updatedAt;
}
