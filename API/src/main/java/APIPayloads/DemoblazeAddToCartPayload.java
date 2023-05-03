package APIPayloads;

import APIRequest.DemoblazeAddToCartRequest;

public class DemoblazeAddToCartPayload {
    static DemoblazeAddToCartRequest demoblazeAddToCartRequest;
    public static DemoblazeAddToCartRequest setBody(){
        demoblazeAddToCartRequest=new DemoblazeAddToCartRequest();
        demoblazeAddToCartRequest.setId("d1a62622-ae59-9c6b-32cd-4c6e5e52dbdc");
        demoblazeAddToCartRequest.setCookie("user=dee2b6b4-37c3-0f18-edaa-43ccd68c0817");
        demoblazeAddToCartRequest.setProductID(1);
        demoblazeAddToCartRequest.setFlag(false);
        return demoblazeAddToCartRequest;
    }
}
