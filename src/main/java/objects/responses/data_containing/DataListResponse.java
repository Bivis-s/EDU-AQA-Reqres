package objects.responses.data_containing;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import objects.responses.ResponseData;
import objects.support.Support;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class DataListResponse<T> extends ResponseData {
    private int page;
    @SerializedName(value = "per_page")
    private int perPage;
    private int total;
    @SerializedName(value = "total_pages")
    private int totalPages;
    @SerializedName(value = "data")
    private List<T> dataList;
    private Support support;
}
