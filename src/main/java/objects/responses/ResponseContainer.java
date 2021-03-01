package objects.responses;

import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.extern.log4j.Log4j2;

@Value
@AllArgsConstructor
@Log4j2
public class ResponseContainer<T extends ResponseData> {
    int statusCode;
    T data;

    {
        log.debug("Created " + this.getClass().getSimpleName() + " object, " + this.toString());
    }
}
