package apiRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BulkShopPlatformRequest {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("store_name")
    @Expose
    private String storeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
