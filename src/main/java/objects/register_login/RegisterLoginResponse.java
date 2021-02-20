package objects.register_login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterLoginResponse {
    private int id;
    private String token;
}
