package objects.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import objects.support.Support;

import java.util.List;

@Data
@Builder
public class DataListResponse<T> {
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
