package objects.responses.no_data;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import objects.responses.ResponseData;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class RegisterLoginResponse extends ResponseData {
    private int id;
    private String token;
}
