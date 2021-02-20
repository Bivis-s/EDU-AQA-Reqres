package objects.response_container;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseContainer<T> {
    private int statusCode;
    private T data;
}
