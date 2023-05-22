package apiRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BulkOrderDataRequest {
    @SerializedName("order_list")
    @Expose
    private List<BulkOrderRequest> orderList;

    public List<BulkOrderRequest> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<BulkOrderRequest> orderList) {
        this.orderList = orderList;
    }

}
