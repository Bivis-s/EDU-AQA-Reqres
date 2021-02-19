package objects.register_login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailPasswordRequest {
    private String email;
    private String password;
}
