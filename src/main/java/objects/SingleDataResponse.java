package objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SingleDataResponse<T> {
    private T data;
    private Support support;
}
