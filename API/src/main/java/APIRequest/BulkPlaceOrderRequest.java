package APIRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BulkPlaceOrderRequest {
    @SerializedName("email_list")
    @Expose
    private List<String> emailList;
    @SerializedName("auth_token")
    @Expose
    private String authToken;
    @SerializedName("child_auth_token")
    @Expose
    private String childAuthToken;
    @SerializedName("shop_platform")
    @Expose
    private BulkShopPlatformRequest shopPlatform;
    @SerializedName("order_data")
    @Expose
    private BulkOrderDataRequest orderData;

    public List<String> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<String> emailList) {
        this.emailList = emailList;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getChildAuthToken() {
        return childAuthToken;
    }

    public void setChildAuthToken(String childAuthToken) {
        this.childAuthToken = childAuthToken;
    }

    public BulkShopPlatformRequest getShopPlatform() {
        return shopPlatform;
    }

    public void setShopPlatform(BulkShopPlatformRequest shopPlatform) {
        this.shopPlatform = shopPlatform;
    }

    public BulkOrderDataRequest getOrderData() {
        return orderData;
    }

    public void setOrderData(BulkOrderDataRequest orderData) {
        this.orderData = orderData;
    }
}
