package APIRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BulkOrderRequest {
    @SerializedName("from_address")
    @Expose
    private String fromAddress;
    @SerializedName("from_email")
    @Expose
    private String fromEmail;
    @SerializedName("from_name")
    @Expose
    private String fromName;
    @SerializedName("from_phone_number")
    @Expose
    private String fromPhoneNumber;
    @SerializedName("from_pincode")
    @Expose
    private String fromPincode;
    @SerializedName("auth_token")
    @Expose
    private String authToken;
    @SerializedName("item_list")
    @Expose
    private List<BulkItemRequest> itemList;
    @SerializedName("to_name")
    @Expose
    private String toName;
    @SerializedName("to_phone_number")
    @Expose
    private String toPhoneNumber;
    @SerializedName("to_pincode")
    @Expose
    private String toPincode;
    @SerializedName("sku_details_source")
    @Expose
    private String skuDetailsSource;
    @SerializedName("to_address")
    @Expose
    private String toAddress;
    @SerializedName("to_email")
    @Expose
    private String toEmail;
    @SerializedName("order_time")
    @Expose
    private String orderTime;
    @SerializedName("total_discount")
    @Expose
    private String totalDiscount;
    @SerializedName("shipping_charge")
    @Expose
    private String shippingCharge;
    @SerializedName("invoice_number")
    @Expose
    private String invoiceNumber;
    @SerializedName("item_weight")
    @Expose
    private Double itemWeight;
    @SerializedName("item_length")
    @Expose
    private Integer itemLength;
    @SerializedName("item_height")
    @Expose
    private Integer itemHeight;
    @SerializedName("item_breadth")
    @Expose
    private Integer itemBreadth;
    @SerializedName("item_name")
    @Expose
    private String itemName;
    @SerializedName("invoice_value")
    @Expose
    private String invoiceValue;
    @SerializedName("client_order_id")
    @Expose
    private String clientOrderId;
    @SerializedName("woocom_order_id")
    @Expose
    private String woocomOrderId;
    @SerializedName("cod_amount")
    @Expose
    private String codAmount;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("location_id")
    @Expose
    private Object locationId;
    @SerializedName("is_new")
    @Expose
    private Boolean isNew;

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromPhoneNumber() {
        return fromPhoneNumber;
    }

    public void setFromPhoneNumber(String fromPhoneNumber) {
        this.fromPhoneNumber = fromPhoneNumber;
    }

    public String getFromPincode() {
        return fromPincode;
    }

    public void setFromPincode(String fromPincode) {
        this.fromPincode = fromPincode;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public List<BulkItemRequest> getItemList() {
        return itemList;
    }

    public void setItemList(List<BulkItemRequest> itemList) {
        this.itemList = itemList;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToPhoneNumber() {
        return toPhoneNumber;
    }

    public void setToPhoneNumber(String toPhoneNumber) {
        this.toPhoneNumber = toPhoneNumber;
    }

    public String getToPincode() {
        return toPincode;
    }

    public void setToPincode(String toPincode) {
        this.toPincode = toPincode;
    }

    public String getSkuDetailsSource() {
        return skuDetailsSource;
    }

    public void setSkuDetailsSource(String skuDetailsSource) {
        this.skuDetailsSource = skuDetailsSource;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public String getShippingCharge() {
        return shippingCharge;
    }

    public void setShippingCharge(String shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Integer getItemLength() {
        return itemLength;
    }

    public void setItemLength(Integer itemLength) {
        this.itemLength = itemLength;
    }

    public Integer getItemHeight() {
        return itemHeight;
    }

    public void setItemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
    }

    public Integer getItemBreadth() {
        return itemBreadth;
    }

    public void setItemBreadth(Integer itemBreadth) {
        this.itemBreadth = itemBreadth;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getInvoiceValue() {
        return invoiceValue;
    }

    public void setInvoiceValue(String invoiceValue) {
        this.invoiceValue = invoiceValue;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getWoocomOrderId() {
        return woocomOrderId;
    }

    public void setWoocomOrderId(String woocomOrderId) {
        this.woocomOrderId = woocomOrderId;
    }

    public String getCodAmount() {
        return codAmount;
    }

    public void setCodAmount(String codAmount) {
        this.codAmount = codAmount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Object getLocationId() {
        return locationId;
    }

    public void setLocationId(Object locationId) {
        this.locationId = locationId;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }
}
