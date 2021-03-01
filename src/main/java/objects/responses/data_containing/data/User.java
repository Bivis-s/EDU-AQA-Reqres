package objects.responses.data_containing.data;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private int id;
    private String email;
    @SerializedName(value = "first_name")
    private String firstName;
    @SerializedName(value = "last_name")
    private String lastName;
    @SerializedName(value = "avatar")
    private String avatarUrl;
}
