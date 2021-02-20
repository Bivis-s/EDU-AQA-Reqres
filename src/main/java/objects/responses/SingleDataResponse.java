package objects.responses;

import lombok.Builder;
import lombok.Data;
import objects.support.Support;

@Data
@Builder
public class SingleDataResponse<T> {
    private T data;
    private Support support;
}
