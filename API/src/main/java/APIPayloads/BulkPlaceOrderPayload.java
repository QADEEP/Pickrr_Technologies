package APIPayloads;

import APIRequest.*;

import java.util.*;

public class BulkPlaceOrderPayload {

    public static BulkPlaceOrderRequest bulkPlaceOrderRequest;
    public static BulkPlaceOrderRequest setBody(String authToken){
    bulkPlaceOrderRequest=new BulkPlaceOrderRequest();
    bulkPlaceOrderRequest.setAuthToken(authToken);
    bulkPlaceOrderRequest.setChildAuthToken(authToken);
    BulkOrderDataRequest bulkOrderDataRequest=new BulkOrderDataRequest();
    BulkOrderRequest bulkOrderRequest=new BulkOrderRequest();
    bulkOrderDataRequest.setOrderList(createOrderList());
    BulkItemRequest bulkItemRequest=new BulkItemRequest();
    bulkOrderRequest.setToName("John");
    bulkOrderRequest.setToPhoneNumber("(555) 555-5555");
    bulkOrderRequest.setToPincode("122001");
    bulkOrderRequest.setSkuDetailsSource("weight_sku_mapper");
    bulkOrderRequest.setToAddress("969 Market  San Francisco  Lakshadeep IN");
    bulkOrderRequest.setToEmail("ayush.1@pickrr.com");
    bulkOrderRequest.setOrderTime("2022-06-02T15:58:47");
    bulkOrderRequest.setTotalDiscount("0.00");
    bulkOrderRequest.setShippingCharge("12.00");
    bulkOrderRequest.setInvoiceNumber("retail205");
    bulkOrderRequest.setItemWeight(12.0);
    bulkOrderRequest.setItemLength(12);
    bulkOrderRequest.setItemHeight(12);
    bulkOrderRequest.setItemBreadth(12);
    bulkOrderRequest.setItemName("");
    bulkOrderRequest.setInvoiceValue("40.00");
    bulkOrderRequest.setClientOrderId("205");
    bulkOrderRequest.setWoocomOrderId("205");
    bulkOrderRequest.setCodAmount("40.00");
    bulkOrderRequest.setQuantity(2);
    //bulkOrderRequest.setLocationId(new Object());
    bulkOrderRequest.setIsNew(true);
    BulkShopPlatformRequest bulkShopPlatformRequest=new BulkShopPlatformRequest();
    bulkShopPlatformRequest.setName("woocommerce");
    bulkShopPlatformRequest.setStoreName("https://mystoreorgin.wpcomstaging.com");
    bulkOrderRequest.setItemList(createItemList());
    return bulkPlaceOrderRequest;
}

public static List<BulkItemRequest> createItemList() {
    List<BulkItemRequest> items = new ArrayList<>();
    BulkItemRequest item=new BulkItemRequest();
    item.setItemName("");
    item.setSku("");
    item.setPrice("0");
    item.setHsnCode("");
    item.setQuantity(2);
    BulkItemRequest item2=new BulkItemRequest();
    item.setItemName("");
    item.setSku("");
    item.setPrice("0.00");
    item.setHsnCode("");
    item.setQuantity(1);
    items.add(item);
    return  items;
    }

    public static List<BulkOrderRequest> createOrderList(){
        List<BulkOrderRequest> bulkOrderRequests=new ArrayList<>();
        BulkOrderRequest bulkOrderRequest=new BulkOrderRequest();
        bulkOrderRequest.setFromAddress("");
        bulkOrderRequest.setFromEmail("");
        bulkOrderRequest.setFromName("");
        bulkOrderRequest.setFromPhoneNumber("");
        bulkOrderRequest.setFromPincode("");
        return bulkOrderRequests;
    }
}


