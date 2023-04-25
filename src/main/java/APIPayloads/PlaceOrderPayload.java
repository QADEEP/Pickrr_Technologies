package APIPayloads;

import APIRequest.PlaceOrderRequest;
import Utils.Utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import APIRequest.Item;

public class PlaceOrderPayload {
        public static PlaceOrderRequest placeOrderRequest;
    public static PlaceOrderRequest placeOrderSetBody(String authToken){
        placeOrderRequest=new PlaceOrderRequest();
        placeOrderRequest.setHsnCode("None");
        placeOrderRequest.setIsNew(true);
        placeOrderRequest.setIsReverse(false);
        placeOrderRequest.setFromPincode("122001");
        placeOrderRequest.setFromAddress("38 gf, Sant nagar, EOK, New Delhi");
        placeOrderRequest.setFromPhoneNumber("+910000000000");
        placeOrderRequest.setFromName("delhi warehouse");
        placeOrderRequest.setItemName("Bag - Large : silver x 1");
        placeOrderRequest.setToPincode("122022");
        placeOrderRequest.setToPhoneNumber("0000000000");
        placeOrderRequest.setToName("Usgsgfs Wagsadgfs");
        placeOrderRequest.setToEmail("svsdgfsg@pickrr.com");
        placeOrderRequest.setToAddress("Dayal Bagh Colony");
        placeOrderRequest.setItemWeight(1.7);
        placeOrderRequest.setItemLength(22);
        placeOrderRequest.setItemHeight(22);
        placeOrderRequest.setItemHeight(22);
        placeOrderRequest.setInvoiceValue(6000);
        placeOrderRequest.setClientOrderId("Random "+Utils.generateRandomNumber());
        placeOrderRequest.setAuthToken(authToken);
        placeOrderRequest.setIsMps("None");
        placeOrderRequest.setFromEmail("None");
        placeOrderRequest.setQuantity(1);
        placeOrderRequest.setChildAuthToken(authToken);
        placeOrderRequest.setCodAmount(510.72);
        placeOrderRequest.setSkuDetailsSource("weight_sku_mapper");
        placeOrderRequest.setTotalDiscount("0.00");
        placeOrderRequest.setTags("");
        placeOrderRequest.setInvoiceNumber("retail1083");
        placeOrderRequest.setOrderTime(new Date().toString());
        placeOrderRequest.setLocationId("34640855142");
        placeOrderRequest.setShopifyOrderId("4385832534118");
        placeOrderRequest.setShippingCharge("0.00");
        placeOrderRequest.setApplySecureShipment(true);
        placeOrderRequest.setItemList(PlaceOrderPayload.createItemList());
        return placeOrderRequest;
    }

    public static List<Item> createItemList(){
        List<Item> items=new ArrayList<>();
        Item item=new Item();
        item.setQuantity(1);
        item.setItemName("Ipad");
        item.setSku("apple1");
        item.setPrice(456);
        item.setItemTaxPercentage(0);
        item.setVariantTitle("Large");
        item.setName("Ipad 5th gen");
        item.setHsnCode("12345679");
        item.setItemWeight(1.7);
        item.setItemLength(22);
        item.setItemBreadth(22);
        item.setItemHeight(22);
        item.setShippingCharge("");
        item.setSecureShipment("SECURE");

        Item item1=new Item();
        item1.setQuantity(1);
        item1.setItemName("MacBook Pro");
        item1.setSku("MackBook Pro");
        item1.setPrice(456);
        item1.setItemTaxPercentage(0);
        item1.setVariantTitle("Large");
        item1.setName("Macbook 6th gen");
        item1.setHsnCode("12345679");
        item1.setItemWeight(1.7);
        item1.setItemLength(22);
        item1.setItemBreadth(22);
        item1.setItemHeight(22);
        item1.setShippingCharge("");
        item1.setSecureShipment("SECURE");

        Item item2=new Item();
        item2.setQuantity(1);
        item2.setItemName("MacBook Air");
        item2.setSku("MacBook Air");
        item2.setPrice(456);
        item2.setItemTaxPercentage(0);
        item2.setVariantTitle("Large");
        item2.setName("Macbook 6th gen");
        item2.setHsnCode("12345679");
        item2.setItemWeight(1.7);
        item2.setItemLength(22);
        item2.setItemBreadth(22);
        item2.setItemHeight(22);
        item2.setShippingCharge("");
        item2.setSecureShipment("SECURE");
        items.add(item);
        items.add(item1);
        items.add(item2);
        return items;
    }

}
