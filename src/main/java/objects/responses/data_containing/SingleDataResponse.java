package objects.responses.data_containing;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import objects.responses.ResponseData;
import objects.support.Support;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class SingleDataResponse<T> extends ResponseData {
    private T data;
    private Support support;
}
