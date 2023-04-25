package ApiResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FetchSpocDetailsResponse {
    @SerializedName("data")
    @Expose
    private SPOCData data;
    @SerializedName("success")
    @Expose
    private Boolean success;

    public SPOCData getData() {
        return data;
    }

    public void setData(SPOCData data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
